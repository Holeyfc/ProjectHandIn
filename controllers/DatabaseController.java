package controllers;
import dblibrary.project.csci230.*;
import entity.*;
import UI.*;

/**
 * @author nhoberg001
 *
 */

public class DatabaseController {
  
  /**
   * 
   */
  private UniversityDBLibrary dbLibrary;
  
  public DatabaseController() {
    this.dbLibrary = new UniversityDBLibrary("Holeyfc", "holeyfan230");
  }
  
  /**
   * 
   */
  
  public int addUser(User user) 
  {
    return this.dbLibrary.user_addUser(user);
  }
  /**
   * 
   */
  
  public int addUniversity(University uni)
  {
    return dbLibrary.university_addUniversity(uni);
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
    return this.dbLibrary.user_getUsers();
  }
  
  /**
   * 
   */
  public void getUniversity(String uniName)
  {
    String[][] unis = this.dbLibrary.university_getUniversities();
    //for loop for finding the uni by the search criteria given i.e. params
  }
  
  /**
   * 
   */
  public java.lang.String[][] getListOfUniversities()
  {
    return this.dbLibrary.university_getUniversities();
  }
  
  /**
   * 
   * @param uni
   */
  
  public int editUniversity(University uni) 
  {
    return this.dbLibrary.univeristy_editUniversity(uni);
  }
  
  /**
   * 
   * @param username
   * @param password
   */
  public int editUser(String username, String password)
  {
    String[][] users = this.dbLibrary.user_getUsers();
    for (int i = 0; i < users.length; i ++)
    {
      if (users[i][2] == username)
      {
      users[i][3] = password;
      }
    }
  }
  
  /**
   * 
   */
  public int deleteUniversity(String uniName)
  {
    return this.dbLibrary.university_deleteUniversity(uniName);
  }
  
  
  
}
