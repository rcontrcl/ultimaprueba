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

public class RequerimentsPage {
    private By GoBack = By.xpath("//i[contains(text(),'arrow_upward')]");
private By ImportGherkinFile = By.xpath("//a[contains(text(),'Import Gherkin File ')]");
private By RunImport = By.xpath("//a[@id='runButton']");
private By ExecutePlugIn = By.xpath("//span[contains(text(),'Execute plug-in')]");

    private By MoveBoxHelp_Destination = By.xpath("");
    private By MoveBoxHelp = By.id("I_000000");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public RequerimentsPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public RequerimentsPage clickGoBack(){
        dependencies.driver.findElement(GoBack).click();
        Report.reportLog(dependencies, "GoBack clicked", "INFO", 0);
        return this;
    }
    public RequerimentsPage clickImportGherkinFile(){
        dependencies.driver.findElement(ImportGherkinFile).click();
        Report.reportLog(dependencies, "ImportGherkinFile clicked", "INFO", 0);
        return this;
    }
    public RequerimentsPage clickRunImport(){
        dependencies.driver.findElement(RunImport).click();
        Report.reportLog(dependencies, "RunImport clicked", "INFO", 0);
        return this;
    }
    public RequerimentsPage clickExecutePlugIn(){
        dependencies.driver.findElement(ExecutePlugIn).click();
        Report.reportLog(dependencies, "ExecutePlugIn clicked", "INFO", 0);
        return this;
    }
    
    public RequerimentsPage MoveBoxHelp() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxHelp), 0, 150).release().build().perform();
        return this;
    }
    
}