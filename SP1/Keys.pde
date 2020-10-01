class Keys
{
  private boolean wDown = false;
  private boolean aDown = false;
  private boolean sDown = false;
  private boolean dDown = false;

  private boolean arrowUp = false;
  private boolean arrowDown = false;
  private boolean arrowLeft = false;
  private boolean arrowRight = false;

  public Keys() {
  }

  public boolean wDown()
  {
    return wDown;
  }

  public boolean aDown()
  {
    return aDown;
  }

  public boolean sDown()
  {
    return sDown;
  }

  public boolean dDown()
  {
    return dDown;
  }


  //Arrows
  public boolean arrowUp()
  {
    return arrowUp;
  }

  public boolean arrowDown()
  {
    return arrowDown;
  }

  public boolean arrowLeft()
  {
    return arrowLeft;
  }

  public boolean arrowRight()
  {
    return arrowRight;
  }


  void onKeyPressed(char ch)
  {
    if (ch == 'W' || ch == 'w')
    {
      wDown = true;
    } else if (ch == 'A' || ch == 'a')
    {
      aDown = true;
    } else if (ch == 'S' || ch == 's')
    {
      sDown = true;
    } else if (ch == 'D' || ch == 'd')
    {
      dDown = true;
    }
  }

  //Arrows
  void onArrowPressed(int x)
  {
    if (x == 38)
    {
      arrowUp = true;
    } else if (x == 40)
    {
     arrowDown = true;
    } else if (x == 37)
    {
     arrowLeft = true;
    } else if (x == 39)
    {
     arrowRight = true;
    }
  }
  
    void onArrowReleased(int x)
  {
    if (x == 38)
    {
      arrowUp = false;
    } else if (x == 40)
    {
     arrowDown = false;
    } else if (x == 37)
    {
     arrowLeft = false;
    } else if (x == 39)
    {
     arrowRight = false;
    }
  }

  void onKeyReleased(char ch)
  {
    if (ch == 'W' || ch == 'w')
    {
      wDown = false;
    } else if (ch == 'A' || ch == 'a')
    {
      aDown = false;
    } else if (ch == 'S' || ch == 's')
    {
      sDown = false;
    } else if (ch == 'D' || ch == 'd')
    {
      dDown = false;
    }
  }
}
