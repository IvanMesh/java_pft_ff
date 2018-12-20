package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {

    app.getNavigationHelper().gotoHomePage();
    app.getGroupHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("t1", "t2", "t3"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().goToGroupPage();
  }
}
