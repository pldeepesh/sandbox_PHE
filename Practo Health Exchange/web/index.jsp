
<!DOCTYPE html>
<html>
<head>
	<title>Practo Health Exchange</title>
	<script type="text/javascript" href="script.js"></script>
	<meta charset="UTF-8">
        <%@page import="java.util.*"%>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="styles.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <form method="post" action="src/login">
        <nav class="navbar navbar-inverse">
	
  
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Practo Health Exchange V 1.0</a>
    </div>
    
      <!-- <li class="active"><a href="#">Home</a></li> -->
      <!-- <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li> -->
      <li><%String name=(String)request.getAttribute("name");
     if(name!=null)
     {%>
     <input type="text" name="name" size="29" value=<%= name%> />
     <%}
       else 
           {%>
           <input type="text" name="name" size="29"/>
           <%}%>
      </li>
      <li><input type="password" name="password" placeholder="password" class="signin"></li>
      <li><input type="submit" name="log_in" value="Log In" class="signin"> </li>
      <li><%List errorMsgs = (List)request.getAttribute("errorMsgs");
            if((errorMsgs!=null) && !errorMsgs.isEmpty())
            {%>
            <font color='red'><i>
            
            <%Iterator itr = errorMsgs.iterator();
            while(itr.hasNext())
            {
            String msg = (String)itr.next();%>
            <li><%= msg %></li>
            <% } %>
            
    <% }%></i></font></li>
    
  

</nav>
</form>
</body>
</html>
