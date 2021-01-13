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

public class DeleteProyectPage {
    private By MenuProyects = By.xpath("/html/body/div/div/aside/section/ul/li[4]/a");

    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public DeleteProyectPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public DeleteProyectPage clickMenuProyects(){
        dependencies.driver.findElement(MenuProyects).click();
        Report.reportLog(dependencies, "MenuProyects clicked", "INFO", 0);
        return this;
    }
    
    
}