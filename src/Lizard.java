public class Lizard extends Pet
{
    private String species;

    public Lizard(String name, String species, int age, double weight)
    {
        super(name, age, weight);
        this.species = species;
    }

    public String Speak()
    {
        return "Hiss";
    }

    public String toString()
    {
        String output = "";
        output += super.toString() + "\nSpecies: " + species;

        return output;
    }//end toString with call to super
}//end Lizard class
