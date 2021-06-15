<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.cadastrarAutor.modelo.Autor" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	
	Lista de Autores: <br />
		
		<ul>
			<c:forEach items="${autores}" var="autor">
				<li>
					${autor.nome} - 
					${autor.email}
				</li>
			</c:forEach>
		</ul>
		
		<br />
				
		<a href="/cadastrarAutor/formNovoAutor.jsp">Adicionar outro autor</a>
</body>
</html>