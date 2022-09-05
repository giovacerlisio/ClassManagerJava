<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Class Manager</title>
<link rel="icon" type="image/x-icon" href="logo.png">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>

<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Home.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="inserimento.jsp">Inserimento</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Visualizzazione">Visualizza</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

  <div class="position-absolute top-50 start-50 translate-middle">
		<div class="text-center">
  <img src="logo.png" class="rounded mt-4" style="width: 300px">
</div>  
  </div>
  
  <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>

<script type="text/javascript">
            var Msg ='<%=session.getAttribute("inserimento")%>';
                if (Msg == "true") {
                     function alertName(){
                         Swal.fire(
                            'Ottimo Lavoro..!!',
                            'Hai inserito un alunno',
                             'success'
                                )   
                     } 
                }
                <%session.setAttribute("inserimento", false);%>
        </script> 
                        
         <script type="text/javascript"> window.onload = alertName; </script>


</body>
</html>