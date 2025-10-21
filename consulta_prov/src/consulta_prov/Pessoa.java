package consulta_prov;

//Abstração: Representação de uma Pessoa no sistema.
public class Pessoa {

 // Atributos: Características da Pessoa.
 // Encapsulamento: Atributos privados para proteger o acesso direto.
 private String nome;
 private int idade;
 
//Composição: Pessoa "tem-um" Endereco. O Endereco é criado junto com a Pessoa.
 private Endereco endereco;

 public Pessoa(String nome, int idade, String rua, int numero) {
     this.nome = nome;
     this.idade = idade;
     this.endereco = new Endereco(rua, numero); // Objeto Endereco é criado aqui
 }

 // Construtor: Método especial para criar e inicializar um objeto da classe.
 // É chamado no momento da instanciação do objeto (usando a palavra-chave "new").
 public Pessoa(String nome, int idade) {
     this.nome = nome;
     this.idade = idade;
 }

 // Métodos: Ações ou comportamentos que a Pessoa pode realizar.

 // Método "getter" para o atributo "nome".
 // Permite que outras classes acessem o valor do atributo "nome" de forma controlada.
 public String getNome() {
     return nome;
 }

 // Método "setter" para o atributo "nome".
 // Permite que outras classes modifiquem o valor do atributo "nome".
 public void setNome(String nome) {
     this.nome = nome;
 }

 // Método "getter" para o atributo "idade".
 public int getIdade() {
     return idade;
 }

 // Método "setter" para o atributo "idade".
 // Inclui uma validação para garantir a integridade dos dados.
 public void setIdade(int idade) {
     if (idade > 0) {
         this.idade = idade;
     }
 }

 // Método para exibir as informações da pessoa.
 public void exibirInformacoes() {
     System.out.println("Nome: " + this.nome);
     System.out.println("Idade: " + this.idade);
 }
//Método que será sobrescrito na subclasse.
 public void seApresentar() {
     System.out.println("Olá, eu sou " + getNome() + ".");
 }
}