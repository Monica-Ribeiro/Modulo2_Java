package Atividade2;

import java.util.ArrayList;
public class Album {
    String nome;
    String nomeArtista1;
    ArrayList<Musica>musicas = new ArrayList<>();

    public Musica GetMaiorpopularidade(){
        int maiorPopularidade = 0;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).popularidade > maiorPopularidade){
                maiorPopularidade = musicas.get(i).popularidade;
                index = i;
            }
        }
        return musicas.get(index);
    }
    public Musica GetMenorDuracao(){
        int menorDuracao = 100;
        int index2 = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).duracaoEmSegundos < menorDuracao){
                menorDuracao = musicas.get(i).duracaoEmSegundos;
                index2 = i;
            }

        }
        return musicas.get(index2);
    }
}
