/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginApp;

/**
 *
 * @author Student
 */
public class main {
    public static void main(String[] args){
            Login login = new Login("Kanelo","Mabena");
            String result=login.registerUser("Kan_1","Kan&&sec@99!", "+27838968976");
            System.out.println(result);
            boolean loggedIn = login.loginUser("Kan_1", "Kan&&sec@99!");
            System.out.println(login.returnLoginStatus(loggedIn));
        }
    }
        

