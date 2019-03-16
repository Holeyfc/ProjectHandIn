/**
 * 
 */
package controllers;
import controllers.*;

/**
 * @author nhoberg001
 *
 */
public class LogonController {
  
  UserFunctinoalityController UFC;
  AdminFunctionalityController AFC;
 
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
 
}
