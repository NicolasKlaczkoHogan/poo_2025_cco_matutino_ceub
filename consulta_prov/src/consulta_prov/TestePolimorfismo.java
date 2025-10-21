package consulta_prov;

//Classe para testar o Polimorfismo
public class TestePolimorfismo {
 public static void main(String[] args) {
     // p1 é uma referência do tipo Pessoa, apontando para um objeto do tipo Pessoa.
     Pessoa p1 = new Pessoa("Maria", 30);

     // p2 é uma referência do tipo Pessoa, mas aponta para um objeto do tipo Funcionario.
     // Isso é polimorfismo.
     Pessoa p2 = new Funcionario("João", 25, "Desenvolvedor");

     // O método seApresentar() se comportará de acordo com o objeto real.
     p1.seApresentar(); // Chama o método de Pessoa
     System.out.println("---");
     p2.seApresentar(); // Chama o método sobrescrito de Funcionario
 }
}
