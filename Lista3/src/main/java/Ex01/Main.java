package Ex01;
public class Main {
    public static void main(String[] args){
        Inimigo inimigo1 = new Inimigo("Goblin",200, 500, 1000);

        Inimigo inimigo2 = new Inimigo("Dragão furioso",400, 600, 1500);

        Heroi heroi1 = new Heroi("Elfo astuto",150, 100, 250);

        Heroi heroi2 = new Heroi("Monstro do pântano",100, 50, 200);

        Mapa mapa = new Mapa("Fase Pântano sombrio",2000, 1500);
        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);
        mapa.herois.add(heroi1);
        mapa.herois.add(heroi2);

        Inimigo inimigoMaiorAtaque = mapa.getInimigoMaiorAtaque();
        if (inimigo2.getAtaque() > inimigo1.getAtaque()){
            System.out.println("O inimigo " + inimigo2.getNome() + " possui o maior ataque, com dano de : " + inimigoMaiorAtaque.getAtaque());
        }
        else {
            System.out.println("O " + inimigo1.getNome() + " possui o maior ataque, com o valor de: " + inimigoMaiorAtaque.getAtaque());
        }
    }
}
