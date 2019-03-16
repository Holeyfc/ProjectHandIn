package controllers;
import dblibrary.project.csci230.*;
import entity.*;

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

 public int addUser(User user) 
 {
  return dbLibary.users_addUser(user);
 }
 /**
  * 
  */

 public int addUniversity(University uni)
 {
  return dbLibary.university_addUniversity(uni);
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
 {
  this.dblibrary.universities_getUniveristies();
  //for loop for finding the uni by the search criteria given i.e. params
 }
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

 public int editUniversity(University uni) 
 {
  return dbLibary.univeristy_editUniversity(uni);
 }
 
 /**
  * 
  * @param username
  */

 public int editUser(String username, String password)
 {
  String[][] users = this.dbLibrary.getUsers();
  for (int i = 0; i < users.length; i ++)
  {
  if (users[i][2] == username)
  {}
  }
 }



}
