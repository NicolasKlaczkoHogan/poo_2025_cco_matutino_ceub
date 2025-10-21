package consulta_prov;

import java.util.ArrayList;
import java.util.HashMap;


public class ExemploColecoes {
    public static void main(String[] args) {
        // --- Exemplo de ArrayList ---
        // Criação de um ArrayList de Strings.
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando elementos.
        nomes.add("Carlos");
        nomes.add("Ana");
        nomes.add("Beatriz");

        System.out.println("ArrayList de nomes: " + nomes);

        // Acessando um elemento pelo índice.
        System.out.println("Primeiro nome: " + nomes.get(0));

        // Removendo um elemento.
        nomes.remove(1); // Remove "Ana"
        System.out.println("ArrayList após remover 'Ana': " + nomes);

        // Iterando sobre o ArrayList.
        System.out.println("Iterando sobre o ArrayList:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("\n--------------------------\n");

        // --- Exemplo de HashMap ---
        // Criação de um HashMap para mapear um ID (Integer) para um nome (String).
        HashMap<Integer, String> mapaDeUsuarios = new HashMap<>();

        // Adicionando pares de chave-valor.
        mapaDeUsuarios.put(1, "Carlos");
        mapaDeUsuarios.put(2, "Ana");
        mapaDeUsuarios.put(3, "Beatriz");

        System.out.println("HashMap de usuários: " + mapaDeUsuarios);

        // Acessando um valor pela chave.
        System.out.println("Usuário com ID 2: " + mapaDeUsuarios.get(2));

        // Removendo um par chave-valor.
        mapaDeUsuarios.remove(1);
        System.out.println("HashMap após remover o ID 1: " + mapaDeUsuarios);

        // Iterando sobre as chaves do HashMap.
        System.out.println("Iterando sobre as chaves:");
        for (Integer id : mapaDeUsuarios.keySet()) {
            System.out.println("ID: " + id);
        }

        // Iterando sobre os valores do HashMap.
        System.out.println("Iterando sobre os valores:");
        for (String nome : mapaDeUsuarios.values()) {
            System.out.println("Nome: " + nome);
        }
    }
}