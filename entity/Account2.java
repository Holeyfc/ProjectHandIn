//@author HoleyFanClub
//@version 2.0
package entity;
import dblibrary.project.csci230.*;
public class Account2 {
 
 String password;
 String username;
 char status;
 char type;
 
 public Account2(String usr, String pass)
 {
  this.username = usr;
  this.password = pass;
  System.out.println("acc");
 }
 public void logout()
 {
  
 }
 
 public void login()
 {
  UniversityDBLibrary lib = new UniversityDBLibrary("localhost", username, password);

 }
  
}
