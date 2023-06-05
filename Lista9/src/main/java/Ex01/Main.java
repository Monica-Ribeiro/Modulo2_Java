package Ex01;
public class Main {
    public static void main(String[] args){
        Pokedex pokedex = new Pokedex();
        pokedex.adicionarPokemon(new Pokemon("1", "Pikachu","Eletricidade"));
        pokedex.adicionarPokemon(new Pokemon("2","Charizard", "Fogo"));
        pokedex.adicionarPokemon(new Pokemon("3","Bubasaur","Planta"));
    }
}
