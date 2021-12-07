# Projeto RHSSO / Keycloak

#### Informações utéis keycloak

- [Site keycloak](https://www.keycloak.org/getting-started)
- [keycloak com OpenJDK](https://www.keycloak.org/getting-started/getting-started-zip)
- [keycloak com Docker](https://www.keycloak.org/getting-started/getting-started-docker)
- [Documentação Keycloak](https://www.keycloak.org/documentation)

----------------------------------

## Preparação:

Para realizar a operação de login através do Keycloak é necessário primeiro editar seu arquivo hosts:

(etc/hosts no Linux/MAC, c:\Windows\System32\Drivers\etc\hosts no Windows)

```
Adicione a seguinte linha ao final do arquivo >>
127.0.0.1 keycloak
```
Isso fará com que a máquina local mapeie o contêiner Keycloak corretamente.

## Comandos no terminal para executar as aplicações

Pelo terminal entre no diretório base e execute os seguintes comandos:

```
systemctl start docker
docker-compose -f docker-compose.yaml up
```

Isso iniciará 3 contêiners com duas aplicações Springboot e o servidor Keycloak

```
Keycloak exposto na porta 8080
App1 exposto na porta 8090
App2 exposto na porta 8066
```

----------------------------------
