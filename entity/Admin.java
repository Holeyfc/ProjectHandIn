/**
 * 
 */
package entity;

/**
 * @author HoleyFanClub
 * @version 2.0
 *
 */
public class Admin {

	/**
	 * 
	 */
	private String password;
	public String username;
	private char type;
	private char status;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public void viewListOfUniversities()
	{}
	
	/**
	 * 
	 */
	public void viewProfile()
	{
		System.out.println("username: " + username + " password: " + password + " type: " + type + " status: " + status);	
	}
	
	/**
	 * 
	 * @param firstname
	 * @param lastname
	 * @param username
	 * @param password
	 * @param type
	 */
	public void userInfo(String firstname, String lastname, String username, String password, Character type)
	{}
	

}
