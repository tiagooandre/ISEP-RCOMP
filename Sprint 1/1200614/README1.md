## ESCALA ##

10m = 4 cm

(escala power point) Piso 0 --> 10m = 5,95 cm; Piso 1 --> 10m = 5 cm


## PISO 0 ##


| SALA          | COMPRIMENTO(cm) | LARGURA(cm) | COMPRIMENTO(m) | LARGURA(m) | AREA(m²) | OUTLETS                      |
|---------------|-----------------|-------------|----------------|------------|----------|------------------------------|
| 10.1          | 4.6 cm          | 2.8 cm      | 11.5 m         | 7 m        | 80.5 m²  | 80.5/10 *2 + 2  = 19 OUTLETS |
| 10.2          | 4.6 cm          | 4.4 cm      | 11.5 m         | 11 m       | 126.5 m² | 126.5/10 *2 + 2 = 28 OUTLETS |
| 10.3 (balcão) | 0.7 cm          | 3.1 cm      | 1.75 m         | 7.75 m     | 13.56 m² | 13.56/10 *2 + 2 = 5 OUTLETS  |

TOTAL OUTLETS = 52



## INVENTÁRIO DO PISO 0 ##

--> 20 metros de cabo de fibra ótica monomodo; 

--> 600 metros de cabo CAT6;

--> 3 access points;

--> 1 horizontal cross-connect;

--> 1 patch pannel de 48 portas para as salas 10.1 e 10.2;

--> 1 patch pannel de 24 portas para a sala 10.3(balcão);


## CÁLCULO DE CABO PISO 0 ## (outlet mais perto(1), outlet mais longe(2)) (usado método -->( (outlet mais perto + outlet mais longe) / 2 )* numero de outlets)

--> SALA 10.1=  3,75 + 13,68 / 2 * 19 = 165,6m

--> SALA 10.2=  3,90 + 13,65 / 2 * 28 = 245,7m

--> SALA 10.3(Balcão)=  31,3 + 33,8 / 2 * 5 = 162,75m

--> CABO DE FIO ÓTICO =  5,98 cm = 10,1m




## PISO 1 ##

| SALA | COMPRIMENTO(cm) | LARGURA(cm) | COMPRIMENTO(m) | LARGURA(m) | AREA(m²)  | OUTLETS                         |
|------|-----------------|-------------|----------------|------------|-----------|---------------------------------|
| 11.1 | cm              | cm          | m              | m          | m²        |                                 |
| 11.2 | 2.2 cm          | 3.1 cm      | 5.5 m          | 7.75 m     | 42.63 m²  | 42.63/10 *2 + 2 = 11 OUTLETS    |
| 11.3 | 4.7 cm          | 2.9 cm      | 11.75 m        | 7.25 m     | 85.19 m²  | 85.19/10 *2 + 2 = 20 OUTLETS    |
| 11.4 | 4.7  cm         | 4.5 cm      | 11.75 m        | 11.25 m    | 132.19 m² | 132.19/10 *2 + 2  = 29  OUTLETS |

TOTAL OUTLETS = 60



## INVENTÁRIO DO PISO 1 ##

--> 25 metros de cabo de fibra ótica monomodo; 

--> 3500 metros de cabo CAT6; 

--> 3 access points;

--> 1 horizontal cross-connect;

--> 1 patch pannel de 24 portas para a sala 11.3;

--> 1 patch pannel de 48 portas para as salas 11.2 e 11.4;

--> 1 intermediate cross connect;

--> 1 main cross connect;

## CÁLCULO DE CABO PISO 1 ## (outlet mais perto(1), outlet mais longe(2)) (usado método -->( (outlet mais perto + outlet mais longe) / 2 )* numero de outlets)

--> SALA 11.2=  37.56 + 45.38 / 2 * 11 = 456.17m

--> SALA 11.3=  48.48 + 61.92 / 2 * 20 = 928.8m

--> SALA 11.4=  55.8 + 78.78 / 2 * 29 = 1951.41m

--> CABO DE FIO ÓTICO =  7.84cm = 15.68




## NOTAS FINAIS ##

--> No Piso 0 utilizam-se 3 access points,um na sala 10.3 com 8.96 metros de diametro (5.33cm), outro na sala 10.2 com 10 metros de diametro (5.95cm) e outro na sala 10.1 com 8.76 metros de diametro (5.21cm), sem o alcance máximo de 50m para garantir os 30 utilizadores por cada access point;

--> No Piso 1 utilizam-se 3 access points, um na sala 11.2 com 8.36 metros de diametro (4.18cm), outro na sala 11.3 com 11.58 metros de diametro (5.79cm) e outro na sala 11.4 com 15.96 metros de diametro (7.98cm), sem o alcance máximo de 50m para garantir os 30 utilizadores por cada access point;

--> No Piso 0, o horizontal cross-connect foi colocado na sala 10.2 pois seria onde a passagem de cabo seria mais curta para todas as salas;

--> No Piso 1, o intermediate cross-connect, o horizontal cross-connect e o main cross connect foram colocados na sala 11.1 destinada ao data center;

--> É utilizado o cabo de fibra otica monomodo uma vez que é imune a dispersões, permite uma maior data rates e maior comprimento de cabo;

--> É utilizado o cabo de cobre CAT6 uma vez que é o mais utilizado e apresenta melhor feedback;

--> São utilizados 2 horizontal cross-connect um por cada piso; 

--> Cada outlet está colocado de modo a assegurar a regra de os 3 metros de distância;

--> Cada AP está associado a um outlet, é necessário adicionar 6 outlets a contagem final em cima referida;

