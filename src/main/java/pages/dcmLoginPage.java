package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;


public class dcmLoginPage  {
    WebDriver driver;

    public dcmLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.ID,using = "username")
    public WebElement emailAddress;

    @FindBy(how = How.ID,using ="password")
    public WebElement password;

    @FindBy(how = How.NAME,using = "action")
    public WebElement continueButton;

    @FindBy(how =How.XPATH ,using = "//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[1]/div[2]/nav/button")
    public WebElement dashboard;

    public void doLogin(String myEmailAddress, String myPassword) throws InterruptedException {

        Thread.sleep(2000);
        emailAddress.sendKeys(myEmailAddress);
        password.sendKeys(myPassword);
    }
        public void clickButton(){
        continueButton.click();

    }
    public void assertDashboard(){
        System.out.println(dashboard.getText());
        String expectedResult = "Dashboard";
        String actualResult = dashboard.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }


}

