public class ValidadorSenha {
    public static void main(String[] args){
        String senhaCorreta = new String("1234");
        String tentativa = "1234";
        if (tentativa.equals(senhaCorreta)) {
        System.out.println("Acesso liberado");
        } else {
        System.out.println("Acesso negado"); 

        /* 
        O que aparece? Por que o acesso é negado mesmo com a senha correta? 
        Aparece Acesso negado, porque o endereço de memória é diferente, pois a string
        senhaCorreta foi criado usando o new String.
        */
        // Corrija substituindo == por .equals(). Execute novamente.
        /* Qual o risco de usar == com Strings em sistemas reais? 
        O == compara as referências do objeto ao invés de comparar os valores, então 
        um sistema pode apresentar erros de validação, mesmo que 2 objetos possuam
        o mesmo valor, pois frequentemente novos objetos são criados a partir dos 
        dados recebidos pelo sistema que vão ser armazenados em diferentes locais 
        na memória fazendo o == dar erro.
        */
        }
    }
}