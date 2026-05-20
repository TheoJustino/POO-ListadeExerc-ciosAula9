

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("Celular", 1199.99);
        Produto produto2 = new Produto("Computador", 1599.99);
        
        System.out.println(produto1);
        System.out.println(produto2);

        /* 
        A saída não é legível e é mostrado o seguinte:
        Produto@3419866c
        Produto@59690aa4
        */
    }    
}