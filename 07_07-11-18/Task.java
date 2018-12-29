
public class Task <T> {

	T taskContent  ;
	int taskDuration ;
	
	
	public Task(T taskContent, int taskDuration) {
		this.taskContent = taskContent;
		this.taskDuration = taskDuration;
	}
	
	public String toString() {
		return "Your task is: "+taskContent+", And task duration is: "+taskDuration+" Minuts.\n";
	}
}
