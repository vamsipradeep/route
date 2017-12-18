<%@page import="javax.portlet.WindowState"%>
<%@ include file="/init.jsp" %>

<portlet:renderURL var="paqqetURL" windowState="<%= WindowState.NORMAL.toString() %>">
	<portlet:param name="mvcRenderCommandName" value="/paqqet" />
</portlet:renderURL>

<aui:form action="<%=paqqetURL %>" method="post" name="fm">
<div class="card">
		<header class="card-header">
			<p class="card-header-title">Provide Paqqet name
			</p>
			<a class="card-header-icon"> <span class="icon"> <i
					class="fa fa-user"></i>
			</span>
			</a>
		</header>
		<div class="card-content">
			<div class="columns">
				<div class="column is-full">

					<div class="field">
						<p class="control has-icons-left">
							<aui:input cssClass="input paddingleft2p25em" type="text" name="paqqetName" label=""
								id="paqqetName" placeholder="Paqqet Name" required="true" value="" maxLength="75"> <span
								class="icon is-left" value=""> <aui:icon cssClass="fa fa-user"></aui:icon>
							</span> <span class="help"></span></aui:input>
						</p>
					</div>

				</div>

			</div>
		</div>
		<footer class="card-footer">
			<aui:button cssClass="btn btn-primary form-control" value="NEXT: CHOOSE SECURITY LEVELS"  onClick="return next();"/>
		</footer>
	</div>
	
</aui:form>

<aui:script>

function next(){
	debugger;
	var paqqetName = "&<portlet:namespace />paqqetName="+$('#<portlet:namespace />paqqetName').val();
	var	sURL = "<%= paqqetURL.toString() %>"+paqqetName;
	submitForm(document.<portlet:namespace />fm, sURL);
}

</aui:script>