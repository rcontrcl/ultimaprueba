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

public class A_GenerarlapruebamediantAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private TestingPage testingPage;
 	
    
    public A_GenerarlapruebamediantAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        testingPage = new TestingPage(dependencies);

        
    }
    
    public void doA_GenerarlapruebamediantAction() throws Exception {
      
      testingPage.clickExecutePlugIn1();
      Report.reportLog(dependencies, "ExecutePlugIn1 action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testingPage.clickImportScenariosIntoTestCases();
      Report.reportLog(dependencies, "ImportScenariosIntoTestCases action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testingPage.clickRunImportScenariosIntoTestCases();
      Report.reportLog(dependencies, "RunImportScenariosIntoTestCases action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}