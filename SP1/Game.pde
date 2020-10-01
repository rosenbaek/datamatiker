import java.util.Random;

class Game
{
  private Random rnd;
  private int width;
  private int height;
  private int[][] board;
  private Keys keys;
  private int player1Life;
  private int player2Life;
  private Dot player1;
  private Dot player2;
  private Dot[] enemies;
  private Dot[] food;
  private int maxLife;


  Game(int width, int height, int numberOfEnemies, int numberOfFood)
  {
    if (width < 10 || height < 10)
    {
      throw new IllegalArgumentException("Width and height must be at least 10");
    }
    if (numberOfEnemies < 0)
    {
      throw new IllegalArgumentException("Number of enemies must be positive");
    } 
    this.rnd = new Random();
    this.board = new int[width][height];
    this.width = width;
    this.height = height;
    this.maxLife = 100;
    keys = new Keys();

    // player1 
    player1 = new Dot(0, 0, width-1, height-1); //int x, int y, int maxX, int maxY

    // player2 
    player2 = new Dot(15, 15, width-1, height-1); //int x, int y, int maxX, int maxY
    
    
    // Construct Enemies
    enemies = new Dot[numberOfEnemies];
    for (int i = 0; i < numberOfEnemies; ++i)
    {
      enemies[i] = new Dot(width-1, height-1, width-1, height-1);
    }

    // Construct food
    food = new Dot[numberOfFood];
    for (int i = 0; i < numberOfFood; ++i)
    {
      food[i] = new Dot(width-1, 0, width-1, height-1);
    }

    println(food);
    // Start player1 life
    this.player1Life = maxLife;
    this.player2Life = maxLife;
  }


  // Getter
  public int getWidth()
  {
    return width;
  }

  public int getHeight()
  {
    return height;
  }

  public int getPlayer1Life()
  {
    return player1Life;
  }
  public int getPlayer2Life()
  {
    return player2Life;
  }

  public void onKeyPressed(char ch)
  {
    keys.onKeyPressed(ch);
  }

  public void onKeyReleased(char ch)
  {
    keys.onKeyReleased(ch);
  }

  //Arrows
  public void onArrowPressed(int x)
  {
    keys.onArrowPressed(x);
  }
  public void onArrowReleased(int x)
  {
    keys.onArrowReleased(x);
  }


  public void update()
  {
    updateplayer1();
    updateEnemies();
    updateFood();
    checkForCollisions();
    clearBoard();
    populateBoard();
  }



  public int[][] getBoard()
  {
    //ToDo: Defensive copy?
    return board;
  }


  private void clearBoard()
  {
    for (int y = 0; y < height; ++y)
    {
      for (int x = 0; x < width; ++x)
      {
        board[x][y]=0;
      }
    }
  }



  private void updateplayer1()
  {
    //Update player11
    if (keys.wDown() && !keys.sDown())
    {
      player1.moveUp();
    }
    if (keys.aDown() && !keys.dDown())
    {
      player1.moveLeft();
    }
    if (keys.sDown() && !keys.wDown())
    {
      player1.moveDown();
    }
    if (keys.dDown() && !keys.aDown())
    {
      player1.moveRight();
    }
    
    //player1 2 - Fix KeyCode issue
    if (keys.arrowUp() && !keys.arrowDown())
    {
      player2.moveUp();
    }
    if (keys.arrowLeft() && !keys.arrowRight())
    {
      player2.moveLeft();
    }
    if (keys.arrowDown() && !keys.arrowUp())
    {
      player2.moveDown();
    }
    if (keys.arrowRight() && !keys.arrowLeft())
    {
      player2.moveRight();
    }
  }

  private void updateEnemies()
  {
    for (int i = 0; i < enemies.length; ++i)
    {
      //Should we follow or move randomly?
      //2 out of 3 we will follow..
      if (rnd.nextInt(3) < 2)
      {
        //We follow
        int dx1 = player1.getX() - enemies[i].getX();
        int dy1 = player1.getY() - enemies[i].getY();
        int dx2 = player2.getX() - enemies[i].getX();
        int dy2 = player2.getY() - enemies[i].getY();
        if (abs(dx1) > abs(dy1) || abs(dx2) > abs(dy2))
        {
          if (dx1 > 0 || dx2 > 0)
          {
            //player1 is to the right
            enemies[i].moveRight();
          } else
          {
            //player1 is to the left
            enemies[i].moveLeft();
          }
        } else if (dy1 > 0 || dy2 > 0)
        {
          //player1 is down;
          enemies[i].moveDown();
        } else
        {//player1 is up;
          enemies[i].moveUp();
        }
      } else
      {
        //We move randomly
        int move = rnd.nextInt(4);
        if (move == 0)
        {
          //Move right
          enemies[i].moveRight();
        } else if (move == 1)
        {
          //Move left
          enemies[i].moveLeft();
        } else if (move == 2)
        {
          //Move up
          enemies[i].moveUp();
        } else if (move == 3)
        {
          //Move down
          enemies[i].moveDown();
        }
      }
    }
  }

  private void updateFood()
  {
    for (int i = 0; i < food.length; ++i)
    {
      //Should we follow or move randomly?
      //2 out of 3 we will follow..
      if (rnd.nextInt(3) < 1)
      {
        //We follow
        int dx1 = player1.getX() - food[i].getX();
        int dy1 = player1.getY() - food[i].getY();
        int dx2 = player2.getX() - enemies[i].getX();
        int dy2 = player2.getY() - enemies[i].getY();
        if (abs(dx1) > abs(dy1) || abs(dx2) > abs(dy2))
        {
          if (dx1 > 0 || dx2 > 0)
          {
            //player1 is to the right
            food[i].moveLeft();
          } else
          {
            //player1 is to the left
            food[i].moveRight();
          }
        } else if (dy1 > 0 || dy2 > 0)
        {
          //player1 is down;
          food[i].moveUp();
        } else
        {//player1 is up;
          food[i].moveDown();
        }
      } else
      {
        //We move randomly
        int move = rnd.nextInt(4);
        if (move == 0)
        {
          //Move right
          food[i].moveRight();
        } else if (move == 1)
        {
          //Move left
          food[i].moveLeft();
        } else if (move == 2)
        {
          //Move up
          food[i].moveUp();
        } else if (move == 3)
        {
          //Move down
          food[i].moveDown();
        }
      }
    }
  }

  private void populateBoard()
  {
    //Insert player1
    board[player1.getX()][player1.getY()] = 1;
    
    //Insert player2
    board[player2.getX()][player2.getY()] = 4;
    
    
    //Insert enemies
    for (int i = 0; i < enemies.length; ++i)
    {
      board[enemies[i].getX()][enemies[i].getY()] = 2;
    }

    //insert Food
    for (int i = 0; i < food.length; ++i)
    {
      board[food[i].getX()][food[i].getY()] = 3;
    }
  }

  private void checkForCollisions()
  {
    //Check enemy collisions
    for (int i = 0; i < enemies.length; ++i)
    {
      //Player 1
      if (enemies[i].getX() == player1.getX() && enemies[i].getY() == player1.getY())
      {
        //We have a collision
        --player1Life;
      }
      //Player 2
      if (enemies[i].getX() == player2.getX() && enemies[i].getY() == player2.getY())
      {
        //We have a collision
        --player2Life;
      }
    }

    //Check food catch
    for (int i = 0; i < food.length; ++i)
    {
      //Player1
      if (food[i].getX() == player1.getX() && food[i].getY() == player1.getY())
      {
        //We have a catch
        if (player1Life <= 90) // 90 to avoid going over 100
        {
        player1Life = player1Life + 10;
        food[i] = new Dot((int)random(width-1), (int)random(height-1), width-1, height-1);
        } else 
        {
          player1Life = maxLife;
          food[i] = new Dot((int)random(width-1), (int)random(height-1), width-1, height-1);
        }
      }
      //Player2
      if (food[i].getX() == player2.getX() && food[i].getY() == player2.getY())
      {
        //We have a catch
        if (player2Life <= 90) // 90 to avoid going over 100
        {
        player2Life = player2Life + 10;
        food[i] = new Dot((int)random(width-1), (int)random(height-1), width-1, height-1);
        } else 
        {
          player2Life = maxLife;
          food[i] = new Dot((int)random(width-1), (int)random(height-1), width-1, height-1);
        }
      }
    }
  }
  

  
}
