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

public class G_AbrirunnuevonavegadorAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    
    
    public G_AbrirunnuevonavegadorAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        
        
    }
    public G_AbrirunnuevonavegadorAction HomePage () {
        dependencies.driver.get(dependencies.prop.getProperty("HOME_PAGE") + "");
        Report.reportLog(dependencies, "Navigated to " + dependencies.prop.getProperty("HOME_PAGE") + "", "INFO", 0);
        return this;
    }

	public G_AbrirunnuevonavegadorAction NewBrowserJIRAITO() throws Exception {
          dependencies.setUpEnvironment("JIRAITO");
          return this;
        }
        
        public G_AbrirunnuevonavegadorAction JIRAITO () {
        dependencies.driver.get("https://steps.everis.com/jiraito/login.jsp?os_destination=%2Fsecure%2FRapidBoard.jspa%3FrapidView%3D1201%26view%3Ddetail%26selectedIssue%3DSUSICADS-23");
        Report.reportLog(dependencies, "Navigated to " + "https://steps.everis.com/jiraito/login.jsp?os_destination=%2Fsecure%2FRapidBoard.jspa%3FrapidView%3D1201%26view%3Ddetail%26selectedIssue%3DSUSICADS-23", "INFO", 0);
        return this;
    }

	
    public void doG_AbrirunnuevonavegadorAction() throws Exception {
      HomePage();
      Report.reportLog(dependencies, "HomePage action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
      NewBrowserJIRAITO();
      Report.reportLog(dependencies, "NewBrowserJIRAITO action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      JIRAITO();
      Report.reportLog(dependencies, "JIRAITO action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}