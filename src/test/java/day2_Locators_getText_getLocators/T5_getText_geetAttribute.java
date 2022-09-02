package day2_Locators_getText_getLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_geetAttribute {

    public static void main(String[] args) {

        //TC 5 : GETtEXT() AND GET Attribute() method practice
        //1-Open a Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        //3- Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));
        // Expected : Registration form
        String expectedHeaderText = "Registration form";
        String actualHeaderText   =  headerText.getText();// will return string

        if(actualHeaderText.equals((expectedHeaderText))){

            System.out.println("Header text verification PASSED!");
        }else{
            System.out.println("Header text verification FAILED!!!");

        }



    }


}
