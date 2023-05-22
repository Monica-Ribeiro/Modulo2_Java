package Ex01;
import java.util.ArrayList;
public class Album {
    String nome;
    String nomeArtista;

    public Album(String nome, String nomeArtista) {
        this.nome = nome;
        this.nomeArtista = nomeArtista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    ArrayList<Musica> musicas = new ArrayList<>();

    public Musica GetMaiorpopularidade() {
        int maiorPopularidade = 0;
        int index1 = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getPopularidade() > maiorPopularidade) {
                maiorPopularidade = musicas.get(i).getPopularidade();
                index1 = i;
            }
        }
        return musicas.get(index1);
    }

    public Musica GetMenorDuracao() {
        int menorDuracao = 100;
        int index2 = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getDuracaoEmSegundos() < menorDuracao) {
                menorDuracao = musicas.get(i).getDuracaoEmSegundos();
                index2 = i;
            }

        }
        return musicas.get(index2);
    }
}
