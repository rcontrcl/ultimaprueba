package everis.pages;
    
import everis.SharedDependencies;
import everis.Utils;
import everis.report.Report;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {
    private By UserName = By.id("id_username");
private By Password = By.xpath("//input[@id='id_password']");
private By SingIn1 = By.id("id_signin");

    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public LoginPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public LoginPage setUserName(String value){
        dependencies.driver.findElement(UserName).clear();
        dependencies.driver.findElement(UserName).sendKeys(value);
        Report.reportLog(dependencies, "Typed jperepei in UserName", "INFO", 0);
        return this;
    }
    public LoginPage setPassword(String value){
        dependencies.driver.findElement(Password).clear();
        dependencies.driver.findElement(Password).sendKeys(value);
        Report.reportLog(dependencies, "Typed Jp01102019 in Password", "INFO", 0);
        return this;
    }
    public LoginPage clickSingIn1(){
        dependencies.driver.findElement(SingIn1).click();
        Report.reportLog(dependencies, "SingIn1 clicked", "INFO", 0);
        return this;
    }
    
    
}