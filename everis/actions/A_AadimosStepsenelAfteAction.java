package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.AfterCasePage;
import everis.pages.TestCaseModelPage;

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

public class A_AadimosStepsenelAfteAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private AfterCasePage afterCasePage;
 	private TestCaseModelPage testCaseModelPage;
 	
    
    public A_AadimosStepsenelAfteAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        afterCasePage = new AfterCasePage(dependencies);
testCaseModelPage = new TestCaseModelPage(dependencies);

        
    }
    
    public void doA_AadimosStepsenelAfteAction() throws Exception {
      
      testCaseModelPage.clickGetInAfter();
      Report.reportLog(dependencies, "GetInAfter action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      afterCasePage.AddBoxFrontEndNavigate2();
      Report.reportLog(dependencies, "AddBoxFrontEndNavigate2 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      afterCasePage.MoveBoxFrontEndNavigate2();
      Report.reportLog(dependencies, "MoveBoxFrontEndNavigate2 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      afterCasePage.AddBoxStart2();
      Report.reportLog(dependencies, "AddBoxStart2 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      afterCasePage.clickCursorBoxStart2();
      Report.reportLog(dependencies, "CursorBoxStart2 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      afterCasePage.AddFlow2();
      Report.reportLog(dependencies, "AddFlow2 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      afterCasePage.clickGoBack6();
      Report.reportLog(dependencies, "GoBack6 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      afterCasePage.clickGoBack5();
      Report.reportLog(dependencies, "GoBack5 action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}