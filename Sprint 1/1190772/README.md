# ESCALA ##

10m = 3.5 cm


## PISO 0 ##


|    SALA    | COMPRIMENTO(m) | LARGURA(m) |  AREA(m²)  |          OUTLETS         |
|:----------:|:--------------:|:----------:|:----------:|:------------------------:|
|            |                |            |            |                          |
| 30.1       | 7.8 m          | 6.1 m      | 47.39 m²   | 50/10 *2   = 10 OUTLETS  |
| 30.2       | 7.8 m          | 6.7 m      | 51.85 m²   | 60/10 *2   = 12 OUTLETS  |
| 30.3       | 7.8 m          | 6.6 m      | 51.51 m²   | 60/10 *2   = 12 OUTLETS  |
| 30.4       | 7.8 m          | 7.8 m      | 60.38 m²   | 70/10 *2   = 14 OUTLETS  |
| 30.5       | 7.8 m          | 6.1 m      | 47.44 m²   | 50/10 *2   = 10 OUTLETS  |
| Right Area | 57.8 m         | 28.8 m     | 1665.91 m² | 1670/10 *2 = 334 OUTLETS |



TOTAL OUTLETS = 392 



## INVENTÁRIO DO PISO 0 ##

--> 17.8 metros de cabo de fibra ótica monomodo; 

--> 20841 metros de cabo CAT6A;

--> 12 access points;

--> 3 horizontal cross-connect;

--> 1 intermediate cross connect;

--> 1 patch pannel de 48 portas para as salas 30.1 e 30.2 e 30.3;

--> 1 patch pannel de 48 portas para as salas 30.4 e 30.5;

--> 7 patch pannel de 48 portas e 1 patch pannel de 24 portas para o lado direito;


## CÁLCULO DE CABO PISO 0 ## (usado método -->( (outlet mais longe + outlet mais próximo) / 2 )* numero de outlets)

--> CABO DE COBRE SALA 30.4 = 75 m

--> CABO DE COBRE SALA 30.5 = 195 m

--> CABO DE COBRE SALA 30.1 = 304 m

--> CABO DE COBRE SALA 30.2 = 502 m

--> CABO DE COBRE SALA 30.3 = 614 m

--> CABO DE COBRE SALA GRANDE = 7417 + 11186 + 23 = 18626 m 

--> CABO DE COBRE ACESS POINTS = 525 m 

--> CABO DE FIO ÓTICO =  17.8 m




## PISO 1 ##

| SALA | COMPRIMENTO(m) | LARGURA(m) | AREA(m²) |          OUTLETS         |
|:----:|:--------------:|:----------:|:--------:|:------------------------:|
|      |                |            |          |                          |
| 31.1 | 7.8 m          | 6.1 m      | 47.38 m² | 50/10 *2   = 10 OUTLETS  |
| 31.2 | 7.8 m          | 6.7 m      | 51.83 m² | 60/10 *2   = 12 OUTLETS  |
| 31.3 | 11.7 m         | 6.6 m      | 77.56 m² | 80/10 *2   = 16 OUTLETS  |
| 31.4 | 7.8 m          | 7.7 m      | 60.36 m² | 70/10 *2   = 14  OUTLETS |
| 31.5 | 6.1 m          | 7.7 m      | 47.43 m² | 50/10 *2   = 10  OUTLETS |
| 31.6 | 5 m            | 6.7 m      | 33.38 m² | 40/10 *2   = 8  OUTLETS  |


TOTAL OUTLETS = 70



## INVENTÁRIO DO PISO 1 ##

--> 2.9 metros de cabo de fibra ótica monomodo; 

--> 1662.5 metros de cabo CAT6A; 

--> 4 access points;

--> 1 horizontal cross-connect;

--> 1 patch pannel de 48 portas para as salas 31.1, 31.2, 31.3 e 31.4;

--> 1 patch pannel de 48 portas para as salas 31.4 e 31.5;


## CÁLCULO DE CABO PISO 1 ## (usado método -->( (outlet mais longe + outlet mais próximo) / 2 )* numero de outlets)

--> CABO DE COBRE SALA 31.1 = 250 m

--> CABO DE COBRE SALA 31.2 = 306 m 

--> CABO DE COBRE SALA 31.3 = 428 m

--> CABO DE COBRE SALA 31.4 = 122 m 

--> CABO DE COBRE SALA 31.5 = 150 m

--> CABO DE COBRE SALA 31.6 = 342 m
 
--> CABO DE COBRE ACESS POINTS = 64.5 m

--> CABO DE FIO ÓTICO =  2.9 m


## ORÇAMENTO ##

--> Cabo de fibra ótica monomodo - 114 €

--> Cabo CAT6A - 45000 €

--> AP´s - 4800 €

--> HCC´s - 4000 €

--> ICC - 3000 €

--> Patch Pannels de 48 portas - 630 €

--> Patch Pannel de 24 portas - 30 €



## NOTAS FINAIS ##

--> No dois pisos utilizam-se 146 access points, com 25 m de diametro, sem o alcance máximo de 50m para garantir os 30 utilizadores por cada access point.

--> Em ambos os pisos, o intermediate cross-connect e os horizontal cross-connect foram colocados em áreas de trabalho, nas salas 30.4 e 31.4.

--> É utilizado o cabo de fibra otica monomodo uma vez que é imune a dispersões, permite uma maior data rates e maior comprimento de cabo;

--> É utilizado o cabo de cobre CAT6A visto que o CAT7 não é tão comum.

--> No piso 0 são utilizados 3 horizontal cross-connect uma vez que o piso tem uma área total entre 2000 e 3000 m² de forma a respeitar aa regra dos 1000 m² são necessários 3;
 
--> Cada outlet está colocado de modo a assegurar a regra dos 3 metros de distância;