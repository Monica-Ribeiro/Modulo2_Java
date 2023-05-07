package Ex01;
public class Main {
    public static void main(String[] args){
        Carro carro = new Carro(1, 500,80);
        carro.acelerar();
        carro.desacelerar();
        carro.ligarFarol();
        carro.utilizarHabilidadeEspecial();
        Moto moto = new Moto(1,600,70);
        moto.acelerar();
        moto.desacelerar();
        moto.ligarFarol();
        moto.utilizarHabilidadeEspecial();
    }
}
