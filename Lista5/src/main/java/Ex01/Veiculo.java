package Ex01;
public abstract class Veiculo {
    private int id;
    private int velocidadeMaxima;
    private int precisaoEmCurvas;
    private boolean estaComFarolLigado;
    public Veiculo(){
    }
    public Veiculo(int id, int velocidadeMaxima, int precisaoEmCurvas){
        this.id = id;
        this.velocidadeMaxima = velocidadeMaxima;
        this.precisaoEmCurvas = precisaoEmCurvas;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getVelocidadeMaxima(){
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public  int getPrecisaoEmCurvas(){
        return precisaoEmCurvas;
    }
    public void setPrecisaoEmCurvas(int precisaoEmCurvas){
        this.precisaoEmCurvas = precisaoEmCurvas;
    }
    public boolean isEstaComFarolLigado(){
        return estaComFarolLigado;
    }
    public void setEstaComFarolLigado(boolean estaComFarolLigado){
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
