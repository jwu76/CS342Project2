
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
  
  public int[] turnIntoInts(String[] array){
	    name = new int[array.length - 1];
	    for (int index = 0; index < array.length - 1; ++index) {
	      name[index] = Integer.parseInt(array[index]);
	    }
	    return name;
	  }
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
    
    // set up layouts
    grid1 = new GridLayout(4, 4);
    
    // get content pane and set its layout
    container = getContentPane();
    container.setLayout(grid1);
    
    // create and add buttons
    solveable = false;
    RandomizeArray(names);
    turnIntoInts(names);
    HasSolution(name);

    while(solveable == false)
    if(complexity % 2 == 0)
    {
    	System.out.println("The 15 puzzle is solvable.");
    	solveable = true;
    }
    else if(complexity % 2 == 1)
    {
    	System.out.println("The 15 puzzle is not solvable.");
    	RandomizeArray(names);
        turnIntoInts(names);
        HasSolution(name);
    	solveable = false;
    }
    buttons = new MyJButton[names.length];
       
    for (int count = 0; count < names.length; count++) {
      buttons[count] = new MyJButton(names[count]);
      
      buttons[count].addActionListener(this);
      
      container.add(buttons[count]);
    }
    
    setSize(400, 400);
    setVisible(true);
    
  } // end constructor GridLayoutDemo
  
  //
  public void actionPerformed(ActionEvent event) {
    container.validate();
    MyJButton temp = (MyJButton)event.getSource();	
    JOptionPane.showMessageDialog(this,
                                  "You pressed: " + temp.getActionCommand() + temp.getText());
    for(int i = 0; i < names.length; ++i)
    {
    	
    }
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NpuzzleGrid application = new NpuzzleGrid();
	    application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}

}
