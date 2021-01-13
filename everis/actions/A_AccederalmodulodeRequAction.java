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

public class A_AccederalmodulodeRequAction{
    private By TestingModuleIsClick = By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[1]/div[3]/div/div/div/div[1]/a/div/div[2]/span");
    private By NameProyect = By.id("nmProject");

    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private ProjectPage projectPage;
 	
    
    public A_AccederalmodulodeRequAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        projectPage = new ProjectPage(dependencies);

        
    }
    public A_AccederalmodulodeRequAction TestingModuleIsClick() {
        new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.elementToBeClickable(TestingModuleIsClick));
      return this;
    }

    public A_AccederalmodulodeRequAction CheckNameProyect() {
        Assert.assertTrue("Field NameProyect not found in assertion", dependencies.driver.findElement(NameProyect).getText().contains("importfeature_master"));
          Report.reportLog(dependencies, "The field importfeature_master has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          
        return this;
    }
    
    
    public void doA_AccederalmodulodeRequAction() throws Exception {
      CheckNameProyect();
      Report.reportLog(dependencies, "CheckNameProyect action completed", "INFO", 5000);
      Thread.sleep(5000);
      
      TestingModuleIsClick();
      Report.reportLog(dependencies, "Condition TestingModuleIsClick isClickable action completed", "INFO", 20);
      Report.capScreen(dependencies);
      
      projectPage.clickRequerimentsModule();
      Report.reportLog(dependencies, "RequerimentsModule action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}