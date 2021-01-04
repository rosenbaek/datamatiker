public class Debugging {
    public static void main(String[] args) {
        String[] list = {"1","2","3"};
        System.out.println("Average finder v0.1");
        double avg = findAverage(list);
        System.out.println("The average is " + avg);
    }

    private static double findAverage(String[] input) {
        double result = 0;
        for (String s : input) {
            result += Integer.parseInt(s);
        }
        return result / input.length;
    }
}
