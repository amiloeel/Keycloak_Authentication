# Logger

Bem vindo ao Logger, sistema criado para testar a validação utilizando o keycloak

## INDICE

- [Acesso ao Java](https://github.com/hsmiranda/rhsso-keyclock/tree/main/Logger/src/main/java/com/example/Logger)
- [Acesso ao HTML](https://github.com/hsmiranda/rhsso-keyclock/tree/main/Logger/src/main/resources/templates)
- [Acesso ao properties](https://github.com/hsmiranda/rhsso-keyclock/blob/main/Logger/src/main/resources/application.properties)
- [Acesso ao POM](https://github.com/hsmiranda/rhsso-keyclock/blob/main/Logger/pom.xml)

## FLUXO

O sistema roda na porta 8066

```flow
Aplicação inicia
    |---> entra na pagina publica
            |---> Clica link para validar
                    |---> Direciona para pagina do keycloak para validação
                            |---> Após validado segue para próxima pagina da aplicação
```

## IMAGENS 

![page1](https://user-images.githubusercontent.com/90478919/143455062-b936c674-5447-4645-bb95-480743b1008c.png)
#
![page2](https://user-images.githubusercontent.com/90478919/143502751-6769a46c-3cf8-4dc2-acd7-1d6043458eba.png)
#
![page3](https://user-images.githubusercontent.com/90478919/143455346-a9047488-9e12-4b1d-83f3-49767a4c8bf3.png)

