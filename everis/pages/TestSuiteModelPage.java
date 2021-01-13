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

public class TestSuiteModelPage {
    private By GetInTestCaseModel = By.id("I_000000");
private By GetInBeforeEach = By.id("I_000001");
private By Goback = By.xpath("//i[contains(text(),'arrow_upward')]");

    private By AddBoxBeforeEach_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxBeforeEach = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[40]/div");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public TestSuiteModelPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public TestSuiteModelPage clickGetInTestCaseModel(){
        Actions action = new Actions(dependencies.driver);
        action.doubleClick(dependencies.driver.findElement(GetInTestCaseModel)).perform();
        return this;
    }
    public TestSuiteModelPage clickGetInBeforeEach(){
        Actions action = new Actions(dependencies.driver);
        action.doubleClick(dependencies.driver.findElement(GetInBeforeEach)).perform();
        return this;
    }
    public TestSuiteModelPage clickGoback(){
        dependencies.driver.findElement(Goback).click();
        Report.reportLog(dependencies, "Goback clicked", "INFO", 0);
        return this;
    }
    
    public TestSuiteModelPage AddBoxBeforeEach() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxBeforeEach), dependencies.driver.findElement(AddBoxBeforeEach_Destination)).release().build().perform();
        return this;
    }
    
}