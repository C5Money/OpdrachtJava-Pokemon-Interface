import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon{
//    Instance Variables
    List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");


//    Constructor
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }


//    Getters & Setters
    @Override
    public String getType(){
        return "electric";
    }

    List<String> getAttacks() {
        return attacks;
    }


//    Instance Methods
    void  thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name + " attacks " + getName() + " with " + getAttacks());
    }

    void electroBall(Pokemon name, Pokemon enemy){

    }

    void thunder(Pokemon name, Pokemon enemy){

    }

    void voltTackle(Pokemon name, Pokemon enemy){

    }


}
