package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;

import everis.customActions.DeleteProyect;
	
import everis.pages.DeleteProyectPage;
import everis.pages.LogoutPage;

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

public class A_Action{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    private DeleteProyect deleteProyect;
	
    
    private DeleteProyectPage deleteProyectPage;
 	private LogoutPage logoutPage;
 	
    
    public A_Action(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        deleteProyectPage = new DeleteProyectPage(dependencies);
logoutPage = new LogoutPage(dependencies);

        deleteProyect = new DeleteProyect(dependencies);
	
    }
    public A_Action IndexProfile () {
        dependencies.driver.get(dependencies.prop.getProperty("HOME_PAGE") + "/profile/home");
        Report.reportLog(dependencies, "Navigated to " + dependencies.prop.getProperty("HOME_PAGE") + "/profile/home", "INFO", 0);
        return this;
    }

	public A_Action DeleteProyect() throws Exception {
          deleteProyect.doDeleteProyect();
          return this;
        }
        
        
    public void doA_Action() throws Exception {
      IndexProfile();
      Report.reportLog(dependencies, "IndexProfile action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      deleteProyectPage.clickMenuProyects();
      Report.reportLog(dependencies, "MenuProyects action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      DeleteProyect();
      Report.reportLog(dependencies, "DeleteProyect action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      logoutPage.clickGoToProfile();
      Report.reportLog(dependencies, "GoToProfile action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      logoutPage.clickSignOut();
      Report.reportLog(dependencies, "SignOut action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}