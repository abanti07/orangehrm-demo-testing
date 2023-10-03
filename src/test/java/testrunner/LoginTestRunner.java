package testrunner;

import config.SetUp;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestRunner extends SetUp {
    LoginPage loginpage;
    @Test(priority = 1)
    public void loginWithWrongCreds(){
        loginpage =new LoginPage(driver);
        loginpage.doLogin("admin","wrongpass");
        String textActual= driver.findElement(By.className("oxd-alert-content-text")).getText();
        String textExpected="Invalid credentials";
        Assert.assertTrue(textActual.contains(textExpected));

    }
    @Test(priority = 2)
    public void doLogin(){

        loginpage=new LoginPage(driver);
        loginpage.doLogin("Admin ","admin123");
        Assert.assertTrue(driver.findElement(By.className("oxd-userdropdown-img")).isDisplayed());
    }
    @Test(priority = 3)
    public void LogOut(){
        loginpage=new LoginPage(driver);
        loginpage.doLogOut();
        String txtActual= driver.findElement(By.className("orangehrm-login-title")).getText();
        String txtExpected="Login";
        Assert.assertEquals(txtActual,txtExpected);
    }
}
