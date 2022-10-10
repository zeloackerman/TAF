package old;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class SeleniumDemo {

    String name = "Azamat";
    String email = "azamat@mail.com";
    String address = "Mira 29";
    String address2 = "Wall Street" ;

    @Test
    public  void test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // polnoe okno
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/text-box");

        WebElement fullname = driver.findElement(By.id("userName"));
        fullname.sendKeys(name);



        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys(email);



        WebElement addressInput = driver.findElement(By.id("currentAddress"));
        addressInput.sendKeys(address);



        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys(address2);



        WebElement button = driver.findElement(By.id("submit"));
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        button.click();

        WebElement idName = driver.findElement(By.id("name"));
        Assertions.assertEquals(name, idName.getText().substring(0));


//        String actualNameRes = fullname.getText();
//        Assertions.assertEquals(name, actualNameRes);


        WebElement idEmail = driver.findElement(By.id("userEmail"));
        Assertions.assertEquals(email, idEmail.getText());

        WebElement idAddress = driver.findElement(By.id("currentAddress"));
        Assertions.assertEquals(address,idAddress.getText());


    }

    @Test
    public void xpathTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInputField = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullNameInputField.sendKeys("John");

        WebElement emailInputField = driver.findElement(By.xpath("//input[@id='userEmail']"));
        emailInputField.sendKeys("john@gmail.com");

        WebElement currentAddressInputField = driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]"));
        currentAddressInputField.sendKeys("Wall Street 123");

        WebElement permanentAddressInputField = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddressInputField.sendKeys("Boston 123");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();
    }

    @Test

    public void registration() throws AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Pirzhan");

        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Abdirasilov");

        WebElement emailInput = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        emailInput.sendKeys("abdirasilov@gmail.com");

        WebElement femaleInput= driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]"));
        femaleInput.click();

        WebElement numberInput =  driver.findElement(By.xpath("//input[@placeholder='Mobile Number']"));
        numberInput.sendKeys("1234567890");

        WebElement dateInput = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        dateInput.sendKeys(Keys.BACK_SPACE);
        dateInput.sendKeys(Keys.BACK_SPACE);
        dateInput.sendKeys("00");
        femaleInput.click();

        WebElement subjectsInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        subjectsInput.sendKeys("Ma");
        subjectsInput.sendKeys(Keys.ENTER);
        subjectsInput.sendKeys("Ph");
        subjectsInput.sendKeys(Keys.ENTER);

        WebElement sportsButton = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
        sportsButton.click();
        WebElement readingButton = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]"));
        readingButton.click();
        WebElement musicButton = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
        musicButton.click();

        WebElement picturesInput = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
        picturesInput.sendKeys("C:\\Users\\User\\Pictures\\Saved Pictures\\animal_a54.jpg");

        Robot robot = new Robot();

        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }


        WebElement addressInput = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        addressInput.sendKeys("Boston");

        WebElement cityInput = driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
        cityInput.sendKeys("Haryana");
        cityInput.sendKeys(Keys.ENTER);

        WebElement cityButton = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
        cityButton.sendKeys("Karnal");
        cityButton.sendKeys(Keys.ENTER);

        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
        submitButton.click();





    }
}
