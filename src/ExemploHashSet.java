
import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        // Criando um HashSet de números inteiros
        Set<String> nomes = new HashSet<>();

        // Adicionando elementos ao HashSet
        nomes.add("Raissa");
        nomes.add("Ana");
        nomes.add("Tome");
        nomes.add("Lalesca");
        nomes.add("Thalia");

        // Imprimindo o conjunto de números
        System.out.println("\nConjunto de nomes: " + nomes);
        System.out.println("---------------------------------------------------");


        // Verificando se o conjunto contém um elemento específico
        boolean contemSete = nomes.contains("Ana");
        System.out.println("O conjunto contém Ana? " + contemSete);
        System.out.println("---------------------------------------------------");

        // Removendo um elemento do conjunto
        nomes.remove("Lalesca");

        // Iterando sobre os elementos do conjunto
        System.out.println("Elementos do conjunto:");
        System.out.println("---------------------------------------------------");
        for (String name : nomes) {
            System.out.println(name);
        }

        // Limpando o conjunto
        nomes.clear();

        // Verificando se o conjunto está vazio
        boolean conjuntoVazio = nomes.isEmpty();
        System.out.println("---------------------------------------------------");
        System.out.println("O conjunto está vazio? " + conjuntoVazio);


    }
}