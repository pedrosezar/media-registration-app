<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Cadastro de CD's">
    <jsp:body>

        <h3 class="titulo">Cadastro de CD's</h3>
        <div class="row">
            <form action="cadastrar-cds" method="post" class="col s12">
                <div class="row">
                    <div class="input-field col s12 l6">
                        <input id="artista" type="text" name="artist" class="validate">
                        <label for="artista">Artista</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12 l6">
                        <input id="titulo" type="text" name="title" class="validate">
                        <label for="titulo">Título</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6 l3">
                        <input id="ano" type="text" name="year" class="validate">
                        <label for="ano">Ano</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6 l3">
                        <button class="waves-effect waves-light orange btn">Salvar</button>
                    </div>
                </div>
            </form>
        </div>

    </jsp:body>
</t:template>
