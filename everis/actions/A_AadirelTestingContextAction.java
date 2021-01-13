package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.TestingContextPage;
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

public class A_AadirelTestingContextAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private TestingContextPage testingContextPage;
 	private TestingPage testingPage;
 	
    
    public A_AadirelTestingContextAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        testingContextPage = new TestingContextPage(dependencies);
testingPage = new TestingPage(dependencies);

        
    }
    
    public void doA_AadirelTestingContextAction() throws Exception {
      testingPage.AddBoxTestingContext1();
      Report.reportLog(dependencies, "AddBoxTestingContext1 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      testingPage.MoveTestingContext();
      Report.reportLog(dependencies, "MoveTestingContext action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testingPage.clickIntoTestingContext();
      Report.reportLog(dependencies, "IntoTestingContext action completed", "INFO", 5000);
      Thread.sleep(5000);
      Report.capScreen(dependencies);
      
      testingContextPage.AddBoxExecuteContext();
      Report.reportLog(dependencies, "AddBoxExecuteContext action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      testingContextPage.MoveExecuteContext();
      Report.reportLog(dependencies, "MoveExecuteContext action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      testingContextPage.AddBoxFrontEndContext();
      Report.reportLog(dependencies, "AddBoxFrontEndContext action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testingContextPage.clickGoBack1();
      Report.reportLog(dependencies, "GoBack1 action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}