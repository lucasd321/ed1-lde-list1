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

# Data Structures: Dynamic Linked List (ADT)

This repository contains the initial implementation of an **Abstract Data Type (ADT)** for a **Dynamic Linked List** developed in Java. The focus of this stage is defining the project architecture using generic interfaces and the fundamental structuring of nodes.

## 📌 About the Project

The goal of this project is to provide a flexible and efficient list structure using the concept of node chaining. The implementation uses **Generics** (`<T>`), allowing the list to store any type of object, ensuring code reusability.

## 🏗️ Architecture and Organization

The project follows a rigorous package structure to ensure organization and standardization:

* **Interface `MyList<T>`**: Defines the contract with all mandatory operations of a list.

* **Class `MyLinkedList<T>`**: Concrete implementation of the list.

* **Class `Node<T>`**: Private inner class that represents each element (node) of the list, containing the data and the reference to the next node.

### Directory Structure
```text
src/
└── dev/

└── aluno/

└── datastructures/

└── list/
├── MyList.java # Interface with subscriptions
├── MyLinkedList.java # Implementation of the structure
└── tests/

└── MyLinkedListTests.java # Class for unit tests
