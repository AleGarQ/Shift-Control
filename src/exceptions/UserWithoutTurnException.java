package exceptions;

public class UserWithoutTurnException extends Exception {
	private String id;
	
	public UserWithoutTurnException(String id) {
		super("The user with id: "+id+" does not have a turn\n");
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
}