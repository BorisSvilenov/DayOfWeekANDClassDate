package edu.school.problems;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calendar {

	public static void main(String[] args) {
		JFrame window=new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(100, 200, 800, 950);
		window.setLayout(null);
		window.setVisible(true);
		
		JLabel monday=new JLabel("Monday");
		monday.setBounds(0, 0, 100, 100);
		window.add(monday);
		
		JLabel tuesday=new JLabel("Tuesday");
		tuesday.setBounds(100,0,100,100);
		window.add(tuesday);
		
		JLabel wednesday=new JLabel("Wednesday");
		wednesday.setBounds(200, 0, 100, 100);
		window.add(wednesday);
		
	    JLabel thursday=new JLabel("Thursday");
	    thursday.setBounds(300,0,100,100);
	    window.add(thursday);
	    JLabel friday=new JLabel("Friday");
	    friday.setBounds(400, 0, 100, 100);
	    window.add(friday);
	    
	    JLabel saturday=new JLabel("Saturday");
	    saturday.setBounds(500, 0, 100, 100);
	    window.add(saturday);
	    
	    JLabel sunday=new JLabel("Sunday");
	    sunday.setBounds(600, 0, 100, 100);
	    window.add(sunday);
	    
	    JPanel[] DaysArray=new JPanel[42];
	    int i=0;
	    int x=0;
	    int y=100;
	    int count=0;
	    while(i!=6) {
	    	DaysArray[i]=new JPanel();
	    	DaysArray[i].setBounds(x, y, 75, 75);
	    	DaysArray[i].setBackground(Color.blue);
	    	DaysArray[count+i].setVisible(true);
	    	window.add(DaysArray[i]);
	    	y+=100;
	    	i++;
	    	if(i==6) {
	    		count+=i;
	    	}
	    }
	    i=0;
	    x+=100;
	    y=100;
	    while(i!=6) {
	    	DaysArray[count+i]=new JPanel();
	    	DaysArray[count+i].setBounds(x, y, 75, 75);
	    	DaysArray[count+i].setBackground(Color.blue);
	    	DaysArray[count+i].setVisible(true);
	    	window.add(DaysArray[count+i]);
	    	y+=100;
	    	i++;
	    	if(i==6) {
	    		count+=i;
	    	}
	    }
	    i=0;
	    x+=100;
	    y=100;
	    while(i!=6) {
	    	DaysArray[count+i]=new JPanel();
	    	DaysArray[count+i].setBounds(x, y, 75, 75);
	    	DaysArray[count+i].setBackground(Color.blue);
	    	DaysArray[count+i].setVisible(true);
	    	window.add(DaysArray[count+i]);
	    	y+=100;
	    	i++;
	    	if(i==6) {
	    		count+=i;
	    	}
	    }
	    i=0;
	    x+=100;
	    y=100;
	    while(i!=6) {
	    	DaysArray[count+i]=new JPanel();
	    	DaysArray[count+i].setBounds(x, y, 75, 75);
	    	DaysArray[count+i].setBackground(Color.blue);
	    	DaysArray[count+i].setVisible(true);
	    	window.add(DaysArray[count+i]);
	    	y+=100;
	    	i++;
	    	if(i==6) {
	    		count+=i;
	    	}
	    }
	    i=0;
	    x+=100;
	    y=100;
	    while(i!=6) {
	    	DaysArray[count+i]=new JPanel();
	    	DaysArray[count+i].setBounds(x, y, 75, 75);
	    	DaysArray[count+i].setBackground(Color.blue);
	    	DaysArray[count+i].setVisible(true);
	    	window.add(DaysArray[count+i]);
	    	y+=100;
	    	i++;
	    	if(i==6) {
	    		count+=i;
	    	}
	    }
	    i=0;
	    x+=100;
	    y=100;
	    while(i!=6) {
	    	DaysArray[count+i]=new JPanel();
	    	DaysArray[count+i].setBounds(x, y, 75, 75);
	    	DaysArray[count+i].setBackground(Color.red);
	    	DaysArray[count+i].setVisible(true);
	    	window.add(DaysArray[count+i]);
	    	y+=100;
	    	i++;
	    	if(i==6) {
	    		count+=i;
	    	}
	    }
	    i=0;
	    x+=100;
	    y=100;
	    while(i!=6) {
	    	DaysArray[count+i]=new JPanel();
	    	DaysArray[count+i].setBounds(x, y, 75, 75);
	    	DaysArray[count+i].setBackground(Color.red);
	    	DaysArray[count+i].setVisible(true);
	    	window.add(DaysArray[count+i]);
	    	y+=100;
	    	i++;
	    	if(i==6) {
	    		count+=i;
	    	}
	    }
	   
	   
	  
	}

}
