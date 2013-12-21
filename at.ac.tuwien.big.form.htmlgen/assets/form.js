var form = {
	_elementIsActive : {},
	_inputFieldIds : [],
	_mandatoryFieldIds : [],
	_conditionalElements : {},
	_elementIds : [],
	_activePage : 0,

	pages : function() {
		return $(".page");
	},
	findLabelForId : function(id) {
		return $("label").filter("[for='" + id + "'], [id='label_for_" + id + "']").first();
	},
	submit : function() {
		this.pages().hide();

		var list = $("<dl/>");

		for (var i = 0; i < this._inputFieldIds.length; ++i) {
			var id = this._inputFieldIds[i];

			if (id in this._elementIsActive
					&& this._elementIsActive[id] == 0) {
				continue;
			}

			var dt = $("<dt/>").text(this.findLabelForId(id).text())
			list.append(dt)

			var element = document.getElementById(id);
			if (element.nodeName == "INPUT" || element.nodeName == "TEXTAREA") {
				var dd = $("<dd/>");
				if (element.type == "password") {
					dd.text($(element).val());
				} else {
					dd.text($(element).val());
				}
				list.append(dd);
			} else {
				var self = this;
				$(element).find("input").each(function(index, item) {
					if (item.checked) {
						var dd = $("<dd/>");
						dd.text($(item).val());
						list.append(dd);
					}
				});
				$(element).find("option").each(function(index, item) {
					if (item.selected) {
						var dd = $("<dd/>");
						dd.text($(item).val());
						list.append(dd);
					}
				});
			}
		}

		var summary = $("<div class='well'/>");
		summary.append($("<h2>Summary</h2>"));
		summary.append(list);

		this.pages().last().after(summary);
	},
	hasValue : function(id) {
		var element = document.getElementById(id);
		if (element.nodeName == "INPUT" || element.nodeName == "TEXTAREA") {
			return $(element).val() != '';
		} else {
			var checked = false;
			$(element).find("input").each(function(index, item) {
				if (item.checked) {
					checked = true;
				}
			});
			$(element).find("option").each(function(index, item) {
				if (item.selected) {
					checked = true;
				}
			});
			return checked;
		}
	},
	next : function(nextIndex) {
		var self = this;
		var missing = false;
		var thisPage = this.pages().eq(this._activePage);

		thisPage.find(".missing").removeClass("missing");

		thisPage.find("*[id]")
				.filter(
						function(index, item) {
							return jQuery.inArray(item.id,
									self._mandatoryFieldIds) > -1
									&& !$(item).hasClass("hidden");
						}).each(function(index, item) {
					var id = $(item).attr('id');
					if (!self.hasValue(id)) {
						missing = true;
						self.findLabelForId(id).addClass("missing");
					}
				});

		if (missing) {
			return;
		}

		if (nextIndex >= this.pages().length) {
			this._activePage = -1;
			this.submit();
		} else {
			if (this.pages().eq(nextIndex).hasClass("skip")) {
				this.next(nextIndex + 1);
			} else {
				this._activePage = nextIndex;
				this.pages().hide().eq(nextIndex).show();
			}
		}
	},
	updateVisiblity : function(id, show) {
		var self = this;
		var element = document.getElementById(id);

		if (show) {
			this._elementIsActive[id] = this._elementIsActive[id] + 1;
		}
		else {
			if (this._elementIsActive[id] > 0) {
				this._elementIsActive[id]--;
			}
		}

		if (this._elementIsActive[id] > 0) {
			$(element).add(this.findLabelForId(id)).removeClass("hidden");
		} else {
			$(element).add(this.findLabelForId(id)).addClass("hidden");
		}

		var parentPage = $(element).closest(".page");
		var skip = true;
		parentPage.find("*[id]").filter(function(index, item) {
			return jQuery.inArray(item.id, self._elementIds) > -1;
		}).each(function(index, item) {
			if (!$(item).hasClass("hidden")) {
				skip = false;
			}
		});
		if (skip) {
			parentPage.addClass("skip");
		} else {
			parentPage.removeClass("skip");
		}
	},
	onSelectItem : function(element, id) {
		var isActive = $(element).is(":checked");
		var concernedIds = this._conditionalElements[id + "_" + $(element).val()].concernedIds;
		for (var i = 0; i < concernedIds.length; ++i) {
			this.updateVisiblity(concernedIds[i], isActive);
		}
	},
	init : function() {
		var self = this;
		var pages = this.pages();
		pages.each(function(index, item) {
			if (index != 0) {
				$(item).hide();
				var button = $("<button class='btn btn-info'>Back</button>");
				button.on("click", function() {
					self.next(index - 1);
				});
				$(item).append(button);
				$(item).append($("<span> </span>"));
			}

			var button = $("<button class='btn btn-primary'/>");
			button.text("Next");
			button.on("click", function() {
				self.next(index + 1);
			});
			$(item).append(button);
		});
	},
	registerConditional : function(id, itemValue, concernedIds) {
		var self = this;
		this._conditionalElements[id+"_"+itemValue] = {
			"concernedIds" : concernedIds,
			"value" : itemValue,
		};
		for (var i = 0; i < concernedIds.length; ++i) {
			this._elementIsActive[concernedIds[i]] = 0;
			this.updateVisiblity(concernedIds[i], false);
		}
		var root = $(document.getElementById(id));
		var inputs = $().add(root.find("input")).add(root.find("option"));
		inputs.each(
				function(index, item) {
					$(item).on("click", function() {
						for (var i = inputs.length - 1; i >= 0; i--) {
							self.onSelectItem(inputs[i], id);
						};
					});
				});
	},
	registerMandatory : function(id) {
		this._inputFieldIds.push(id);
		this._mandatoryFieldIds.push(id);
		this.findLabelForId(id).append($("<span> *</span>"))
	},
	registerOptional : function(id) {
		this._inputFieldIds.push(id);
	},
	registerElement : function(id) {
		this._elementIds.push(id);
	}
}
