<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
                
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h1><fmt:message key="person.form.title"/></h1>

<c:if test="${not empty statusMessageKey}">
    <p><fmt:message key="${statusMessageKey}"/></p>
</c:if>

<c:url var="url" value="/form.html" /> 
<form:form action="${url}" commandName="person">
    <form:hidden path="id" />

    <fieldset>
        <div class="form-row">
            <label for="firstName"><fmt:message key="person.form.firstName"/>:</label>
            <span class="input"><form:input path="firstName" /></span>
        </div>       
        <div class="form-row">
            <label for="lastName"><fmt:message key="person.form.lastName"/>:</label>
            <span class="input"><form:input path="lastName" /></span>
        </div>
        <div class="form-buttons">
            <div class="button"><input name="submit" type="submit" value="<fmt:message key="button.save"/>" /></div>
        </div>
    </fieldset>
</form:form>
</body>
</html>