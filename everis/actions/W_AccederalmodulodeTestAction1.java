package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.ProjectPage;

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

public class W_AccederalmodulodeTestAction1{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private ProjectPage projectPage;
 	
    
    public W_AccederalmodulodeTestAction1(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        projectPage = new ProjectPage(dependencies);

        
    }
    
    public void doW_AccederalmodulodeTestAction1() throws Exception {
      
      projectPage.clickTestingModule1();
      Report.reportLog(dependencies, "TestingModule1 action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}