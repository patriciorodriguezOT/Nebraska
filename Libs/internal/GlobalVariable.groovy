package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile Dev Env : Registration Form in Dev Environment
Profile QA Env : Registration Form in Dev Environment</p>
     */
    public static Object G_Registration_Form
     
    /**
     * <p></p>
     */
    public static Object G_Nebraska_Link
     
    /**
     * <p></p>
     */
    public static Object G_UserAdministration_Link
     
    /**
     * <p></p>
     */
    public static Object G_Applicant_FirstName
     
    /**
     * <p></p>
     */
    public static Object G_Applicant_LastName
     
    /**
     * <p></p>
     */
    public static Object G_Applicant_DOB
     
    /**
     * <p></p>
     */
    public static Object G_Applicant_SSN
     
    /**
     * <p></p>
     */
    public static Object G_Applicant_I94
     
    /**
     * <p></p>
     */
    public static Object G_Applicant_AlienRegistrationNum
     
    /**
     * <p>Profile QA Env : Email used for Applicant Registratoin</p>
     */
    public static Object G_Applicant_Email
     
    /**
     * <p></p>
     */
    public static Object G_Admin_Username
     
    /**
     * <p></p>
     */
    public static Object G_Admin_Pass
     
    /**
     * <p></p>
     */
    public static Object G_ApplicantPass
     
    /**
     * <p></p>
     */
    public static Object G_Applicant_PlaceOfBirth
     
    /**
     * <p></p>
     */
    public static Object G_Applicant_PlaceOfBirthCanada
     
    /**
     * <p></p>
     */
    public static Object G_Applicant_ZipCode
     
    /**
     * <p></p>
     */
    public static Object G_Applicant_ZipCode_Canada
     
    /**
     * <p></p>
     */
    public static Object G_Applicant_AddressLine
     
    /**
     * <p></p>
     */
    public static Object G_Applicant_PhoneNumber
     
    /**
     * <p></p>
     */
    public static Object G_LU_Staff_UserName
     
    /**
     * <p></p>
     */
    public static Object G_LU_Staff_Pass
     
    /**
     * <p></p>
     */
    public static Object G_Gmail_Test_Account
     
    /**
     * <p></p>
     */
    public static Object G_Gmail_Test_Account_Pass
     
    /**
     * <p></p>
     */
    public static Object G_Appeal_Code
     
    /**
     * <p></p>
     */
    public static Object G_Appeal_Link
     
    /**
     * <p></p>
     */
    public static Object G_ClientId
     
    /**
     * <p></p>
     */
    public static Object G_ClientSecret
     
    /**
     * <p></p>
     */
    public static Object G_EndpointAccessToken
     
    /**
     * <p></p>
     */
    public static Object G_Token
     
    /**
     * <p></p>
     */
    public static Object G_BaseUrl
     
    /**
     * <p></p>
     */
    public static Object G_host
     
    /**
     * <p></p>
     */
    public static Object G_mailStoreType
     
    /**
     * <p></p>
     */
    public static Object G_EmailSubject_Registration
     
    /**
     * <p>Profile QA Env : License Manager</p>
     */
    public static Object G_LM_Staff_UserName
     
    /**
     * <p></p>
     */
    public static Object G_LM_Staff_Pass
     
    /**
     * <p></p>
     */
    public static Object G_LP_Staff_UserName
     
    /**
     * <p></p>
     */
    public static Object LP_Staff_Pass
     
    /**
     * <p>Profile QA Env : Direct link to all individuals manage menu section</p>
     */
    public static Object G_IndividualsAll_Link
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            G_Registration_Form = selectedVariables['G_Registration_Form']
            G_Nebraska_Link = selectedVariables['G_Nebraska_Link']
            G_UserAdministration_Link = selectedVariables['G_UserAdministration_Link']
            G_Applicant_FirstName = selectedVariables['G_Applicant_FirstName']
            G_Applicant_LastName = selectedVariables['G_Applicant_LastName']
            G_Applicant_DOB = selectedVariables['G_Applicant_DOB']
            G_Applicant_SSN = selectedVariables['G_Applicant_SSN']
            G_Applicant_I94 = selectedVariables['G_Applicant_I94']
            G_Applicant_AlienRegistrationNum = selectedVariables['G_Applicant_AlienRegistrationNum']
            G_Applicant_Email = selectedVariables['G_Applicant_Email']
            G_Admin_Username = selectedVariables['G_Admin_Username']
            G_Admin_Pass = selectedVariables['G_Admin_Pass']
            G_ApplicantPass = selectedVariables['G_ApplicantPass']
            G_Applicant_PlaceOfBirth = selectedVariables['G_Applicant_PlaceOfBirth']
            G_Applicant_PlaceOfBirthCanada = selectedVariables['G_Applicant_PlaceOfBirthCanada']
            G_Applicant_ZipCode = selectedVariables['G_Applicant_ZipCode']
            G_Applicant_ZipCode_Canada = selectedVariables['G_Applicant_ZipCode_Canada']
            G_Applicant_AddressLine = selectedVariables['G_Applicant_AddressLine']
            G_Applicant_PhoneNumber = selectedVariables['G_Applicant_PhoneNumber']
            G_LU_Staff_UserName = selectedVariables['G_LU_Staff_UserName']
            G_LU_Staff_Pass = selectedVariables['G_LU_Staff_Pass']
            G_Gmail_Test_Account = selectedVariables['G_Gmail_Test_Account']
            G_Gmail_Test_Account_Pass = selectedVariables['G_Gmail_Test_Account_Pass']
            G_Appeal_Code = selectedVariables['G_Appeal_Code']
            G_Appeal_Link = selectedVariables['G_Appeal_Link']
            G_ClientId = selectedVariables['G_ClientId']
            G_ClientSecret = selectedVariables['G_ClientSecret']
            G_EndpointAccessToken = selectedVariables['G_EndpointAccessToken']
            G_Token = selectedVariables['G_Token']
            G_BaseUrl = selectedVariables['G_BaseUrl']
            G_host = selectedVariables['G_host']
            G_mailStoreType = selectedVariables['G_mailStoreType']
            G_EmailSubject_Registration = selectedVariables['G_EmailSubject_Registration']
            G_LM_Staff_UserName = selectedVariables['G_LM_Staff_UserName']
            G_LM_Staff_Pass = selectedVariables['G_LM_Staff_Pass']
            G_LP_Staff_UserName = selectedVariables['G_LP_Staff_UserName']
            LP_Staff_Pass = selectedVariables['LP_Staff_Pass']
            G_IndividualsAll_Link = selectedVariables['G_IndividualsAll_Link']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
