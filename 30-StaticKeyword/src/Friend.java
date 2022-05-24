public class Friend {

	String name;

	//Static variable 
	static int numberOfFriends;

	Friend(String name) {
		this.name = name;
		numberOfFriends++;
	}
	
	//Static Method
	static void dispalyFriends() {
		System.out.println("You have " +numberOfFriends+ " friends" );
	}
}