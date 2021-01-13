package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.UploadPage;
import everis.pages.ScrollPage;

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

public class W_SubirunficheroAction{
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private UploadPage uploadPage;
 	private ScrollPage scrollPage;
 	
    
    public W_SubirunficheroAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        uploadPage = new UploadPage(dependencies);
scrollPage = new ScrollPage(dependencies);

        
    }
    
    public void doW_SubirunficheroAction() throws Exception {
      
      scrollPage.clickScrollDown();
      Report.reportLog(dependencies, "ScrollDown action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      uploadPage.clickUploadFileFeature();
      Report.reportLog(dependencies, "UploadFileFeature action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}