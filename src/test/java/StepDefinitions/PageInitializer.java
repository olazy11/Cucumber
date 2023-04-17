package StepDefinitions;

import Pages.AddEmployeePage;
import Pages.LoginPage;

//this class will manage objects creation of different page objects in our Framework.
// Instead of calling the page objects again and again ,this class will take care of this step
public class PageInitializer {
    public static LoginPage login;
    public static AddEmployeePage addEmployeePage;
    public static void initializePageObjects(){
         login = new LoginPage();
         addEmployeePage= new AddEmployeePage();

    }
}
