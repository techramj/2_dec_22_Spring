<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project Manager</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" />
  <link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
  	input[type="radio"], input[type="checkbox"]{
  		float:left;
  	}
  </style>
</head>
	<body>
	  <jsp:include page="../views/fragments/header.jsp"></jsp:include>
	
	  <div class="container">
	      <div class="row">
	          <form action="<spring:url value="/project/add"/>"  method="post"
	          class="col-md-8 col-md-offset-2">
	              <div class="form-group">
	                  <label for="project-name">Name</label>
	                  <input type="text" id="project-name" class="form-control" name="name">
	              </div>
	              
	              <div class="form-group">
	                  <label for="project-name">Type</label>
	                 <select name="type" class="form-control selectpicker">
	                    <option></option>
	                    <option value="single">Single Year</option>
	                    <option value="multi">Multi Year</option>
	                 </select>
	              </div>
	         
	              <div class="form-group">
	                <label for="sponsor">Sponsor</label>
	                <input type="text" id="sponsor" class="form-control" name="sponsor">
	              </div>
	
	              <div class="form-group">
	                <label for="funds">Authorized Funds</label>
	                <input type="text" id="funds" class="form-control" name="authorizedFunds">
	              </div>
	
	              <div class="form-group">
	                <label for="hours">Authorized Hours</label>
	                <input type="text" id="hours" class="form-control" name="authorizedHours">
	              </div>
	
	              <div class="form-group">
	                <label for="hours">Description</label>
	                <textarea class="form-control" rows="3" name="description"></textarea>
	              </div>
	
	              <button type="submit" class="btn btn-default">Submit</button>
	
	          </form>
	      </div>
	  </div>
	
	</body>
</html>

