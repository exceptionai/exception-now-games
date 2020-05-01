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

<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/autoreload.js" />"></script>
<title>Exception Now Games</title>
</head>
<body class="-bg-primary-color">
	<header>

		<div class="row   -bg-card">
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
						href="<c:url value="/" />">Início</a></li>
					<li class="nav-item"><a class="nav-link"
						href="<c:url value="/game/new" />">Adicionar Jogo</a></li>
					<li class="nav-item"><a class="nav-link disabled" href="#">Amigos</a>
					</li>
					<li class="nav-item"><a class="nav-link disabled" href="#">Meus
							Jogos</a></li>
				</ul>
				<div class="user-area">
					<i class="fas fa-heart disabled link"></i> <i
						class="fas fa-shopping-cart disabled link"></i> <i
						class="fas fa-comment-alt disabled link"></i> <span
						class="text-light pr-2">Usuario_Spring</span/> <img
						src="https://image.flaticon.com/icons/svg/2317/2317963.svg"
						class=rounded-circle alt="Cinque Terre">
				</div>

			</div>
		</nav>
	</header>
	<main class="container games-container _container">
		<h2 class="content-title">Games</h2>

		<c:forEach items="${games}" var="game">
			<h3>${game.name}</h3>
		</c:forEach>
	</main>
</body>
</html>