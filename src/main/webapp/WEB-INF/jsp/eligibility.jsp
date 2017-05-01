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
	<h1 class="h1">ELIGIBILITY INFORMATION</h1>
	<br>
	<br>
	<h3 align="center" class="error">${errval}</h3>
	
	<div ALIGN="left">
		<form:form method="post" action="eligibility"
			commandName="eligibility">
			<table align="center">
				<tr height="20px"></tr>
				<tr>
					<td align="right"><span class="column">Account Type:</span></td>
					<td><form:select path="accounttype">
							<form:option value="NONE"> --SELECT--</form:option>
							<form:option value="CHECKING ACCOUNT"> CHECKING ACCOUNT</form:option>
							<form:option value="SAVING ACCOUNT"> SAVING ACCOUNT</form:option>
							<form:option value="NRI ACCOUNT"> NRI ACCOUNT</form:option>
							<form:option value="NRO ACCOUNT"> NRO ACCOUNT</form:option>
							<form:option value="OTHER"> OTHER</form:option>
						</form:select></td>
					<td><form:errors path="accounttype" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Initial Deposit:</span></td>
					<td><form:input path="intialDeposit" /></td>
					<td><form:errors path="intialDeposit" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Direct Deposit
							Monthly:</span></td>
					<td><form:radiobutton path="directDepositMonthly" value="Yes" />
						Yes <form:radiobutton path="directDepositMonthly" value="No" />
						No</td>
					<td><form:errors path="directDepositMonthly" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Debit Card Type
							(VISA/Master/AMEX):</span></td>
					<td><form:select path="debitCardVisaMaster">
							<form:option value="NONE"> --SELECT--</form:option>
							<form:option value="VISA"> VISA</form:option>
							<form:option value="MASTER"> MASTER</form:option>
							<form:option value="AMEX"> AMEX</form:option>
						</form:select></td>
					<td><form:errors path="debitCardVisaMaster" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Loan Amount
							Required (in $):</span></td>
					<td><form:select path="loanRequirement">
							<form:option value="25,000.00"> 25,000.00</form:option>
							<form:option value="50000.00"> 50,000.00</form:option>
							<form:option value="75000.00"> 75,000.00</form:option>
							<form:option value="100000.00"> 1,00,000.00</form:option>
						</form:select></td>
					<td><form:errors path="loanRequirement" cssClass="error" /></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="right"><span class="column">Credit Score:</span></td>
					<td><form:select path="creditScore">
							<form:option value="EXCELLENT"> EXCELLENT</form:option>
							<form:option value="GOOD"> GOOD</form:option>
							<form:option value="FAIR"> FAIR</form:option>
							<form:option value="BAD"> BAD</form:option>
						</form:select></td>
					<td><form:errors path="creditScore" cssClass="error" /></td>
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
