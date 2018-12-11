
package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void ConatctCreationTests() {
    app.gotoHomePage();
    app.initAddNewContact();
    app.fillContactForm(
            new ContactData("Ivan", "Nya", "Meshcheriyakov",
                    "Meepo", "Msk", "8999", "8999", "8999",
                    "9", "inams@majds.ru", "9"));
    app.submitContactCreation();
    app.gotoHomePage();
  }
}
