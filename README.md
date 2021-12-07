# doc-assembler

## Roteiro de estudos:

1. Começo!
   1.0 Revisão de conceitos Spring 1.1 RESTful Web Service: https://spring.io/guides/gs/rest-service/
   1.2 Atendendo requisições com Spring MVC: https://spring.io/guides/gs/serving-web-content/

2. Aumentando o nível 2.1 Curso
   completo: https://www.youtube.com/watch?v=9SGDpanrc8U&list=PLwvrYc43l1MzeA2bBYQhCWr2gvWLs9A7S&index=2
   Obs: desconsiderar a implementação do CRUD. Lembrar que ele usa a camada de dados (Repository) e não é necessário
   para o nosso código. 2.2 Tutorial completo de Spring REST: https://spring.io/guides/tutorials/rest/

Material auxiliar: https://www.baeldung.com/spring-boot

Desafio: construir o Document Assembler com Spring. Levar em consideração:
Existem duas partes: Spring MVC e a lógica da árvore. Primeiro é necessário aprender o Spring MVC.

1. Receber a requisição POST (json).
2. Converter o Json para um objeto do Model. Depois é que entra a lógica da árvore.
3. Aplicar a lógica para operar a árvore (descrito no documento de solução).

# Campo Auxiliar (última modificação 06/12/2021 12:20)
Último erro:
>com.fasterxml.jackson.databind.exc.MismatchedInputException: Cannot deserialize value of type `my.project.docassembler.model.Impl.Inner` from Array value (token `JsonToken.START_ARRAY`)
 at [Source: (String)"{"inner": [{"leaf": "Felix"}]}"; line: 1, column: 11]
 
 Últimas referências
 >https://stackoverflow.com/questions/11798394/polymorphism-in-jackson-annotations-jsontypeinfo-usage
 >https://www.tutorialspoint.com/jackson_annotations/jackson_annotations_jsontypename.htm
 >https://www.baeldung.com/spring-mvc-send-json-parameters
 >https://spring.io/guides/gs/rest-service/
