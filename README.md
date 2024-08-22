# Exercícios de Programação - Solutis School Dev Trail

O objetivo é criar uma aplicação que aborde conceitos de orientação a objetos e práticas de desenvolvimento de software.

## Estrutura do Projeto

O projeto é organizado em diferentes pacotes e classes para demonstrar conceitos de orientação a objetos. Abaixo está a descrição da estrutura do projeto:

### Pacotes

- **`abstratas`**: Contém a interface `AnimalIF` e a classe abstrata `AnimalAB`.
- **`animais_aereos`**: Contém classes para animais que voam, como `Pombo`.
- **`animais_aquaticos`**: Contém classes para animais que vivem na água, como `Peixe`.

### Classes

- **`AnimalIF`**: Interface que define os métodos `comer`, `mover` e `dormir`.
- **`AnimalAB`**: Classe abstrata que implementa a interface `AnimalIF` e define atributos comuns para todos os animais.
- **`AnimalMarinhoAB`**: Classe abstrata para animais marinhos.
- **`AnimalVoadorAB`**: Classe abstrata para animais que voam.
- **`AnimalTerrestreAB`**: Classe abstrata para animais terrestres.

### Classes Concretas

- **`Cachorro`**: Classe concreta que representa um cachorro, implementa métodos para `comer`, `mover` e `dormir`.
- **`Gato`**: Classe concreta que representa um gato, implementa métodos para `comer`, `mover` e `dormir`.
- **`Elefante`**: Classe concreta que representa um elefante, implementa métodos para `comer`, `mover` e `dormir`.
- **`Leão`**: Classe concreta que representa um leão, implementa métodos para `comer`, `mover` e `dormir`.
- **`Peixe`**: Classe concreta que representa um peixe, implementa métodos para nadar e dormir.
- **`Pombo`**: Classe concreta que representa um pombo, implementa métodos para voar e dormir.

## Requisitos

- **Java 11** ou superior
- **Maven** (se necessário para gerenciamento de dependências)

## Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/bugkaue/Exercicio04-solutis-dev-trail.git
