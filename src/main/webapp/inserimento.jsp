<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inserimento</title>
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
          <a class="nav-link" aria-current="page" href="Home.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="inserimento.jsp">Inserimento</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Visualizzazione">Visualizza</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<div class="m-4">
	<form method="POST" name="form" action="Inserimento">
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Nome</label>
			<input type="text" name="nome" class="form-control"
				id="exampleFormControlInput1" placeholder="Nome">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlTextarea1" class="form-label">Cognome</label>
			<input type="text" name="cognome" class="form-control"
				id="exampleFormControlInput1" placeholder="Cognome">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Eta</label>
			<input type="number" name="eta" class="form-control"
				id="exampleFormControlInput1" placeholder="Eta">
		</div>
		<input type="submit">
	</form>
</div>

</body>
</html>