package tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTests extends TestBase {

    @BeforeMethod
    public void preCondition(){
        if(app.getHelperUser().isSignOutPresent()){
            app.getHelperUser().signOut();
        }
    }

    @Test
    public void loginSuccess() {
        //open login form
//        WebElement loginItem = wd.findElement(By.cssSelector("[href='/login']"));
//        loginItem.click();
//        //fill email
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("noa@gmail.com");
//
//        // fill password
//        WebElement passwordInput = wd.findElement(By.xpath("//input[2]"));
//        passwordInput.click();
//        passwordInput.clear();
//        passwordInput.sendKeys("Nnoa12345$");
//        //click button Login
//        wd.findElement(By.xpath("//*[text()=' Login']")).click();
//
//
//        Assert.assertTrue(wd.findElements(By.xpath("//*[text()='Sign Out']")).size() > 0);


    }

    @Test
    public void loginSuccessNew(){

        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistartionForm("noa@gmail.com","Nnoa12345$");
        app.getHelperUser().submitLogin();

        Assert.assertTrue(app.getHelperUser().isLoginRegistrationSuccess());
    }

    @Test
    public void LoginNegativeTestWrongPassword() {
        User user = new User().withEmail().;
    }
}