int a = 3;
int b = 6;
String string = "Dette er en test";

void setup() {
  sum(a,b);
  toUpperCase(string);
  checkUpperCase(string);
}

int sum(int a, int b) {
  int sum = a + b;
  println(sum);
  return sum;
}

void toUpperCase(String s) {
  String upper = s.toUpperCase();
  println(upper);
}

boolean checkUpperCase(String e) {
  if (Character.isUpperCase(e.charAt(0)) == true) {
    println("Character 0 is uppercase");
    return true;
  } else {
    println("Character 0 is not uppercase");
    return false;
  }
}
