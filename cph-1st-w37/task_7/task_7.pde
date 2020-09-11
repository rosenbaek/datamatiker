int input = -48;
int counter = input/2;
int inputAbs = abs(input);

while (inputAbs >= 0 ) 
  {
  if (inputAbs == 6) {
    println("six");
  }
  if (inputAbs == counter) 
  {
    println("Half");
  } else 
  {
    println(inputAbs);
  }
  inputAbs--;
}
