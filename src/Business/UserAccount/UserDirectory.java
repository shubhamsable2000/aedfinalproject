/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author shubhamsable
 */
public class UserDirectory {
    
      private ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList();
    }

    public ArrayList<User> getUserAccountList() {
        return userList;
    }
    
    public User authenticateUser(String username, String password){
        for (User ua : userList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
//        System.out.println("No user account found. Returning Null");
        return null;
    }
    
    public User createUserAccount(String username, String password, Employee employee, Role role){
        User users = new User();
        users.setUsername(username);
        users.setPassword(password);
        users.setEmployee(employee);
        users.setRole(role);
        userList.add(users);
        return users;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (User ua : userList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
