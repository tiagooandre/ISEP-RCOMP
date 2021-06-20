

## ESCALA ##

10m = 5 cm

(escala power point) --> 10m = 3.58 cm


## PISO 0 ##


| SALA | COMPRIMENTO(cm) | LARGURA(cm) | COMPRIMENTO(m) | LARGURA(m) | AREA(m²) | OUTLETS |
|:--------------------:|:--------------------:|:-------------:|:-----------------:|:--------------:|:---------------:|:------------------------------:|
| 40.1 | 3.8 cm | 3.6 cm | 7.6 m | 7.2 m | 54.72 m² | 60/10 *2 = 12 OUTLETS |
| 40.2 | 3.8 cm | 3.6 cm | 7.6 m | 7.2 m | 54.72 m² | 60/10 *2 = 12 OUTLETS |
| 40.3 | 3.8 cm | 3.8 cm | 7.6 m | 7.6 m | 57.76 m² | 60/10 *2 = 12 OUTLETS |
| 40.4 | 3 cm | 3.8 cm | 6 m | 7.6 m | 45.6 m² | 50/10 *2 = 10 OUTLETS |
| Right Area A | 10.2 cm | 2.7cm | 20.4 m | 5.4 m | 110.16 m² | 120/10 *2 = 24 OUTLETS |
| Right Area B | 14.7 cm | 28.7 cm | 29.4 m | 57.4 m | 1687.56 m² | 1700/10 *2 = 340 OUTLETS |
| TOTAL Right Area | | | | | 1797.72 m² | 340 + 24 = 364 OUTLETS |

TOTAL OUTLETS = 410



## INVENTÁRIO DO PISO 0 ##

--> 144 metros de cabo de fibra ótica monomodo; 

--> 9968.14 metros de cabo CAT7;

--> 14 access points;

--> 3 horizontal cross-connect;

--> 1 intermediate cross connect;

--> 1 patch panel de 48 portas para as salas 40.1 e 40.2;

--> 1 patch panel de 48 portas para as salas 40.3 e 40.4;

--> 8 patch panel de 48 portas para o lado direito;


## CÁLCULO DE CABO PISO 0 ## (usado método -->( (outlet mais longe + outlet mais próximo) / 2 )* numero de outlets)

--> CABO DE COBRE BAIXO (zona inferior das salas 40.3 e 40.4)=  18 + 3 / 2 * 11 = 115, 5m

--> CABO DE COBRE CIMA (zona superior das salas 40.3, 40.4 e ligação às salas 40.1 e 40.2)=  66.8 + 1.4 / 2 * 35 = 1193.5m

--> CABO DE COBRE GRELHA (zona superior da sala 40.4 e ligação ao lado direito)=  40 + 1.4 / 2 * 131 = 2711.7m

--> CABO DE COBRE GRELHA MEIO (zona do HC do meio)=  24 + 5 / 2 * 34 = 493m

--> CABO DE COBRE GRELHA DIREITA (zona do HC da direita)=  49.4 + 4.4 / 2 * 202 = 5433.8

--> CABO DE COBRE HC DO MEIO ATÉ AP (zona do HC do meio inferior onde faz ligação aos AP)=  1.84 + 18.8 = 20.64m

--> CABO DE FIO ÓTICO =  57 + 58 + 3 + 1 + 4 +21 = 144m




## PISO 1 ##

| SALA | COMPRIMENTO(cm) | LARGURA(cm) | COMPRIMENTO(m) | LARGURA(m) | AREA(m²) | OUTLETS |
|:----:|:---------------:|:-----------:|:--------------:|:----------:|:--------:|:-----------------------:|
| | | | | | | |
| 41.1 | 3.8 cm | 3.7 cm | 7.6 m | 7.4 m | 56.24 m² | 60/10 *2 = 12 OUTLETS |
| 41.2 | 3.8 cm | 3.7 cm | 7.6 m | 7.4 m | 56.24 m² | 60/10 *2 = 12 OUTLETS |
| 41.3 | 4.4 cm | 5.5 cm | 8.8 m | 11 m | 96.8 m² | 100/10 *2 = 20 OUTLETS |
| 41.4 | 2.5 cm | 3.8 cm | 5 m | 7.6 m | 38 m² | 40/10 *2 = 8 OUTLETS |

TOTAL OUTLETS = 52



## INVENTÁRIO DO PISO 1 ##

--> 2.4 metros de cabo de fibra ótica monomodo; 

--> 1118.8 metros de cabo CAT7; 

--> 2 access points;

--> 1 horizontal cross-connect;

--> 1 patch panel de 48 portas para as salas 40.1 e 40.2;

--> 1 patch panel de 48 portas para as salas 40.3 e 40.4;


## CÁLCULO DE CABO PISO 1 ## (usado método -->( (outlet mais longe + outlet mais próximo) / 2 )* numero de outlets)

--> CABO DE COBRE BAIXO (zona inferior da sala 41.4 e sala 41.43)=  36.6 + 6 / 2 * 24 = 511.2m

--> CABO DE COBRE CIMA (zona superior da sala 41.4 e ligação às salas 41.1 e 41.2)=  42.4 + 1 / 2 * 28 = 607.6m

--> CABO DE FIO ÓTICO =  2.4m





## NOTAS FINAIS ##

--> No Piso 0 utilizam-se 14 access points, com 18.72 metros de diametro (6.7cm), sem o alcance máximo de 50m para garantir os 30 utilizadores por cada access point--> 410/30 = 14;

--> No Piso 1 utilizam-se 2 access points, com 37.43 metros de diametro (13.4), sem o alcance máximo de 50m para garantir os 30 utilizadores por cada access point--> 52/30 = 2;

--> Em ambos os pisos, o intermediate cross-connect e os horizontal cross-connect foram colocados em áreas de trabalho, nas salas 40.4 e 41.4;

--> É utilizado o cabo de fibra otica monomodo uma vez que é imune a dispersões, permite uma maior data rates e maior comprimento de cabo;

--> É utilizado o cabo de cobre CAT7 uma vez que têm maior velocidade em relação ao CAT6A;

--> São utilizados 3 horizontal cross-connect uma vez que o piso tem uma área total de 2322,6 m², de forma a respeitar aa regra dos 1000 m² são necessários 3; 

--> Cada outlet está colocado de modo a assegurar a regra de os 3 metros de distância;

--> A cada access points está associado um outlet;

--> Piso 0 tem 424 outlets (com AP incluido);

--> Piso 1 tem 54 outlets (com AP incluido);

--> Nas salas 40.3 e 40.4 é utilizado um patch panel de 48 entradas uma vez que 24 entradas para 24 outlets seria a medida certa mas não dá possibilidade de melhoramento;





