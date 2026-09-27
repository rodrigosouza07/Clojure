# Estudos de Clojure

Projeto pessoal para praticar Clojure com exercícios inspirados em tarefas de engenharia de software.

## Cenários praticados

### Controle de estoque

- Representar produtos com mapas e coleções
- Calcular o valor total do estoque
- Identificar produtos que precisam de reposição
- Estimar o custo para atingir o estoque ideal

### Processamento de transações

- Representar transações com ID, cliente, valor e status
- Filtrar transações aprovadas
- Somar o valor das transações aprovadas
- Contar transações por status
- Criar um resumo diário
- Validar os dados de uma transação

## Tecnologias

- Clojure
- Clojure CLI
- VS Code com Calva

## Exemplo de transação

```clojure
{:id "T001"
 :cliente "Ana"
 :valor 45.90
 :status :aprovada}
