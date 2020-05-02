<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="shortcut icon" href="<c:url value="/resources/img/logo.png" />" />
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<script src="https://kit.fontawesome.com/98b78c6895.js" crossorigin="anonymous"></script>
   
		<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/js/autoreload.js" />" ></script>		
		<title>Exception Now Games</title>
		
		<c:set value="${pageContext.request.contextPath}" var="contextPath"/>
	</head> 
	<body class="-bg-primary-color">
		<header> 
			
			   <div class="row   -bg-card">
				<img src="<c:url value="/resources/img/logo.png" />" alt="logo exception">
		 	  	<div class="_container title-container">
		 	  		<h1 class="application-title">Exception Now Games</h1>
		 	  	</div>
		 	  </div>
			<nav class="navbar navbar-expand-lg -bg-secondary">
			  <div class="collapse navbar-collapse container _container" id="navbarSupportedContent">
			    <ul class="navbar-nav mr-auto">
			      <li class="nav-item ">
			        <a class="nav-link" href="<c:url value="/" />">Início</a>
			      </li>
			      <li class="nav-item active">
			        <a class="nav-link" href="<c:url value="/game/new" />">Adicionar Jogo</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link disabled" href="#">Amigos</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link disabled" href="#">Meus Jogos</a>
			      </li>
			    </ul>
			    <div class="user-area">
			    	<i class="fas fa-heart disabled link"></i>
			    	<i class="fas fa-shopping-cart disabled link"></i>
			    	<i class="fas fa-comment-alt disabled link"></i>
			    	<span class="text-light pr-2">Usuario_Spring</span/>
				    <img src="https://image.flaticon.com/icons/svg/2317/2317963.svg" class=rounded-circle alt="Cinque Terre">
			    </div>
			    
			  </div>
			</nav>
		</header>
		<main class="container games-container _container">
		<h2 class="content-title">Editar ${game.name}</h2>
		
		<form:form modelAttribute="gameModel" action="${contextPath}/game" method="PUT">
		
			<spring:hasBindErrors name="gameModel">
				<div class="alert alert-danger" role="alert">
					<b class="has-error">Por favor, corrija o(s) seguinte(s) erro(s) para continuar:</b><br>
					<form:errors path="*" class="has-error" />
				</div>
			</spring:hasBindErrors>
			
			<form:input type="hidden" path="id" name="id" id="id" />
		
			<div class="form-group">
				<label for="name">Nome: </label>
				<form:input type="text" path="name" name="name" id="name" class="form-control" />
				<font color="red">
					<form:errors path="name" />
				</font><br/>
			</div>
			
			<div class="form-group">
				<label for="description">Descrição:</label>
				<form:textarea id="description" class="form-control" path="description" name="description" rows="4" ></form:textarea>
				<font color="red">
					<form:errors path="description" />
				</font><br/>
			</div>
			
			<div class="form-group">
				<label for="genre">Gênero(s): </label>
				<form:input type="text" path="genre" name="genre" id="genre" class="form-control" />
				<font color="red">
					<form:errors path="genre" />
				</font><br/>
			</div>
			
			<div class="form-group">
				<label for="developer">Desenvolvedor(a): </label>
				<form:input type="text" path="developer" name="developer" id="developer" class="form-control" />
				<font color="red">
					<form:errors path="developer" />
				</font><br/>
			</div>
			
			<div class="form-group">
				<label for="publisher">Publisher: </label>
				<form:input type="text" path="publisher" name="publisher" id="publisher" class="form-control" />
				<font color="red">
					<form:errors path="publisher" />
				</font><br/>
			</div>
			
			<div class="form-group">
				<label for="price">Preço: </label>
				<form:input type="number" step="0.01" pattern="[0-9]+([\.,][0-9]+)?" path="price" name="price" id="price" class="form-control" />
				<font color="red">
					<form:errors path="price" />
				</font><br/>
			</div>
			
			<div class="form-group">
				<label for="imageUrl">URL da imagem do jogo: </label>
				<form:input type="text" path="imageUrl" name="imageUrl" id="imageUrl" class="form-control" />
				<font color="red">
					<form:errors path="imageUrl" />
				</font><br/>
			</div>
			
			<a class="btn btn-secondary btn-lg" href="${contextPath}/game">Voltar</a>
			<button type="submit" class="btn btn-primary btn-lg">Cadastrar</button>
			
		</form:form>
		
		</main>
	</body>
</html>