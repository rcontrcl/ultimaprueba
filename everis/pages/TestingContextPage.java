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

public class TestingContextPage {
    private By GoBack1 = By.xpath("//i[contains(text(),'arrow_upward')]");
private By valueUri = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div/ul/li[4]/div/ul/li[5]/div/div[2]/input");
private By AddUri = By.id("I_000001");
private By SelectFrontEndContext = By.id("I_000001");
private By GoBack2 = By.xpath("//i[contains(text(),'arrow_upward')]");

    private By AddBoxFrontEndContext_Destination = By.xpath("//*[@id='RaphaelSVG_82']");
    private By AddBoxFrontEndContext = By.xpath("//*[@id=\"/C/L/WJ\"]");
    private By AddBoxExecuteContext_Destination = By.xpath("//*[@id='RaphaelSVG_82']");
    private By AddBoxExecuteContext = By.xpath("//*[@id=\"/C/L/jD\"]");
    private By MoveExecuteContext_Destination = By.xpath("");
    private By MoveExecuteContext = By.id("I_000000");
    private By AddBoxExecuteContext_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxExecuteContext1 = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[128]/div");
    private By AddBoxFrontEndContext_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxFrontEndContext1 = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[153]/div");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public TestingContextPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public TestingContextPage clickGoBack1(){
        dependencies.driver.findElement(GoBack1).click();
        Report.reportLog(dependencies, "GoBack1 clicked", "INFO", 0);
        return this;
    }
    public TestingContextPage setvalueUri(String value){
        dependencies.driver.findElement(valueUri).clear();
        dependencies.driver.findElement(valueUri).sendKeys(value);
        Report.reportLog(dependencies, "Typed https://cad-alfa-thecide.caddev.everis.com/profile/login?redirect=%2F in valueUri", "INFO", 0);
        return this;
    }
    public TestingContextPage clickAddUri(){
        dependencies.driver.findElement(AddUri).click();
        Report.reportLog(dependencies, "AddUri clicked", "INFO", 0);
        return this;
    }
    public TestingContextPage clickSelectFrontEndContext(){
        dependencies.driver.findElement(SelectFrontEndContext).click();
        Report.reportLog(dependencies, "SelectFrontEndContext clicked", "INFO", 0);
        return this;
    }
    public TestingContextPage clickGoBack2(){
        dependencies.driver.findElement(GoBack2).click();
        Report.reportLog(dependencies, "GoBack2 clicked", "INFO", 0);
        return this;
    }
    
    public TestingContextPage AddBoxFrontEndContext() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndContext), dependencies.driver.findElement(AddBoxFrontEndContext_Destination)).release().build().perform();
        return this;
    }
    public TestingContextPage AddBoxExecuteContext() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxExecuteContext), dependencies.driver.findElement(AddBoxExecuteContext_Destination)).release().build().perform();
        return this;
    }
    public TestingContextPage MoveExecuteContext() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveExecuteContext), 150, 0).release().build().perform();
        return this;
    }
    public TestingContextPage AddBoxExecuteContext1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxExecuteContext1), dependencies.driver.findElement(AddBoxExecuteContext_Destination1)).release().build().perform();
        return this;
    }
    public TestingContextPage AddBoxFrontEndContext1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndContext1), dependencies.driver.findElement(AddBoxFrontEndContext_Destination1)).release().build().perform();
        return this;
    }
    
}