
# Back-end para um Ecommerce de Perfume

Este projeto é a criação de um back-end de uma loja online de vendas de perfumes importados e nacionais. O projeto foi criado utilizando JAVA Spring e postgresql visando otimização e segurança. Esta é uma versão base que será utilizada em um projeto real.


## Referência

 - [Java Spring](https://spring.io)
 - [Parfum Prestige](https://www.parfumprestige.com.br)


## Autores

- [@LuizAGDomingues](https://github.com/LuizAGDomingues)


## Documentação da API

#### Autenticação:

#### Cria login

```http
  POST /auth/register
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `login` | `string` | **Obrigatório**. Login da conta |
| `password` | `string` | **Obrigatório**. Senha da conta |
| `name` | `string` | **Obrigatório**. Nome do usuário |
| `phone` | `string` | **Obrigatório**. Telefone do usuário |
| `cep` | `string` | **Obrigatório**. CEP do usuário |
| `document` | `string` | **Obrigatório**. CPF do usuário |
| `role` | `string` | **Obrigatório**. Tipo de conta. Sempre será tipo USER|

#### Realiza login

```http
  POST /auth/login
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `login` | `string` | **Obrigatório**. Login da conta |
| `password` | `string` | **Obrigatório**. Senha da conta |

| Retorno   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `token` | `string` | **Obrigatório**. Token para requisições |

#### Perfumes no DB:

#### Cria item

```http
  POST /items
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `token` | `string` | **Obrigatório**. Token da conta ADMIN |
| `name` | `string` | **Obrigatório**. Nome do produto |
| `description` | `string` | **Obrigatório**. Descrição do produto |
| `image` | `string` | **Obrigatório**. URL da imagem do produto |
| `value` | `number` | **Obrigatório**. Custo do produto |
| `size` | `string` | **Obrigatório**. Volume do produto |
| `brand` | `string` | **Obrigatório**. Marca do produto |
| `gender` | `string` | **Obrigatório**. Genero alvo do produto (Masculino/Feminio) |
| `quantity` | `number` | **Obrigatório**. Qauntidade do produto em estoque |
| `ratio` | `number` | **Obrigatório**. Ranking de saida do produto |

#### Atualiza um item

```http
  POST /items/{itemId}
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `token` | `string` | **Obrigatório**. Token da conta ADMIN |
| `name` | `string` | **Obrigatório**. Nome do produto |
| `description` | `string` | **Obrigatório**. Descrição do produto |
| `image` | `string` | **Obrigatório**. URL da imagem do produto |
| `value` | `number` | **Obrigatório**. Custo do produto |
| `size` | `string` | **Obrigatório**. Volume do produto |
| `brand` | `string` | **Obrigatório**. Marca do produto |
| `gender` | `string` | **Obrigatório**. Genero alvo do produto (Masculino/Feminio) |
| `quantity` | `number` | **Obrigatório**. Qauntidade do produto em estoque |
| `ratio` | `number` | **Obrigatório**. Ranking de saida do produto |

#### Retorna todos os itens

```http
  GET /items
```

#### Retorna os items com ratio 5

```http
  GET /items/destaques
```

#### Retorna todos as marcas

```http
  GET /items/marcas
```

#### Retorna todos os items de uma marca

```http
  GET /items/marca/{brand}
```

#### Retorna todos os itens de um genero

```http
  GET /items/gender/{gender}
```

#### Retorna todos os items pela palavra

```http
  GET /items/parfum/{name}
```

#### Retorna o items pelo id

```http
  GET /items/{itemId}
```

#### Deleta um item

```http
  DELETE /items/delete/{itemId}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `token` | `string` | **Obrigatório**. Token da conta ADMIN |


## Stack utilizada

**Back-end:** JAVA, Postgresql


## Melhorias Futuras

Implementação de Pub/Sub para mensagem em email assim que a conta for criada e deploy no aws

