package Ex03;
public class Main {
    public static void main(String[] args){
        Carro carro = new Carro(1, 750,80);
        carro.acelerar();
        carro.desacelerar();
        carro.ligarFarol();
        carro.utilizarHabilidadeEspecial();
        Moto moto = new Moto(2,900,90);
        moto.acelerar();
        moto.desacelerar();
        moto.ligarFarol();
        moto.utilizarHabilidadeEspecial();
    }
}
