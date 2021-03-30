package testNg;


import ixigo_Actions.ixigo_actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class ixigo_Test {
    WebDriver driver=null;

    @BeforeClass
    public void driver_setup()  {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\unbxd\\Downloads\\ixigo\\src\\main\\resources\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.ixigo.com/");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test(priority=0)
    public void login_page_validation() throws InterruptedException {
        ixigo_actions ixigo = PageFactory.initElements(driver, ixigo_actions.class);
        ixigo.LoginPage_validation();
        ixigo.Travel_Validation();
        ixigo.Datepicker();
        ixigo.RDatepicker();
        ixigo.SearchPage_validation();
        ixigo.Filter_validation();

    }


    @AfterClass
    public void afterClass() {
        driver.close();
    }

}
