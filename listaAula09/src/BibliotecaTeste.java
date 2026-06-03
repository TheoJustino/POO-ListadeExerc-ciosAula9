import java.util.HashSet;

public class BibliotecaTeste {
    public static void main(String[] args) {
        HashSet biblioteca = new HashSet<>();

        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");
        biblioteca.add(l1);
        biblioteca.add(l2);
        System.out.println(biblioteca.size()); // 1 ou 2?

        /* 
        Exercício 8
        Rodada A: O tamanho do set é 1
        Rodada B: O tamanho mudou para 2, porque sem o hashCode() sobrescrito, 
        cada objeto recebe um hash diferente da classe Object. Como o HashSet 
        usa hashCode() para detectar possíveis duplicatas, ele passa a considerar 
        l1 e l2 como elementos distintos, mesmo que equals() indique que eles são 
        iguais, resultando em um tamanho de 2 ao invés de 1. 
        
        O que o HashSet usa internamente para detectar duplicatas?
        O HashSet utiliza primeiro o hashCode() para localizar o objeto
        em uma estrutura interna de buckets. Quando dois objetos possuem
        o mesmo hashCode(), o HashSet utiliza equals() para verificar
        se eles são realmente iguais. Por isso, ao sobrescrever equals(),
        também é necessário sobrescrever hashCode().
        */
    }
}
