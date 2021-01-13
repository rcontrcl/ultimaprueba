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

public class A_ComprobarqueestamosenAction2{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    
    
    public A_ComprobarqueestamosenAction2(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        
        
    }
    public A_ComprobarqueestamosenAction2 CheckPageCAD() {
        Assert.assertTrue("Field CheckPageCAD not found in assertion", dependencies.driver.getCurrentUrl().equals("https://cad-alfa-thecide.caddev.everis.com/profile/login?redirect=%2F"));
          Report.reportLog(dependencies, "The field https://cad-alfa-thecide.caddev.everis.com/profile/login?redirect=%2F has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          
        return this;
    }
    
    
    public void doA_ComprobarqueestamosenAction2() throws Exception {
      CheckPageCAD();
      Report.reportLog(dependencies, "CheckPageCAD action completed", "INFO", 0);
      
      
    
    }
}