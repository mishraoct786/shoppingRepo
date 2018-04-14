<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel= "stylesheet" type ="text/css" href="<%=request.getContextPath()%>/resources/css/style.css"/>
</head>

<body>
                


<div id="formCat" class ="cadre">
<f:form modelAttribute ="categorie" action="saveCat" method="post" enctype="multipart/form-data">
<table>
<tr>
<td>ID Categorie:</td>
<td>$(categorie.idCategorie)<f:input type="hidden" path ="idCategorie"/></td>
<td><f:errors path="idCategarie"></f:errors>
</td>
</tr>
<tr>
<td>Non Categorie:</td>
<td><f:input  path ="nonCategorie"/></td>
<td><f:errors path="idCategarie"></f:errors>
</td>
</tr>
<tr>
<td>Description</td>
<td> <f:textarea path ="description" /></td>
<td><f:errors path="description"></f:errors>
</td>
</tr>

<tr>
<td>photo</td>
<c:if test="${categorie.idContegorie !=null} ">
</c:if>
<td>
<input type="file" name="file"></td>
</tr>
<tr>
<td> input type ="submit" value ="save"></td>
</tr>
</table>
</f:form>
</body>
</html>