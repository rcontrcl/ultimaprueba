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

public class W_AccederalmodulodeTestAction{
    private By TestingModuleIsClick1 = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div[3]/div/div/div/div[1]/a/div/div[2]/span");
    private By NameProyect1 = By.id("nmProject");

    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private ProjectPage projectPage;
 	
    
    public W_AccederalmodulodeTestAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        projectPage = new ProjectPage(dependencies);

        
    }
    public W_AccederalmodulodeTestAction TestingModuleIsClick1() {
        new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(TestingModuleIsClick1));
      return this;
    }

    public W_AccederalmodulodeTestAction CheckNameProyect1() {
        Assert.assertTrue("Field NameProyect1 not found in assertion", dependencies.driver.findElement(NameProyect1).getText().contains("createmodel_master"));
          Report.reportLog(dependencies, "The field createmodel_master has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          
        return this;
    }
    
    
    public void doW_AccederalmodulodeTestAction() throws Exception {
      CheckNameProyect1();
      Report.reportLog(dependencies, "CheckNameProyect1 action completed", "INFO", 5000);
      Thread.sleep(5000);
      
      TestingModuleIsClick1();
      Report.reportLog(dependencies, "Condition TestingModuleIsClick1 isClickable action completed", "INFO", 20);
      Report.capScreen(dependencies);
      
      projectPage.clickTestingModule();
      Report.reportLog(dependencies, "TestingModule action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}