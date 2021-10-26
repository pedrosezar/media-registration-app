<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Detalhes do CD">
    <jsp:body>

        <h5>Contador Global: ${counterApplication}</h5>
        <h6>Contador Sessão: ${counterSession}</h6>
        <h1 class="artista">Artista: ${cd.artist}</h1>
        <h2 class="cd">CD: <span>${cd.title}</span></h2>
        <h3 class="ano">Ano: ${cd.year}</h3>
        <h4 class="musicas">Músicas</h4>
    <c:if test="${not empty musics}">
        <ol class="musicas">
        <c:forEach var="music" items="${musics}">
            <li><span>${music.title}</span></li>
        </c:forEach>
        </ol>
    </c:if>
    <c:if test="${empty musics}">
        <span>Nenhum resultado encontrado!</span>
    </c:if>

    </jsp:body>
</t:template>
