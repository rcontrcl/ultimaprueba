package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.TestCaseModelPage;
import everis.pages.BeforeCasePage;
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

public class A_AadimosStepsenelBefoAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private TestCaseModelPage testCaseModelPage;
 	private BeforeCasePage beforeCasePage;
 	private TestSuiteModelPage testSuiteModelPage;
 	
    
    public A_AadimosStepsenelBefoAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        testCaseModelPage = new TestCaseModelPage(dependencies);
beforeCasePage = new BeforeCasePage(dependencies);
testSuiteModelPage = new TestSuiteModelPage(dependencies);

        
    }
    
    public void doA_AadimosStepsenelBefoAction() throws Exception {
      
      testSuiteModelPage.clickGetInTestCaseModel();
      Report.reportLog(dependencies, "GetInTestCaseModel action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testCaseModelPage.clickGetInBefore();
      Report.reportLog(dependencies, "GetInBefore action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      beforeCasePage.AddBoxFrontEndNavigate();
      Report.reportLog(dependencies, "AddBoxFrontEndNavigate action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      beforeCasePage.MoveBoxFrontEndNavigate();
      Report.reportLog(dependencies, "MoveBoxFrontEndNavigate action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      beforeCasePage.AddBoxStart();
      Report.reportLog(dependencies, "AddBoxStart action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      beforeCasePage.clickCursorBoxStart();
      Report.reportLog(dependencies, "CursorBoxStart action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      beforeCasePage.AddFlow();
      Report.reportLog(dependencies, "AddFlow action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      beforeCasePage.clickGoBack3();
      Report.reportLog(dependencies, "GoBack3 action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}