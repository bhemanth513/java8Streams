package Java8Assignment;

public class EventManager {

	public static void main(String[] args) {
		
		String message1 = "Hello my dear developer, I am an Immutable String";
		long previous1 = System.currentTimeMillis();
		String modifiedMessage = "";
		for(int i = 0; i < 1000; i++){
		   modifiedMessage = modifiedMessage + message1;
		}
		System.out.println("Snippet 1 = " + (System.currentTimeMillis() - previous1));

		long previous2 = System.currentTimeMillis();
		String message2 = "Hello my dear developer, I am another Immutable String";
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 1000; i++){
		   sb.append(message2);
		}
		System.out.println("Snippet 2 = " + (System.currentTimeMillis() - previous2));
	}

}
