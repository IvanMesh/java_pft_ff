package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test

  public void testGroupDelition() {
    app.getGroupHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deteteSelectedGroups();
    app.getGroupHelper().goToGroupPage();
  }

}
