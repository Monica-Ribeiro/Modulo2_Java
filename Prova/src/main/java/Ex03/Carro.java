package Ex03;
public class Carro extends Veiculo{
    public Carro(){
    }
    public Carro(int id, int velocidadeMaxima, int precisaoEmCurvas){

    }
    @Override
    public void utilizarHabilidadeEspecial(){
        System.out.println("Carro passou na curva em velocidade máxima");
    }
}
