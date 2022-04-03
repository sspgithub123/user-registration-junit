import org.junit.Assert;
import org.junit.Test;

/**
 * testCases for validating lastName
 */

public class UserRegTest {
    @Test
    /**
     * created method testingFirstName() to check firstname is valid or not
     */
    public void testingFirstName() {
        /**
         * Creating Object for UserRegistration class
         */
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling checkFName method to see firstname is valid
         */
        boolean isFNameValid = userRegistration.checkFName("Almas");
        Assert.assertTrue(isFNameValid);
    }

    @Test
    /**
     * created method testFirstNameInvalidMustReturnFalse for false condition
     */
    public void testFirstNameInvalidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFnameValid = userRegistration.checkFName("almas");
        Assert.assertFalse(isFnameValid);
    }

    /**
     * created method testingLastName() to check lastname is valid or not
     */
    @Test
    public void testLastNameValidMustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling Lname method to see LastName is valid
         */
        boolean isLnameValid = userRegistration.Lname("Advani");
        Assert.assertTrue(isLnameValid);
    }

    /**
     * created method testLastNameInvalidMustReturnFalse for false condition
     */
    @Test
    public void testLastNameValidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLnameINValid = userRegistration.Lname("advani");
        Assert.assertFalse(isLnameINValid);
    }
    @Test
    /**
     * created method testEmailId_MustReturnTrue() for true condition
     */
    public void testEmailId_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling checkEmail method to see mailId is valid
         */
        boolean isEmailValid = userRegistration.checkEmail("almas.ab@gmail.com");
        Assert.assertTrue(isEmailValid);
    }

    @Test
    /**
     * created method testEmailId_MustReturnFalse() for false condition
     */

    public void testEmailId_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailInvalid = userRegistration.checkEmail("almas@.com");
        Assert.assertFalse(isEmailInvalid);
    }
    @Test
    /**
     * created testPhoneNumber_MustReturnTrue() for True condition
     */
    public void testPhoneNumber_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling checkPhoneNum method to see phoneNumber is valid
         */
        boolean isPhoneNumberValid = userRegistration.checkPhoneNum("91 7903990740");
        Assert.assertTrue(isPhoneNumberValid);
    }

    @Test
    /**
     * created testPhoneNumber_MustReturnFalse() for False condition
     */
    public void testPhoneNumber_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberInValid = userRegistration.checkPhoneNum("7903990740");
        Assert.assertFalse(isPhoneNumberInValid);
    }
    @Test
    /**
     * created testPassword_MustReturnTrue() for True condition
     */
    public void testPassword_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling checkPassword method to see Password is valid
         */
        boolean isPasswordValid = userRegistration.checkPassword("abcdefghi");
        Assert.assertTrue(isPasswordValid);
    }

    @Test
    /**
     * created testPassword_MustReturnFalse() for False condition
     */
    public void testPassword_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordInValid = userRegistration.checkPassword("abcd");
        Assert.assertFalse(isPasswordInValid);
    }
}
