import java.util.ArrayList;
import java.util.Collections;

public class interfaces {
    // Interface
    interface Animal {
        public void animalSound(); // interface method (does not have a body)
        public void sleep(); // interface method (does not have a body)
    }

    // Pig "implements" the Animal interface
    static class Pig implements Animal, Comparable<Pig> {
        private int age;
        public Pig (int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
        public void sleep() {
            // The body of sleep() is provided here
            System.out.println("Zzz");
        }

        @Override
        public String toString() {
            return "Pig{" +
                    "age=" + age +
                    '}';
        }

        @Override
        public int compareTo(Pig o) {
            return age - o.getAge();
        }
    }




        public static void main(String[] args) {
            ArrayList<Pig> list = new ArrayList<>();
            Pig myPig = new Pig(10);// Create a Pig object
            list.add(myPig);
            Pig myPig1 = new Pig(1);
            list.add(myPig1);

            Collections.sort(list);

            for (Pig p:list) {
                System.out.println(p.toString());
            }

            myPig.animalSound();
            myPig.sleep();
        }

}
