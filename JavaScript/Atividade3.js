//function
const alunos = [
    {
        nome:'joao',
        nota: 5,
        turm: 'A',
    },
    {
        nome:'sofia',
        nota: 9,
        turm: 'A',
    },
    {
        nome:'paulo',
        nota: 4,
        turm: 'C',
    }
];

function alunosAprovados(arr, media){
    let aprovados = [];
    for(let i=0;i < arr.length;i++){
        const {nota,nome} = arr[i];
        if(nota >= media){
            aprovados.push(nome);
        }
    }
    return aprovados;
}
console.log(alunosAprovados(alunos,5));