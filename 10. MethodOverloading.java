/**
 * Created by nishant on 14/4/17.
 */
public class InchFeet2cm {
    public static void main(String[] args)
    {
        double feet = 13;
        double inch = 1;

        double centimeters= calculateFeetAndInchesToCentimeters(feet,inch);

    }

    public static double calculateFeetAndInchesToCentimeters(double feet, double inches)
    {
        if ((feet >=0 ) && (inches >=0 && inches <= 12))
        {
            double centimeter = (feet * 12 * 2.54) + inches * 2.54 ;
            System.out.println(centimeter);
            return centimeter;
        }
        System.out.println("invalid");
        return -1;
    }

    public static double calculateFeetAndInchesToCentimeters(double inches)
    {
        if(inches >=0 && inches <= 12) {
            double feet = inches /12 ;
            double remainingInches = inches % 12;
            System.out.println(inches + " is equal to " + feet + "feet" + inches + "inches");
            return calculateFeetAndInchesToCentimeters(feet,inches);
        }
        return -1;
    }

}
