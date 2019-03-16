/**
 * Admin confirms that the account exist
 */
package UI;
import entity.*;

/**
 * @author HoleyFanClub
 * @version 2.0
 *
 */
public class AdminUI extends Admin {

 
 public AdminUI() {
  // TODO Auto-generated constructor stub
 }

 /**
  * Confirms that the user is correct and the password is correct, the account exist
  */
 public void confirmMessage()
 {
   
 System.out.println("Successful Login!");
 }
 
 
 /**
  * Confirms that there is no account or the user or password is incorrect
  */
 public void failMessage()
 {
   
  System.out.println("Try again"); 
  
 }

 public void viewListOfUser()
 {
   // TODO Auto-generated constructor stub
 }
}