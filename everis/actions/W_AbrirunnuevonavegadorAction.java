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

public class W_AbrirunnuevonavegadorAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    
    
    public W_AbrirunnuevonavegadorAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        
        
    }
    public W_AbrirunnuevonavegadorAction NewBrowserGmail() throws Exception {
          dependencies.setUpEnvironment("Gmail");
          return this;
        }
        
        public W_AbrirunnuevonavegadorAction WebGmail () {
        dependencies.driver.get("https://www.google.com/intl/es/gmail/about/#");
        Report.reportLog(dependencies, "Navigated to " + "https://www.google.com/intl/es/gmail/about/#", "INFO", 0);
        return this;
    }

	
    public void doW_AbrirunnuevonavegadorAction() throws Exception {
      NewBrowserGmail();
      Report.reportLog(dependencies, "NewBrowserGmail action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      WebGmail();
      Report.reportLog(dependencies, "WebGmail action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}