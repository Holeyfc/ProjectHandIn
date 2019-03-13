//@author HoleyFanClub
//@version 1.0
package entity;
import javax.swing.*;
import dblibrary.project.csci230.*;
public class Account 
{
 private String password;
 public String username;
 private char type;
 private char status;
 public static void main(String[] args) 
 {
  this.username = JOptionPane.showInputDialog("please enter your username");
  this.password = JOptionPane.showInputDialog("please enter your password");
  login(username, password);
  
 }
 public void logout()
 {
 }
 
 public static void login(String username, String password)
 {
  UniversityDBLibrary lib = new UniversityDBLibrary(username, password);
 }

}