/**
 * 
 */
package controllers;
import entity.*;

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
  public void getUniversity(String uniName)
  {
    this.database.getUniversity(uniName);
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
  
  
  public void getUniversity()
  {}
  
  
  /**
   * 
   */
  public void saveToProfile(University university)
  {
    
  }
  
  public void searchForUser(String username)
  {
    
  }
  
  public void logout()
  {}
}
