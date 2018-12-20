package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContactForm(ContactData contactData) {

    type(By.name("firstname"), contactData.getName());
    type(By.name("middlename"), contactData.getMiddlename());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("nickname"), contactData.getNick());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getHome());
    type(By.name("mobile"), contactData.getMobile());
    type(By.name("work"), contactData.getWork());
    type(By.name("fax"), contactData.getFax());
    type(By.name("email"), contactData.getEmail());
    type(By.name("email2"), contactData.getEmail2());
  }

  public void initAddNewContact() {
    click(By.linkText("add new"));
  }

  public void selectAnyContact() {
    click(By.name("selected[]"));
  }

  public void deleteContact() {
    click(By.xpath("//div/div[4]/form[2]/div[2]/input"));
    wd.switchTo().alert().accept();
  }

  public void initModifyContact() {
    click(By.xpath("//*[@id=\"maintable\"]/tbody/tr[3]/td[8]/a"));
  }

  public void submitContactModification() {
    click(By.name("update"));
  }
}
