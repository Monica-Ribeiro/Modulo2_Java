package Ex03;
public class Moto extends Veiculo{
    public Moto(){
    }
    public Moto(int id, int velocidadeMaxima, int precisaoEmCurvas){

    }
    @Override
    public void utilizarHabilidadeEspecial(){
        System.out.println("Moto ultrapassou o carro");
    }
}
