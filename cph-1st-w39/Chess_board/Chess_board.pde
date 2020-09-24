int[][] board;
int f = 8; //Fields 
float fx = f; //Made to convert int to float. (More precise sideLength)
float sideLength;

void setup() 
{
  size(350, 350);
  sideLength = width/fx; 
  board = new int[f][f];
  drawFields();
  println(sideLength);
}

void drawFields() 
{
  for (int x = 0; x < f; x++) 
  {
    for (int y = 0; y < f; y++) 
    {
      if (x % 2 == 0 && y % 2 != 0) 
      {
        fill(250);
      } else if (x % 2 != 0 && y % 2 == 0) 
      {
        fill(250);
      } else 
      {
        fill(50);
      }
      rect(x * sideLength, y * sideLength, sideLength, sideLength);
    }
  }
}
