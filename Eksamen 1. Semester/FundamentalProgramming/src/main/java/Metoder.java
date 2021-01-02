/*Med metoder er det mulig at bryde sin kode ned i minde dele.
Why use methods? To reuse code: define the code once, and use it many times..
Begrænser man én metode til ét formål så bliver koden meget nemmere at læse og nemmere at debugge*/

public class Metoder {
    public static void main(String[] args) {
        System.out.println(metodeMedParameter("parameter"));
        System.out.println(metodeMedParameter("parameter", "test"));
    }

    public static String metodeMedParameter(String string) {
        String s = "";
        s = string;
        return s;
    }
    //The method signature in the above example is metodeMedParameter(String string).

    public static String metodeMedParameter(String string, String string1) {
        String s = "";
        s = string + string1;
        return s;
    }
    //Vi kan lave en metode med samme navn fordi vore paramter er forskellige.
}
