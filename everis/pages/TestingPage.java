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

public class TestingPage {
    private By IntoTestingContext = By.id("I_000000");
private By GetInTestingContext = By.id("I_000000");
private By ImportScenariosIntoTestCases = By.xpath("//a[contains(text(),'Import Scenarios into Test Cases')]");
private By RunImportScenariosIntoTestCases = By.xpath("//a[@id='runButton']");
private By ExecutePlugIn1 = By.xpath("//span[contains(text(),'Execute plug-in')]");
private By ExportModel = By.xpath("//span[contains(text(),'Export project')]");
private By CloseExportModel = By.xpath("//button[contains(text(),'×')]");
private By EverisCADProject = By.xpath("//*[@id=\"composition\"]/div/ul/li/span/span[2]");
private By GetInTestSuiteModel = By.id("I_000001");
private By GenerateRun = By.xpath("//button[contains(text(),'Run...')]");
private By ContinueGenerateRun = By.xpath("//button[contains(text(),'Continue and run action')]");
private By ExecutePlugIn2 = By.xpath("//span[contains(text(),'Execute plug-in')]");
private By GenerateJAR = By.xpath("//a[contains(text(),'Test - Export Test Model to JAR')]");
private By GenerateGherkinCucumber = By.xpath("//option[contains(text(),'gherkinCucumber')]");
private By ShowResults = By.xpath("//a[contains(text(),'Show results...')]");
private By RunGenerate = By.xpath("//button[contains(text(),'Run...')]");
private By EjecutePlugIn = By.xpath("//span[contains(text(),'Execute plug-in')]");
private By DowloadProyect = By.xpath("//span[contains(text(),'at this URL')]");
private By EjecutePlugIn1 = By.xpath("//span[contains(text(),'Execute plug-in')]");
private By ExportModelJAR = By.xpath("/html/body/div[4]/div/div/div[1]/div[1]/ul/li[7]/a");

    private By AddBoxTestingContext_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxTestingContext = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[305]/div");
    private By MoveBoxTestingContext_Destination = By.xpath("");
    private By MoveBoxTestingContext = By.id("I_000000");
    private By AddBoxTestingContext_Destination1 = By.xpath("//*[@id='RaphaelSVG_82']");
    private By AddBoxTestingContext1 = By.xpath("//*[@id=\"/C/L/f\"]");
    private By MoveTestingContext_Destination = By.xpath("");
    private By MoveTestingContext = By.id("I_000000");
    private By AddBoxTestSuiteModel_Destination = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]");
    private By AddBoxTestSuiteModel = By.xpath("/html/body/div[3]/div[2]/div[1]/div/div[2]/ul[1]/li[312]/div");
    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public TestingPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public TestingPage clickIntoTestingContext(){
        Actions action = new Actions(dependencies.driver);
        action.doubleClick(dependencies.driver.findElement(IntoTestingContext)).perform();
        return this;
    }
    public TestingPage clickGetInTestingContext(){
        Actions action = new Actions(dependencies.driver);
        action.doubleClick(dependencies.driver.findElement(GetInTestingContext)).perform();
        return this;
    }
    public TestingPage clickImportScenariosIntoTestCases(){
        dependencies.driver.findElement(ImportScenariosIntoTestCases).click();
        Report.reportLog(dependencies, "ImportScenariosIntoTestCases clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickRunImportScenariosIntoTestCases(){
        dependencies.driver.findElement(RunImportScenariosIntoTestCases).click();
        Report.reportLog(dependencies, "RunImportScenariosIntoTestCases clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickExecutePlugIn1(){
        dependencies.driver.findElement(ExecutePlugIn1).click();
        Report.reportLog(dependencies, "ExecutePlugIn1 clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickExportModel(){
        dependencies.driver.findElement(ExportModel).click();
        Report.reportLog(dependencies, "ExportModel clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickCloseExportModel(){
        dependencies.driver.findElement(CloseExportModel).click();
        Report.reportLog(dependencies, "CloseExportModel clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickEverisCADProject(){
        Actions action = new Actions(dependencies.driver);
        action.contextClick(dependencies.driver.findElement(EverisCADProject)).perform();
        return this;
    }
    public TestingPage clickGetInTestSuiteModel(){
        Actions action = new Actions(dependencies.driver);
        action.doubleClick(dependencies.driver.findElement(GetInTestSuiteModel)).perform();
        return this;
    }
    public TestingPage clickGenerateRun(){
        dependencies.driver.findElement(GenerateRun).click();
        Report.reportLog(dependencies, "GenerateRun clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickContinueGenerateRun(){
        dependencies.driver.findElement(ContinueGenerateRun).click();
        Report.reportLog(dependencies, "ContinueGenerateRun clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickExecutePlugIn2(){
        dependencies.driver.findElement(ExecutePlugIn2).click();
        Report.reportLog(dependencies, "ExecutePlugIn2 clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickGenerateJAR(){
        dependencies.driver.findElement(GenerateJAR).click();
        Report.reportLog(dependencies, "GenerateJAR clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickGenerateGherkinCucumber(){
        dependencies.driver.findElement(GenerateGherkinCucumber).click();
        Report.reportLog(dependencies, "GenerateGherkinCucumber clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickShowResults(){
        dependencies.driver.findElement(ShowResults).click();
        Report.reportLog(dependencies, "ShowResults clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickRunGenerate(){
        dependencies.driver.findElement(RunGenerate).click();
        Report.reportLog(dependencies, "RunGenerate clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickEjecutePlugIn(){
        dependencies.driver.findElement(EjecutePlugIn).click();
        Report.reportLog(dependencies, "EjecutePlugIn clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickDowloadProyect(){
        dependencies.driver.findElement(DowloadProyect).click();
            
        return this;
    }
    public TestingPage clickEjecutePlugIn1(){
        dependencies.driver.findElement(EjecutePlugIn1).click();
        Report.reportLog(dependencies, "EjecutePlugIn1 clicked", "INFO", 0);
        return this;
    }
    public TestingPage clickExportModelJAR(){
        dependencies.driver.findElement(ExportModelJAR).click();
        Report.reportLog(dependencies, "ExportModelJAR clicked", "INFO", 0);
        return this;
    }
    
    public TestingPage AddBoxTestingContext() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxTestingContext), dependencies.driver.findElement(AddBoxTestingContext_Destination)).release().build().perform();
        return this;
    }
    public TestingPage MoveBoxTestingContext() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveBoxTestingContext), 200, 0).release().build().perform();
        return this;
    }
    public TestingPage AddBoxTestingContext1() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxTestingContext1), dependencies.driver.findElement(AddBoxTestingContext_Destination1)).release().build().perform();
        return this;
    }
    public TestingPage MoveTestingContext() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDropBy(dependencies.driver.findElement(MoveTestingContext), 0, 150).release().build().perform();
        return this;
    }
    public TestingPage AddBoxTestSuiteModel() {
        Actions action = new Actions(dependencies.driver);
        action.dragAndDrop(dependencies.driver.findElement(AddBoxTestSuiteModel), dependencies.driver.findElement(AddBoxTestSuiteModel_Destination)).release().build().perform();
        return this;
    }
    
}