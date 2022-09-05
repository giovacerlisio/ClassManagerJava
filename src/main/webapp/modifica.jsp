<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>


    <nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" aria-current="page" href="Home.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="inserimento.jsp">Inserisci Utenti</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Visualizzazione">Visualizza Utenti</a>
        </li>
      </ul>
    </div>
  </div>
</nav>


<div class="m-4">
<form method="POST" action="Modifica">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Nome</label>
			<input type="text" name="nome" class="form-control"
				id="exampleFormControlInput1" value="${nome}">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">Cognome</label>
			<input type="text" name="cognome" class="form-control"
				id="exampleFormControlInput1" value="${cognome}">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Eta</label>
			<input type="number" name="eta" class="form-control"
				id="exampleFormControlInput1" value="${eta}"  min="1">
		</div>
			<label for="exampleFormControlInput1" class="form-label">ID</label>
			<input type="number" name="id" class="form-control" id="exampleFormControlInput1" value="${id}" readonly>
		<input type="submit">
</div>
</form>
</div>
<br>
</body>
</html>