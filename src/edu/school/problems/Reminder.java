package edu.school.problems;

public class Reminder {
	private Event events[];
	private int eventIndex;
	
	public Reminder(){
		eventIndex=0;
		events=new Event[30];
	}
	
	public  void addEvent(Event newEvent) {
		if(eventIndex==30) {
			System.out.println("Your reminder is full");
		}else {
			events[eventIndex]=newEvent;
			eventIndex++;
		}
	}

}
