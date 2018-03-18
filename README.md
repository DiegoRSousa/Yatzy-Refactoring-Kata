# Yatzy Refactoring Kata

## Kata: Regras Yatzy

O jogo Yatzy é um simples jogo de dados. Cada jogador lança cinco dados de 6 lados. Eles podem lançar novamente alguns ou todos os dados até três vezes (incluindo o lançamento original).

Por exemplo, suponha que um jogador lança:

3, 4, 5, 5, 2

Ele mantêm (-, -, 5, 5, -) e lança novamente (3, 4, -, -, 2):

5, 1, 5, 5, 3

Ele mantêm (5, -, 5, 5, -) e lança novamente (-, 1, -, -, 3):

5, 6, 5, 5, 2

O jogador coloca o lançamento em uma categoria, como um, dois, cinco, um par, dois pares, etc. (veja abaixo). Se o lançamento for compatível com a categoria, o jogador obtém uma pontuação para o lançamento de acordo com as regras. Se o lançamento não for compatível com a categoria, o jogador marca zero para o lançamento.

Por exemplo, suponha que um jogador marque 5, 6, 5, 5, 2 na categoria de cinco que marcaria 15 (três cincos). A pontuação para isso é então adicionada ao total e a categoria não pode ser usada novamente no restante para esse jogo. Um jogo completo consiste em marcar para cada categoria. Assim, para o último jogo. Um jogador deve escolher a sua única categoria restante.

Sua tarefa é marcar um lançamento DADO em uma categoria ADICIONAL. Você não precisa programar os dados aleatórios que lançam. O jogo NÃO é jogado, deixando o computador escolher a categoria de pontuação mais alta para um determinado lançamento.

## Kata: categorias e regras de pontuação

### Chance:
O jogador marca a soma de todos os lados, não importam os valores. Por exemplo:

-	1,1,3,3,6 colocando em pontuação change 14 (1+1+3+3+6)
-	4,5,5,6,1 colocando em pontuação "chance" 21 (4+5+5+6+1)

### Yatzy:
Se todos os lados tem o mesmo número, o jogador marca 50 pontos. Por exemplo:

-	1,1,1,1,1 colocado em pontuação "yatzy" 50
-	1,1,1,2,1 colocado em pontuação "yatzy" 0

### Um, Dois, Três, Quatro, Cinco, Seis:
O jogador marca a soma dos lados que lê um, dois, três, quatro, cinco ou seis, respectivamente. Por exemplo:

-	1,1,2,4,4 coloca em pontuação "quatro" 8 (4+4)
-	2,3,2,5,1 coloca em pontuação "dois" 4 (2+2)

### Par:
O jogador marca a soma de dois dos dois melhores dados correspondentes. Por exemplo, quando coloca em par:

-	3,3,3,4,4 pontuação 8 (4+4)
-	1,1,6,2,6 pontuação 12 (6+6)
-	3,3,3,4,1 pontuação 6 (3+3)
-	3,3,3,3,1 pontuação 6 (3+3)

### Dois pares:
Se existir dois pares de dados com o mesmo número, o jogador marca a soma desses dados: Por exemplo, quando colocado em dois pares:

-	1,1,2,3,3 pontuação 8 (1+1+3+3)
-	1,1,2,3,4 pontuação 0
-	1,1,2,2,2 pontuação 6 (1+1+2+2)

### Três de um tipo:
Se houver três dados com o mesmo número, o jogador marca a soma desses dados. Por exemplo, quando colocado em três de um tipo:

-	3,3,3,4,5 scores 9 (3+3+3)
-	3,3,4,5,6 scores 0
-	3,3,3,3,1 scores 9 (3+3+3)

### Quatro de um tipo:
Se houver quatro dados com o mesmo número, o jogador marca a soma desses dados. Por exemplo, quando colocado em Quatro de um tipo:

-	2,2,2,2,5 pontuação 8 (2+2+2+2)
-	2,2,2,5,5 pontuação 0
-	2,2,2,2,2 pontuação 8 (2+2+2+2)
### Pequena sequência:
Quando colocado em pequena sequência:, se o dado lê

	1,2,3,4,5

O jogador marca 15 (a soma de todos os lados).

### Grande sequência:
Quando colocado em grande sequência, se os dados são lidos

	2,3,4,5,6,

O jogador marca 20 (a soma de todos os lados)

### Casa cheia
Se os dados são dois de um tipo e três de outro, o jogador marca a soma de todos os dados. Por exemplo, quando colocado em casa cheia:

-	1,1,2,2,2 pontuação 8 (1+1+2+2+2)
-	2,2,3,3,4 pontuação 0
-	4,4,4,4,4 pontuação 0

