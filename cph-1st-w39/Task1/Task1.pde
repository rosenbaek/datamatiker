int[] c = { 8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2 }; //<>//
boolean isDone = false;

void setup() {

  while(!isDone) {
    sorting(c);
  } 
  println(c);
}

void draw() {
}

void sorting(int[] c) {
    isDone = true;

    for (int i = 0; i < c.length-1; i++) {
      if (c[i] > c[i+1]) {
        int temp = c[i];
        c[i] = c[i+1];
        c[i+1] = temp;
        isDone = false;
      }
    }
}
