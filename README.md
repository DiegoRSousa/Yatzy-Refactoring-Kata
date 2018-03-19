# Yatzy Refactoring Kata

## Kata: Regras Yatzy

O jogo Yatzy � um simples jogo de dados. Cada jogador lan�a cinco dados de 6 lados. Eles podem lan�ar novamente alguns ou todos os dados at� tr�s vezes (incluindo o lan�amento original).

Por exemplo, suponha que um jogador lan�a:

3, 4, 5, 5, 2

Ele mant�m (-, -, 5, 5, -) e lan�a novamente (3, 4, -, -, 2):

5, 1, 5, 5, 3

Ele mant�m (5, -, 5, 5, -) e lan�a novamente (-, 1, -, -, 3):

5, 6, 5, 5, 2

O jogador coloca o lan�amento em uma categoria, como um, dois, cinco, um par, dois pares, etc. (veja abaixo). Se o lan�amento for compat�vel com a categoria, o jogador obt�m uma pontua��o para o lan�amento de acordo com as regras. Se o lan�amento n�o for compat�vel com a categoria, o jogador marca zero para o lan�amento.

Por exemplo, suponha que um jogador marque 5, 6, 5, 5, 2 na categoria de cinco que marcaria 15 (tr�s cincos). A pontua��o para isso � ent�o adicionada ao total e a categoria n�o pode ser usada novamente no restante para esse jogo. Um jogo completo consiste em marcar para cada categoria. Assim, para o �ltimo jogo. Um jogador deve escolher a sua �nica categoria restante.

Sua tarefa � marcar um lan�amento DADO em uma categoria ADICIONAL. Voc� n�o precisa programar os dados aleat�rios que lan�am. O jogo N�O � jogado, deixando o computador escolher a categoria de pontua��o mais alta para um determinado lan�amento.

## Kata: categorias e regras de pontua��o

### Chance:
O jogador marca a soma de todos os lados, n�o importam os valores. Por exemplo:

-	1,1,3,3,6 colocando em pontua��o change 14 (1+1+3+3+6)
-	4,5,5,6,1 colocando em pontua��o "chance" 21 (4+5+5+6+1)

### Yatzy:
Se todos os lados tem o mesmo n�mero, o jogador marca 50 pontos. Por exemplo:

-	1,1,1,1,1 colocado em pontua��o "yatzy" 50
-	1,1,1,2,1 colocado em pontua��o "yatzy" 0

### Um, Dois, Tr�s, Quatro, Cinco, Seis:
O jogador marca a soma dos lados que l� um, dois, tr�s, quatro, cinco ou seis, respectivamente. Por exemplo:

-	1,1,2,4,4 coloca em pontua��o "quatro" 8 (4+4)
-	2,3,2,5,1 coloca em pontua��o "dois" 4 (2+2)

### Par:
O jogador marca a soma de dois dos dois melhores dados correspondentes. Por exemplo, quando coloca em par:

-	3,3,3,4,4 pontua��o 8 (4+4)
-	1,1,6,2,6 pontua��o 12 (6+6)
-	3,3,3,4,1 pontua��o 6 (3+3)
-	3,3,3,3,1 pontua��o 6 (3+3)

### Dois pares:
Se existir dois pares de dados com o mesmo n�mero, o jogador marca a soma desses dados: Por exemplo, quando colocado em dois pares:

-	1,1,2,3,3 pontua��o 8 (1+1+3+3)
-	1,1,2,3,4 pontua��o 0
-	1,1,2,2,2 pontua��o 6 (1+1+2+2)

### Tr�s de um tipo:
Se houver tr�s dados com o mesmo n�mero, o jogador marca a soma desses dados. Por exemplo, quando colocado em tr�s de um tipo:

-	3,3,3,4,5 scores 9 (3+3+3)
-	3,3,4,5,6 scores 0
-	3,3,3,3,1 scores 9 (3+3+3)

### Quatro de um tipo:
Se houver quatro dados com o mesmo n�mero, o jogador marca a soma desses dados. Por exemplo, quando colocado em Quatro de um tipo:

-	2,2,2,2,5 pontua��o 8 (2+2+2+2)
-	2,2,2,5,5 pontua��o 0
-	2,2,2,2,2 pontua��o 8 (2+2+2+2)
### Pequena sequ�ncia:
Quando colocado em pequena sequ�ncia:, se o dado l�

	1,2,3,4,5

O jogador marca 15 (a soma de todos os lados).

### Grande sequ�ncia:
Quando colocado em grande sequ�ncia, se os dados s�o lidos

	2,3,4,5,6,

O jogador marca 20 (a soma de todos os lados)

### Casa cheia
Se os dados s�o dois de um tipo e tr�s de outro, o jogador marca a soma de todos os dados. Por exemplo, quando colocado em casa cheia:

-	1,1,2,2,2 pontua��o 8 (1+1+2+2+2)
-	2,2,3,3,4 pontua��o 0
-	4,4,4,4,4 pontua��o 0

[fonte](https://github.com/emilybache/Yatzy-Refactoring-Kata)

