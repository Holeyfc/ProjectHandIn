//@author HoleyFanClub
//@version 2.0
package entity;
import dblibrary.project.csci230.*;
import javax.swing.*;
public class Account2 {
 
 String password;
 String username;
 char status;
 char type;
 UniversityDBLibrary lib;
 
 public Account2(String usr, String pass)
 {
  this.username = usr;
  this.password = pass;
  
  login();
 }
 public void logout()
 {
  
 }
 
 public void login()
 {
   this.lib = new UniversityDBLibrary(username, password);
   System.out.println("login successful!");
   System.out.println("university_addUniversity(x,x,x,x,1,1,1,1,1,1,1,1,1,1,1,1) : " + lib.university_addUniversity("x","x","x","x",1,1,1,1,1,1,1,1,1,1,1,1));
   String input = "";
  
  while(!input.equals("q"))
  {
    input = JOptionPane.showInputDialog("what would you like to do? \n l: login to a specific user \n a: add a new user \n au: add a new university \n eu: edit a university \n s: search for a university");
    
    if(input.equals("l"))
    {
      userLogin();
    }
    else if (input.equals("a"))
    {
      userAdd();
    }
    else if (input.equals("au"))
    {
      addUniversity();
    }
    else if (input.equals("eu"))
    {
      editUniversity();
    }
    else if (input.equals("s"))
    {
      search();
    }
  }
 }
    
    public void search()
    {
      String name = JOptionPane.showInputDialog("please enter the name of the school");
      String student = JOptionPane.showInputDialog("please enter the number of students");
      int students = Integer.parseInt(student);
      String[][] universities = lib.university_getUniversities();
    }
    public void userLogin()
    {
      String username = JOptionPane.showInputDialog("please enter your username");
      String password = JOptionPane.showInputDialog("please enter your password");
      String[][] users = this.lib.user_getUsers();
    }
    public void userAdd()
    {
      String username = JOptionPane.showInputDialog("please enter the new username");
      String password = JOptionPane.showInputDialog("please enter the new password");
      String firstName = JOptionPane.showInputDialog("please enter your first name");
      String lastName = JOptionPane.showInputDialog("please enter your last name");
      String type2 = JOptionPane.showInputDialog("please enter your type");
      char type = type2.charAt(0);
      this.lib.user_addUser(firstName, lastName, username, password, type);
    }
    public void addUniversity()
    {
    }
    public void editUniversity()
    {
    }
  }
  
   
 
