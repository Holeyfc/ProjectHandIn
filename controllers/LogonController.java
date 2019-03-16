/**
 * 
 */
package controllers;

/**
 * @author nhoberg001
 *
 */
public class LogonController {

	/**
	 * 
	 */
	
	public DatabaseController database;
	
	public LogonController() {
		this.database = new DatabaseController();
	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void login(String username, String password)
	{

	}
	
	//from communication
	//public User findByMemberName()
	/**
	 * 
	 */
	public void logout()
	{}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
