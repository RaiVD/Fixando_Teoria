
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        Set<String> nomes = new LinkedHashSet<>();

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

        // Limpando o conjunto
        nomes.clear();

        // Verificando se o conjunto está vazio
        boolean conjuntoVazio = nomes.isEmpty();
        System.out.println("---------------------------------------------------");
        System.out.println("O conjunto está vazio? " + conjuntoVazio);



    }
}
