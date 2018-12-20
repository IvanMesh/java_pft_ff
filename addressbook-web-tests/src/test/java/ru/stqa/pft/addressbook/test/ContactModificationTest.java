package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initModifyContact();
    app.getContactHelper().fillContactForm(new ContactData("niy", "mia", "cria",
            "tia", "sria", "op", "hop", "dr", "23", "kp", "sd"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHomePage();
  }
}
