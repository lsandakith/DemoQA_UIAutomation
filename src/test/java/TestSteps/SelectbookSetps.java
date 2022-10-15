package TestSteps;

import BaseTest.BaseTest;
import DataReader.DataReader;
import Page.SelectbookPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SelectbookSetps extends BaseTest {
     SelectbookPage loginpage;
     DataReader data= new DataReader();

     public int addBookNum =3;
     public int deleteBookNum =0;

  @Test(priority = 1, description = "Add book",enabled = false)
  public void selectBook() {
      loginpage=new SelectbookPage(driver);
      loginpage.BookStorebtn.click();
      loginpage.siginbtn.click();
      loginpage.GotoBookStore(data.Username(), data.Password());
      loginpage.loginbtn.click();
      Assert.assertTrue(loginpage.logOutbtn.isDisplayed(),"User not logged in");
      scroll();
      waitForElement(loginpage.bookSelect.get(addBookNum));
      loginpage.bookSelect.get(addBookNum).click();
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
  @Test(priority = 2, description = "Remove book",enabled = true)
  public void removeBook()  {
      selectBook();
      scroll();
      waitForElement(loginpage.deleteSelectedBook.get(deleteBookNum));
      loginpage.deleteSelectedBook.get(deleteBookNum).click();
      waitForElement(loginpage.confirmdelete);
      loginpage.confirmdelete.click();
      waitForAlert();
      driver.switchTo( ).alert().accept();
  }


}

//allure serve