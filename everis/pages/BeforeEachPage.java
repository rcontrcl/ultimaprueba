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

public class BeforeEachPage {
    private By CursorBoxStart3 = By.id("I_000001");
private By GoBack7 = By.xpath("//i[contains(text(),'arrow_upward')]");

    private By AddBoxStart_Destination3 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxStart3 = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[282]/div");
    private By MoveBoxFrontEndNavigate_Destination3 = By.xpath("");
    private By MoveBoxFrontEndNavigate3 = By.id("I_000000");
    private By AddBoxFrontEndNavigate_Destination3 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxFrontEndNavigate3 = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[156]/div");
    private By AddFlow_Destination3 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div/div[4]");
    private By AddFlow3 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[3]/div/div[5]");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public BeforeEachPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public BeforeEachPage clickCursorBoxStart3(){
        Actions action = new Actions(dependencies.driver);
        action.moveToElement(dependencies.driver.findElement(CursorBoxStart3)).perform();
        return this;
    }
    public BeforeEachPage clickGoBack7(){
        dependencies.driver.findElement(GoBack7).click();
        Report.reportLog(dependencies, "GoBack7 clicked", "INFO", 0);
        return this;
    }
    
    public BeforeEachPage AddBoxStart3() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxStart3), dependencies.driver.findElement(AddBoxStart_Destination3)).release().build().perform();
        return this;
    }
    public BeforeEachPage MoveBoxFrontEndNavigate3() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxFrontEndNavigate3), 170, 0).release().build().perform();
        return this;
    }
    public BeforeEachPage AddBoxFrontEndNavigate3() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndNavigate3), dependencies.driver.findElement(AddBoxFrontEndNavigate_Destination3)).release().build().perform();
        return this;
    }
    public BeforeEachPage AddFlow3() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddFlow3), dependencies.driver.findElement(AddFlow_Destination3)).release().build().perform();
        return this;
    }
    
}