# clean-architecture

## Executar kafka e mongodb pelo docker

## Configurar o wiremock fornecido na aula 24: 
```
java -jar wiremock-standalone-3.12.1 --port 8082
```

## CONSULTA NO BANCO
```
docker exec -it {CONTAINER ID do mongo} /bin/bash    {CONTAINER ID mongo}
```
```
mongosh -u root -p (informe a senha)
	 > use cleanarch
	 > show collections
	 > db.customers.find()
```

## KAFKA (Publicar o topico de cpf validado)
Depois de instalado o plugin kafkalytic, crie os topicos de acordo com o que foi criado no projeto. 
No topico tp-cpf-validated clicamos com direito e selecionamos "Publish single message"
```
	 {
	 "id":"67dd9816f56b9f5dfea3eb73",
	 "name": "Luiz",
	 "zipCode": "38400000",
	 "cpf": "11111111111",
	 "isValidCpf": true
	 }
```
	 Clique em OK e ele fará a publicação
