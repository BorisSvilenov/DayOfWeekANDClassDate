package edu.school.problems;

import java.time.LocalDate;

public class ReminderClass {
	private Event events[];
	private int eventIndex;
	
	public ReminderClass(){
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
	public Event[] getAllEventsAt(Date date) {
		Event[] eventsOfCurrentDate=new Event[30];
		Date currentDate;
		for(int i=0;i<eventsOfCurrentDate.length;i++) {
			eventsOfCurrentDate[i]=new Event();
			currentDate=events[i].getDate();
			
			if(date.IsSameDate(currentDate)==true) {
				eventsOfCurrentDate[i]=events[i];
				
			}
		}
		return eventsOfCurrentDate;
	}
	public void remind() {
		LocalDate currentLocalDate=LocalDate.now();
		  
		Date currentDate=new Date();
		
		int currentDay= currentLocalDate.getDayOfMonth();
		int currentMonth= currentLocalDate.getMonthValue();
		int currentYear= currentLocalDate.getYear();
		
		currentDate.setDay(currentDay);
		currentDate.setMonth(currentMonth);
		currentDate.setYear(currentYear);
		
		Event[] eventsOfCurrentDate=new Event[30];
		eventsOfCurrentDate=getAllEventsAt(currentDate);
		
		for(int i=0;i<eventsOfCurrentDate.length;i++) {
			if(eventsOfCurrentDate[i]!=null) {
				System.out.println(eventsOfCurrentDate[i].toString());
			}
		}
		
	
		
	}

}
