package com.syntax.class23;

public class WebDriver {
    public void startBrowser() { // method
        System.out.println("Starting the browser");
    }

    public void openUrl(String url) { // method
        System.out.println("Opening "+url);
    }

    public void testLoginPage() {
        System.out.println("Checking if login page is visible ");
    }

    public void closeBrowser() {
        System.out.println("Closing the browser");
    }
}

class Chrome extends WebDriver { // overwriting
    @Override
    public void startBrowser() {
        System.out.println("Opening Google Chrome");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opening the URL " + url + " on Google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Google Chrome");
    }
}

class Firefox extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opening the URL " + url + " on Firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Firefox");
    }
}

class Safari extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Opening Safari");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opening the URL " + url + " on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Safari");
    }
}

class EI extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Opening EI");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opening the URL " + url + " on EI");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on EI");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the EI");
    }
}







