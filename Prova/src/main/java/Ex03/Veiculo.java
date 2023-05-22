package Ex03;
public abstract class Veiculo {
    private int id;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private int precisaoEmCurvas;
    private Boolean estaComFarolLigado;
    public Veiculo(){

    }
    public Veiculo(int id, int velocidadeMaxima, int velocidadeAtual, int precisaoEmCurvas){
        this.id = id;
        this.velocidadeAtual = velocidadeAtual;
        this.velocidadeMaxima = velocidadeMaxima;
        this.precisaoEmCurvas = precisaoEmCurvas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getPrecisaoEmCurvas() {
        return precisaoEmCurvas;
    }

    public void setPrecisaoEmCurvas(int precisaoEmCurvas) {
        this.precisaoEmCurvas = precisaoEmCurvas;
    }

    public Boolean getEstaComFarolLigado() {
        return estaComFarolLigado;
    }

    public void setEstaComFarolLigado(Boolean estaComFarolLigado) {
        this.estaComFarolLigado = estaComFarolLigado;
    }

    public void acelerar(){
        System.out.println("Estou acelerando.");
    }
    public void desacelerar(){
        System.out.println("Estou desacelerando.");
    }
    public void ligarFarol(){
        setEstaComFarolLigado(true);
        System.out.println("Ligando o farol.");
    }
    public abstract void utilizarHabilidadeEspecial();
}
