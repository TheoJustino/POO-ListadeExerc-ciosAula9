public class Produto {
    private String nome; 
    private Double preco;

    Produto(String nome, Double preco){
        setNome(nome);
        setPreco(preco);
    }

    @Override 
    public String toString(){
        return "Produto{nome='" + nome + "', preco=" + preco + "}";
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public Double getPreco(){
        return preco;
    }
}
