package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class ContactDelitionTests extends TestBase {

  @Test
  public void testContactDelition() {

    app.getContactHelper().selectAnyContact();
    app.getContactHelper().deleteContact();
  }
}
