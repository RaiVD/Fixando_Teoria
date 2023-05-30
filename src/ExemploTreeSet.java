import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        Set<String> nomes = new TreeSet<>();

        // Adicionando elementos ao HashSet
        nomes.add("Raissa");
        nomes.add("Ana");
        nomes.add("Tome");
        nomes.add("Lalesca");
        nomes.add("Thalia");

        // Imprimindo o conjunto de números
        System.out.println("\nConjunto de nomes: " + nomes);
        System.out.println("---------------------------------------------------");

        // Verificando o tamanho do conjunto
        int tamanho = nomes.size();
        System.out.println("Tamanho do conjunto: " + tamanho);

        // Limpando o conjunto
        nomes.clear();

        // Verificando se o conjunto está vazio
        boolean conjuntoVazio = nomes.isEmpty();
        System.out.println("---------------------------------------------------");
        System.out.println("O conjunto está vazio? " + conjuntoVazio);

    }
}
