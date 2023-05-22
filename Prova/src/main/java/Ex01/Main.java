package Ex01;
public class Main {
    public static void main(String[] args){
        Musica musica1 = new Musica("Falling away from me", 300, 7, "Rock/Metal");

        Musica musica2 = new Musica("Lost", 330, 5, "Retrô Synthwave");

        Musica musica3 = new Musica("Drown", 250, 6, "Alternative");

        Musica musica4 = new Musica("Sinematic", 345, 7, "Metal");

        Album album = new Album("Musics", "Diversos");
        album.musicas.add(musica1);
        album.musicas.add(musica2);
        album.musicas.add(musica3);
        album.musicas.add(musica4);

        Musica musicaMaisPopular = album.GetMaiorpopularidade();
        Musica musicaMenorDuracao = album.GetMenorDuracao();
        System.out.println("ALBUM: " + album.getNome());
        System.out.println("ARTISTA: " + album.getNomeArtista());
        System.out.println("Música mais popular: " + musicaMaisPopular.getNome() + " com pontuação de: " +  musicaMaisPopular.getPopularidade() + " do gênero: " + musicaMaisPopular.getGenero());
        System.out.println("Menor tempo de duração: " + musicaMenorDuracao.getNome() + " com duração de: " + musicaMenorDuracao.getDuracaoEmSegundos() + " do gênero: " + musicaMenorDuracao.getGenero());
    }
}
