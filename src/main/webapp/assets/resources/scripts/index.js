const cds = document.querySelector('#select-cd');

document.addEventListener('DOMContentLoaded', async e => {
    const instance = M.FormSelect.getInstance(cds);
    instance.destroy();
    await pegarCds();
    M.FormSelect.init(cds);
})

const pegarCds = async () => {
    const data = await fetch(`cds`).then(resp => resp.json()).catch(error => false)
    if (!data) return
    inserirCds(data)
}

const inserirCds = (data) => {
    cds.innerHTML = '<option value="" disabled selected>Selecione um CD</option>'
    data.forEach(row => {
        cds.innerHTML += `<option value="${row["id"]}">${row["title"]}</option>`
    })
}

$(document).ready(function(){

    $('.sidenav').sidenav();

    $('select').formSelect();

    $('#ano').mask('0000');

});
