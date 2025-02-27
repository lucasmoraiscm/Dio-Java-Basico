# Tipos e Variáveis

## Tipos primitivos
Os 8 tipos primitivos em Java são:
- int
- byte
- short
- long
- float
- double
- boolean
- char

### Tabela de Tipos Primitivos e seus valores
| Tipo | Memória | Valor mínimo | Valor máximo |
|-|-|-|-|
| byte | 1 byte | -128 | 127 |
| short | 2 bytes | -32.768 | 32.767 |
| int | 4 bytes | -2.147.483.648 | 2.147.483.647 |
| long | 8 bytes | -9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |
<br>

Os tipos primitivos que podem conter partes fracionárias:
| Tipo | Memória | Valor mínimo | Valor máximo |
|-|-|-|-|
| float | 4 bytes | -3.4028E+38 | 3.4028E+38 |
| double | 8 bytes | -1,7976E+308 | 1,7976E+308 |

## Declaração de variáveis
A estrutura padrão para se declarar uma variável sempre é:
```
<tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
```
Exemplos: 
```java
int idade;
int anoFabricacao = 2025;
double salarioMinimo = 2500.50;
```

OBS:
- O tipo long precisa terminar com "L" e o tipo float com "F".
```java
long numeroLong = 453235664L;
float numeroFloat = 3.14F;
```

## Variáveis e Constantes

### Variáveis
- Área da memória associada a um valor, com um tipo determinado, podendo variar seu valor.

```java
int numero = 5;
numero = 6;
```

### Constantes
- Valores armazenados em memória, com um tipo determinado, que não podem ser modificados após a declaração;
- Valores representados pela palavra reservada "final";
- Por convenção, constantes são sempre escritas em CAIXA ALTA.
```java
final double PI = 3.14;
PI = 3.20; //erro
```