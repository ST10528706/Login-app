/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginApp;

/**
 *
 * @author Student
 */
public class Login{
    private String username;
    private String password;
    private String cellPhoneNumber;
    private String firstName;
    private String lastName;
    public Login(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
     }
    public boolean checkUsername(String username){
    if (username == null){
        return false;
    }
    boolean hasUnderscore = username.contains("_");
    boolean rightLength = username.length()<= 5;
    return hasUnderscore && rightLength;
    }
    public boolean checkPasswordComplexity(String password){
        if (password == null ||password.length() < 8){
            return false;
        }
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (int i = 0; i< password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasCapital = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)){
                hasSpecial = true;
        }
        }
        return hasCapital && hasNumber && hasSpecial;
        }
        public boolean checkCellPhoneNumber(String cellPhoneNumber) {
            if (cellPhoneNumber == null) {
                return false; 
        }
           boolean hasCountryCode = cellPhoneNumber.startsWith("+27");
           boolean rightLength= cellPhoneNumber.length()<= 12;
           return hasCountryCode && rightLength;
        }
        public String registerUser(String username, String password, String cellPhoneNumber) {
            if (!checkUsername(username)) {
                return "Username is not correctly formatted; please ensure that your username contains an uderscore and is no more than 5 characters in length.";
            }
            if (!checkPasswordComplexity(password)) {
                return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
            }
            if (!checkCellPhoneNumber(cellPhoneNumber)){
                return "cell number is incorrectly formatted or does not contain an internantional code, please correct the number  and try again.";
            }
            this.username= username;
            this.cellPhoneNumber= cellPhoneNumber;
            this.password= password;
            return "User successfully registered.";
        }
        public boolean loginUser(String username, String password) {
            return this.username != null
                && this.username.equals(username)
                && this.password!= null
                && this.password.equals(password);
        } 
        public String returnLoginStatus(boolean successful){
            if (successful){
                return "Welcome " + firstName + ", " + lastName + " It is great to see you again.";
            }
            return "Username or password incorrect, please try again.";
        }
        }
        
                    
                    
        
        
        
         
        

