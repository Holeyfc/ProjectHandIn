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

 public void saveSchool()
 {}
 
 public void editProfile(String username)
 {}
 
 public void getUniversity()
 {}
 
 public void searchUsersSavedSchools(String username)
 {}
 

 /**
  * 
  */
 public void saveToProfile(University university)
 {
 
 }
 

}
