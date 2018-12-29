package alarmClock;

public class ExtentedTime extends SimpleTime {

	boolean is24Hours  ;

	public ExtentedTime() {
		super();
	}

	public ExtentedTime(int hour, int minute, int second, boolean is24Hours) {
		super(hour, minute, second);
		this.is24Hours = is24Hours;
	}

	public boolean isIs24Hours() {
		return is24Hours;
	}

	public void setIs24Hours(boolean is24Hours) {
		this.is24Hours = is24Hours;
	}


	@Override
	public String toSrting() {
		String hh = Integer.toString(getHour());
		String mm = Integer.toString(getMinute());
		String ss = Integer.toString(getSecond());
		if (is24Hours) {
			return super.toSrting();
		}
		else return hh+":"+mm+":"+ss;
			
	}


	
	
}
