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

public class TesstingPage {
    private By CloseGenerate = By.xpath("//a[contains(text(),'Close')]");

    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public TesstingPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public TesstingPage clickCloseGenerate(){
        dependencies.driver.findElement(CloseGenerate).click();
        Report.reportLog(dependencies, "CloseGenerate clicked", "INFO", 0);
        return this;
    }
    
    
}