public class Region {

  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String image;

  // add constructors
  public Region(String name, String image) {
    this.name = name;
    this.image = image;
  }

  // Write accessor/get methods for each instance variable that returns it.
  public String getName() {
    return name;
  }

  public String getImage() {
    return image;
  }
  // Write a toString() method that returns a concatenated String of 3 of the instance
  // variables in a sentence like "The region is ..."
  public String toString() {
    return "The region is " + name + " and the image is " + image;
  }

}
