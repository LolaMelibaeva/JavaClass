package com.class10;
import javax.swing.JOptionPane;    // Needed for Dialog Box
public class Task2 {

	
		

		
		   public static void main(String[] args)
		   {
			   String name;

			      // Get the user's name.
			      name = JOptionPane.showInputDialog("What is your name? ");

			      // Display message
			      JOptionPane.showMessageDialog(null, "Hello sweetie " + name);
			   }
			}