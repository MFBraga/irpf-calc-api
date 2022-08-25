# Desafio - Criação de API REST para cálculo do IRRF

```
- FACULDADE IMPACTA TECNOLOGIA - FIT
- Disciplina: LAB Coding (Turma 08/2022)
- Professor:  Emilio Murta Resende
- Turma:      Arquitetura de Soluções Digitais (AS_04 - 2022)
```

## ✔️ Resumo do Projeto
- Este projeto foi desenvolvido como cumprimento da entrega do Trabalho/Atividade [Desafio - Criação de API REST para cálculo do IRRF](https://classroom.google.com/u/0/c/NDg3OTk3MTczMDcz/a/NTI2NTMyNTA0Mzg0/) (19/08/2022)
- Criação de uma API para calcular o IRRF (Imposto Retido na Fonte), usando `Spring Boot`.
- A API considerou a implementação disponível em https://github.com/prof-emilio-resende/irpf-refactoring-sample.git
- A API recebe um objeto (definido pelo "Salário Bruto" e pelo "Número de Dependentes") como parâmetro de entrada, bem como o "Ano de Referência" como parâmetro de URL.

&nbsp;

## 🔨 Carregar o Projeto:
```
git clone https://github.com/MFBraga/irpf-calc-api.git
```

&nbsp;
## 🔨 Preparar Ambiente (maven)
```
mvn clean
mvn install
```

&nbsp;
## 🔨 Executar o Projeto (Spring Boot)
```
mvn spring-boot:run
```

&nbsp;
# 💻 Outputs: 

| Parâmetro                |  Contexto  |
| :----------------------: | :--------: |
| Ano de referência        | URL        |
| Salário Bruto            | BODY       |
| Número de Dependentes    | BODY       |


&nbsp;
```
curl --request POST \
  --url http://localhost:8080/irrf/calculate/?year=2021 \
  --header 'Content-Type: application/json' \
  --data '{
    "totalSalary": 6500.00,
    "dependents": 2
  }'
  ```
  ```
  {"rate":0.275,"irrf":963.006}
  ```
