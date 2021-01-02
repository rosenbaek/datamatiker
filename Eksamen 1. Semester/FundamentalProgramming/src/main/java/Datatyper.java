import java.text.DecimalFormat;

public class Datatyper {
    //Strings, Int, Double,


    //Hvorfor kan man ikke sammenligne 2 Strings med ==?
    public static void main(String[] args) {
        int tal = 1;
        double flereTal = 200.3456;
        String navn = "navn";
        Boolean trueFalse = false;

        //Strings
        System.out.println(navn.length()); //Checker hvor mange char der er i string
        System.out.println(navn.charAt(2)); //Checker hvilket char der er på index du angiver (som et array)
        System.out.println(navn.toUpperCase()); //Ændre char til uppercase
        System.out.println(navn.contains("v")); //Boolean checker om string indeholder char du angiver
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
