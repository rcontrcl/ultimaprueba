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

public class ExecuteCasePage {
    private By CursorBoxStart1 = By.id("I_000001");
private By GoBack4 = By.xpath("//i[contains(text(),'arrow_upward')]");

    private By AddBoxFrontEndNavigate_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxFrontEndNavigate1 = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[156]/div");
    private By AddFlow_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div/div[4]");
    private By AddFlow1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[3]/div/div[5]");
    private By MoveBoxFrontEndNavigate_Destination1 = By.xpath("");
    private By MoveBoxFrontEndNavigate1 = By.id("I_000000");
    private By AddBoxStart_Destination1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxStart1 = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[282]/div");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public ExecuteCasePage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public ExecuteCasePage clickCursorBoxStart1(){
        Actions action = new Actions(dependencies.driver);
        action.moveToElement(dependencies.driver.findElement(CursorBoxStart1)).perform();
        return this;
    }
    public ExecuteCasePage clickGoBack4(){
        dependencies.driver.findElement(GoBack4).click();
        Report.reportLog(dependencies, "GoBack4 clicked", "INFO", 0);
        return this;
    }
    
    public ExecuteCasePage AddBoxFrontEndNavigate1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndNavigate1), dependencies.driver.findElement(AddBoxFrontEndNavigate_Destination1)).release().build().perform();
        return this;
    }
    public ExecuteCasePage AddFlow1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddFlow1), dependencies.driver.findElement(AddFlow_Destination1)).release().build().perform();
        return this;
    }
    public ExecuteCasePage MoveBoxFrontEndNavigate1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxFrontEndNavigate1), 170, 0).release().build().perform();
        return this;
    }
    public ExecuteCasePage AddBoxStart1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxStart1), dependencies.driver.findElement(AddBoxStart_Destination1)).release().build().perform();
        return this;
    }
    
}