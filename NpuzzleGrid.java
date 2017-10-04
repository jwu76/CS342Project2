/*
 * this java class attempts the following:
 * 		-create the NPuzzleGrid
 * 		-randomize the array
 * 		-find out if the array is solvable
 * 		-implements the action events
 */


//import libraries for code to work
import java.util. *;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NpuzzleGrid extends JFrame implements ActionListener {
  private JButton buttons[];
  private String names[] =
  {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", " "};
  private Container container;
  private GridLayout grid1;
  private int nameContent[];
  private boolean solveable;
  private int complexity =0;
  Solvability buttonNames[];
  private int name[]; 
   
 //function to randomize the array  
  public static String[] RandomizeArray(String[] array) {
    Random rgen = new Random();  // Random number generator
    
    for (int i = 0; i < array.length - 1; i++) {
      int randomPosition = rgen.nextInt(array.length - 1);
      String temp = array[i];
      array[i] = array[randomPosition];
      array[randomPosition] = temp;
    }   
    return array;
  }
  
  //turn the string of array into ints so that the array can perform the following function
  public int[] turnIntoInts(String[] array){
	    name = new int[array.length - 1];
	    for (int index = 0; index < array.length - 1; ++index) {
	      name[index] = Integer.parseInt(array[index]);
	    }
	    return name;
	  }
  
  //check for the complexity 
  public int HasSolution(int[] array) {
	    for (int indexCurrent = 0; indexCurrent < array.length; ++indexCurrent) {
	      for (int indexRest = indexCurrent + 1; indexRest < array.length; ++indexRest) {
	        if (array[indexCurrent] > array[indexRest])
	          complexity = complexity + 1;
	      }
	      
	    }
	    System.out.println("This puzzle has a complexity of: " + complexity);
	    return complexity;
	  }
  // set up GUI
  
  public NpuzzleGrid() {
    super("GridLayout Demo");
    Menu menu1  = new Menu(this); 
    //menu1.add();
    // set up layouts
    grid1 = new GridLayout(4, 4);
    
    // get content pane and set its layout
    container = getContentPane();
    container.setLayout(grid1);
    
    // create and add buttons
    solveable = false;      //array not randomize so do not know if solvable
    RandomizeArray(names);	//randomize array
    turnIntoInts(names);   //turn into ints
    HasSolution(name);		//check for complexity

    //repeat the randomization function until a solvable puzzle is found
    while(solveable == false)
    if(complexity % 2 == 0) //complexity is even
    {
    	System.out.println("The 15 puzzle is solvable.");
    	solveable = true; //since complexity is even, the puzzle is solvable
    }
    else if(complexity % 2 == 1) //complexity is odd
    {
    	System.out.println("The 15 puzzle is not solvable.");
    	RandomizeArray(names);
        turnIntoInts(names);
        HasSolution(name);
    	solveable = false; //since complexity is odd, the puzzle is not solvable so reloops
    }
    buttons = new MyJButton[names.length];
       
    for (int count = 0; count < names.length; count++) {
      buttons[count] = new MyJButton(names[count]);
      
      buttons[count].addActionListener(this);
      
      container.add(buttons[count]);
    }
    
    //setJMemu(menu1.);
    setSize(400, 400);
    setVisible(true);
    
  } // end constructor GridLayoutDemo
  
  //
  public void actionPerformed(ActionEvent event) {
    MyJButton temp = (MyJButton)event.getSource();	
    JOptionPane.showMessageDialog(this,
                                  "You pressed: " + temp.getText());
    container.validate();
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NpuzzleGrid application = new NpuzzleGrid();
	    application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

}
