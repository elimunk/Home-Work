import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class Program {

  public static int totalDuration(Queue<Task> queue) {
		int totalDuration = 0;
		for (Task task : queue) {
			totalDuration += task.taskDuration;
		}
		return totalDuration;
	}
	
  public static String getTasks(Hashtable<String, Queue<Task>> tasksList, String key) {
		String tasks = "";
		for (Task values : tasksList.get(key)) {
			if (values.taskContent instanceof String) {
				tasks += values.taskContent + ", ";
			} if (values.taskContent instanceof String[]) {
				String[] str = (String[]) values.taskContent;
				for (int i = 0; i < str.length; i++) {
					tasks += str[i] + ", ";
				}
			} if (values.taskContent instanceof String[][]) {
				String[][] str2 = (String[][]) values.taskContent;
				for (int row = 0; row < str2.length; row++) {
					for (int col = 0; col < str2[row].length; col++) {
						tasks += str2[row][col] + ", ";
					}
				}
			}
		} return tasks;
	}
	
  public static String getKeys(Hashtable<String, Queue<Task>> tasksList, String key){
		String keys="";
	for (String key1 : tasksList.keySet()) {
		if (key1.equals(key)) {
			keys=key1;
		return keys;
		}
		}
	return keys;
	}
	
  public static String printHashtable(Hashtable<String, Queue<Task>> tasksList, String key) {
		
		return"Name: " +getKeys(tasksList, key)+
		"\nYour tasks are: "+getTasks(tasksList, key)+
		"\nTotal duration: "+totalDuration(tasksList.get(key))+ " Minutes";
	}
	
    public static void main(String[] args) {
    	

		Queue<Task> bobQueue = new LinkedList<>();
		bobQueue.add(new Task<>("Buy food", 20));
		String[] tasksBob = new String[] { "Clean room", "Clean garden" };
		bobQueue.add(new Task<>(tasksBob, 50));

		Queue<Task> aliceQueue = new LinkedList<>();
		aliceQueue.add(new Task<>("Cook food", 20));
		String[][] tasksAlice = new String[][] { { "Buy drink", "Buy food" }, { "Pay to post", "Pay to bank" } };
		aliceQueue.add(new Task<>(tasksAlice, 120));

		Hashtable<String, Queue<Task>> tasksList = new Hashtable<>();

		tasksList.put("Bob", bobQueue);
		tasksList.put("Alice", aliceQueue);
		
		System.out.println(printHashtable(tasksList, "Bob")+"\n"+printHashtable(tasksList, "Alice"));
	
		
	}
}
