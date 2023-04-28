package Ex01;
public class Heroi {
    private String nome;
    private int id;
    private int quantidadeMoedasDeOuro;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getQuantidadeMoedasDeOuro(){
        return quantidadeMoedasDeOuro;
    }
    public void setQuantidadeMoedasDeOuro(int quantidadeMoedasDeOuro){
        this.quantidadeMoedasDeOuro = quantidadeMoedasDeOuro;
    }
    public Heroi(String nome, int id, int quantidadeMoedasDeOuro){
        this.nome = nome;
        this.id = id;
        this.quantidadeMoedasDeOuro = quantidadeMoedasDeOuro;
    }
}
