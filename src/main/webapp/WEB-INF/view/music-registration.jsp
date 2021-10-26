<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:template title="Cadastro de Músicas">
    <jsp:body>

        <h3 class="titulo">Cadastro de Músicas</h3>
        <div class="row">
            <form action="cadastrar-musicas" method="post" class="col s12">
                <div class="row">
                    <div class="input-field col s12 l6">
                        <select name="cd_id" id="select-cd" class="browser-default">
                            <option value="" disabled selected>Selecione um CD</option>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6 l3">
                        <input id="faixa" type="number" min="1" max="50" name="track" class="validate">
                        <label for="faixa">Faixa</label>
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
                        <button class="waves-effect waves-light orange btn">Salvar</button>
                    </div>
                </div>
            </form>
        </div>

        <script>
            window.onload = function (){
                $.get('cds', function(data) {
                    let $select = $('#select-cd');
                    $.each(data, function(index, item) {
                        $('<option>').val(item.id).text(item.title).appendTo($select);
                    });
                });
                $('#select-cd').change(function (){
                    let params = {
                        cd: $(this).find(':selected').text()
                    }
                    localStorage.setItem('cd', params.cd);
                });
            }
        </script>

    </jsp:body>
</t:template>
