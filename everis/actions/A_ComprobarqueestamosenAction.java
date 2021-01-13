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

public class A_ComprobarqueestamosenAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    
    
    public A_ComprobarqueestamosenAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        
        
    }
    public A_ComprobarqueestamosenAction WebJIRAITO() {
        Assert.assertTrue("Field WebJIRAITO not found in assertion", dependencies.driver.getCurrentUrl().equals("https://steps.everis.com/jiraito/login.jsp?os_destination=%2Fsecure%2FRapidBoard.jspa%3FrapidView%3D1201%26view%3Ddetail%26selectedIssue%3DSUSICADS-23"));
          Report.reportLog(dependencies, "The field https://steps.everis.com/jiraito/login.jsp?os_destination=%2Fsecure%2FRapidBoard.jspa%3FrapidView%3D1201%26view%3Ddetail%26selectedIssue%3DSUSICADS-23 has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          
        return this;
    }
    
    
    public void doA_ComprobarqueestamosenAction() throws Exception {
      WebJIRAITO();
      Report.reportLog(dependencies, "WebJIRAITO action completed", "INFO", 0);
      
      
    
    }
}