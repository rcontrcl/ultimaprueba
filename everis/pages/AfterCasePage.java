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

public class AfterCasePage {
    private By CursorBoxStart2 = By.id("I_000001");
private By GoBack5 = By.xpath("//i[contains(text(),'arrow_upward')]");
private By GoBack6 = By.xpath("//i[contains(text(),'arrow_upward')]");

    private By AddFlow_Destination2 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div/div[4]");
    private By AddFlow2 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[3]/div/div[5]");
    private By AddBoxFrontEndNavigate_Destination2 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxFrontEndNavigate2 = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[156]/div");
    private By MoveBoxFrontEndNavigate_Destination2 = By.xpath("");
    private By MoveBoxFrontEndNavigate2 = By.id("I_000000");
    private By AddBoxStart_Destination2 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxStart2 = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[282]/div");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public AfterCasePage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public AfterCasePage clickCursorBoxStart2(){
        Actions action = new Actions(dependencies.driver);
        action.moveToElement(dependencies.driver.findElement(CursorBoxStart2)).perform();
        return this;
    }
    public AfterCasePage clickGoBack5(){
        dependencies.driver.findElement(GoBack5).click();
        Report.reportLog(dependencies, "GoBack5 clicked", "INFO", 0);
        return this;
    }
    public AfterCasePage clickGoBack6(){
        dependencies.driver.findElement(GoBack6).click();
        Report.reportLog(dependencies, "GoBack6 clicked", "INFO", 0);
        return this;
    }
    
    public AfterCasePage AddFlow2() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddFlow2), dependencies.driver.findElement(AddFlow_Destination2)).release().build().perform();
        return this;
    }
    public AfterCasePage AddBoxFrontEndNavigate2() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndNavigate2), dependencies.driver.findElement(AddBoxFrontEndNavigate_Destination2)).release().build().perform();
        return this;
    }
    public AfterCasePage MoveBoxFrontEndNavigate2() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxFrontEndNavigate2), 170, 0).release().build().perform();
        return this;
    }
    public AfterCasePage AddBoxStart2() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxStart2), dependencies.driver.findElement(AddBoxStart_Destination2)).release().build().perform();
        return this;
    }
    
}