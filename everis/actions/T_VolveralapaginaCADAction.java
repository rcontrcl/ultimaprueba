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

public class T_VolveralapaginaCADAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    
    
    public T_VolveralapaginaCADAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        
        
    }
    public T_VolveralapaginaCADAction ChangeCAD() throws Exception {
          dependencies.setUpEnvironment("MAIN_CONTEXT");
          return this;
        }
        
        
    public void doT_VolveralapaginaCADAction() throws Exception {
      ChangeCAD();
      Report.reportLog(dependencies, "ChangeCAD action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}