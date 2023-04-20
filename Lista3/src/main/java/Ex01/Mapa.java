package Ex01;

import java.util.ArrayList;
public class Mapa {
   private  String titulo;
    private int altura;
    private int largura;
    public String getNome(){
        return titulo;
    }
    public void setNome(String nome) {
        this.titulo = nome;
    }
    public int getAltura(){
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getLargura(){
        return largura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }
    public Mapa(String titulo, int altura, int largura){
        this.titulo = titulo;
        this.altura = altura;
        this.largura = largura;
    }
    ArrayList<Inimigo> inimigos = new ArrayList<>();
    ArrayList<Heroi> herois = new ArrayList<>();
    public Inimigo getInimigoMaiorAtaque(){
        int maiorAtaque = 0;
        int index = 0;
        for (int i = 0; i < inimigos.size(); i++) {
            if (inimigos.get(i).getAtaque() > maiorAtaque){
                maiorAtaque = inimigos.get(i).getAtaque();
                index = i;
            }
        }
        return inimigos.get(index);
    }
}
