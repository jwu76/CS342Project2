/*
 *  this class attempts to create the menu
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menu extends JFrame implements ActionListener{

	public Menu(){
		
	JFrame f = new JFrame("Menu Demo");
	f.setSize(500, 500);

	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	

	JMenuBar menubar = new JMenuBar();
	JMenu menu = new JMenu("MENU");
	JMenuItem about = new JMenuItem("ABOUT");
	JMenuItem exit = new JMenuItem("EXIT");
	JMenuItem help = new JMenuItem("HELP");
	JMenuItem mix = new JMenuItem("MIX PUZZLE");
	JMenuItem solve = new JMenuItem("AUTO SOLVE");
	JMenuItem undo = new JMenuItem("UNDO");
	JMenuItem undoall = new JMenuItem("UNDO ALL");
	
	menubar.add(about);
	menubar.add(exit);
	menubar.add(help);
	menubar.add(mix);
	menubar.add(solve);
	menubar.add(undo);
	menubar.add(undoall);
	
	about.addActionListener(this);
	exit.addActionListener(this);
	help.addActionListener(this);
	mix.addActionListener(this);
	solve.addActionListener(this);
	undo.addActionListener(this);
	undoall.addActionListener(this);
	
	f.setJMenuBar(menubar);
	f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
	    String comStr = ae.getActionCommand();
	    System.out.println(comStr + " Selected");
	  }
}
