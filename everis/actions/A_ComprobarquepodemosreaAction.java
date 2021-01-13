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

public class A_ComprobarquepodemosreaAction{
    private By ButtonSiguiente = By.xpath("//span[contains(text(),'Siguiente')]");

    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    
    
    public A_ComprobarquepodemosreaAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        
        
    }
    public A_ComprobarquepodemosreaAction CheckButton() {
        Assert.assertTrue("Field ButtonSiguiente not found in assertion", dependencies.driver.findElement(ButtonSiguiente).getText().contains("Siguiente"));
          Report.reportLog(dependencies, "The field Siguiente has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          
        return this;
    }
    
    
    public void doA_ComprobarquepodemosreaAction() throws Exception {
      CheckButton();
      Report.reportLog(dependencies, "CheckButton action completed", "INFO", 0);
      
      
    
    }
}