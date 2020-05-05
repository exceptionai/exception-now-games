<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
<script
	src="https://unpkg.com/masonry-layout@4/dist/masonry.pkgd.min.js"></script>
<script src="https://unpkg.com/magic-grid/dist/magic-grid.min.js"></script>
<script src="https://code.jquery.com/jquery-3.5.0.min.js"
	integrity="sha256-xNzN2a4ltkB44Mc/Jz3pT4iU1cmeR0FkXs4pru/JxaQ="
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/vanillatoasts@1.3.0/vanillatoasts.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/vanillatoasts@1.3.0/vanillatoasts.css"
	rel="stylesheet">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/autoreload.js" />"></script>

<title>Exception Now Games</title>

<c:set value="${pageContext.request.contextPath}" var="contextPath" />

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
		<nav class="navbar navbar-expand-lg -bg-secondary sticky-top">


			<div class="collapse navbar-collapse container _container"
				id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link"
						href="<c:url value="/" />">Início</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${contextPath}/game/form?page=newGame">Adicionar Jogo</a></li>
					<li class="nav-item"><a class="nav-link disabled" href="#">Amigos</a>
					</li>
					<li class="nav-item"><a class="nav-link disabled" href="#">Meus
							Jogos</a></li>
				</ul>
				<ul class="user-area navbar-nav d-flex align-items-center">
					<li class=""><i class="fas fa-heart disabled link"></i></li>
					<li><i class="fas fa-shopping-cart disabled link"></i></li>
					<li><i class="fas fa-comment-alt disabled link"></i></li>
					<li><span class="text-light pr-2">Usuario_Spring</span/> <img
						src="https://image.flaticon.com/icons/svg/2317/2317963.svg"
						class="rounded-circle" alt="Cinque Terre"></li>

				</ul>

			</div>
		</nav>
	</header>
		<main class="container games-container _container">
			<div class="row">
				<span class="col-sm-1"></span>
				<h2 class="content-title">Sobre ${game.name}</h2>
			</div>
			<div class=row>
				<span class="col-sm-1"></span>
				<div class="col-sm-5 text-wrap">
						<p class="text-wrap">${game.description}</p>
						<div class="row">
							<div class="col-sm-3">Gênero:</div>
							<div class="col">${game.genre}</div>
						</div>
						<div class="row">
							<div class="col-sm-3">Desenvolvedor:</div>
							<div class="col">${game.developer}</div>
						</div>
						<div class="row">
							<div class="col-sm-3">Publicado por:</div>
							<div class="col">${game.publisher}</div>
						</div>
						<div class="row">
							<div class="col-sm-3">Preço:</div>
							<c:if test="${ game.price > 0}">
								<div class="col">R$ ${game.price}</div>
							</c:if>
							<c:if test="${ game.price == 0}">
								<div class="col">Gratuito</div>
							</c:if>
						</div>
						<div class="pt-4-my-md-5 pt-md-5">
							<a class="btn btn-secondary text-light btn-lg mr-4" href="${contextPath}/game">Voltar</a>
							<a class="btn btn-primary btn-lg" href="${contextPath}/game/form?page=editGame&id=${game.id}">Editar</a>
						</div>
						
				</div>
				<div class ="col-sm-5">
					<img src="${game.imageUrl}" class="img-fluid" alt="Responsive image">
				</div>
				<span class="col-sm-1"></span>
			</div>
		
		</main>
		
	<script src="<c:url value="/resources/js/navbar.js" />"></script>
	<script src="<c:url value="/resources/js/form.js" />"></script>
	</body>
</html>