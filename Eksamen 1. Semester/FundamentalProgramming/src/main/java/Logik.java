import java.util.Scanner;
/*If-else conditional branches are great for variable conditions that result into a boolean,
whereas switch statements are great for fixed data values. If a switch contains more than five items, it's implemented
using a lookup table or a hash list. This means that all items get the same access time, compared to a list of if:s
where the last item takes much more time to reach as it has to evaluate every previous condition first.Generally when
faced with a huge switch-case or if-else block
the solution is to use polymorphism. Find the behavior that's changing and encapsulate it.*/
public class Logik {
    public static void main(String[] args) {
        int i = 0;
        int x = 1;

        // If-then-else statement
        if (i == x || i == 2) { // || is equal to OR
            System.out.println("IF statement her");
        } else if (x == 1 && i == 0) { // && is equal to AND
            System.out.println("else IF statement her");
        } else {
            System.out.println("else statement her");
        }

        //Switchcase
        System.out.println("tast S eller A");
        Scanner scan = new Scanner(System.in);
        Boolean finish = false;
        while (!finish) {
            String choice = scan.nextLine();
            switch (choice.toUpperCase()) {
                case "S":
                    System.out.println("S");
                    finish = true;
                    break;
                case "A":
                    System.out.println("A");
                    finish = true;
                    break;
                default:
                    System.out.println("default");
                    finish = true;
                    break;
            }
        }
    }
}
