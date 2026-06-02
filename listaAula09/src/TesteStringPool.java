public class TesteStringPool {
    public static void main(String[] args){
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println(a == b);        
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // true, a == b retorna true porque a e b apontam para o mesmo objeto na memória
        // false, a == c retorna false porque como o c foi criado com o new, ele fica em outro local da memória
        // true, aqui retorna true porque o equals faz a comparação dos valores ao invés do endereço de memória
        
        /* 
        String Pool é uma área especial da memória onde o Java armazena   
        strings literais. Quando duas strings possuem o mesmo conteúdo,
        o Java reutiliza o mesmo objeto para economizar memória.
        Por isso, duas strings literais iguais podem apontar para o
        mesmo objeto e retornar true ao usar ==. 
        */
    }
}
