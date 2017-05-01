<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
.h1 {
	color: #338DFF;
	font-style: italic;
	font-weight: bold;
	text-align: center;
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
	margin-top: 75px; /* negative value of footer height */
	height: 150px;
	clear: both;
}

.button {
margin: 5px;
width: 85px;
height:auto;
display:inline-block;
}
</style>
<title>Loan Bank Application</title>
<script>
function goBack() {
    window.history.back()
}
</script>
</head>
<body bgcolor="#C0C0C0">
	<img width=150px; height=150px; style="padding-bottom: 50px"
		src="<%=request.getContextPath()%>/resources/images/bank.jpg" />
	<h1 class="h1">INCOME INFORMATION</h1>
	<br>
	<br>
	<h3 align="center" class="error">${errval}</h3>
	
	<div ALIGN="left">
		<form:form method="post" action="income" commandName="income">
			<table align="center">
				<tr height="20px"></tr>
				<tr>
					<td align="right"><span class="column">SSN Number:</span></td>
					<td><form:input path="applSSN" size="9"/></td>
					<td><form:errors path="applSSN" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Mode of Income:</span></td>
					<td><form:select path="incomemode">
							<form:option value="NONE"> --SELECT--</form:option>
							<form:option value="Salaried"> SALARIED</form:option>
							<form:option value="BUSINESS"> BUSINESS</form:option>
							<form:option value="SELFEMPLOYMENT"> SELF EMPLOYMENT</form:option>
							<form:option value="OTHER"> OTHER</form:option>
						</form:select></td>
					<td><form:errors path="incomemode" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Annual Income:</span></td>
					<td><form:input path="applincome" /></td>
					<td><form:errors path="applincome" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">House Rent/Own:</span></td>
					<td><form:select path="RentorOwn">
							<form:option value="NONE"> --SELECT--</form:option>
							<form:option value="RENT"> RENT</form:option>
							<form:option value="OWN"> OWN</form:option>
						</form:select></td>
					<td><form:errors path="RentorOwn" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Rent/Lease
							Amount:</span></td>
					<td><form:input path="rentorleaseamt" /></td>
					<td><form:errors path="rentorleaseamt" cssClass="error" /></td>
				</tr>
				<tr height="20px"></tr>
				<tr>
					<td align="center"><button class="button" onclick="goBack()">Back</button></td>
					<td align="center"><input type="submit" name="Submit"
						class="button" id="Submit" value="Next" /></td>
				</tr>
			</table>

		</form:form>
	</div>

	<div id="footer" align="center" class="footer">
			<span><b>Legal Disclaimer:@2017 Demo Disclaimer</b></span>
	</div>

</body>
</html>
