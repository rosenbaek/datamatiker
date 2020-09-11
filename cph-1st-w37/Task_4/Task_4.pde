// 4.a
int y;
for (int x = 0; x < 21; x++) {
  y = (int)random(21);
  println("x: " + x + " y: " + y);
}

// 4.b
for (int x = 0; x < 21; x++) {
  // even numbers using modulus
  if (x % 2 == 0) {
    System.out.println(x);
  }
}

// 4.b
int x = 0;
while (x < 21) {
  if (x % 2 == 0) {
    System.out.println(x);
  }
  x++;
}
