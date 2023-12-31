# DESAFIO: CRUD de clientes
https://devsuperior.com.br
## Formação Desenvolvedor Moderno - Módulo: Back end
## Capítulo: API REST, camadas, CRUD, exceções, validações
### ESPECIFICAÇÃO - Sistema EVENTO:

Um projeto Spring Boot contendo um CRUD completo de web services REST para
acessar um recurso de clientes, contendo as cinco operações básicas.

- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso



O projeto estar em um ambiente de testes configurado  para acessar ao banco de dados H2, e possui o
Maven como gerenciador de dependência.

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos.

O projeto possui um seed de 20 clientes.

### O projeto trata as seguintes exceções:
- Id não encontrado (para GET por id, PUT e DELETE), retornando código 404.
- Erro de validação, retornando código 422 e mensagens customizada para cada campo inválido. As
regras de validação são:
  - Nome: não pode ser vazio.
  - Data de nascimento: não pode ser data futura.