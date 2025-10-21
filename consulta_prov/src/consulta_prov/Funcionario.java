package consulta_prov;

//A classe Funcionario herda da classe Pessoa.
//Funcionario é a subclasse (ou classe filha) e Pessoa é a superclasse (ou classe pai).
//Funcionario "é um tipo de" Pessoa e herda seus atributos (nome, idade) e métodos.
public class Funcionario extends Pessoa {

 // Atributo específico da classe Funcionario.
 private String cargo;

//Agregação: Funcionario "tem-um" Departamento.
 private Departamento departamento;

 public Funcionario(String nome, int idade, String cargo, Departamento depto) {
     super(nome, idade, "Rua Fictícia", 123);
     this.cargo = cargo;
     this.departamento = depto; // Recebe um objeto Departamento que já existe
 } 
 
 // Construtor da classe Funcionario.
 public Funcionario(String nome, int idade, String cargo) {
     // A palavra-chave "super" chama o construtor da superclasse (Pessoa).
     // É necessário para inicializar os atributos herdados.
     super(nome, idade);
     this.cargo = cargo;
 }

 // Métodos getter e setter para o atributo "cargo".
 public String getCargo() {
     return cargo;
 }

 public void setCargo(String cargo) {
     this.cargo = cargo;
 }

 // Método específico da classe Funcionario.
 public void trabalhar() {
     System.out.println(getNome() + " está trabalhando como " + this.cargo);
 }
//Sobrescrita do método seApresentar da classe Pessoa.
 @Override
 public void seApresentar() {
     // A palavra-chave "super" pode ser usada para chamar o método da superclasse.
     super.seApresentar();
     System.out.println("Eu trabalho como " + getCargo() + ".");
 }
}