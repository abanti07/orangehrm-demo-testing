import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class DashBoardPage {
    @FindBy(className = "oxd-main-menu-item--name")
    List<WebElement> menuItems;
    @FindBy(className = "oxd-button")
    List<WebElement> buttons;
    @FindBy(className = "oxd-input")
    List<WebElement> txtFields;
    @FindBy(className = "oxd-switch-input")
    WebElement btnSwitch;
   public DashBoardPage (WebDriver driver) {
       PageFactory.initElements(driver, this);
   }
   public void createUser(String firstName,String lastName,String userName,String passWord){
       menuItems.get(1).click();//click PIM
       buttons.get(2).click(); //click Add button
       txtFields.get(1).sendKeys(firstName);
       txtFields.get(3).sendKeys(lastName);
       btnSwitch.click();
       txtFields.get(5).sendKeys(userName);
       txtFields.get(6).sendKeys(passWord);
       txtFields.get(7).sendKeys(passWord); //confirm password
       buttons.get(1).click(); // save data

   }


}
