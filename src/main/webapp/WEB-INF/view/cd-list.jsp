<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Tela Inicial">
    <jsp:body>

        <table class="responsive-table striped">
            <thead>
            <tr>
                <th>#</th>
                <th>Artista</th>
                <th>Título</th>
                <th>Ação</th>
            </tr>
            </thead>
            <tbody>
        <c:if test="${not empty cds}">
            <c:forEach var="cd" items="${cds}">
                <tr>
                    <td class="id">${cd.id}</td>
                    <td>${cd.artist}</td>
                    <td>${cd.title}</td>
                    <td>
                        <a href="visualizar?codCD=${cd.id}" id="link" class="waves-effect waves-light orange btn"><i class="material-icons right">visibility</i><span class="texto">vizualizar</span></a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${empty cds}">
                <tr>
                    <td colspan="4">Nenhum CD cadastrado!</td>
                </tr>
        </c:if>
            </tbody>
        </table>

    </jsp:body>
</t:template>
