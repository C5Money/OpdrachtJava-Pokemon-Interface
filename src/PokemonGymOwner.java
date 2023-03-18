import java.util.List;
public class PokemonGymOwner extends PokemonTrainer{
    //    Instance Variables
    private String town;


//    Constructor
    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        super(name, pokemons);
    }


//    Getters & Setters
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }


//    Instance Methods
}




