public class Dog extends Pet
{
    private String breed;

    public Dog(String name, String breed, int age, double weight, String food)
    {
        super(name, age, weight, food);
        this.breed = breed;
    }//end full constructor

    public String fetch()
    {
        if(Math.random() > 0.5)
        {
            return "Fetch accomplished";
        }
        else
        {
            return "No fetching here";
        }
    }//end method that exists in Dog but not Pet to demo polymorphism issue

    public String Speak()
    {
        if(this.age < 2)
            return "Yip";
        return "Woof";
    }//end method that was overwrote the one in Pet

    public int monthlyFeeding()
    {
        int dailyFeedings;
        if(super.getAge() < 6)
        {
            dailyFeedings = 2;
        }
        else
        {
            dailyFeedings = 1;
        }
        return dailyFeedings * 30;
    }

    public String toString()
    {
        String output = "";
        output += super.toString() + "\nBreed: " + breed;

        return output;
    }//end toString with call to super
}//end class
