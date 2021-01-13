package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.TestCaseModelPage;
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

public class W_AadimosunTestCaseAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private TestCaseModelPage testCaseModelPage;
 	private TestingPage testingPage;
 	
    
    public W_AadimosunTestCaseAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        testCaseModelPage = new TestCaseModelPage(dependencies);
testingPage = new TestingPage(dependencies);

        
    }
    
    public void doW_AadimosunTestCaseAction() throws Exception {
      
      testingPage.clickGetInTestSuiteModel();
      Report.reportLog(dependencies, "GetInTestSuiteModel action completed", "INFO", 2000);
      Thread.sleep(2000);
      Report.capScreen(dependencies);
      
      testCaseModelPage.AddBoxTestCaseModel();
      Report.reportLog(dependencies, "AddBoxTestCaseModel action completed", "INFO", 2000);
      Thread.sleep(2000);
      Report.capScreen(dependencies);
      
      testCaseModelPage.MoveTestCaseModel();
      Report.reportLog(dependencies, "MoveTestCaseModel action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}