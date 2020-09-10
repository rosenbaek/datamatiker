int a = (int)random(11);
int b = (int)random(11);
int x = 10;

println("a: " + a);
println("b: " + b);

if ((a == x) || (b == x)  || (a+b==x)) {
  println("Success!");
} else {
  println("Failure!");
}
