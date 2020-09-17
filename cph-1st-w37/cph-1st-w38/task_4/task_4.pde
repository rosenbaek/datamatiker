int[] intArray = {3, 8, 6};
String[] stringArray = {"hej", "med", "dig"};
boolean[] booleanArray = new boolean[3];

void setup() {
  printStrings(stringArray);
  sumOfArray(intArray);
  averageArray(intArray);
  sortArray(intArray);
}

void printStrings(String[] string) {
  for (int i = 0; i < string.length; i++) {
    println(string[i]);
  }
}

void sumOfArray(int[] tempArray) {
  int y = 0;
  for (int i = 0; i < tempArray.length; i++) {
    int x = tempArray[i];
    y = x + y;
  }
  println(y);
}

void averageArray(int[] tempArray) {
  float y = 0;
  float average = 0;
  for (int i = 0; i < tempArray.length; i++) {
    int x = tempArray[i];
    y = x + y;
    average = y / tempArray.length;
  }
  println(average);
}

int[] sortArray(int[] tempArray) {
  int[] x = sort(tempArray);
  println(x);
  return x;
}
