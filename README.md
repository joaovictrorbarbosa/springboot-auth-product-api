# REST API com Autenticação e Gerenciamento de Produtos

Aplicação backend desenvolvida em Java utilizando Spring Boot, com arquitetura em camadas e foco em boas práticas de desenvolvimento, segurança e testabilidade.<br>
A API implementa autenticação de usuários e operações CRUD para gerenciamento de produtos, utilizando JPA para persistência e testes automatizados distribuídos entre as camadas da aplicação.

## Stack Tecnológica
### Linguagem e Plataforma:
Java 17+ <br>
Maven (gerenciamento de dependências e build)

### Framework
Spring Boot <br>
Módulos Utilizados <br>
Spring Web – construção de endpoints REST <br>
Spring Data JPA – abstração de acesso a dados <br>
Spring Security – controle de autenticação e segurança <br>
Spring Boot Starter Validation – validação de dados de entrada <br>
Spring Boot Test – suporte a testes <br>

### Persistência
Jakarta Persistence API (JPA) <br>
Hibernate (ORM) <br>
Banco de dados relacional (PostgreSQL em ambiente principal)<br>
H2 Database (ambiente de testes, se configurado)<br>

### Testes
JUnit 5<br>
Mockito<br>
Spring Boot Test<br>
WebMvcTest<br>
DataJpaTest<br>
Postman - Testes manuais.<br>

## Arquitetura
A aplicação segue o padrão de arquitetura em camadas:<br>
Controller<br>
Responsável pela exposição dos endpoints REST, recebimento de requisições HTTP e retorno de respostas padronizadas.<br>
Service<br>
Implementa as regras de negócio, orquestra chamadas aos repositórios e aplica validações adicionais.<br>
Repository<br>
Interfaces que estendem Spring Data JPA, responsáveis pelo acesso e manipulação das entidades no banco de dados.<br>
Entity (Model)<br>
Representações mapeadas com anotações JPA, incluindo definição de tabela, colunas, constraints e relacionamentos.<br>

## Segurança
A aplicação utiliza Spring Security para:<br>
Configuração de autenticação<br>
Proteção de endpoints<br>
Integração com UserDetailsService<br>
Codificação de senha utilizando PasswordEncoder<br>
A estrutura permite expansão para JWT ou outros mecanismos de autenticação stateless.<br>

## Funcionalidades Implementadas
Registro de usuários<br>
Autenticação de usuários<br>
CRUD completo de produtos:<br>
Criação<br>
Listagem<br>
Atualização<br>
Remoção<br>
Validação de dados de entrada<br>
Tratamento de exceções<br>

## Testes Automatizados
O projeto possui cobertura de testes distribuída por camada:

### Testes de Service
Utilizam Mockito para mockar dependências<br>
Validação de regras de negócio<br>
Testes de cenários positivos e negativos<br>
Verificação de interações com repositórios<br>

### Testes de Repository
Utilizam DataJpaTest<br>
Testes de persistência com banco em memória<br>
Validação de consultas e constraints<br>

### Testes de Controller
Utilizam WebMvcTest e MockMvc<br>
Simulação de requisições HTTP<br>
Validação de status codes e payloads<br>

### Teste de Inicialização
Verificação do carregamento do contexto da aplicação.

### Como Executar
Clonar o repositório:<br>
git clone <url-do-repositorio><br>
Executar via Maven:<br>
mvn spring-boot:run<br>
Ou rodar a classe principal da aplicação pela IDE.<br>

## Objetivo Técnico
Este projeto foi desenvolvido com foco em:<br>
Aplicação de arquitetura em camadas<br>
Uso correto de ecossistema Spring<br>
Implementação de autenticação com Spring Security<br>
Persistência com JPA/Hibernate<br>
Escrita de testes unitários e de integração<br>
Organização de código voltada a boas práticas<br>




