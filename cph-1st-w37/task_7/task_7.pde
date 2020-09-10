int input = abs(-30);
int counter = input/2;


while (input >= 0 ) {
  println(input);
  if (input == 6) {
    println("six");
  }
  if (input == counter) {
    println("Half");
  } 
  input--;
}
