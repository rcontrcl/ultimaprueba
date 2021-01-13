package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.GmailPage;

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

public class A_AbrirlapestaaparareaAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private GmailPage gmailPage;
 	
    
    public A_AbrirlapestaaparareaAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        gmailPage = new GmailPage(dependencies);

        
    }
    public A_AbrirlapestaaparareaAction ChangeWindowGmail() throws Exception {
      for (String winHandle : dependencies.driver.getWindowHandles()) {
        if ("Gmail".equals(dependencies.driver.switchTo().window(winHandle).getTitle())) {
          dependencies.driver.switchTo().window(winHandle);
          return this;
        }
      }
      throw new Exception("Error: Window/Tab Gmail not found");
    }

    
    public void doA_AbrirlapestaaparareaAction() throws Exception {
      
      gmailPage.clickSingIn();
      Report.reportLog(dependencies, "SingIn action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      ChangeWindowGmail();
      Report.reportLog(dependencies, "ChangeWindowGmail action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}