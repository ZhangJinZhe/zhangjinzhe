// JavaScript Document

var jq = jQuery.noConflict();
jQuery(function() {
	jq(".leftNav ul li")
			.hover(
					function() {

						var sub = jq(this).find(".zj .zj_l");
						var bol = sub.attr("rendered");
						var subMenuId = jq(this).find(".fj .fl").attr(
								"data-value");

						if (!bol) {
							
							var html = "";
							jq
									.ajax({
										async:false,
										url : "MenuServlet",
										type : "post",
										
										data : {"menuId" : subMenuId},
										dataType : "json",
										success : function(result) {
											var a = result.list2;
											
											for (var i = 0; i < a.length; i++) {
												var data = a[i];	
												html += "<div class=\"zj_l_c\" data-value="+data.id+"><h2>"
													+ data.nav
													+ "</h2>";
												var secondId=data.id;
												jq.ajax({
													        async:false,
															url : "ThirdServlet",
															type : "post",
															data : {"secondId":
																	secondId
															},
															dataType : "json",
															success : function(result) {
																var b = result.list3;

																for (var j = 0; j < b.length; j++) {
																	var data1 = b[j];
																	html += "<a href='"+data1.url+"'>"
																			+ data1.nav
																			+ "</a>|";
																
																}

																html+="</div>";
																		
																		
															}
														})
											}
											sub.html(html);
											sub.attr("rendered", "true");
										}
									});
						}
						jq(this).find(".fj").addClass("nuw");
						jq(this).find(".zj").show();
					}, function() {
						jq(this).find(".fj").removeClass("nuw");
						jq(this).find(".zj").hide();
					})
});
