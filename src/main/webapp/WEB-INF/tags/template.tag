<%@ tag description="Template principal" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ attribute name="title"%>
<jsp:useBean id="date" class="java.util.Date" />

<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0"/>
    <title>${title}</title>

    <!-- CSS  -->
    <link rel="stylesheet" href="assets/resources/styles/main.css"/>
    <link rel="stylesheet" href="assets/resources/styles/template.css"/>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons"/>
    <link rel="stylesheet" href="assets/libraries/materialize/css/materialize.css" media="screen,projection"/>
    <link rel="stylesheet" href="assets/libraries/font-awesome/css/fontawesome.css"/>
</head>
<body>
    <header>
        <nav class="light-blue lighten-1" role="navigation">
            <div class="nav-wrapper container">
                <a id="logo-container" href="" class="brand-logo">
                    <img src="assets/resources/images/logo.png"/>
                </a>
                <ul class="right hide-on-med-and-down">
                    <li>
                        <a href="">Inicio</a>
                    </li>
                    <li>
                        <a href="cadastrar-cds">Cadastrar CD's</a>
                    </li>
                    <li>
                        <a href="cadastrar-musicas">Cadastrar Músicas</a>
                    </li>
                </ul>

                <ul id="nav-mobile" class="sidenav">
                    <li>
                        <a href="">Inicio</a>
                    </li>
                    <li>
                        <a href="cadastrar-cds">Cadastrar CD's</a>
                    </li>
                    <li>
                        <a href="cadastrar-musicas">Cadastrar Músicas</a>
                    </li>
                </ul>
                <a href="#" data-target="nav-mobile" class="sidenav-trigger"><i class="material-icons">menu</i></a>
            </div>
        </nav>
    </header>

    <main id="content" class="container">
        <jsp:doBody></jsp:doBody>
    </main>

    <footer class="page-footer orange">
        <div class="container">
            <div class="row">
                <div class="col s12 center footer">
                    <a href="https://www.utfpr.edu.br/guarapuava">
                        <img src="assets/resources/images/logo_utfpr.png" class="img-responsive"/>
                    </a>
                </div>
            </div>
        </div>
        <div class="footer-copyright">
            <div class="container">
                &#169; Copyright <fmt:formatDate value="${date}" pattern="yyyy" /> - Todos os direitos reservados
            </div>
        </div>
    </footer>

    <!--  Scripts-->
    <script src="assets/libraries/jquery/jquery-2.1.1.min.js"></script>
    <script src="assets/libraries/jquery.mask.min.js"></script>
    <script src="assets/libraries/materialize/js/materialize.js"></script>
    <script src="assets/resources/scripts/index.js"></script>
</body>
</html>
