import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
//    Instance Variables
    List<String> attacks = Arrays.asList("hydrocanon", "raindance", "surf", "hydropump");


//    Constructor
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }


//    Getters & Setters
    List<String> getAttacks() {
        return attacks;
    }


//    Instance Methods
    void hydroCanon(Pokemon name, Pokemon enemy){}

    void rainDance(Pokemon name, Pokemon enemy){}

    void surf(Pokemon name, Pokemon enemy){}

    void hydroPump(Pokemon name, Pokemon enemy){}
}
