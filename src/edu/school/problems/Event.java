package edu.school.problems;

public class Event {
	private Date date;
	private String name;
	
	public Event() {
		name="";
		date=new Date();
	}
	public Event(String nameValue, Date dateValue) {
		
		if(nameValue!=null && !nameValue.isEmpty()) {
			this.name=nameValue;
		}
		if(dateValue!=null) {
			date=dateValue;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String nameValue) {
		if(nameValue!=null && !nameValue.isEmpty()) {
			this.name=nameValue;
		}
	}
	public void setDate(Date dateValue) {
		if(dateValue!=null) {
		this.date=dateValue;
		}
	}
	public Date getDate() {
		return date;
	}
	public String toString() {
		return date.getDay()+"."+date.getMonth()+"."+date.getYear()+"., "+date.getHour()+":"+date.getMin()+"-"+name;
	}
}
