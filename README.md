#  💻 Desafio de Controle de fluxo - DIO

Desafio Proposto no Claro - Java com Spring Boot pela plataforma DIO.

IDE usada: NetBeans 21

## Desafio Proposto:
Criar uma exceção personalizada chamada ParametrosInvalidosException que possa ser lançada
quando os parâmetros passados para um método são inválidos. 

## Como Foi Feito:
Primeiramente, foi feita a criação da exceção ParametrosInvalidosException estendendo a classe Exception e criando um construtor com o método super para aparecer a mensagem pedida no desafio. 
Mensagem: "Valor dos parâmetros inválido.\nO segundo parâmetro deve ser maior que o primeiro."

Após a criação da exceção, foi criada a classe Contador com um método estático contar, o qual verifica se os parâmetros estão corretos e, 
caso estejam certos, ele irá executar um for para saber quantas ocorrências ocorreram. Na classe Contador, está o método main, o qual possui a classe Scanner para o usuário poder atribuir os valores.


## Print do Codigo:
### ParametrosInvalidosException:

![image](https://github.com/user-attachments/assets/551b4770-c9ce-4138-b369-1bbe31f43a17)


### Contador:

#### Metodo main:


![image](https://github.com/user-attachments/assets/d561ebfe-ec1d-473f-a192-ed39ccd4b6b4)

#### Metodo contar:

![image](https://github.com/user-attachments/assets/fad10d00-533e-4b04-a6f4-8209b67bcc04)


