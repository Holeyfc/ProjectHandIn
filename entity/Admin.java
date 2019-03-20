package entity;
import UI.*;
import controllers.*;

/**
 * @author HoleyFanClub
 * @version 2.0
 *
 */
public class Admin extends Account2
{
  
  
  private String password;
  public String userName;
  private char type;
  private char status;
  AdminFunctionalityController afc;
  UniversityController uc;
  AdminUI adUI;
  
  /**
   * creating an admin account
   * @param userName the user name
   * @param password the password of the account
   * param type the account type, admin or student
   */
  public Admin() 
  {
    Account2 admin = Account2();
  }
  
  /**
   * logout of the account
   * @param admin the account to be log out
   */
  public void logout(Admin admin)
  {
    //log out of the account
    this.afc.logout(admin);
  }
  
  /**
   * login to the account
   * @param userName the userName
   * @param password the password
   * @param type the accoun't type, admin or student
   */
  public void login(String userName, String password, char type)
  {
    this.afc.login(userName, password, type);
  }
  
  /**
   * view the list of universities
   * @param university the universities to view
   */
  public void viewUniversities(University university)
  {
    //view the university
   this.uc.viewUniversity(university);
    
  }
  
  /**
   * view the list of user
   */
  public void viewUsers()
  {
    //view the list of users
   this.adUI.viewListOfUsers();
    
  }
  
  /**
   * add a new user
   * @param user the user
   */
  public void addNewUser(User user)
  {
    //add a new user
    this.afc.addNewUser(user);
  }
  
  /**
   * reset the user's password
   * @param user the account's password to be change
   */
  public void resetPassword(String userName, String newPassword)
  {
    this.afc.resetUsersPassword(userName,newPassword);
    
  }
  
  /**
   * add a new university
   */
  public void addNewUniversity(University university)
  {
    //add a new university
    this.afc.addNewUniversity(university);

  }
  
  /**
   * edit the information of the university
   */
  public void editUniversityInfo(University university)
  {
    //edit a university's information
    this.afc.editUniversity(university);
  }
  
  /**
   * delete school
   */
  public void deleteUniversity(String university)
  {
    //delete the university
    this.afc.deleteUniversity(university);
    
  }
  
  /**
   * save the statistic of school searched  
   */
  public void saveSchoolSearchStatistics()
  {
    
    
  }
  
  /**
   * delete user's account
   */
  public void deleteUser()
  {
    
  }
  
  
  /**
   * view the profile of an account
   */
  public void viewProfile()
  {
    
    System.out.println("username: " + username + " password: " + password + " type: " + type + " status: " + status);
    
  }
  
  
  
}
