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
	menu.add(about);
	menu.add(exit);
	menu.add(help);
	menu.add(mix);
	menu.add(solve);
	menu.add(undo);
	menu.add(undoall);
	menubar.add(menu);
	about.addActionListener(this);
	//add functionality to the menu items
//	about.addActionListener(new ActionListener(){
//		@Override
//		public void actionPerformed(ActionEvent event) {
//			action(event);
//		}
//	});
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

	public void action(ActionEvent ae) {
	    String comStr = (String) ae.getSource();
	    JMenuItem item= (JMenuItem)ae.getSource();
	    //System.out.println(item);
	    JOptionPane.showMessageDialog(this, "This is the 2nd project for cs342");
	  }

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
