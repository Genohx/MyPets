public class MyPetsDriver
{
    public static void main(String[] args)
    {
        Pet pablo = new Dog("Pablo", "Chihuahua", 5, 25.0, "kibble");
        Pet tony = new Bird("Tony", 2, 10.0, "Red", 20, "Parrot", "seeds");

        System.out.println(pablo.toString());
        System.out.println(tony.toString());
        //v the declaration here is very important
//        Dog rex = new Dog("Rex", "German Shepherd", 2, 160.2);
//        Pet mochi = new Lizard("Mochi", "Blue-Tongued Skink", 8, 2);
//        Pet donald = new Bird("Donald", 85, 1.13, "White", 5000, "Duck");
//        //Pet secret = new Pet("Secret", 7, 40.2); pet is abstract, cannot be instantiated
//
//        System.out.println(rex.fetch());//only works when rex is a Dog, not when rex is a Pet
//        System.out.println(rex.Speak());//depends on what type rex is, Dog vs Pet

//        int[] arrayOfInts = new int[5];//example of how to instantiate an array
//
//        Pet[] menagerie = new Pet[5];//instantiating an array of Pets
//        menagerie[0] = rex;
//        menagerie[1] = mochi; //filling the array
//        menagerie[2] = donald;
//
//        for(int i = 0; i < menagerie.length; i++)
//        {
//            System.out.println(menagerie[i]);
//        }

        //Speaking to pets
//        System.out.println("Rex says: " + rex.Speak());
//        System.out.println("Mochi says: " + mochi.Speak());
//        System.out.println("Donald says: " + donald.Speak());

        //check conversion
//        System.out.println("Rex's weight in pounds is: " + rex.AmericanFreedomUnits() + ".");

        //testing pets
//        System.out.println(rex);
//        System.out.println(mochi);
//        System.out.println(donald);
    }
}
