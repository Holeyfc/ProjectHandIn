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
 
 public AdminFunctionalityController() 
 {
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
  * java.lang.String school, java.lang.String state, java.lang.String location,
   java.lang.String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath,
   double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, 
   double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale
  */

 public void addNewUniversity(University university)
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
 public int addNewUser(User user) //necessimos paramatinos
 {
 return this.database.addUser(user);
 }
 
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
 public void resetUsersPassword(String username, String newPassword)
 {
   this.database.editUser(username, newPassword);  
 }
 
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

 public java.lang.String[][] getListOfUsers()
 {
   return this.database.getUsers();
 }

}
