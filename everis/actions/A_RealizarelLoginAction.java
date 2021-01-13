package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.LoginPage;

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

public class A_RealizarelLoginAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private LoginPage loginPage;
 	
    
    public A_RealizarelLoginAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        loginPage = new LoginPage(dependencies);

        
    }
    
    public void doA_RealizarelLoginAction() throws Exception {
      
      loginPage.setUserName("jperepei");
      Report.capScreen(dependencies);
      loginPage.setPassword("Jp01102019");
      Report.capScreen(dependencies);
      loginPage.clickSingIn1();
      Report.reportLog(dependencies, "SingIn1 action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}