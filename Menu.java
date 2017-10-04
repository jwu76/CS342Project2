/*
 *  this class attempts to create the menu
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menu extends JFrame implements ActionListener{

	public Menu(JFrame frame){
	
	//create the menubar	
	JMenuBar menubar = new JMenuBar();
	
	//create the menu
	JMenu menu = new JMenu("MENU");
	
	//create the items onto the menu
	JMenuItem about = new JMenuItem("ABOUT");
	JMenuItem exit = new JMenuItem("EXIT");
	JMenuItem help = new JMenuItem("HELP");
	JMenuItem mix = new JMenuItem("MIX PUZZLE");
	JMenuItem solve = new JMenuItem("AUTO SOLVE");
	JMenuItem undo = new JMenuItem("UNDO");
	JMenuItem undoall = new JMenuItem("UNDO ALL");
	
	//add the items onto the menubar
	menubar.add(about);
	menubar.add(exit);
	menubar.add(help);
	menubar.add(mix);
	menubar.add(solve);
	menubar.add(undo);
	menubar.add(undoall);
	
	//add functionality to the menu items
	about.addActionListener(this);
	exit.addActionListener(this);
	help.addActionListener(this);
	mix.addActionListener(this);
	solve.addActionListener(this);
	undo.addActionListener(this);
	undoall.addActionListener(this);
	
	//create the actual menu
	frame.setJMenuBar(menubar);
	frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
	    String comStr = ae.getActionCommand();
	    System.out.println(comStr + " Selected");
	  }
}
