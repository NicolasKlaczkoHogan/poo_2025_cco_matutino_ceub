package consulta_prov;

public class ExemploArray {
    public static void main(String[] args) {
        // Declaração e inicialização de um array de inteiros com 5 posições.
        int[] numeros = new int[5];

        // Atribuindo valores a cada posição do array.
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println("Elemento na posição 0: " + numeros[0]);

        // Iterando sobre o array com um loop 'for'.
        System.out.println("Iterando com 'for':");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }

        // Iterando sobre o array com um loop 'for-each'.
        System.out.println("Iterando com 'for-each':");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
