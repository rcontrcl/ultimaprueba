package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.TestingPage;

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

public class A_GenerarelproyectoconCAction{
    private By ContainsSuccess = By.xpath("//span[contains(text(),'Export Test Model to JAR finished with success! (c')]");
private By VisibleExportJarOK = By.xpath("//span[contains(text(),'Export Test Model to JAR finished with success! (c')]");
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private TestingPage testingPage;
 	
    
    public A_GenerarelproyectoconCAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        testingPage = new TestingPage(dependencies);

        
    }
    public A_GenerarelproyectoconCAction VisibleExportJarOK() {
      new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.visibilityOfElementLocated(VisibleExportJarOK));
      return this;
    }

    public A_GenerarelproyectoconCAction GenerateJarOK() {
        Assert.assertTrue("Field ContainsSuccess not found in assertion", dependencies.driver.findElement(ContainsSuccess).getText().contains("success"));
          Report.reportLog(dependencies, "The field success has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          
        return this;
    }
    
    
    public void doA_GenerarelproyectoconCAction() throws Exception {
      
      testingPage.clickExecutePlugIn2();
      Report.reportLog(dependencies, "ExecutePlugIn2 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testingPage.clickGenerateJAR();
      Report.reportLog(dependencies, "GenerateJAR action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testingPage.clickGenerateGherkinCucumber();
      Report.reportLog(dependencies, "GenerateGherkinCucumber action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testingPage.clickGenerateRun();
      Report.reportLog(dependencies, "GenerateRun action completed", "INFO", 3000);
      Thread.sleep(3000);
      Report.capScreen(dependencies);
      
      
      testingPage.clickContinueGenerateRun();
      Report.reportLog(dependencies, "ContinueGenerateRun action completed", "INFO", 2000);
      Thread.sleep(2000);
      Report.capScreen(dependencies);
      VisibleExportJarOK();
      Report.reportLog(dependencies, "Condition VisibleExportJarOK isVisible action completed", "INFO", 20);
      Report.capScreen(dependencies);
      GenerateJarOK();
      Report.reportLog(dependencies, "GenerateJarOK action completed", "INFO", 0);
      
      
    
    }
}