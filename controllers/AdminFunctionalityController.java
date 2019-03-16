/**
 * 
 */
package controllers;

/**
 * @author nhoberg001
 *
 */
public class AdminFunctionalityController {

	/**
	 * 
	 */
	
	public DatabaseController database;
	
	public AdminFunctionalityController() {
		this.database = new DatabaseController();
	}

	/**
	 * 
	 */
	public void getListOfUsers() 
	{
		this.database.getUsers();
	}
	
	/**
	 * 
	 */
	public void addNewUniversity(java.lang.String school, java.lang.String state, java.lang.String location,
			java.lang.String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath,
			double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
			double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale)
	{
		this.database.addUniversity(school, state, location, control, numberOfStudents, percentFemales,
				SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted,
				percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void addNewUser(String username, String password) //necessimos paramatinos
	{}
	
	/**
	 * 
	 * @param username
	 */
	public void editUniversity(String username) //necessimos paramatinos
	{}
	
	/**
	 * 
	 * @param username
	 * @param oldPassword
	 * @param newPassword
	 */
	public void resetUsersPassword(String username, String oldPassword, String newPassword)
	{}
	
	/**
	 * 
	 * @param schoolName
	 */
	public void deleteSchool(String schoolName)
	{}
	
	/**
	 * 
	 * @return
	 */
	public boolean exists() //dont remember what this is for
	{return true;}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
