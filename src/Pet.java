import java.text.DecimalFormat;

public abstract class Pet
{
    protected String name;
    protected int age;
    protected double weight; //kilograms
    protected final double LB_TO_KG = 0.454;
    protected String food;

    DecimalFormat fmt = new DecimalFormat("#.#");

    public Pet(String name, int age, double weight, String food)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.food = food;
    }

    //Getters
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public String getFood()
    {
        return food;
    }
    //Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setFood(String food)
    {
        this.food = food;
    }
    //Brain Methods
    abstract public String Speak(); //overwritten in other classes

    abstract public int monthlyFeeding();

    public double AmericanFreedomUnits()
    {
        return weight * 2.205;
    }//end method to convert weight value to pounds

    //toString
    public String toString()
    {
        String output = "";
        output += "Name: " + name;
        output += "\nAge: " + age;
        output += "\nWeight: " + weight + " kg(s) " + "(" + fmt.format(AmericanFreedomUnits())+ " in pounds)";
        output += "\nFood: " + food;
        return output;
    }
}
