# Data Structures: Dynamic Linked List (TAD)

Este repositório contém a implementação inicial de um **Tipo Abstrato de Dados (TAD)** de **Lista Dinâmica Encadeada** desenvolvido em Java. O foco desta etapa é a definição da arquitetura do projeto utilizando interfaces genéricas e a estruturação fundamental de nós.

## 📌 Sobre o Projeto

O objetivo deste projeto é fornecer uma estrutura de lista flexível e eficiente, utilizando o conceito de encadeamento de nós. A implementação utiliza **Generics** (`<T>`), permitindo que a lista armazene qualquer tipo de objeto, garantindo a reusabilidade do código.

## 🏗️ Arquitetura e Organização

O projeto segue uma estrutura rigorosa de pacotes para garantir a organização e padronização:

*   **Interface `MyList<T>`**: Define o contrato com todas as operações obrigatórias de uma lista.
*   **Classe `MyLinkedList<T>`**: Implementação concreta da lista.
*   **Classe `Node<T>`**: Classe interna privada que representa cada elemento (nó) da lista, contendo o dado e a referência para o próximo nó.

### Estrutura de Diretórios
```text
src/
└── dev/
    └── aluno/
        └── datastructures/
            └── list/
                ├── MyList.java           # Interface com assinaturas
                ├── MyLinkedList.java     # Implementação da estrutura
                └── tests/
                    └── MyLinkedListTests.java  # Classe para testes unitários
-----
└── MyLinkedListTests.java # Class for unit tests
