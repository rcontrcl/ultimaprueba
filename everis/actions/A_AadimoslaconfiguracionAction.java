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

public class A_AadimoslaconfiguracionAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private TestingContextPage testingContextPage;
 	private TestingPage testingPage;
 	
    
    public A_AadimoslaconfiguracionAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        testingContextPage = new TestingContextPage(dependencies);
testingPage = new TestingPage(dependencies);

        
    }
    
    public void doA_AadimoslaconfiguracionAction() throws Exception {
      
      testingPage.clickGetInTestingContext();
      Report.reportLog(dependencies, "GetInTestingContext action completed", "INFO", 5000);
      Thread.sleep(5000);
      Report.capScreen(dependencies);
      
      testingContextPage.AddBoxExecuteContext1();
      Report.reportLog(dependencies, "AddBoxExecuteContext1 action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
      testingContextPage.AddBoxFrontEndContext1();
      Report.reportLog(dependencies, "AddBoxFrontEndContext1 action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
      
      testingContextPage.clickSelectFrontEndContext();
      Report.reportLog(dependencies, "SelectFrontEndContext action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
      
      testingContextPage.setvalueUri("https://cad-alfa-thecide.caddev.everis.com/profile/login?redirect=%2F");
      Report.capScreen(dependencies);
      testingContextPage.clickAddUri();
      Report.reportLog(dependencies, "AddUri action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
      
      testingContextPage.clickGoBack2();
      Report.reportLog(dependencies, "GoBack2 action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}