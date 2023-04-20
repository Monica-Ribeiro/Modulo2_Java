package Ex02;
public class Main {
    public static void main(String[] args){
        Musica musica1 = new Musica("Numb", 3, 8, "Rock/Metal");

        Musica musica2 = new Musica("Lost", 4, 10, "Retrô Dark Synthwave");

        Musica musica3 = new Musica("Tear You Apart", 2, 6, "Alternative/Indiê");

        Musica musica4 = new Musica("TimeBomb", 5, 7, "Metal");

        Album album = new Album("Dark Nocturne", "Diversos");
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
