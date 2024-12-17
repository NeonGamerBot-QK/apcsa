import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class Main {
    // GUI elements
    private JFrame jFrame = new JFrame("Countries");
    private ImageIcon img;
    private JLabel imageLabel;
    private JLabel outputLabel;
    
    // array of 10 Country objects
    private Country[] countryArray = new Country[10];
    // index of current shown country
    private int cindex = 0;
    
    // array of Region objects
    private Region[] regionsArray = new Region[8];
    private int rindex = 0;
    
    private static String type;

    public static void main(String[] args) {
        // Create the GUI
        Main gui = new Main();
        gui.loadCountries();
        gui.loadRegions();
        gui.showCountry();
        type = "country";
    }

    public void loadCountries() {
        // Open the data file - do not change
        File file = new File("/Users/saahil.dutta/apcsa/projects/GeoGame/countries-data.csv");
        Scanner scan = null;
        try {
          scan = new Scanner(file);
        } catch(FileNotFoundException e) { 
            System.out.println("File not found");     
        }
    
        // Write a for loop that goes through the countryArray.
        // for(int i ....) {
        // Do the following inside the loop
        for(int i = 0; i < countryArray.length;i++) {
        String input = scan.nextLine();
        String[] data = input.split(",");
        System.out.println("Read in " + data[0]);
        countryArray[i] = new Country(data[0], data[1], data[2], data[3]);
        }
        // inside the loop, create a new Country using your constructor with 3 arguments and pass in data[0], data[1], data[2], data[3] as arguments.
        // inside the loop, set countryArray[i] to the created Country object
    }



    public void loadRegions(){
        // use mustache notation to create an array for the names of the regions
        
        // use mustache notation to create an array for the image names
        
        // Write a loop to create a region object for each region and store it in the array
    
    
    }

    /* showCountry() will show the image associated with the current country. 
    * It should get the country at the index from the countryArray. It should use 
    * its get method to get its image file name and use the code below to put 
    * the image in the GUI.
    */
    public void showCountry() {
        // Get the country at index from countryArray
        
        // Use its get method to get the its image file name and save it into imagefile variable below instead of worldmap.jpg.
        String imagefile = "world.jpeg";
        // Use the following code to create an new Image Icon and put it into the GUI
        img = new ImageIcon("images/" + imagefile);
        imageLabel.setIcon(img);
    }


    /* showRegion() will show the image associated with the current region.
    * It should get the region at the index from the regionsArray.  It should
    * use its get method to get its image file name and use the code bellow to put
    * the image in the GUI
    */
    public void showRegion() {
        // Get the country at index from countryArray
        
        // Use its get method to get the its image file name and save it into imagefile variable below instead of worldmap.jpg.
        String imagefile = "world.jpeg";
        img = new ImageIcon("images/" + imagefile);
        // create a label to display image
        imageLabel.setIcon(img);
    }

    /* reviewButton should get the country/region at index from the corresponding array, 
    * call its toString() method and save the result, print it out with 
    * System.out.println and as an argument to outputLabel.setText( text to print out ); 
    */
    public void reviewButtonClick() {
      
    }

    /* quizButton should clear the outputLabel (outputLabel.setText to empty string),
    * get the country or region at index from their array, print out a question about it like 
    * What country is this? and/or What's this country's capital?. and/or What region is this? 
    * Get the user's answer using scan.nextLine() and check if it is equal to the country's data 
    * using its get  methods and print out correct or incorrect.
    */
    public void quizButtonClick() {
        Scanner scan = new Scanner(System.in); 
        
    
    }


    public void newButtonClick() {
        //  incriment the index values make sure they do not go out of range
    
    }

    public Main() {
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 360);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // buttons at the top
        JButton regionButton = new JButton("Region");
        JButton countryButton = new JButton("Country");
        JButton reviewButton = new JButton("Review");
        JButton quizButton = new JButton("Quiz");
        JButton newButton = new JButton("Next");
        jFrame.add(countryButton);
        jFrame.add(regionButton);
        jFrame.add(reviewButton);
        jFrame.add(quizButton);
        jFrame.add(newButton);
    
        // create a new image icon
        img = new ImageIcon("images/world.jpeg");
        // create a label to display image
        imageLabel = new JLabel(img);
        // and one for output
        outputLabel = new JLabel();
        jFrame.add(imageLabel);
        jFrame.add(outputLabel);
        jFrame.setVisible(true);
        
        // add event listener for button click
        reviewButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) 
        {
            reviewButtonClick();
        }
        });
        
        quizButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) 
        {
            quizButtonClick();
        }
        });
    
        newButton.addActionListener(new ActionListener()  {
        public void actionPerformed(ActionEvent e) 
        {
            newButtonClick();
        }
        });
        
        regionButton.addActionListener(new ActionListener()  {
        public void actionPerformed(ActionEvent e) 
        {
            //switch to regions
        
        }
        });
        
        countryButton.addActionListener(new ActionListener()  {
        public void actionPerformed(ActionEvent e) 
        {
            //switch to countries
        
        }
        });
        
    }
    
    
}