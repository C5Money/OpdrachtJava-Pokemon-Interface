import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
//    Instance Variables
    List<String> attacks = Arrays.asList("leechSeed", "leaveBlade", "leafStorm", "solarBeam");


//    Constructor
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }


    //    Getters & Setters
    @Override
    public String getType(){
        return "grass";
    }

    List<String> getAttacks() {
        return attacks;
    }


//    Instance Methods
    public void leechSeed(Pokemon name, Pokemon enemy){}

    public void leaveBlade(Pokemon name, Pokemon enemy){}

    public void leafStorm(Pokemon name, Pokemon enemy){}

    public void solarBeam(Pokemon name, Pokemon enemy){}
}
