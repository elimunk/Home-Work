package alarmClock;

public class Alarm {
	SimpleTime time;
	boolean isSet;
	int snoozTime;
	boolean isSnooze;
	
	
	
	public Alarm() {
		super();
		this.isSet = false;
		this.snoozTime = 0;
		this.isSnooze = false;
	}

	public Alarm(SimpleTime time, boolean isSet, int snoozTime, boolean isSnooze) {
		super();
		this.time = time;
		this.isSet = isSet;
		this.snoozTime = snoozTime;
		this.isSnooze = isSnooze;
	}

	public SimpleTime getTime() {
		return time;
	}

	public void setTime(SimpleTime time) {
		this.time = time;
	}

	public boolean isSet() {
		return isSet;
	}

	public void setSet(boolean isSet) {
		this.isSet = isSet;
	}

	public int getSnoozTime() {
		return snoozTime;
	}

	public void setSnoozTime(int snoozTime) {
		this.snoozTime = snoozTime;
	}

	public boolean isSnooze() {
		return isSnooze;
	}

	public void setSnooze(boolean isSnooze) {
		this.isSnooze = isSnooze;
	}
	
	
	
}
