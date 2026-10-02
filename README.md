
# 💳 Payment Service
Sistema de processamento de contratos com geração automática de parcelas, cálculo de juros simples e taxa de pagamento online.
---
## 📋 Descrição
O programa lê os dados de um contrato (número, data e valor total) e o número de parcelas desejado, gerando as parcelas a serem pagas. Cada parcela possui vencimento mensal a partir da data do contrato, com valor calculado aplicando:
- **Juros simples:** 1% ao mês
- **Taxa de pagamento:** 2% sobre o valor da parcela
---

## 🎯 Sobre o projeto
Exercício proposto no curso **Java COMPLETO — Programação Orientada a Objetos** (prof. Nelio Alves), com o objetivo de praticar:
- Modelagem de classes a partir de UML
- Interfaces e injeção de dependência
- Separação em camadas
---
## 🏗️ Estrutura do Projeto

src/  
├── app/  
│ └── Program.java  
├── entities/  
│ ├── Contract.java  
│ └── Installment.java  
└── services/  
├── ContractService.java  
├── OnlinePaymentService.java  
└── PaypalService.java


---
## 🧠 Conceitos aplicados
- Programação Orientada a Objetos (POO)
- Separação em camadas: `app`, `entities`, `services`
- Interface + injeção de dependência via construtor
- API `java.time` (`LocalDate`, `DateTimeFormatter`)
- Boas práticas de encapsulamento e coesão
---
## 🚀 Como executar
**Pré-requisitos:** JDK 17+ e VS Code com a extensão *Extension Pack for Java*.

# Clonar o repositório
git clone https://github.com/BrunoAngelo12/payment-service.git
# Entrar na pasta
cd payment-service

Abra o projeto no VS Code e execute `Program.java` (botão **Run** acima do método `main`).

Ou via terminal:

bash

javac -d bin src/**/*.java
java -cp bin app.Program

----------

## 💡 Exemplo de uso

text

Entre com os dados do contrato:
Numero: 8028
Data (dd/MM/yyyy): 25/06/2018
Valor do contrato: 600.00
Entre com o numero de parcelas: 3
Parcelas:
25/07/2018 - 206.04
25/08/2018 - 208.08
25/09/2018 - 210.12

----------

## 📐 Regras de cálculo

Para cada parcela de índice `i` (começando em 1):

text

valorBase     = totalValue / numeroDeParcelas
juros         = valorBase * 0.01 * i
taxa          = (valorBase + juros) * 0.02
valorParcela  = valorBase + juros + taxa
vencimento    = dataContrato.plusMonths(i)

----------

## 👤 Autor

**Bruno Angelo**

-   GitHub: [Meu perfil](https://github.com/BrunoAngelo12)
    
-   LinkedIn: [Meu perfil](https://www.linkedin.com/in/brunoangelo12/?isSelfProfile=true)
