public class Arrays {

    private static String[] stringArray = {"hej", "med", "dig"};
    private static String[] stringArray1 = new String[3];
    public static void main(String[] args) {

        for (int i = 0; i < stringArray.length; i++) {
            stringArray1[i] = stringArray[i];
            System.out.println("stringArray1: " + stringArray1[i]);
            System.out.println("stringArray: " + stringArray[i]);
        }

    }
}
