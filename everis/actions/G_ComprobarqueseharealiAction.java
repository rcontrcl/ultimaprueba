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

public class G_ComprobarqueseharealiAction{
    private By NameProfile = By.xpath("//strong[contains(text(),'jperepei')]");

    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    
    
    public G_ComprobarqueseharealiAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        
        
    }
    public G_ComprobarqueseharealiAction CheckProfile() {
        Assert.assertTrue("Field NameProfile not found in assertion", "jperepei".equals(dependencies.driver.findElement(NameProfile).getText()));
          Report.reportLog(dependencies, "The field jperepei has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          
        return this;
    }
    
    
    public void doG_ComprobarqueseharealiAction() throws Exception {
      CheckProfile();
      Report.reportLog(dependencies, "CheckProfile action completed", "INFO", 0);
      
      
    
    }
}