public class Bird extends Pet
{
    private String species;
    private String color;
    private double wingspan; //inches

    public Bird(String name, int age, double weight, String color, double wingspan, String species, String food)
    {
        super(name, age, weight, food);
        this.color = color;
        this.wingspan = wingspan;
        this.species = species;
    }//end full constructor with call to super

    public String Speak()
    {
        return "The Universe is a Simulation";
    }

    public int monthlyFeeding()
    {
        return 8;
    }

    public String toString()
    {
        String output = super.toString() + "\nColor: " + color;
        output += "\nWingspan: " + wingspan + " inches";
        output += "\nSpecies: " + species;
        return output;
    }
}
