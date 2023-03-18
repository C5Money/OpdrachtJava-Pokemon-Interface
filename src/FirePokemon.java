import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
//    Instance Variables
    List<String> attacks = Arrays.asList("flamethrower", "firelash", "pyroball", "inferno");


//    Constructor
    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }


//    Getters & Setters
    List<String> getAttacks() {
        return attacks;
    }


//    Instance Methods
    void flameThrower(Pokemon name, Pokemon enemy){

    }

    void fireLash(Pokemon name, Pokemon enemy){

    }

    void pyroBall(Pokemon name, Pokemon enemy){

    }

    void inferno(Pokemon name, Pokemon enemy){

    }
}
