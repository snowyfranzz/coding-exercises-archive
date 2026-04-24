## Dados prévios:
Matriz Codificadora: $A = \begin{bmatrix}2 & 5 \\ 1 & 3\end{bmatrix}$
Mensagem Enviada: **G F E M P Z I R N P X H P V C O**
Matriz de Transição: $P = \begin{bmatrix}0.75 & 0 & 0.15 & 0.1 \\ 0.2 & 0.5 & 0.2 & 0.1 \\ 0.1 & k & 0.5 & 0.2 \\ 0 & 0.1 & 0.2 & 0.7\end{bmatrix}$



## Exercício 1:
1) Para proteger os comandos transmitidos, a empresa utiliza uma adaptação da cifra de Hill em módulo 27, considerando a seguinte correspondência: [A = 1, B = 2, ... Z = 26, # = 0]

a) Verifique se a matriz dada é inversível no módulo 27.

b) Determine a matriz decodificadora.

c) Decodifique a mensagem enviada pelo sensor.

d) Escolha uma palavra com 9 letras relacionada ao tema e codifique-a no módulo 27 usando a mesma matriz.  Apresente a palavra original e a codificação da mesma.

## Exercício 2:
2) Modelagem do estado do servidor por Cadeia de Markov

- O servidor central do sistema pode, a cada hora, estar em um dos seguintes estados:

- E1: Operação normal
- E2: Sobrecarga
- E3: Modo degradado
- E4: Falha total
 

- A matriz  mostra as probabilidades de transição entre os estados a cada hora.

a) Indique o significado do elemento  e determine o valor de  k

b) Construa o dígrafo associado à cadeia de Markov e a respectiva matriz de adjacência.

c) Suponha que, no instante inicial, o servidor esteja em X. Determine a probabilidade de que, após 3 horas, ele esteja em Y.

d) Um estado é denominado absorvente se, uma vez alcançado, não pode ser abandonado. Isto indica a presença de eventos irreversíveis. Verifique se esta situação ocorre na matriz acima e justifique sua resposta.

e) Verifique se a matriz é regular.

f) Determine o estado estacionário, caso exista, e interprete seu significado no contexto do estudo de caso.