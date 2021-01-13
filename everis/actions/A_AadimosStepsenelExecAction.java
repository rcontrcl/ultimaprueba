package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.ExecuteCasePage;
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

public class A_AadimosStepsenelExecAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private ExecuteCasePage executeCasePage;
 	private TestCaseModelPage testCaseModelPage;
 	
    
    public A_AadimosStepsenelExecAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        executeCasePage = new ExecuteCasePage(dependencies);
testCaseModelPage = new TestCaseModelPage(dependencies);

        
    }
    
    public void doA_AadimosStepsenelExecAction() throws Exception {
      
      testCaseModelPage.clickGetInExecute();
      Report.reportLog(dependencies, "GetInExecute action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      executeCasePage.AddBoxFrontEndNavigate1();
      Report.reportLog(dependencies, "AddBoxFrontEndNavigate1 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      executeCasePage.MoveBoxFrontEndNavigate1();
      Report.reportLog(dependencies, "MoveBoxFrontEndNavigate1 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      executeCasePage.AddBoxStart1();
      Report.reportLog(dependencies, "AddBoxStart1 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      executeCasePage.clickCursorBoxStart1();
      Report.reportLog(dependencies, "CursorBoxStart1 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      executeCasePage.AddFlow1();
      Report.reportLog(dependencies, "AddFlow1 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      executeCasePage.clickGoBack4();
      Report.reportLog(dependencies, "GoBack4 action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}