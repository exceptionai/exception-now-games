<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />  
		<link rel="shortcut icon" href="<c:url value="/resources/img/logo.png" />" />
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<script src="https://kit.fontawesome.com/98b78c6895.js" crossorigin="anonymous"></script>
   
		<script src="<c:url value="/resources/js/autoreload.js" />" ></script>		
		<script src="https://code.jquery.com/jquery-3.5.0.min.js"
	integrity="sha256-xNzN2a4ltkB44Mc/Jz3pT4iU1cmeR0FkXs4pru/JxaQ="
	crossorigin="anonymous"></script>
	<script
	src="https://cdn.jsdelivr.net/npm/vanillatoasts@1.3.0/vanillatoasts.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/vanillatoasts@1.3.0/vanillatoasts.css"
	rel="stylesheet">
		<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/css/form.css" />" rel="stylesheet">
	
		<title>Exception Now Games</title>
		
		
		<c:set value="${pageContext.request.contextPath}" var="contextPath"/>
	</head> 
	<body class="-bg-primary-color">
		<header> 
			
			   <div class="row  mx-0  -bg-card">
				<img src="<c:url value="/resources/img/logo.png" />" alt="logo exception">
		 	  	<div class="_container title-container">
		 	  		<h1 class="application-title">Exception Now Games</h1>
		 	  	</div>
		 	  </div>
			<nav class="navbar navbar-expand-lg sticky-top -bg-secondary">
			  <div class="collapse navbar-collapse container _container" id="navbarSupportedContent">
			    <ul class="navbar-nav mr-auto">
			      <li class="nav-item ">
			        <a class="nav-link" href="<c:url value="/" />">Início</a>
			      </li>
			      <li class="nav-item active">
			        <a class="nav-link" href="${contextPath}/game/form?page=newGame">Adicionar Jogo</a>
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
		<h2 class="content-title">Adicionar Game</h2>
		
		<form:form modelAttribute="gameModel" action="${contextPath}/game/new" method="POST">
		
			
			<div class="form-row pb-4">
				<div class="form-add col px-4">
					<div class="form-row">
						<label for="name">Nome: </label>
						<form:input type="text" path="name" name="name" id="name" class="form-control" />
						<font color="red">
							<form:errors path="name" />
						</font>
					</div>
					
					<div class="form-row">
						<label for="description">Descrição:</label>
						<form:textarea id="description" class="form-control" path="description" name="description" rows="3"></form:textarea>
						<font color="red">
							<form:errors path="description" />
						</font>
					</div>
					
					<div class="form-row">
						<label for="genre">Gênero(s): </label>
						<form:input type="text" path="genre" name="genre" id="genre" class="form-control" />
						<font color="red">
							<form:errors path="genre" />
						</font>
					</div>
					
					<div class="form-row">
						<div class="col pl-0">
							<label for="developer">Desenvolvedor(a): </label>
							<form:input type="text" path="developer" name="developer" id="developer" class="form-control" />
							<font color="red">
								<form:errors path="developer" />
							</font>
						</div>
						
						<div class="col pr-0">
							<label for="publisher">Publisher: </label>
							<form:input type="text" path="publisher" name="publisher" id="publisher" class="form-control" />
							<font color="red">
								<form:errors path="publisher" />
							</font>
						</div>
					
					</div>
					
					<div class="form-row">
						<div class="col pl-0">
							<label for="price">Preço: </label>
								 <div class="input-group">
					 
					<div class="input-group-prepend">
			          <div class="input-group-text price-preppend">R$</div>
			        </div>
					<form:input type="number" step="0.01" pattern="[0-9]+([\.,][0-9]+)?" path="price" name="price" id="price" class="form-control" />
				</div>
							
						</div>
						
					<div class="col-auto mt-4 pr-0  align-items-center d-flex">
					      <div class="custom-control custom-checkbox mr-sm-2">
					        <input type="checkbox" class="custom-control-input" id="freePrice">
					        <label class="custom-control-label" for="freePrice">Gratuito</label>
					      </div>
					    </div>
					    
					</div>
				<font color="red">
					<form:errors path="price" />
				</font>
					
					
				</div>
				<div class="col mx-4">
				
					<div class="form-row  ">
						<label for="imageUrl">URL da imagem do jogo: </label>
						<div class="input-group">
						<form:input type="text" path="imageUrl" name="imageUrl" id="imageUrl" class="form-control" />
						  <div class="input-group-append">
						    <button type="button" class="input-group-text" id="btn-refresh-img">Preview</button>
						  </div>
						
						</div>
						<font color="red">
							<form:errors path="imageUrl" />
						</font>
					</div>
					<div class="form-row py-4 form-img">
						<img src="https://www.getdigital.eu/web/getdigital/gfx/products/__generated__resized/1100x1100/12586NSM_Block_Lampe_004.jpg" alt="Imagem do jogo" title="interrogação" class="img-fluid" id="game-img">
					
					</div>
				</div>
			</div>
			
			<div class="form-row form-buttons justify-content-center">
				<a class="btn btn-secondary text-light btn-lg mr-4" href="${contextPath}/game">Voltar</a>
				<button type="submit" class="btn btn-primary btn-lg">Cadastrar</button>
			</div>
				
			<spring:hasBindErrors name="gameModel">
				<script>
	
				$(document).ready(() => {
					let toast = VanillaToasts.create({
						title: "Por favor, corrija o(s) seguinte(s) erro(s) para continuar: ",
						text: '<form:errors path="*" />',
						type: "error",
						icon: "https://image.flaticon.com/icons/png/512/190/190406.png",
						timeout: 20000
					});
					$("#vanillatoasts-container").addClass("toast-expanded");
					
					$("input").change(()=> 
					  setTimeout(()=>
						toast.hide(),
						2000
					  )
					)
				});
				</script>
			</spring:hasBindErrors>
			</form:form>
			
		</main>
		
	<script src="<c:url value="/resources/js/navbar.js" />"></script>
	<script src="<c:url value="/resources/js/form.js" />"></script>
	</body>
</html>