package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployee extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
    WebElement pimTub =driver.findElement(By.id("menu_pim_viewPimModule"));
    doClick(pimTub);
    }
    @Then("user clicks on Add Employee button")
    public void user_clicks_on_add_employee_button() {
        //driver.findElement(By.id("menu_pim_addEmployee")).click();
        WebElement addEmpBtn = driver.findElement(By.id("menu_pim_addEmployee"));
        doClick(addEmpBtn);
    }
    @Then("user enters first, middle an last names")
    public void user_enters_first_middle_an_last_names() {
        //driver.findElement(By.id("firstName")).sendKeys(ConfigReader.getPropertyValue("firstname"));
        WebElement firstNameTextBox = driver.findElement(By.id("firstName"));
        sendText(firstNameTextBox, ConfigReader.getPropertyValue("firstname"));

        //driver.findElement(By.id("middleName")).sendKeys(ConfigReader.getPropertyValue("middlename"));

        WebElement middleNameTextBox = driver.findElement(By.id("middleName"));
        sendText(middleNameTextBox, ConfigReader.getPropertyValue("middlename"));

        //driver.findElement(By.id("lastName")).sendKeys(ConfigReader.getPropertyValue("lastname"));
        WebElement lastNameTextBox = driver.findElement(By.id("lastName"));
        sendText(lastNameTextBox, ConfigReader.getPropertyValue("lastname"));

    }
    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
     WebElement saveBtn=driver.findElement(By.id("btnSave"));
     doClick(saveBtn);
    }

}
