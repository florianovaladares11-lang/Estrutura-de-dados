
let numero1 = 10;                       // number
let numero2 = 25;                       // number
let preco = 19.99;                      // number (decimal)
let nome = "Guilherme";                 // string
let aprovado = true;                    // boolean
let semValor;                           // undefined
let vazio = null;                       // null
let numeroGigante = 9007199254740993n;  // bigint


let soma = numero1 + numero2;
console.log("Soma:", soma);

let total = preco * 3;
console.log("Total de 3 produtos:", total.toFixed(2));


console.log("Nome:", nome, "| tipo:", typeof nome);
console.log("Aprovado?", aprovado, "| tipo:", typeof aprovado);
console.log("Sem valor:", semValor, "| tipo:", typeof semValor);
console.log("Vazio:", vazio);
console.log("Numero gigante:", numeroGigante, "| tipo:", typeof numeroGigante);


let numeros = [1, 3, 5, 7, 9, 10];

let somaArray = 0;
for (let n of numeros) {
    somaArray += n;
}
console.log("Soma do array:", somaArray);
console.log("Media do array:", somaArray / numeros.length);


let lista = [1, 3, 5, 7, 9, 11, "B", true, 3.14];
console.log("Lista com tipos diferentes:", lista);


let matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

console.log("Linha 1, coluna 0:", matriz[1][0]);

console.log("Matriz completa:");
for (let linha of matriz) {
    console.log(linha.join(" "));
}
