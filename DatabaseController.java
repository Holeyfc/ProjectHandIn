/**
 * 
 */
package controllers;
import dblibrary.project.csci230.*;
/**
 * @author nhoberg001
 *
 */



public class DatabaseController {

	/**
	 * 
	 */
	
	private UniversityDBLibrary dbLibary;
	
	public DatabaseController() {
		this.dbLibary = new UniversityDBLibrary(database, username, password);
	}

	/**
	 * 
	 */
	public int addUser(java.lang.String firstName, java.lang.String lastName,
			java.lang.String username, java.lang.String password, char type) 
	{
		return dbLibary.users_addUser(firstName, lastName, username, password, type);
	}
	
	/**
	 * 
	 */
	public int addUniversity(java.lang.String school, java.lang.String state, java.lang.String location,
			java.lang.String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath,
			double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
			double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale)
	{
		return dbLibary.university_addUniversity(school, state, location, control, numberOfStudents, percentFemales,
				SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted,
				percentEnrolled, academicsScale, socialScale, qualityOfLifeScale);
	}
	
	/**
	 * 
	 * @param username
	 */
	public void getUserInfo(String username)
	{}
	
	/**
	 * 
	 */
	public java.lang.String[][] getUsers()
	{
		return dbLibary.university_getUsers();
	}
	
	/**
	 * 
	 */
	public void getUniversity()
	{}
	
	/**
	 * 
	 */
	public java.lang.String[][] getListOfUniversities()
	{
		return dbLibrary.university_getUniversities();
	}
	
	/**
	 * 
	 * @param uniName
	 */
	public int editUniversity(java.lang.String school, java.lang.String state, java.lang.String location,
			java.lang.String control, int numberOfStudents, double percentFemales, double SATVerbal,
			double SATMath, double expenses, double percentFinancialAid, int numberOfApplicants,
			double percentAdmitted,double percentEnrolled, int academicsScale, 
			int socialScale, int qualityOfLifeScale) 
	{
		return dbLibary.univeristy_editUniversity(school, state, location, control, numberOfStudents, percentFemales,
				SATVerbal, SATMath, expenses, percentFinancialAid, numberOfApplicants, percentAdmitted, percentEnrolled,
				academicsScale, socialScale, qualityOfLifeScale);
	}
	
	/**
	 * 
	 * @param username
	 */
	public int editUser(java.lang.String username, java.lang.String firstName, java.lang.String lastName,
			java.lang.String password, char type, char status)
	{
		return dbLibary.user.editUser(username, firstName, lastName, password, type, status);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
