package alarmClock;

public class SimpleTime {
  private int hour;
  private int minute;
  private int second;
  
//  --------------------------------------constructors--------------------------
  
public SimpleTime() {
	this.hour = 0;
	this.minute = 0;
	this.second = 0;
}

public SimpleTime(int hour, int minute, int second) {
	if (hour>=0 && hour <24)
	this.hour = hour;
	if (minute>=0 && minute <60)
	this.minute = minute;
	if (second>=0 && second <60)
	this.second = second;

}

//---------------------------------Getters & Setters------------------------------------

public int getHour() {
	return hour;
}

public void setHour(int hour) {
	if (hour>=0 && hour <24)
	this.hour = hour;
}

public int getMinute() {
	return minute;
}

public void setMinute(int minute) {
	if (minute>=0 && minute <60)
		this.minute = minute;
}

public int getSecond() {
	return second;
}

public void setSecond(int second) {
	if (second>=0 && second <60)
	this.second = second;
}

//---------------------------------------------Functions-----------------------------------
   
public void setTime (int hour, int minute, int second){
	    if (hour>=0 && hour <24)
		this.hour = hour;
		if (minute>=0 && minute <60)
		this.minute = minute;
		if (second>=0 && second <60)
		this.second = second;
	}

public void add (SimpleTime param ) {
	addSecond(param.getSecond());
	addMinute(param.getMinute());
	addHour(param.getHour());
}
 
public void addHour (int Hour) {
	if (Hour>=0) {
	 if (Hour+ hour <24) {
	 this.hour += Hour;
	 }
	 else {
		 this.hour=hour+Hour-24;
		 }
	}
}
public void addMinute(int Minute) {
	if (Minute>=0) {
		if (this.minute+ Minute <60) {
	    this.minute += Minute;
	    }
	    else {
	    	this.addHour(1);
	    this.minute=this.minute+Minute-60;
	    }
	}
}
public void addSecond (int Second) {
	if (Second>=0) {
		if (this.second+ Second <60) {
	this.second += Second;
	}
	else {
		this.addMinute(1);
    this.second= this.second+Second-60;
    }
	}
}
public void tick () {
addSecond(1);	
}

public boolean equals(SimpleTime object) {
	return (this.getSecond()==object.getSecond()
			&& this.getMinute()==object.getMinute()
			&& this.getHour()==object.getHour())?true :false ;
}

public String toSrting() {
	String hh = Integer.toString(getHour());
	String mm = Integer.toString(getMinute());
	String ss = Integer.toString(getSecond());
	if(getHour()<10) {
		hh="0"+Integer.toString(getHour());
	}
	if(getMinute()<10) {
		mm="0"+Integer.toString(getMinute());
	}
	if(getSecond()<10) {
		ss="0"+Integer.toString(getSecond());
	}
	return hh+":"+mm+":"+ss;
}



}

  
	
	

