# 🐾PATAS AMIGAS🐾

O objetivo desse projeto é desenvolver uma aplicação (em terminal) robusta e eficiente, chamada "PatasAmigas", que automatize e facilite
o processo de adoção de animais, permitindo o cadastro de usuários (tutores e adotantes), animais
disponíveis para adoção e o acompanhamento das adoções.

## Classes

- Pessoa
- Funcionario
- Adotante
- Tutor

Partindo da ideia de que um usuário poderia, ao mesmo tempo, ser funcionário, adotante e/ou tutor, decidimos criar uma classe Pessoa que além dos atributos básicos (nome, endereço, etc), tivesse também os atributos: isFuncionario, isAdotante e isTutor (todos booleanos). Cada uma dessas flags indica se aquela pessoa em questão tem os atributos de suas respectivas classes. Dessa forma, criamos as classes Funcionario, Adotante e Tutor, que contêm os atributos exclusivos delas, para passar os seus atributos para a classe Pessoa se o atributo booleano for verdadeiro.

Essa foi a maneira mais simples de se pensar, além de ter sido recomendada pelo professor Quirino.

### Animal

A classe animal, nesta primeira entrega, apenas foi criada para ter seus atributos e métodos já definidos, porém ainda não foi utilizada de fato para nenhuma função.

### Adoção

Criamos uma classe adoção, que apesar de não estar no doc, achamos ser uma boa ideia. Essa classe reuniria como atributos, o Tutor, Adotante e Animal. Dessa forma, em todos os momentos que precisamos de um histórico de adoção, basta acessar com base no id da adoção. Vale notar que ainda não criamos essa funcionalidade nesta primeira entrega, apenas criamos a classe.

### Preferência

Assim como a classe adoção, decidimos criar uma outra classe para facilitar o projeto posteriormente. A classe preferência reune 4 atributos (especie, raça, idade, sexo). Um usuário pode ter várias preferências, por exemplo: Coelho macho de 1 ano, Cachorro golden fêmea, Gato de 1 ano. Pensando assim, um usuário irá possuir uma lista de preferências, ou seja, uma lista de conjuntos de características dos animais.  

Primeiramente imaginamos em criar a classe Preferência com 4 listas de atributos (especie, raça, idade, sexo) e um único atributo preferência para a classe Pessoa. Contudo, achamos que faz mais sentido o usuário possuir várias preferências (ou seja, uma lista) do que um usuário possuir uma preferência de diversos atributos. Intuitivamente e logicamente o primeiro caso é mais direto e simples.


## Funcionalidades

O menu do projeto foi baseado no código base do professor Quirino. Realizamos algumas modificações para que o usuário possa escolher ser funcionário, adotante e/ou tutor. Além disso, é possível editar e excluir pessoas, bem como listar todas as pessoas cadastradas.
