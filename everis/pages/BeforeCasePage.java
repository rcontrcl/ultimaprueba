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

public class BeforeCasePage {
    private By GoBack3 = By.xpath("//i[contains(text(),'arrow_upward')]");
private By CursorBoxStart = By.id("I_000001");

    private By AddFlow_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div/div[4]");
    private By AddFlow = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[2]/div[3]/div/div[5]");
    private By AddBoxFrontEndNavigate_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxFrontEndNavigate = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[156]/div");
    private By MoveBoxFrontEndNavigate_Destination = By.xpath("");
    private By MoveBoxFrontEndNavigate = By.id("I_000000");
    private By AddBoxStart_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxStart = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[282]/div");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public BeforeCasePage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public BeforeCasePage clickGoBack3(){
        dependencies.driver.findElement(GoBack3).click();
        Report.reportLog(dependencies, "GoBack3 clicked", "INFO", 0);
        return this;
    }
    public BeforeCasePage clickCursorBoxStart(){
        Actions action = new Actions(dependencies.driver);
        action.moveToElement(dependencies.driver.findElement(CursorBoxStart)).perform();
        return this;
    }
    
    public BeforeCasePage AddFlow() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddFlow), dependencies.driver.findElement(AddFlow_Destination)).release().build().perform();
        return this;
    }
    public BeforeCasePage AddBoxFrontEndNavigate() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxFrontEndNavigate), dependencies.driver.findElement(AddBoxFrontEndNavigate_Destination)).release().build().perform();
        return this;
    }
    public BeforeCasePage MoveBoxFrontEndNavigate() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxFrontEndNavigate), 170, 0).release().build().perform();
        return this;
    }
    public BeforeCasePage AddBoxStart() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxStart), dependencies.driver.findElement(AddBoxStart_Destination)).release().build().perform();
        return this;
    }
    
}