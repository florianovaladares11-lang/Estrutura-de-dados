
numero1 = 10            # int
numero2 = 25            # int
preco = 19.99           # float
nome = "Guilherme"      # str
aprovado = True         # bool
vazio = None            # NoneType
complexo = 2 + 3j       # complex


soma = numero1 + numero2
print("Soma:", soma)

total = preco * 3
print("Total de 3 produtos:", round(total, 2))


print("Nome:", nome, "| tipo:", type(nome))
print("Aprovado?", aprovado, "| tipo:", type(aprovado))
print("Vazio:", vazio, "| tipo:", type(vazio))
print("Complexo:", complexo, "| tipo:", type(complexo))


numeros = [1, 3, 5, 7, 9, 10]

soma_array = 0
for n in numeros:
    soma_array += n

print("Soma do array:", soma_array)
print("Media do array:", soma_array / len(numeros))
print("Maior:", max(numeros), "| Menor:", min(numeros))


lista = [1, 3, 5, 7, 9, 11, 'B', True, 3.14]
print("Lista com tipos diferentes:", lista)

for item in lista:
    print(item, "->", type(item).__name__)


matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

print("Linha 1, coluna 0:", matriz[1][0])

print("Matriz completa:")
for linha in matriz:
    for valor in linha:
        print(valor, end=" ")
    print()
