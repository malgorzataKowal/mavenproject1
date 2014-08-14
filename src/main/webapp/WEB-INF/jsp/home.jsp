<%@ include file="./includes/common.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1250">
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <script type="text/javascript" src="przychodnia.js"></script>
        <title>Przychodnia</title>
    </head>
    <body>
        <div class="header"><h1>Witaj w przychodni!</h1>
        <ul>
		<li>
			<div id="przycisk"><a href="<c:url value="/addPacjenci.do" />" >Dodaj Pacjenta</a></div>
		</li>
		
	</ul>
        </div>
    </body>
</html>
