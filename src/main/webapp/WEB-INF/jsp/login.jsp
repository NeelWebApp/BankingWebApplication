<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<style>
.h1 {
	color: #338DFF;
	font-style: italic;
}

.error {
	color: #FF3355;
	font-style: italic;
	font-weight:bold;
}

.column {
	color: #581845;
	font-weight: bold;
}

.footer {
	position: relative;
	margin-top: 250px; /* negative value of footer height */
	height: 150px;
	clear: both;
}
</style>
<title>Loan Bank</title>
</head>
<body bgcolor="#C0C0C0">
	<img width=150px; height=150px; style="padding-bottom: 50px"
		src="<%=request.getContextPath()%>/resources/images/bank.jpg" />
	<h1 align="center" class="h1">Welcome To Loan Bank</h1>
	<br>
	<br>
	<h3 align="center" class="error">${errval}</h3>
		<div align="center">

			<form:form method="post" action="login" commandName="login">

				<table align="center">
					<tr>
					</tr>
					<tr>
						<td><span class="column">Username:</span></td>
						<td><form:input path="username" /></td>
						<td><form:errors path="username" cssClass="error" /></td>
					</tr>
					<tr height="10px"></tr>
					<tr>
						<td><span class="column">Password:</span></td>
						<td><form:input path="password" type="password"/></td>
						<td><form:errors path="password" cssClass="error" /></td>
					</tr>
					<tr height="10px"></tr>
					<tr>
						<td></td>
						<td align="right"><input type="submit" name="Submit"
							id="Submit" value="Login"></td>
					</tr>
				</table>

			</form:form>
		</div>
		<div id="footer" align="center" class="footer">
			<span><b>Legal Disclaimer:@2017 Demo Disclaimer</b></span>
		</div>
</body>
</html>