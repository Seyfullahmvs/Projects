package Day01;

import Utilities.DriverClass;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class Project01 extends DriverClass {


    @Test
    public void Deneme() {

        driver.get("https://www.lidl.com/");

        String url1 = driver.getCurrentUrl();
        Assert.assertTrue(url1.contains("https://www.lidl.com/"));

        MyMethods.myWait(3);

        WebElement cookies=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        cookies.click();

        MyMethods.myWait(2);

        WebElement xBar=driver.findElement(By.xpath("//img[@src='/assets/icons/icon-close-white.svg']"));
        xBar.click();

        MyMethods.myWait(2);

        WebElement sign = driver.findElement(By.xpath("//li [@class='sign-in']"));
        sign.click();

        MyMethods.myWait(3);

        WebElement joinMyLidl = driver.findElement(By.xpath("//a[@class='clickable link clickable--theme-primary clickable--size-full clickable--color-light-blue clickable--bold-weight']"));
        joinMyLidl.click();

        String url2 = driver.getCurrentUrl();
        Assert.assertTrue(url2.contains("register"));

        MyMethods.myWait(3);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='input2']"));
        firstName.sendKeys("Seyf");

        MyMethods.myWait(1);

        WebElement lastName = driver.findElement(By.xpath("//input[@id='input3']"));
        lastName.sendKeys("Mavus");

        MyMethods.myWait(1);

        WebElement email1 = driver.findElement(By.xpath("//input[@id='input4']"));
        email1.sendKeys("seyf");

        MyMethods.myWait(2);

        WebElement emailMistake = driver.findElement(By.xpath("//*[text()='Enter a valid email address.']"));

       Assert.assertTrue(emailMistake.getText().contains("Enter a valid email address."));

        MyMethods.myWait(2);

        email1.sendKeys("@abc.com");

        MyMethods.myWait(2);

        WebElement confirmEmail = driver.findElement(By.xpath("//input[@id='input5']"));
        confirmEmail.sendKeys("seyf");

        MyMethods.myWait(3);

        WebElement confirmEmailMistake = driver.findElement(By.xpath("//*[text()='Emails do not match']"));

        Assert.assertTrue(confirmEmailMistake.getText().contains("Emails do not match"));

        confirmEmail.sendKeys("@abc.com");

        MyMethods.myWait(2);

        WebElement password = driver.findElement(By.xpath("//input[@id='input6']"));
        password.sendKeys("1234");

        MyMethods.myWait(2);

        WebElement hide = driver.findElement(By.xpath("//button[@role='checkbox']"));
        hide.click();

        MyMethods.myWait(2);

        WebElement passwordMistake = driver.findElement(By.xpath("//*[text()='Your password must be at least 8 characters!']"));

        Assert.assertTrue(passwordMistake.getText().contains("Your password must be at least 8 characters!"));

        MyMethods.myWait(2);

        password.sendKeys("5678");

        MyMethods.myWait(3);

        WebElement passwordMistake2 = driver.findElement(By.xpath("//*[text()='You need to have at least one uppercase, lowercase, number or special character in your password!']"));

        Assert.assertTrue(passwordMistake2.getText().contains("You need to have at least one uppercase, lowercase, number or special character in your password!"));

        MyMethods.myWait(2);

        password.sendKeys("aA");

        MyMethods.myWait(2);

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='input7']"));
        phoneNumber.sendKeys("0000000000");

        MyMethods.myWait(3);

        WebElement phoneNumberMistake = driver.findElement(By.xpath("//*[text()='This phone number is already being used, please use another one.']"));

        Assert.assertTrue(phoneNumberMistake.getText().contains("This phone number is already being used, please use another one."));

        MyMethods.myWait(3);

        Actions actions = new Actions(driver);

        for (int i = 0; i <10; i++) {
            Action action = actions.sendKeys(Keys.BACK_SPACE).build();

            action.perform();
        }

        MyMethods.myWait(3);

        phoneNumber.sendKeys("12345678");

        MyMethods.myWait(2);

        WebElement phoneNumberMistake2 = driver.findElement(By.xpath("//*[text()='Enter a valid phone number.']"));

       Assert.assertTrue(phoneNumberMistake2.getText().contains("Enter a valid phone number."));

        MyMethods.myWait(2);

        for (int i = 0; i <10; i++) {
            Action action = actions.sendKeys(Keys.BACK_SPACE).build();

            action.perform();
        }
        MyMethods.myWait(2);

        phoneNumber.sendKeys("5590775432");

        MyMethods.myWait(2);

        WebElement zipCode = driver.findElement(By.xpath("//input[@id='input8']"));
        zipCode.sendKeys("123");

        MyMethods.myWait(2);

        WebElement zipCodeMistake = driver.findElement(By.xpath("//*[text()='Enter a valid zipcode.']"));

        Assert.assertTrue(zipCodeMistake.getText().contains("Enter a valid zipcode."));

        MyMethods.myWait(2);

        zipCode.sendKeys("45");

        MyMethods.myWait(2);

        WebElement birtday=driver.findElement(By.xpath("//input[@id='date-picker-dialog']"));
        birtday.sendKeys("11111111");

        MyMethods.myWait(2);

        WebElement birtdayMistake=driver.findElement(By.xpath("//*[text()='Age must be less than 100.']"));

        Assert.assertTrue(birtdayMistake.getText().contains("Age must be less than 100."));

        for (int i = 0; i <4; i++) {
            Action action = actions.sendKeys(Keys.BACK_SPACE).build();

            action.perform();
        }
        MyMethods.myWait(2);

        birtday.sendKeys("2222");
        MyMethods.myWait(2);

        WebElement birtdayMistake1=driver.findElement(By.xpath("//*[text()='You must be at least 13 years old.']"));
        Assert.assertTrue(birtdayMistake1.getText().contains("You must be at least 13 years old."));

        MyMethods.myWait(2);

        for (int i = 0; i <3; i++) {
            Action action = actions.sendKeys(Keys.BACK_SPACE).build();

            action.perform();
        }

        MyMethods.myWait(2);

        birtday.sendKeys("000");

        MyMethods.myWait(2);

        WebElement addressLine=driver.findElement(By.xpath("//input[@id='input9']"));
        addressLine.sendKeys("ROOSEVELT AVE");

        MyMethods.myWait(2);

        WebElement city=driver.findElement(By.xpath("//input[@id='input10']"));
        city.sendKeys("Queens");

        MyMethods.myWait(2);

        WebElement state=driver.findElement(By.xpath("//select[@id='select0']"));
        Select select=new Select(state);

        MyMethods.myWait(2);

        select.selectByValue("NY");

        MyMethods.myWait(2);

        WebElement joinMy=driver.findElement(By.xpath("//div[@class='spinnie']"));
        joinMy.click();

        MyMethods.myWait(30);

        WebElement myAccount=driver.findElement(By.xpath("//*[text()='my account']"));
        myAccount.click();

        MyMethods.myWait(2);

        WebElement signOut=driver.findElement(By.xpath("//*[text()='sign out']"));
        signOut.click();

        MyMethods.myWait(2);

        WebElement sign2=driver.findElement(By.xpath("//*[text()='sign in']"));
        sign2.click();

        MyMethods.myWait(2);

        WebElement emailLogin=driver.findElement(By.xpath("//input[@id='input12']"));
        emailLogin.sendKeys("seyf");

        MyMethods.myWait(2);

        WebElement signInClick=driver.findElement(By.xpath("//button[@class='clickable button sign-in clickable--theme-primary clickable--size-base clickable--color-blue clickable--bold-weight clickable--regular-font']"));
        signInClick.click();

        MyMethods.myWait(2);

        emailLogin.sendKeys("@abc.com");

        MyMethods.myWait(2);

        signInClick.click();

        MyMethods.myWait(2);

        WebElement passwordLogin=driver.findElement(By.xpath("//input[@id='input13']"));
        passwordLogin.sendKeys("1234");

        MyMethods.myWait(2);

        signInClick.click();

        MyMethods.myWait(2);

        WebElement hide2=driver.findElement(By.xpath("//button[@aria-label='show password']"));
        hide2.click();

        MyMethods.myWait(2);

        passwordLogin.sendKeys("5678aA");

        MyMethods.myWait(2);

        signInClick.click();

        MyMethods.myWait(2);

        WebElement myAccount2=driver.findElement(By.xpath("//span[@class='profile-dropdown-button-label ']"));
        myAccount2.click();

        MyMethods.myWait(2);

        WebElement mavusClick=driver.findElement(By.xpath("//*[text()='Mavus']"));
        mavusClick.click();

        MyMethods.myWait(2);

//        WebElement accountOptions=driver.findElement(By.xpath("//a[@class='clickable link active clickable--size-inline']  "));
//        accountOptions.click();
//
//        MyMethods.myWait(2);

        WebElement lastName2=driver.findElement(By.xpath("//input[@id='input17']"));
        lastName2.sendKeys("44");

        MyMethods.myWait(2);

        WebElement state2=driver.findElement(By.xpath("//select[@id='select4']"));
        Select select2=new Select(state2);
        select2.selectByValue("NY");

        MyMethods.myWait(2);

        WebElement save=driver.findElement(By.xpath("//button[@class='clickable button submit clickable--theme-primary clickable--size-base clickable--color-blue clickable--bold-weight clickable--regular-font']"));
        save.click();

        MyMethods.myWait(2);

//        WebElement saveApprove=driver.findElement(By.xpath("//*[text()='Profile updated successfully']"));
//        Assert.assertTrue(saveApprove.getText().contains("Profile updated successfully"));
//
//        MyMethods.myWait(2);

        WebElement preferences=driver.findElement(By.xpath("//*[text()='preferences']"));
        preferences.click();

        MyMethods.myWait(2);

        WebElement kidFriendly=driver.findElement(By.xpath("//input[@name='kidfriendly']"));
        kidFriendly.click();

        MyMethods.myWait(2);

        WebElement kosher=driver.findElement(By.xpath("//input[@name='kosher']"));
        kosher.click();

        MyMethods.myWait(2);

        WebElement organic=driver.findElement(By.xpath("//input[@name='organic']"));
        organic.click();

        MyMethods.myWait(2);

        WebElement save2=driver.findElement(By.xpath("//button[@class='clickable button submit clickable--theme-primary clickable--size-base clickable--color-light-blue clickable--bold-weight clickable--regular-font']"));
        save2.click();

        MyMethods.myWait(2);

        WebElement password2=driver.findElement(By.xpath("//*[text()='password']"));
        password2.click();

        MyMethods.myWait(2);

        WebElement preferences2=driver.findElement(By.xpath("//a[@href='/profile/food-preferences']"));
        preferences2.click();

        MyMethods.myWait(2);

        WebElement accountManagement=driver.findElement(By.xpath("//*[text()='account management']"));
        accountManagement.click();

        MyMethods.myWait(2);

        WebElement deleteAccount=driver.findElement(By.xpath("//*[text()='delete account']"));
        deleteAccount.click();

        MyMethods.myWait(2);

        WebElement deleteAccount2=driver.findElement(By.xpath("//*[text()='delete account']"));
        deleteAccount2.click();


        waitAndQuit();


    }
}
