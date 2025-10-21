package consulta_prov;

public class conseitos {
/**
 * 1. Abstração e Encapsulamento
Abstração:

Conceito: É a ideia de focar nos aspectos essenciais de um objeto e ignorar os detalhes irrelevantes. Pense nela como uma forma de simplificar a complexidade, criando um modelo que representa as características e comportamentos importantes de algo.

Analogia: Pense em um controle remoto de TV. Você sabe que o botão de "aumentar volume" faz o som ficar mais alto. Você não precisa saber como os circuitos internos funcionam para usá-lo. O controle remoto é uma abstração de uma operação complexa. Em programação, uma classe Carro tem métodos como acelerar() e frear(), que são as ações essenciais, escondendo toda a complexidade do motor e dos freios.

Encapsulamento:

Conceito: É o mecanismo de "empacotar" os dados (atributos) e os métodos que manipulam esses dados dentro de uma única unidade (a classe). Além disso, o encapsulamento protege os dados de acessos externos diretos, geralmente tornando os atributos private e fornecendo métodos públicos (getters e setters) para interagir com eles.

Analogia: Imagine uma pílula (cápsula). O medicamento (os dados) está protegido dentro do invólucro. Você não interage diretamente com o pó químico, mas sim com a cápsula como um todo. O encapsulamento em POO funciona da mesma forma: protege os atributos (private) e oferece uma interface segura (métodos public) para interagir com eles, garantindo que os dados não sejam corrompidos.

2. Atributos, Métodos e Construtores
Atributos (ou Campos):

Conceito: São as variáveis que pertencem a uma classe. Eles definem o estado e as características de um objeto.

Exemplo: Em uma classe Pessoa, os atributos poderiam ser nome, idade, altura. Eles são os "substantivos" ou "adjetivos" que descrevem o objeto.

Métodos:

Conceito: São as funções que pertencem a uma classe. Eles definem o comportamento e as ações que um objeto pode realizar.

Exemplo: Na classe Pessoa, os métodos poderiam ser andar(), falar(), fazerAniversario(). Eles são os "verbos", as ações do objeto.

Construtores:

Conceito: É um método especial que tem o mesmo nome da classe e é chamado automaticamente quando um novo objeto é criado (com a palavra-chave new). Sua principal função é inicializar o objeto, definindo os valores iniciais para seus atributos.

Exemplo: Um construtor para a classe Pessoa receberia o nome e a idade no momento da criação para garantir que o objeto já nasça com um estado válido.

3. Herança
Conceito: É um pilar da POO que permite que uma classe (chamada de subclasse ou classe filha) herde atributos e métodos de outra classe (chamada de superclasse ou classe pai). Isso promove a reutilização de código e cria uma relação "é um tipo de".

Analogia: Pense em uma hierarquia biológica. Um Gato "é um tipo de" Felino, que por sua vez "é um tipo de" Mamifero. O Gato herda características gerais de Mamifero (como ter pelos e sangue quente) e de Felino (como ter garras retráteis), além de ter suas próprias características específicas. Em programação, uma classe Gerente pode herdar da classe Funcionario. O Gerente "é um tipo de" Funcionario, então ele herda atributos como nome e salario, mas pode adicionar seus próprios atributos, como bonus e equipe.

4. Sobrescrita de Métodos e Polimorfismo
Sobrescrita de Métodos (Overriding):

Conceito: Ocorre quando uma subclasse fornece uma implementação específica para um método que já existe em sua superclasse. O método na subclasse tem a mesma assinatura (mesmo nome e mesmos parâmetros) do método na superclasse.

Exemplo: A superclasse Animal tem um método emitirSom(). A subclasse Cachorro vai sobrescrever esse método para imprimir "Au au!", enquanto a subclasse Gato vai sobrescrevê-lo para imprimir "Miau!".

Polimorfismo:

Conceito: Significa "muitas formas". É a capacidade de um objeto ser tratado como um objeto de sua superclasse. Na prática, isso permite que chamemos o mesmo método em objetos de diferentes classes (que herdam da mesma superclasse) e obtenhamos comportamentos diferentes.

Analogia: Imagine que você tem um controle universal (a superclasse Animal) e aperta o botão emitirSom(). Se o controle estiver apontado para um aparelho de som de cachorro (objeto Cachorro), ele fará "Au au!". Se estiver apontado para um de gato (objeto Gato), ele fará "Miau!". A ação é a mesma (emitirSom()), mas o resultado (o comportamento) é diferente dependendo do objeto.

5. Relacionamento entre Classes
Associação: É o relacionamento mais genérico, onde uma classe "usa" outra. Os objetos têm ciclos de vida independentes. Ex: Um Aluno está associado a uma Disciplina.

Agregação: É um tipo especial de associação, um relacionamento "tem-um". A classe "todo" contém objetos da classe "parte", mas a "parte" pode existir independentemente do "todo". Ex: Um TimeDeFutebol "tem" Jogadores. Se o time for desfeito, os jogadores continuam existindo.

Composição: É uma forma mais forte de agregação, um relacionamento "é parte de". A "parte" não pode existir sem o "todo". Se o objeto "todo" é destruído, as "partes" também são. Ex: Um Carro é "composto por" um Motor. O motor não existe sem o carro.

6. Arrays
Conceito: É uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo com um tamanho fixo. Cada elemento é acessado por um índice numérico (começando em 0).

Analogia: Pense em um porta-ovos. Ele tem um número fixo de espaços (tamanho) e cada espaço guarda um ovo (mesmo tipo). Para pegar um ovo específico, você vai até a sua posição (índice).

7. Listas e Coleções: ArrayList e HashMap
ArrayList:

Conceito: É como um array, mas com tamanho dinâmico. Você pode adicionar ou remover elementos, e a lista se ajusta automaticamente. Faz parte do framework de Collections do Java.

Analogia: Pense em uma lista de compras. Você pode adicionar novos itens ou riscar itens já comprados a qualquer momento. A lista cresce e diminui conforme a necessidade.

HashMap:

Conceito: É uma estrutura de dados que armazena pares de chave-valor. Cada valor é associado a uma chave única. É extremamente rápido para buscar, inserir ou remover um elemento se você souber a chave.

Analogia: Pense em um dicionário de verdade. A "palavra" é a chave, e a "definição" é o valor. Você usa a palavra (chave) para encontrar rapidamente a sua definição (valor).
 */
	
}
