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

public class LogoutPage {
    private By GoToProfile = By.xpath("/html/body/div/div/header/nav/div/ul/li[3]/a");
private By SignOut = By.xpath("//button[contains(text(),'Sign Out')]");

    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public LogoutPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public LogoutPage clickGoToProfile(){
        dependencies.driver.findElement(GoToProfile).click();
        Report.reportLog(dependencies, "GoToProfile clicked", "INFO", 0);
        return this;
    }
    public LogoutPage clickSignOut(){
        dependencies.driver.findElement(SignOut).click();
        Report.reportLog(dependencies, "SignOut clicked", "INFO", 0);
        return this;
    }
    
    
}