String str = "string";
String name = "Christian";
int age = 25;

void setup() {
  emptyLine();
  printString(str);
  printNameAge(name,age);
}

void emptyLine() {
  String l = "__";
  println(l);
}

void printString(String s) {
  println(s);
}

void printNameAge(String name, int age) {
  println("My name is " + name + ", I am " + age + " years old.");
}
