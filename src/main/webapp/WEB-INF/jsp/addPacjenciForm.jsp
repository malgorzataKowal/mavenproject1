<%@ include file="./includes/common.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <link rel="stylesheet" type="text/css" href="newcss.css">
    </head>
<body>
	<h1>Dodaj pacjenta</h1>
	<form:form modelAttribute="przychodnia">
		<!--<table class="tabelka">
		<tr>
			<td>
				Pacjenci:
			</td>
			
		</tr>
                </table>-->
                <hr/>
                <table class="tabelka">
			<tr>
				<td><spring:message code="name.label" /></td>
				<td>
					<form:input path="pacjenci.name" />
                                        
                                        <form:errors path="pacjenci.name"/>
				</td>
			</tr>

			<tr>
				<td><spring:message code="surname.label" /></td>
				<td>
					<form:input path="pacjenci.surname" />
                                        <form:errors path="pacjenci.surname"/>
				</td>
			</tr>
		</table>
                <hr/>
               
                <table class="tabelka">
		<tr>
			<td>
				
                                <input type="submit" value="<spring:message code="submit.label" />" colspan="2" />
			</td>
		</tr>
		</table>
	</form:form>
</body>
</html>
