import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashBoardRunner extends SetUp {
    @BeforeTest
    public void login() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.doLogin("Admin ", "admin123");
    }

    @Test(priority = 1)
    public void createUser() {
        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        dashBoardPage.createUser("Test", "user", "user07", "p@ssword07");
    }
}
