package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;



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

public class W_VolveralapestaadeGmAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    
    
    public W_VolveralapestaadeGmAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        
        
    }
    public W_VolveralapestaadeGmAction ChangeGmail() {
      dependencies.driver.switchTo().window(dependencies.handler);
      dependencies.driver.switchTo().defaultContent();
      return this;
    }

    
    public void doW_VolveralapestaadeGmAction() throws Exception {
      ChangeGmail();
      Report.reportLog(dependencies, "ChangeGmail action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}