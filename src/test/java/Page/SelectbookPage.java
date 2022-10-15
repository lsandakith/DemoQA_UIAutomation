package Page;

import BaseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectbookPage extends BaseTest{

    @FindBy(xpath = "//h5[contains(text(),'Book Store Application')]")
    public WebElement BookStorebtn;

    @FindBy(xpath = "//*[@id='login']")
    public WebElement siginbtn;

    @FindBy(xpath = "//*[@id='userName']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@id='login']")
    public WebElement loginbtn;

    @FindBy(xpath = "//button[contains(text(),'Log out')]")
    public WebElement logOutbtn;

    @FindBy(css = "[class='mr-2']")
    public List<WebElement> bookSelect;

    @FindBy(xpath = "//button[contains(text(),'Add To Your Collection')]")
    public WebElement addCollection;

    @FindBy(xpath = "//span[contains(text(),'Profile')]")
    public WebElement profilebtn;

    @FindBy(xpath = "//*[@id='delete-record-undefined']")
    public List<WebElement> deleteSelectedBook;

    @FindBy(xpath = "//button[@id='closeSmallModal-ok']")
    public WebElement confirmdelete;

    public SelectbookPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void GotoBookStore(String Username,String Password)  {
        username.sendKeys(Username);
        password.sendKeys(Password);
   }
}
