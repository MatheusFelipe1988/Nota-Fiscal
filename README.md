# Nota-Fiscal.
Aplicação desenvolvida em Java e Springboot que realiza a mensageria entre duas notas fiscais producer e consumer utilizando o framework RabbitMQ, uma de envio e outra de consumo neste mesmo repositório e com documentação Swagger para melhor leitura de outros desenvolvedores nas controllers.
&nbsp;

## Nota-Fiscal-Producer.
A producer realiza o envio de mensagens para a consumer a cada novo dado criado com a finalidade de colaborar com relatórios para fins de consultar se a aplicação está sendo trabalhada da forma que foi elaborada pelos desenvolvedores.

## Nota-Fiscal-Consumer.
A consumer realiza o consumo das mensagens enviadas pela producer para fins de enviar mensagens a API e verificar se o programa está executando as operações com o que foi definido pelos desenvolvedores

## Used Languages:
- Java
- Springboot
- RabbitMQ
- Swagger
- MySQL
