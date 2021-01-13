package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.BeforeEachPage;
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

public class A_AadirlosStepsAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private BeforeEachPage beforeEachPage;
 	private TestSuiteModelPage testSuiteModelPage;
 	
    
    public A_AadirlosStepsAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        beforeEachPage = new BeforeEachPage(dependencies);
testSuiteModelPage = new TestSuiteModelPage(dependencies);

        
    }
    
    public void doA_AadirlosStepsAction() throws Exception {
      
      testSuiteModelPage.clickGetInBeforeEach();
      Report.reportLog(dependencies, "GetInBeforeEach action completed", "INFO", 2000);
      Thread.sleep(2000);
      Report.capScreen(dependencies);
      
      beforeEachPage.AddBoxFrontEndNavigate3();
      Report.reportLog(dependencies, "AddBoxFrontEndNavigate3 action completed", "INFO", 2000);
      Thread.sleep(2000);
      Report.capScreen(dependencies);
      
      beforeEachPage.MoveBoxFrontEndNavigate3();
      Report.reportLog(dependencies, "MoveBoxFrontEndNavigate3 action completed", "INFO", 2000);
      Thread.sleep(2000);
      Report.capScreen(dependencies);
      
      beforeEachPage.AddBoxStart3();
      Report.reportLog(dependencies, "AddBoxStart3 action completed", "INFO", 2000);
      Thread.sleep(2000);
      Report.capScreen(dependencies);
      
      
      beforeEachPage.clickCursorBoxStart3();
      Report.reportLog(dependencies, "CursorBoxStart3 action completed", "INFO", 2000);
      Thread.sleep(2000);
      Report.capScreen(dependencies);
      
      beforeEachPage.AddFlow3();
      Report.reportLog(dependencies, "AddFlow3 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      beforeEachPage.clickGoBack7();
      Report.reportLog(dependencies, "GoBack7 action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}