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

public class TestCaseModelPage {
    private By GetInBefore = By.id("I_000001");
private By GetInExecute = By.id("I_000002");
private By GetInAfter = By.id("I_000000");

    private By AddBoxTestCaseModel_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxTestCaseModel = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[301]/div");
    private By MoveTestCaseModel_Destination = By.xpath("");
    private By MoveTestCaseModel = By.id("I_000000");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public TestCaseModelPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public TestCaseModelPage clickGetInBefore(){
        Actions action = new Actions(dependencies.driver);
        action.doubleClick(dependencies.driver.findElement(GetInBefore)).perform();
        return this;
    }
    public TestCaseModelPage clickGetInExecute(){
        Actions action = new Actions(dependencies.driver);
        action.doubleClick(dependencies.driver.findElement(GetInExecute)).perform();
        return this;
    }
    public TestCaseModelPage clickGetInAfter(){
        Actions action = new Actions(dependencies.driver);
        action.doubleClick(dependencies.driver.findElement(GetInAfter)).perform();
        return this;
    }
    
    public TestCaseModelPage AddBoxTestCaseModel() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxTestCaseModel), dependencies.driver.findElement(AddBoxTestCaseModel_Destination)).release().build().perform();
        return this;
    }
    public TestCaseModelPage MoveTestCaseModel() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveTestCaseModel), 0, 170).release().build().perform();
        return this;
    }
    
}