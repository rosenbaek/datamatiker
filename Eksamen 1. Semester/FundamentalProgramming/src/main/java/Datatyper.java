import java.text.DecimalFormat;

public class Datatyper {
    //Strings, Int, Double,


    //Hvorfor kan man ikke sammenligne 2 Strings med ==?
    public static void main(String[] args) {
        int tal = 1;
        double flereTal = 200.3456;
        String navn = "navn";
        String navn1 = "navn";
        Boolean trueFalse = false;

        //Strings
        /*We can use == operators for reference comparison (address comparison in memory) and .equals() method for content
        comparison. In simple words, == checks if both objects point to the same memory location whereas .equals()
        evaluates to the comparison of values in the objects.*/
        String abc = new String("Hello World");
        String xyz = new String("Hello World");

        if(abc == xyz)
            System.out.println("Refers to same string");
        else
            System.out.println("Refers to different strings");

        if(abc.equals(xyz)) {
            System.out.println("Contents of both strings are same");
        }
        else {
            System.out.println("Contents of strings are different");
        }


        System.out.println("length: " + navn.length()); //Checker hvor mange char der er i string
        System.out.println("Char at: " + navn.charAt(2)); //Checker hvilket char der er på index du angiver (som et array)
        System.out.println("to uppercase: " + navn.toUpperCase()); //Ændre char til uppercase
        System.out.println("contains: " + navn.contains("v")); //Boolean checker om string indeholder char du angiver
        navn = navn.substring(1,3); //Substring af index 1 & 2
        System.out.println(navn);
        navn.split("v");
        System.out.println(navn);


        //double
        System.out.printf("double 2 decimaler: %.2f", flereTal);
        System.out.println();
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println(df.format(flereTal));
    }
}
