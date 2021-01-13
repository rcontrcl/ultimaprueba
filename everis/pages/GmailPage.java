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

public class GmailPage {
    private By SingIn = By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a");

    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public GmailPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public GmailPage clickSingIn(){
        dependencies.driver.findElement(SingIn).click();
        Report.reportLog(dependencies, "SingIn clicked", "INFO", 0);
        return this;
    }
    
    
}