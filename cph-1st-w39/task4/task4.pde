/*4.a Write a method that takes in an integer as a parameter and prints all values between 0 and 100 that are divisible by the parameter received.
 4.b add the following array to your code: int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 }
 4.c Write a method that returns a random element from the above array.
 4.d Write a function that takes an integer as a parameter and prints the number. 
 After that, it subtracts one from the input and calls itself again (recursion). 
 If the input is less than zero, it should no longer call itself.
 4.e Write a function that takes two integers as parameters and prints both of them seperated by a tab ( \t ). 
 Then have the function calculate and print the fibunacci sequence by calling itself. If the input is greater than 10000, then stop. 
 Start the function by calling it from setup with the input (1, 1). (hint: fibunacci sequence: */

int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 }; //4.b
int x = 3;

void setup()
{
  printValues(x); // 4.a
  randomNum(arr); // 4.c
  println(randomNum(arr));
  recursion(x); // 4.d
  fibunacci(1, 1); // 4.e
}

// 4.a
void printValues(int input) 
{
  for (int i = 0; i <= 100; i++)
  {
    if (i % input == 0)
    {
      println(i);
    }
  }
}

// 4.c
int randomNum(int[] a) 
{
  return a[(int)random(a.length)];
}

// 4.d
int recursion(int x)
{
  println("x = " + x);
  if (x >= 0)
  {
    x -= 1;
    recursion(x);
  }
  return x;
}

// 4.e
void fibunacci(int x, int y)
{
  println(x + "\t" + y);
  x = x + y;
  int fibu = x + y;

  if (fibu < 10000)
  {
    fibunacci(x, fibu);
  }
}
