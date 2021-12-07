# AppLogger

Bem vindo ao AppLogger, sistema criado para testar a validação utilizando o keycloak

## INDICE

- [Acesso ao Java](https://github.com/hsmiranda/rhsso-keyclock/tree/main/applogger/src/main/java/com/extreme/digital/applogger)
- [Acesso ao HTML](https://github.com/hsmiranda/rhsso-keyclock/tree/main/applogger/src/main/resources/templates)
- [Acesso ao properties](https://github.com/hsmiranda/rhsso-keyclock/blob/main/applogger/src/main/resources/application.properties)
- [Acesso ao POM](https://github.com/hsmiranda/rhsso-keyclock/blob/main/applogger/pom.xml)

## FLUXO

O sistema roda na porta 8090

```flow
Aplicação inicia
    |---> entra na pagina publica
            |---> Clica link para validar
                    |---> Direciona para pagina do keycloak para validação
                            |---> Após validado segue para próxima pagina da aplicação
```

## IMAGENS 

![page1](https://user-images.githubusercontent.com/90478919/143450028-98367621-598c-4756-8b5e-5824a4863393.png)
#
![page2](https://user-images.githubusercontent.com/90478919/143502696-b3f068ff-ca0e-4855-b80b-d60728cf2465.png)
#
![page3](https://user-images.githubusercontent.com/90478919/143450348-3eddfca1-f099-49ff-8165-46c0e78dd8e3.png)


