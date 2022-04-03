import org.junit.Assert;
import org.junit.Test;

/**
 * testCases for validating lastName
 */

public class UserRegistrationTest {
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
        boolean isFirstNameValid = userRegistration.checkFirstName("Shubham");
        Assert.assertTrue(isFirstNameValid);
    }

    @Test
    /**
     * created method testFirstNameInvalidMustReturnFalse for false condition
     */
    public void testFirstNameInvalidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFirstnameValid = userRegistration.checkFirstName("shubham");
        Assert.assertFalse(isFirstnameValid);
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
        boolean isLastNameValid = userRegistration.lastName("Pawar");
        Assert.assertTrue(isLastNameValid);
    }

    /**
     * created method testLastNameInvalidMustReturnFalse for false condition
     */
    @Test
    public void testLastNameValidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLastNameINValid = userRegistration.lastName("jadhav");
        Assert.assertFalse(isLastNameINValid);
    }
    @Test
    /**
     * created method testEmailId_MustReturnTrue() for true condition
     */
    public void testEmailIdMustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling checkEmail method to see mailId is valid
         */
        boolean isEmailValid = userRegistration.checkEmail("pawar.ab@gmail.com");
        Assert.assertTrue(isEmailValid);
    }

    @Test
    /**
     * created method testEmailId_MustReturnFalse() for false condition
     */

    public void testEmailIdMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailInvalid = userRegistration.checkEmail("pawar@.com");
        Assert.assertFalse(isEmailInvalid);
    }
    @Test
    /**
     * created testPhoneNumber_MustReturnTrue() for True condition
     */
    public void testPhoneNumberMustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        /**
         * calling checkPhoneNum method to see phoneNumber is valid
         */
        boolean isPhoneNumberValid = userRegistration.checkPhoneNumber("91 7903990740");
        Assert.assertTrue(isPhoneNumberValid);
    }

    @Test
    /**
     * created testPhoneNumber_MustReturnFalse() for False condition
     */
    public void testPhoneNumberMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberInValid = userRegistration.checkPhoneNumber("7903990740");
        Assert.assertFalse(isPhoneNumberInValid);
    }
    @Test
    /**
     * created testPassword_MustReturnTrue() for True condition
     */
    public void testPasswordMustReturnTrue() {
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
    public void testPasswordMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordInValid = userRegistration.checkPassword("abcd");
        Assert.assertFalse(isPasswordInValid);
    }
    @Test
    /**
     * created method mood_Analyser_Test_Happy() as Happy Test Case validates the
     * Entry Successfully
     */
    public void moodAnalyserTestHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodHappy = userRegistration.moodAnalyzer("Shubham", "Pawar", "91 7903900074",
                "pawar007.sm@gmail.com",
                "Shubham@2103");
        Assert.assertEquals("HAPPY", isMoodHappy);
    }

    @Test
    /**
     * created method mood_Analyser_Test_Sad() as Sad Test Cases fails the Entry
     */
    public void moodAnalyserTestSad() {
        UserRegistration userRegistration = new UserRegistration();
        String isMoodSad = userRegistration.moodAnalyzer("Shubham", "pawar", "7903900074",
                "pawar007@.com", "799235");
        Assert.assertEquals("SAD", isMoodSad);
    }
}
