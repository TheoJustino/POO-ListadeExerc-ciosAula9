public class MainLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Código Limpo", "978-0132350884");

        System.out.println(l1 == l2); //false (Exercício 5)
        System.out.println(l1.equals(l2)); //false (Exercício 5)
        System.out.println(l1.equals(l2));     // true (Exercício 6)
        System.out.println(l1.equals(null));   // false (Exercício 6)
        System.out.println(l1.equals("Olá"));  // false (Exercício 6)

        System.out.println(l1.hashCode()); // -212694152
        System.out.println(l2.hashCode()); // -212694152
        
        Livro l3 = new Livro("The Pragmatic Programmer", "978-0201616224");

        System.out.println(l1.hashCode()); // -212694152
        System.out.println(l3.hashCode()); // 536217454

        /*
        Exercício 5 
        Por que .equals() também retorna false sem override?
        O equals() retorna false porque a classe Livro não 
        sobrescreveu o método equals(). Assim, é utilizado o 
        método herdado de Object, que compara as referências 
        dos objetos, da mesma forma que o operador ==.
        */

        /* 
        Exercício 6
        Teste com dois livros de mesmo ISBN mas títulos diferentes. São iguais?
        Sim, porque o ISBN é comparado e não os títulos, porém a primeira 
        comparação, l1 == l2 ainda retorna falso

        Teste passando null e uma String para o equals(). Lança exceção?
        Não lança exceção

        Por que comparamos pelo ISBN e não pelo título?
        Porque um livro possui um ISBN único, ou seja, nenhum outro livro possui
        ele, então ele serve como um identificador do livro, além disso,
        caso o livro tenha edições em diferentes idiomas, mesmo que o título 
        mude, o ISBN normalmente continua o mesmo. E também podem existir
        livros diferentes com o mesmo título, por isso não é bom comparar pelo
        título.
        */

        /* 
        Exercício 7
        Na Main, imprima o hashCode de dois livros com o mesmo ISBN. São iguais?
        Sim, eles são iguais.

        Imprima o hashCode de dois livros com ISBNs diferentes. São diferentes?
        Sim, eles são diferentes, mas nem sempre isso é garantido.
        */
    }
}
