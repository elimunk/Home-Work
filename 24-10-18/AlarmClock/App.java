package alarmClock;

public class App {

	public static void main(String[] args) {

		System.out.println("------------------------TESTS-------------------");
		SimpleTime time1 = new SimpleTime();
		time1.setTime(5, 9, 23);
		
		SimpleTime time2 = new SimpleTime(10, 10, 35);
		
		System.out.println("time1: "+ time1.toSrting()+"\ntime2: "+time2.toSrting());
		
		time1.add(time2);		
		System.out.println("\nNow time1: "+ time1.toSrting());
		
		time1.tick();
		System.out.println("\ntick: "+time1.toSrting());
		
//		------------------------------------------ equals and printing ----------------------------
		System.out.println("\nis time1 equals time2: "+time1.equals(time2));
		
		time2.setTime(15, 19, 59);
		System.out.println("set time2: "+time2.toSrting());

		System.out.println("is time1 equals time2: "+time1.equals(time2));
		
//      --------------------------------------12/24 hours format & printing------------------------
		ExtentedTime time3 = new ExtentedTime();
		System.out.println("\n"+time3.toSrting()+" is24Hours: "+time3.is24Hours );
		
		ExtentedTime time5 = new ExtentedTime(2, 3, 35, false);
		System.out.println(time5.toSrting()+" is24Hours: "+time5.is24Hours );
		
		ExtentedTime time4 = new ExtentedTime(2, 3, 35, true);
		System.out.println(time4.toSrting()+" is24Hours: "+time4.is24Hours );
	
//		----------------------------------  Alarm Clock -------------------------------------------
		System.out.println("\n--------------------create Alarm Clock-----------------");
		
		ExtentedTime extentedTime= new ExtentedTime(2, 3, 25, true);
		Alarm alarm = new Alarm(time4, true, 5, true);	
		
		System.out.println("ExtentedTime: "+ extentedTime.toSrting()+ "\nAlarm time: "+alarm.getTime().toSrting() );
    	 
    	
    	
    	for (int i = 2; i >0; ) {
    	if (!alarm.isSet) {
        	System.out.println(extentedTime.toSrting());
        	extentedTime.tick();
    	}
        	else	if (extentedTime.equals(alarm.getTime())) {
    		System.out.println(extentedTime.toSrting()+" GLING !!!!!!!!! WAKE UP!!!!!!!!!!!!!!!");
    		alarm.time.setSecond(alarm.time.getSecond()+alarm.snoozTime);
    		i--;
    	}
        	else 
        		System.out.println(extentedTime.toSrting());
    	        extentedTime.tick();
    	}
	}
	
}
