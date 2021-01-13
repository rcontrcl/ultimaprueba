package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.ProjectsPage;

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

public class G_CrearunproyectonuevoAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private ProjectsPage projectsPage;
 	
    
    public G_CrearunproyectonuevoAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        projectsPage = new ProjectsPage(dependencies);

        
    }
    
    public void doG_CrearunproyectonuevoAction() throws Exception {
      
      projectsPage.clickNewProject();
      Report.reportLog(dependencies, "NewProject action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      projectsPage.clickCreateNew();
      Report.reportLog(dependencies, "CreateNew action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      projectsPage.setNameProject("importfeature");
      Report.capScreen(dependencies);
      projectsPage.clickCreateNewProject();
      Report.reportLog(dependencies, "CreateNewProject action completed", "INFO", 3000);
      Thread.sleep(3000);
      Report.capScreen(dependencies);
      
      
      projectsPage.clickCreateSeed();
      Report.reportLog(dependencies, "CreateSeed action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}