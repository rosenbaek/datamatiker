int a = (int)random(11);
int b = (int)random(11);
int c = 10;
int x = 8;
int y = 9;
int z = 13;
int q = x+y+z;
println("x+y+z = " + q);

println("a: " + a);
println("b: " + b);

if ((a == c) || (b == c)  || (a+b==c)) {
  println("Success!");
} else {
  println("Failure!");
}

if (((x != 10) && (x != 20) && (x!=30)) && 
  ((y != 10) && (y != 20) && (y!=30)) && 
  ((z != 10) && (z != 20) && (z!=30)) && 
  (x+y+z == 30)) {
  println("Success!");
} else {
  println("Failure!");
}
