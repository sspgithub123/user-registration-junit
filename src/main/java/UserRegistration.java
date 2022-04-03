/**
 * Program on User Registration Using Regex
 *
 * @author : Shubham Pawar
 * @since : 01/04/2022
 */

/**
 * created class name as UserRegistration
 */

public class UserRegistration {
    /**
     * created method checkFName and passing parameter in this it will check
     * FirstName is valid or not result will be in true or false because method is
     * boolean type
     *
     * @param fName -FirstName of the String
     * @return -return to method created
     */
    public boolean checkFName(String fName) {
        /**
         * regex pattern for FirstName
         */
        return (fName.matches("[A-Z][a-z]{3,}"));

    }

    /**
     * created method Lname and passing parameter in this it will check LastName is
     * valid or not result will be in true or false because method is boolean type
     *
     * @param Lname -LastName of the String
     * @return - return to method created
     */
    public boolean Lname(String Lname) {
        return (Lname.matches("[A-Z][a-z]{3,}"));
    }

    /**
     * created method checkEmail and passing parameter in this it will check Email
     * is valid or not result will be in true or false because method is boolean
     * type
     *
     * @param emailID -passing emailId
     * @return -return to method created
     */
    public boolean checkEmail(String emailID) {
        return (emailID.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
    }

    /**
     * created method checkPhoneNum and passing parameter in this it will check
     * phoneNumber is valid or not result will be in true or false because method is
     * boolean type
     *
     * @param phoneNum -passing phoneNumber
     * @return -return to method created
     */
    public boolean checkPhoneNum(String phoneNum) {
        return (phoneNum.matches("91\\s[0-9]{10}"));
    }

    /**
     * created method checkPassword and passing parameter in this it will check
     * Password is valid or not result will be in true or false because method is
     * boolean type
     *
     * @param password- passing password
     * @return -return to method created
     */
    public boolean checkPassword(String password) {
        return (password.matches("[a-zA-Z]{8,}"));
    }
    /**
     * creating method moodAnalyzer to check the mood happy or sad
     *
     * @param fName-    passing FirstName
     * @param Lname-    Passing LastName
     * @param phoneNum- Passing PhoneNumber
     * @param emailID-  Passing EmailId
     * @param password- passing Password
     * @return -return to method created
     */

    public String moodAnalyzer(String fName, String Lname, String phoneNum, String emailID, String password) {
        if (checkFName(fName) == true && Lname(Lname) == true && checkEmail(emailID) == true
                && checkPhoneNum(phoneNum) == true && checkPassword(password) == true) {
            return "HAPPY";
        } else {
            return "SAD";
        }
    }
}
