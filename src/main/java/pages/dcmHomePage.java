package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dcmHomePage {

    WebDriver driver;

    public dcmHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[contains(text(),'Login')]")
    private WebElement loginButton;

    public void clickLoginButton(){
        loginButton.click();
    }
    @FindBy(xpath = "//h1[contains(text(),'Welcome')]")
    private WebElement welcomeText;

    public boolean assertLoginPage(){

                return welcomeText.isDisplayed();
    }
}

