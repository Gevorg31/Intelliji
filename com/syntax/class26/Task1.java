package com.syntax.class26;

 public class Task1 {
     //Create a WebDriver Interface that will have the following unimplemented behaviour:
     //openBrowser(), closeBrowser(), maximizeWindow(), findElement().
     //Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 }

    interface WebDriver {
    void openBrowser();
    void maximizeWindow();
    void findElement();
    void closeBrowser();
}
class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening the Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window of the Chrome Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element in Chrome Browser ");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Chrome Browser");
    }
}
class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening the FireFox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window of the FireFox Browser");
    }

    @Override
    public void findElement() {
        System.out.println("Finding element in FireFox Browser ");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the FireFox Browser");
    }
}
class DriverTest {
    public static void main(String[] args) {
        WebDriver[] drivers = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver driver:drivers) {
            driver.openBrowser();
            driver.maximizeWindow();
            driver.findElement();
            driver.closeBrowser();
        }
    }
}

