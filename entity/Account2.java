//@author HoleyFanClub
//@version 2.0
package entity;

import dblibrary.project.csci230.*;
import javax.swing.*;
import controllers.*;
public class Account2 {
  
  String password;
  String username;
  char status;
  char type;
  DatabaseController lib;
  
  public Account2()
  {
    String username = "x";
    String password = "x";
    char status = 'a';
    char type = 'u';
    lib = new DatabaseController();
    
  }
  public void logout()
  {
    
  }
  
  public void login()
  {
    String[][] users = this.lib.getUsers();
    for(int i = 0; i < users.length; i++)
    {
      for(int j = 0; j < users[i].length; j++)
      {
        System.out.println(users[i][j]);
      }
    }
    System.out.println("log in for john smith passed, log in for smith johnson failed");
    
  }
  
  public void viewSavedUniversities()
  {
    String[][] schools = this.lib.getUsernamesWithSavedSchools();
    for(int i = 0; i < schools.length; i++)
    {
      for(int j = 0; j < schools[i].length; j++)
      {
        System.out.println(schools[i][j]);
      }
    }
  }
  
  public void viewProfile()
  {
  }
  
  public void search()
  {
  }
  
  public void viewSearchResults()
  {
  }
  
  public void viewUniversity()
  {
  }
  
  public void saveUniversity()
  {
   this.lib.saveSchool("John", "x");
   this.lib.saveSchool("Lynn", "x"); 
   this.lib.saveSchool("Noreen", "x");
   System.out.println("saved");
  }
  
  public void sortUniversityByCriteria()
  {
  }
  
  public void searchOthersSchools()
  {
  }
  
}



