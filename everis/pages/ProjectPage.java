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

public class ProjectPage {
    private By RequerimentsModule = By.xpath("//*[@id=\"card-nodeRequirements\"]/div/div");
private By TestingModule = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div[3]/div/div/div/div[1]/a/div/div[1]/img");
private By TestingModule1 = By.xpath("//*[@id=\"card-nodeTesting\"]/div/div");

    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public ProjectPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public ProjectPage clickRequerimentsModule(){
        Actions action = new Actions(dependencies.driver);
        action.doubleClick(dependencies.driver.findElement(RequerimentsModule)).perform();
        return this;
    }
    public ProjectPage clickTestingModule(){
        Actions action = new Actions(dependencies.driver);
        action.doubleClick(dependencies.driver.findElement(TestingModule)).perform();
        return this;
    }
    public ProjectPage clickTestingModule1(){
        Actions action = new Actions(dependencies.driver);
        action.doubleClick(dependencies.driver.findElement(TestingModule1)).perform();
        return this;
    }
    
    
}