

Listar todos:

localhost:8080/passagens method: GET

Lista somente 1 informando, passando o id como parâmetro:

localhost:8080/passagem/{id} method: GET

Salvando um registro:

localhost:8080/passagem method: POST

exemplo: { "empresa": "Avianca", "cidade_destino": "Petrolina", "horario_saida": "22:00", "valor": 80.2 }

Stream, a cada 10 segundos ele retorna 1 dado do banco. De forma assicrona:
http://localhost:8080/passagem/events

Banco de dados mongoDB
