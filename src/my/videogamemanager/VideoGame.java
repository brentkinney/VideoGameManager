
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.videogamemanager;

/**
 *Class that describes a video game.  A video game has a title, rating, and 
 * release year.  You can retrieve and set aspects of the video game.
 * @author Brent Kinney
 */
public class VideoGame {
     ////////////Fields///////////////////
  private String title;
  private String rating;
  private int releaseYear;
  
  ///////////Constructors////////////
  /*
  Creates an empty VideoGame object and sets some default values
  */
  public VideoGame() {title = "emptyTitle"; rating = "E"; releaseYear = 0;}
  
  /*
  Method that creats a new VideoGame with a passed title 
  @param gameTitle is a string that the title will be set to
  */
  public VideoGame(String gameTitle)
  {
    this.title = gameTitle;
    rating = "E";
    releaseYear = 0;
  }
  
  /*
  Method that creates a VideoGame and sets the title, rating, and release year
  based on the passed values
  @param gameTitle is the the title of the video game
  @param gameRating is the given rating of the game E, T, or M
  @param gameYear is the int value of the release year for a video game
  */
  public VideoGame(String gameTitle, String gameRating, int gameYear)
  {
    //set title name
    this.title = gameTitle;
    
    //check if gameRating is an acceptable rating of 'E', 'T', or 'M' set the value
    if (gameRating == "E" || gameRating == "T" || gameRating == "M")
    {
      this.rating = gameRating;
    }
    //if gameRating not an acceptable rating, set to default of 'E'
    else
    {
      this.rating = "E";
      System.out.println("Incorrect rating.  Acceptable ratings are: 'E', 'T', or 'M'.");
      System.out.println("Setting Rating to default of 'E'");
    }
    //check if gameYear is greater than 0 and if so, set value
    if (gameYear > 0)
    {
      this.releaseYear = gameYear;
    }
    //if not, set to default of 0
    else
    {
      this.releaseYear = 0;
      System.out.println("Incorrect release year, value must be positive.  Release year will be set to default of '0'");
    }
  }
  
  ////////////////Methods////////////////////////////////////////
  /*
  method to get the title of a video game
  */
  public String getTitle() { return this.title;}
  
  /*
  method to get the rating of a video game
  */
  public String getRating() { return this.rating;}
  
  /*
  method to get the release year of a video game
  */
  public int getReleaseYear() { return this.releaseYear;}
  
  /*
  method to set the title of a video game
  @param gameName is the given string to be used for the title
  */
  public boolean setTitle(String gameName)
  {
      //check if the passed string has characters and if it does set the title
    if (!"".equals(gameName))
    {
        this.title = gameName;
        return true;
    }
    //if the string is empty, set the boolean result to false
    else
    {
        return false;
    }
  }
  
  /*
  method to set the rating of a video game
  @param gameRating is the rating of the game.  The rating must be an acceptable
  value of E, T, or M
  */
  public boolean setRating(String gameRating)
  {
      //check if passed rating is an acceptable value and if so, set the rating
      //and return true
    if (gameRating == "E" || gameRating == "T" || gameRating == "M")
    {
      this.rating = gameRating;
      System.out.println("Game rating set to " + this.rating);
      return true;
    }
    //if an acceptable rating is not used, print an error message and return false
    else
    {
      System.out.println("Incorrect rating.  Acceptable ratings are: 'E', 'T', or 'M'. Rating is unchanged");
      return false;
    }
  }
  
  /*
  method to set the release year of a game
  @param gameYear is the passed int value that sets the Release Year of a game
  */
  public boolean setReleaseYear(int gameYear)
  {
    //if passed realease year greater than 0, use passed value
    if (gameYear > 0)
    {
      this.releaseYear = gameYear;
      System.out.println("Release year set to " + this.releaseYear);
      return true;
    }
    //if passed value is not greater than 0, display the error message
    else
    {
      System.out.println("Incorrect release year, value must be positive. Value is unchanged");
      return false;
    }
  }
  
  
  /*
  method to return the value for a video game
  */
  public String toString()
  {
    return this.title + " was released in " + this.releaseYear + " with a rating of " + this.rating;
  }
  
  ///////Main Method//////////
 /*
 public static void main (String[] args)
  {
    //set video game with default values
    VideoGame game1 = new VideoGame();
    System.out.println(game1);
    
    //set video game with given vales
    VideoGame game2 = new VideoGame("The Elder Scrolls V: Skyrim","M",2011);
    System.out.println(game2);
    
    //set game1 title
    game1.setTitle("Grand Theft Auto V");
    System.out.println(game1);
    
    //set game1 rating
    game1.setRating("Mature");
    //set game1 rating to acceptable rating
    game1.setRating("M");
    System.out.println(game1);
    
    //set game1 release year
    game1.setReleaseYear(-150);
    //set game1 release year to an acceptable value
    game1.setReleaseYear(2013);
    System.out.println(game1);
    
    //create new game
    VideoGame game3 = new VideoGame("GoldenEye 007","Teen",-1997);
    //set correct values
    game3.setRating("T");
    game3.setReleaseYear(1997);
    
    //show final game results
    System.out.println(game1);
    System.out.println(game2);
    System.out.println(game3);
    
  }
   

  */
}
