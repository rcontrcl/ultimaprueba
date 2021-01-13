package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.TestingPage;
import everis.pages.TesstingPage;
import everis.pages.TestSuiteModelPage;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class T_GenerarelproyectoconMAction{
    private By CheckExportJARNotVisible = By.xpath("//span[contains(text(),'Export Test Model to JAR finished with success! (c')]");
    private By CheckRunExists = By.xpath("//button[contains(text(),'Run...')]");
    private By CheckRunClickable = By.xpath("//button[contains(text(),'Run...')]");
    private By CheckRunVisible = By.xpath("//button[contains(text(),'Run...')]");
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private TestingPage testingPage;
 	private TesstingPage tesstingPage;
 	private TestSuiteModelPage testSuiteModelPage;
 	
    
    public T_GenerarelproyectoconMAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        testingPage = new TestingPage(dependencies);
tesstingPage = new TesstingPage(dependencies);
testSuiteModelPage = new TestSuiteModelPage(dependencies);

        
    }
    public T_GenerarelproyectoconMAction CheckRunExists() {
        new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.presenceOfElementLocated(CheckRunExists));
      return this;
    }

    public T_GenerarelproyectoconMAction CheckRunClickable() {
        new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(CheckRunClickable));
      return this;
    }

    public T_GenerarelproyectoconMAction CheckRunVisible() {
      new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.visibilityOfElementLocated(CheckRunVisible));
      return this;
    }

    public T_GenerarelproyectoconMAction CheckExportJARNotVisible() {
        new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(CheckExportJARNotVisible));
      return this;
    }

    
    public void doT_GenerarelproyectoconMAction() throws Exception {
      
      testSuiteModelPage.clickGoback();
      Report.reportLog(dependencies, "Goback action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testingPage.clickEjecutePlugIn1();
      Report.reportLog(dependencies, "EjecutePlugIn1 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testingPage.clickExportModelJAR();
      Report.reportLog(dependencies, "ExportModelJAR action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      CheckRunExists();
      Report.reportLog(dependencies, "Condition CheckRunExists Exists action completed", "INFO", 20);
      Report.capScreen(dependencies);CheckRunClickable();
      Report.reportLog(dependencies, "Condition CheckRunClickable isClickable action completed", "INFO", 20);
      Report.capScreen(dependencies);CheckRunVisible();
      Report.reportLog(dependencies, "Condition CheckRunVisible isVisible action completed", "INFO", 20);
      Report.capScreen(dependencies);
      
      testingPage.clickRunGenerate();
      Report.reportLog(dependencies, "RunGenerate action completed", "INFO", 5000);
      Thread.sleep(5000);
      Report.capScreen(dependencies);
      CheckExportJARNotVisible();
      Report.reportLog(dependencies, "Condition CheckExportJARNotVisible isNotVisible action completed", "INFO", 20);
      Report.capScreen(dependencies);
      
      testingPage.clickEjecutePlugIn();
      Report.reportLog(dependencies, "EjecutePlugIn action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testingPage.clickShowResults();
      Report.reportLog(dependencies, "ShowResults action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testingPage.clickDowloadProyect();
      Report.reportLog(dependencies, "DowloadProyect action completed", "INFO", 10000);
      Thread.sleep(10000);
      Report.capScreen(dependencies);
      
      
      tesstingPage.clickCloseGenerate();
      Report.reportLog(dependencies, "CloseGenerate action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}