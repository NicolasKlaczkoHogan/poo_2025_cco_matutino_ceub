package consulta_prov;

//Exemplo de Composição: um Endereco não existe sem uma Pessoa.
public class Endereco {
 private String rua;
 private int numero;

 public Endereco(String rua, int numero) {
     this.rua = rua;
     this.numero = numero;
 }
//--- Getters e Setters ---

 // Getter para 'rua': permite que outras classes leiam o valor de 'rua'
 public String getRua() {
     return rua;
 }

 // Setter para 'rua': permite que outras classes alterem o valor de 'rua'
 public void setRua(String rua) {
     this.rua = rua;
 }

 // Getter para 'numero'
 public int getNumero() {
     return numero;
 }

 // Setter para 'numero' (com uma pequena validação)
 public void setNumero(int numero) {
     if (numero > 0) {
         this.numero = numero;
     }
 }
}
