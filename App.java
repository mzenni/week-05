package week05;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello and welcome to the Week 5 Assignment!");
		Logger logger = new AsteriskLogger(); 
		System.out.println("Asterisk Logger (log):");
		logger.log("Hello"); 
		System.out.println("Asterisk Logger (error): ");
		logger.error("Hello");

		Logger logger2 = new SpacedLogger();
		System.out.println("Spaced Logger (log):");
		logger2.log("Hello");
		System.out.println("Spaced Logger (error):");
		logger2.error("Hello");
	}

}
