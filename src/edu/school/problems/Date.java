package edu.school.problems;

public class Date {
	private int sec;
	private int min;
	private int hour;
	private int day;
	private int month;
	private int year;

	public Date() {
		sec=0;
		min=0;
		hour=0;
		day=1;
		month=1;
		year=1;

	}
	public Date(int s, int m, int h, int d, int mon, int y) {
		if (s < 60 && s >= 0)
			sec = s;
		if (m < 60 && m >= 0)
			min = m;
		if (h < 24 && h>= 0)
			hour = h;
		if (mon <= 12 && mon >= 1)
			month = mon;
		if (mon == 2) {
			if (IsLeap()) {
				if (d >= 1 && d <= 29) {
					day = d;
				}
			} else if (d >= 1 && d <= 28) {
				day = d;
			}

		} else if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon== 8 || mon== 10 || mon == 12) {
			if (d >= 1 && d <= 31) {
				day = d;
			}
		} else if (d >= 1 && d <= 30) {
				day = d;
			}
		
		
		year = y;

		// for standard use
	}
	public int getSec() {
		return (sec);
	}

	public int getMin() {
		return (min);
	}

	public int getHour() {
		return (hour);
	}

	public int getDay() {
		return (day);
	}

	public int getMonth() {
		return (month);
	}

	public int getYear() {
		return (year);
	}

	public void setSec(int s) {
		sec = s;
	}

	public void setMin(int m) {
		min = m;
	}

	public void setDay(int d) {
		day = d;
	}

	public void setHour(int h) {
		hour= h;
	}

	public void setMonth(int m) {
		month = m;
	}

	public void setYear(int y) {
		year = y;
	}
	public int compareTo(Date d1) {
		if (year > d1.getYear()) {
			return (-1);
		} else if (year < d1.getYear()) {
			return (1);
		} else {
			if (month > d1.getMonth()) {
				return (-1);
			} else if (month < d1.getMonth()) {
				return (1);
			} else {
				if (day > d1.getDay()) {
					return (-1);
				} else if (day  < d1.getDay()) {
					return (1);
				} else {
					if (hour> d1.getHour()) {
						return (-1);
					} else if (hour < d1.getHour()) {
						return (1);
					} else {
						if (min > d1.getMin()) {
							return (-1);
						} else if (min > d1.getMin()) {
							return (1);
						} else {
							if (sec > d1.getSec()) {
								return (-1);
							} else if (sec < d1.getSec()) {
								return (1);
							} else {
								return (0);
							}
						}
					}
				}
			}
		}
	}
	public String toString() {
		String result="";
		result+=sec+":"+min+":"+hour+":"+day+":"+month+":"+year;
		return result;
	}
	public boolean IsLeap()
	{
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0) return true;
				else return false;
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	public int checkDate(Date d1) {
		int sum= 0;
		int i = 0;
		while (d1.getMonth()-1 > i) {
			if (i == 0 || i == 2 || i == 4 || i == 6 || i == 7 || i == 9 || i == 11) {
				sum += 31;
			}
			else if (i == 1) {
				if (d1.IsLeap() == false) {
					sum += 29;
				} else
					sum += 28;

			} else
				sum += 30;
			i++;
		}
		sum+=d1.getDay();
		
		return (sum);
	}
	public int checkWeek(Date d1) {
		int week = 0;
		week=checkDate(d1)/7+1;
		return (week);
	}
	public void addSec(Date d1) {
		d1.setSec(d1.getSec()+1);
		if(d1.getSec()>=60) {
			d1.setSec(d1.getSec()-60);
			d1.setMin(d1.getMin()+1);
			if(d1.getMin()>=60) {
				d1.setMin(d1.getMin()-60);
				d1.setHour(d1.getHour()+1);
				if(d1.getHour()>=24) {
					d1.setHour(d1.getHour()-24);
					d1.setDay(d1.getDay()+1);
					if(d1.getDay()>28&&d1.getMonth()==2&& d1.IsLeap()==true) {
						d1.setDay(d1.getDay()-28);
						d1.setMonth(d1.getMonth()+1);
						if(d1.getMonth()>=12) {
							d1.setMonth(d1.getMonth()-12);
							d1.setYear(d1.getYear()+1);
						}
					}
					else if(d1.getDay()>29&&d1.getMonth()==2&&  d1.IsLeap()==false) {
						d1.setDay(d1.getDay()-29);
						d1.setMonth(d1.getMonth()+1);
						if(d1.getMonth()>=12) {
							d1.setMonth(d1.getMonth()-12);
							d1.setYear(d1.getYear()+1);
						}
					}
					else if(d1.getDay()>30&&(d1.getMonth()==4||d1.getMonth()==6||d1.getMonth()==9||d1.getMonth()==11)) {
						d1.setDay(d1.getDay()-30);
						d1.setMonth(d1.getMonth()+1);
						if(d1.getMonth()>=12) {
							d1.setMonth(d1.getMonth()-12);
							d1.setYear(d1.getYear()+1);
						}
					}
					else if(d1.getMonth()>31) {
						d1.setDay(d1.getDay()-31);
						d1.setMonth(d1.getMonth()+1);
						if(d1.getMonth()>=12) {
							d1.setMonth(d1.getMonth()-12);
							d1.setYear(d1.getYear()+1);
						}
					}
				}
			}
		}
		System.out.println(d1.toString());
	}
	public double getDayOfTheWeek() {
		int mon;
		if(month>2) {
			mon=month;
		}else {
			mon=month+12;
		}
		int y=year%100;
		int c=year/100;
		double w=(day+Math.floor((13*(mon+1))/5)+y+Math.floor(y/4)+Math.floor(c/4)+(5*c));
		w=w%7;
		return w;
	}
	public boolean IsSameDate(Date d) {
		boolean IsSameDate=false;
		if(year==d.getYear() &&  month==d.getMonth() && day==d.getDay()) {
			IsSameDate=true;
		}
		return IsSameDate;
	}
}
