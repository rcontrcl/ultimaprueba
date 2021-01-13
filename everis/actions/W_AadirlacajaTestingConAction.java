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

public class W_AadirlacajaTestingConAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private TestingPage testingPage;
 	
    
    public W_AadirlacajaTestingConAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        testingPage = new TestingPage(dependencies);

        
    }
    
    public void doW_AadirlacajaTestingConAction() throws Exception {
      testingPage.AddBoxTestingContext();
      Report.reportLog(dependencies, "AddBoxTestingContext action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
      testingPage.MoveBoxTestingContext();
      Report.reportLog(dependencies, "MoveBoxTestingContext action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}