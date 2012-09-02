<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div id="features-wrapper">
	<div id="features">
	</div>
</div>
<div id="content-wrapper">
	<div id="content">
		<div class="5grid">
	
			<h1>Foro</h1>
			
			<s:form action="welcome">
				<s:textfield name="name" label="Name"/>
				<s:textfield name="description" label="Description"/>
				<s:submit />
				<s:submit action="addForumTheme" value="Add" />
				<s:submit action="updateForumTheme" value="Update" />
				<s:submit action="deleteForumTheme" value="Delete" />
			</s:form>
		</div>
	</div>
</div>
