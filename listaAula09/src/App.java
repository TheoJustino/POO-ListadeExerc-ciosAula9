

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("Celular", 1199.99);
        Produto produto2 = new Produto("Computador", 1599.99);
        Produto produto3 = new Produto("Caneta", 2.50);
        
        System.out.println(produto1);
        System.out.println("Item: " + produto2);
        System.out.println(produto3.toString());

        /* 
        Exercício 1
        A saída não é legível e é mostrado o seguinte:
        Produto@3419866c
        Produto@59690aa4
        */
        /* 
        Exercício 2
        Diferente do exercício 1, está legível e mostra o 
        valor dos atributos e não o hash do objeto. O 
        toString() funciona tanto automaticamente como 
        também colocando ele manualmente.
        */
    }    
}