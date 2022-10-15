package TestSteps;

import BaseTest.BaseTest;
import DataReader.DataReader;
import Page.SelectbookPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SelectbookSetps extends BaseTest {
     SelectbookPage loginpage;
     DataReader data= new DataReader();

  @Test(priority = 1, description = "Add book",enabled = true)
  public void selectBook() {
      loginpage=new SelectbookPage(driver);
      loginpage.BookStorebtn.click();
      loginpage.siginbtn.click();
      loginpage.GotoBookStore(data.Username(), data.Password());
      loginpage.loginbtn.click();
      Assert.assertTrue(loginpage.logOutbtn.isDisplayed(),"User not logged in");
      waitForElement(loginpage.bookSelect.get(1));
      loginpage.bookSelect.get(1).click();
      scroll();
      waitForElement(loginpage.addCollection);
      loginpage.addCollection.click();
      waitForAlert();
      driver.switchTo( ).alert().accept();
      waitForElement(loginpage.profilebtn);
      scroll();
      waitForElement(loginpage.profilebtn);
      loginpage.profilebtn.click();
      Assert.assertTrue(!loginpage.bookSelect.isEmpty(),"Book Collection is empty");

  }
  @Test(priority = 2, description = "Remove book",enabled = false)
  public void removeBook()  {
      selectBook();
      waitForElement(loginpage.deleteSelectedBook.get(1));
      loginpage.deleteSelectedBook.get(1).click();
      waitForElement(loginpage.confirmdelete);
      loginpage.confirmdelete.click();
      waitForAlert();
      driver.switchTo( ).alert().accept();
  }


}

//allure serve