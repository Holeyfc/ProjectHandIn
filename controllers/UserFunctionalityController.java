/**
 * 
 */
package controllers;

/**
 * @author nhoberg001
 *
 */
public class UserFunctionalityController {

	/**
	 * 
	 */
	
	public DatabaseController database;
	
	public UserFunctionalityController() {
		this.database = new DatabaseController();
	}

	/**
	 * 
	 */
	public void saveSchool()
	{}
	
	/**
	 * 
	 * @param username
	 */
	public void editProfile(String username)
	{}
	
	/**
	 * 
	 */
	public void getUniversity(String schoolName, String state, String location, String control, int numStudents,
			float percentFemale, int SATverbal, int SATmath, int expenses, float percentFinAid, int numApplicants
			, float percentAdmitted, float percentEnrolled, int academScr, int socScr, int qualLifeScr, String emphases)
	{
		this.database.getUniversity();
	}
	
	/**
	 * 
	 * @param username
	 */
	public void searchUsersSavedSchools(String username)
	{}
	
	/**
	 * 
	 */
	public void getSavedSchools()
	{}
	
	/**
	 * 
	 */
	public void saveToProfile(University university)
	{}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
