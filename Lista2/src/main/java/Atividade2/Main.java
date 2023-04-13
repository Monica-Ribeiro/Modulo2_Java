package Atividade2;
public class Main {
    public static void main(String[] args){
        Musica musica1 = new Musica();
        musica1.nome = "Numb";
        musica1.duracaoEmSegundos = 3;
        musica1.popularidade = 8;
        musica1.genero = "Rock/Metal";

        Musica musica2 = new Musica();
        musica2.nome = "Lost";
        musica2.duracaoEmSegundos = 4;
        musica2.popularidade = 10;
        musica2.genero = "Retrô Dark Synthwave";

        Musica musica3 = new Musica();
        musica3.nome = "Tear You Apart";
        musica3.duracaoEmSegundos = 2;
        musica3.popularidade = 6;
        musica3.genero = "Alternative/Indiê";

        Musica musica4 = new Musica();
        musica4.nome = "TimeBomb";
        musica4.duracaoEmSegundos = 5;
        musica4.popularidade = 7;
        musica4.genero = "Metal";

        Album album = new Album();
        album.nome = "Dark Nocturne";
        album.nomeArtista1 = "Depeche Mode";
        album.musicas.add(musica1);
        album.musicas.add(musica2);
        album.musicas.add(musica3);
        album.musicas.add(musica4);

        Musica musicaMaisPopular = album.GetMaiorpopularidade();
        Musica musicaMenorDuracao = album.GetMenorDuracao();
        System.out.println("Música mais popular: " + musicaMaisPopular.popularidade);
        System.out.println("Menor tempo de duração: " + musicaMenorDuracao.duracaoEmSegundos);
    }

}
