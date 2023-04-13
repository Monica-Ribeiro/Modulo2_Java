package atividades;
public class Main {
    public static void main(String[] args){
        Inimigo inimigo1 = new Inimigo();
        inimigo1.ataque = 200;
        inimigo1.defesa = 500;
        inimigo1.pontos = 1000;

        Inimigo inimigo2 = new Inimigo();
        inimigo2.ataque = 400;
        inimigo2.defesa = 600;
        inimigo2.pontos = 1500;

        Heroi heroi1 = new Heroi();
        heroi1.ataque = 150;
        heroi1.defesa = 100;
        heroi1.pontos = 250;

        Heroi heroi2 = new Heroi();
        heroi2.ataque = 100;
        heroi2.defesa = 50;
        heroi2.pontos = 200;

        Mapa mapa = new Mapa();
        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);
        mapa.herois.add(heroi1);
        mapa.herois.add(heroi2);

        Inimigo inimigoMaiorAtaque = mapa.getInimigoMaiorAtaque();
        System.out.println(inimigoMaiorAtaque.ataque);
    }
}
