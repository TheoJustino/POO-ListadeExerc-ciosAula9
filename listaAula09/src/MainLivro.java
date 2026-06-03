public class MainLivro {
    public static void main(String[] args) {
        Livro l1 = new Livro("Clean Code", "978-0132350884");
        Livro l2 = new Livro("Clean Code", "978-0132350884");

        System.out.println(l1 == l2); //false 
        System.out.println(l1.equals(l2)); //false 

        /*
        Por que .equals() também retorna false sem override?
        O equals() retorna false porque a classe Livro não 
        sobrescreveu o método equals(). Assim, é utilizado o 
        método herdado de Object, que compara as referências 
        dos objetos, da mesma forma que o operador ==.
        */
    }
}
