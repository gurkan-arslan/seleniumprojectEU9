package day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {

    public static void main(String[] args) throws InterruptedException {

        //1- Set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium Web driver
        //This is the line opening an empty browser
        WebDriver driver = new ChromeDriver();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get the title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get the current title after getting the google page
        String currentTitle = driver.getTitle();

        //get the title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //Get the current url using selenium
        String currentURL =  driver.getCurrentUrl();


    }


}
