import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pikachu p1 = new Pikachu("David");
        Pikachu p2 = new Pikachu("Per");

        Balbasaur b1 = new Balbasaur("Susan");
        Balbasaur b2 = new Balbasaur("Lois");

        ArrayList<Pokemon> pokedex = new ArrayList<>();

        pokedex.add(p1);
        pokedex.add(p2);
        pokedex.add(b1);
        pokedex.add(b2);


        for(Pokemon p : pokedex) {
            //System.out.println("name: " + p.getName());
            p.attack();
        }

        b1.talk();

        Pokemon currentPokemon = pokedex.get(2);

        //( (Balbasaur) currentPokemon).attack();

       // Pokemon p = new Pokemon("Laura");

    }
}