<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="shortcut icon"
			href="<c:url value="/resources/img/logo.png" />" />
		<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
			crossorigin="anonymous">
		<script src="https://kit.fontawesome.com/98b78c6895.js"
			crossorigin="anonymous"></script>
			<script src="https://unpkg.com/masonry-layout@4/dist/masonry.pkgd.min.js"></script>
			<script src="https://unpkg.com/magic-grid/dist/magic-grid.min.js"></script>
			<script
		src="https://code.jquery.com/jquery-3.5.0.min.js"
		integrity="sha256-xNzN2a4ltkB44Mc/Jz3pT4iU1cmeR0FkXs4pru/JxaQ="
		crossorigin="anonymous"></script>

		<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
		<script src="<c:url value="/resources/js/autoreload.js" />"></script>
		<title>Exception Now Games</title>
	</head> 
	<body class="-bg-primary-color">
		<header>

			<div class="row mx-0 -bg-card">
				<img src="<c:url value="/resources/img/logo.png" />"
					alt="logo exception">
				<div class="_container title-container">
					<h1 class="application-title">Exception Now Games</h1>
				</div>
			</div>
			<nav class="navbar navbar-expand-lg -bg-secondary">
				
							
				<div class="collapse navbar-collapse container _container"
					id="navbarSupportedContent">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active"><a class="nav-link"
							href="<c:url value="/" />">In�cio</a></li>
						<li class="nav-item"><a class="nav-link"
							href="<c:url value="/game/new" />">Adicionar Jogo</a></li>
						<li class="nav-item"><a class="nav-link disabled" href="#">Amigos</a>
						</li>
						<li class="nav-item"><a class="nav-link disabled" href="#">Meus
								Jogos</a></li>
					</ul> 
					<ul class="user-area navbar-nav d-flex align-items-center">
						<li class="">
							<i class="fas fa-heart disabled link"></i>
						</li>
						<li>
							<i class="fas fa-shopping-cart disabled link"></i>
						</li>
						<li>
							<i class="fas fa-comment-alt disabled link"></i>
						</li>
						<li>
							<span 
							class="text-light pr-2">Usuario_Spring</span/>
							<img
							src="https://image.flaticon.com/icons/svg/2317/2317963.svg"
							class=rounded-circle alt="Cinque Terre">
						</li>
							
					</ul>

				</div>
			</nav>
		</header>
		<main class="container games-container _container">
			<h2 class="content-title">Games</h2>
			
			<c:if test="${not empty message}">
				<h3 class="alert alert-success">${message}</h3>
			</c:if>
		
		<div class="container games_list grid">
				<c:forEach items="${games}" var="game">
					<div class="card games-card grid-item">
						<img class="card-img-top"
							src="${game.imageUrl}"
							alt="Card image cap">
						<div class="card-body ">
							<h3 class="card-title">${game.name}</h3>
							<h4 class="card-subtitle mb-2 text-muted">${game.genre}</h4>
							<a href="#" class="card-link">Detalhes</a> <a href="#"
								class="card-link">Editar</a> <a href="#" class="card-link">Remover</a>
						</div>
					</div>
				</c:forEach>
			</div>
		</main> 
		<script src="<c:url value="/resources/js/main.js" />"></script>
</body>
</html>