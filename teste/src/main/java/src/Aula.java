package src;
public class Aula {
    private int id;
    private String titulo;
    private int duracao;

    public Aula() {
    }

    public Aula(int id, String titulo, int duracao) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
