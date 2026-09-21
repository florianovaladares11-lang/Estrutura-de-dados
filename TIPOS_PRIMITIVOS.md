# Tipos Primitivos — Java, JavaScript e Python

Tipo primitivo é o tipo de dado mais básico de uma linguagem: o "tijolo" com que todo o resto é construído.

---

## Java

Java tem 8 tipos primitivos de verdade (escritos em minúsculo). Eles guardam o valor direto na memória.

| Tipo | O que guarda | Tamanho | Exemplo |
|---|---|---|---|
| `byte` | número inteiro pequeno | 8 bits | `byte b = 100;` |
| `short` | número inteiro | 16 bits | `short s = 3000;` |
| `int` | número inteiro (o mais usado) | 32 bits | `int idade = 17;` |
| `long` | número inteiro grande | 64 bits | `long populacao = 8000000000L;` |
| `float` | número com vírgula | 32 bits | `float nota = 7.5f;` |
| `double` | número com vírgula (mais preciso) | 64 bits | `double pi = 3.14159;` |
| `char` | um único caractere | 16 bits | `char letra = 'A';` |
| `boolean` | verdadeiro ou falso | 1 bit | `boolean passou = true;` |

> Obs: `String` em Java **não** é primitivo, é uma classe (objeto).

---

## JavaScript

Em JavaScript você não declara o tipo — ele é descoberto sozinho. São 7 tipos primitivos:

| Tipo | O que guarda | Exemplo |
|---|---|---|
| `number` | qualquer número (inteiro ou decimal) | `let idade = 17;` |
| `string` | texto | `let nome = "Maria";` |
| `boolean` | verdadeiro ou falso | `let passou = true;` |
| `undefined` | variável declarada sem valor | `let x;` |
| `null` | ausência proposital de valor | `let y = null;` |
| `bigint` | números inteiros gigantes | `let n = 9007199254740993n;` |
| `symbol` | identificador único | `let id = Symbol("id");` |

Para descobrir o tipo: `typeof variavel`

---

## Python

Python também descobre o tipo sozinho. Os principais tipos básicos:

| Tipo | O que guarda | Exemplo |
|---|---|---|
| `int` | número inteiro | `idade = 17` |
| `float` | número com vírgula | `nota = 7.5` |
| `complex` | número complexo | `c = 2 + 3j` |
| `str` | texto | `nome = "Maria"` |
| `bool` | `True` ou `False` | `passou = True` |
| `NoneType` | ausência de valor | `x = None` |

Para descobrir o tipo: `type(variavel)`

---

## Comparação rápida

| Conceito | Java | JavaScript | Python |
|---|---|---|---|
| Inteiro | `int` | `number` | `int` |
| Decimal | `double` / `float` | `number` | `float` |
| Texto | `String` (não primitivo) | `string` | `str` |
| Lógico | `boolean` | `boolean` | `bool` |
| Vazio | `null` (só em objetos) | `null` / `undefined` | `None` |

---

# Array x Lista

**ARRAY:** todos os elementos são do **mesmo tipo**.

```
array = [1, 3, 5, 7, 9, 10]
array = [True, True, True, False]
array = [3.2, 3.1, 3.0, 2.9]
```

**LISTA (list):** pode misturar **tipos diferentes**, dentro de colchetes.

```
list = [1, 3, 5, 7, 9, 11, 'B']
```

## Array dentro de Array (array bidimensional / matriz)

É um array cujos elementos são outros arrays. Vira uma tabela com linhas e colunas:

```
matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
```

- `matriz[0]` → `[1, 2, 3]` (a primeira linha)
- `matriz[0][2]` → `3` (linha 0, coluna 2)

Usa-se para tabelas, tabuleiros de jogo (jogo da velha, xadrez), imagens (pixels), planilhas.

### Como fica em cada linguagem

**Java** (precisa dizer o tipo e o tamanho)
```java
int[] numeros = {1, 3, 5, 7, 9};
int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
System.out.println(matriz[1][0]); // 4
```

**JavaScript** (aceita tipos misturados, funciona como lista)
```javascript
let numeros = [1, 3, 5, 7, 9];
let matriz = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
console.log(matriz[1][0]); // 4
```

**Python** (a `list` do Python aceita tipos misturados)
```python
numeros = [1, 3, 5, 7, 9]
matriz = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
print(matriz[1][0])  # 4
```
