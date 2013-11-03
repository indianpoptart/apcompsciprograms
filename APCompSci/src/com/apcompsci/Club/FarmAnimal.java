
/**
 * Write a description of class FarmAnimal here.
 * 
 * @author Nikhil Paranjape 
 * @version 4/24/13
 */
public class FarmAnimal extends Animal
{
    // instance variables - replace the example below with your own
    private String creature;
    private String noise;
    private String place;
    private String statement;
    /**
     * Constructors for objects of class Animal
     */
    public FarmAnimal(String farmcreature, String farmnoise, String farmplace, String farmstatement)
    {
        creature = farmcreature;
        noise = farmnoise;
        statement = farmstatement;
        place = farmplace;
    }
    public String toString(){
        String line1 = "Old MacDonald had a " + place + ", " + statement;
        String line2 = "And on that " + place + " he had a " + creature + ", " + statement;
        String line3 = "With a " + noise + " " + noise + " here and a " + noise + " " + noise + " there";
        String line4 = "Here a " + noise + ", there a " + noise + ", everywhere a " + noise + " " + noise;
        String line5 = "Old MacDonald had a " + place + ", " + statement;
        return line1 +  "\n" + line2 + "\n" + line3 +  "\n" + line4 + "\n" + line5 + "\n";
       
    }
}


