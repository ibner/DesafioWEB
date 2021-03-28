# DesafioWEB

Exemplo de projeto web utilizando JSF, JPA, Spring Boot, Spring MVC, PrimeFaces, JoinFaces, jUnit e Embedded Tomcat.

# Como Usar

OBS: Antes de realizar o processo abaixo, é necessário ter um banco criado.

Segue os comandos SQL para criar a base de dados:
```
CREATE ROLE desafio SUPERUSER CREATEDB CREATEROLE NOINHERIT LOGIN PASSWORD 'desafio';

CREATE DATABASE desafio
OWNER = desafio;
```

1- Relizar uma atualizacao do projeto; Clicar com botao direito do mouse em projetoWeb > Mavem > Update Project. Na janela que será exibida  marcar a opção "Force Update of Snapshots/Releases" e apertar em OK.

2- Startar a aplicação ProjetoWebApplication.java (Run As) como Java Application.

3- Abrir o navegador web com o seguinte endereco, "http://localhost:8080/produto.xhtml".

# Características do Sistema

Joinfaces | Java | Spring Boot | JSF | Tomcat | Spring Framework |
----------|------|-------------|-----|--------|------------------|
`4.1.5`   |`1.8` |`2.2.5`      |`2.3`|`9.0`   |`5.2`             |

Guia de referência utilizado (https://docs.joinfaces.org/master-SNAPSHOT/reference/).
