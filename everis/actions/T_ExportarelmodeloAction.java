package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


import everis.pages.TestingPage;

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

public class T_ExportarelmodeloAction{
    private By DownloadExportModelNotVisible = By.xpath("//body/div[11]");
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private TestingPage testingPage;
 	
    
    public T_ExportarelmodeloAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        testingPage = new TestingPage(dependencies);

        
    }
    public T_ExportarelmodeloAction DownloadExportModelNotVisible() {
      new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.visibilityOfElementLocated(DownloadExportModelNotVisible));
      return this;
    }

    
    public void doT_ExportarelmodeloAction() throws Exception {
      
      testingPage.clickEverisCADProject();
      Report.reportLog(dependencies, "EverisCADProject action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      testingPage.clickExportModel();
      Report.reportLog(dependencies, "ExportModel action completed", "INFO", 5000);
      Thread.sleep(5000);
      Report.capScreen(dependencies);
      DownloadExportModelNotVisible();
      Report.reportLog(dependencies, "Condition DownloadExportModelNotVisible isVisible action completed", "INFO", 20);
      Report.capScreen(dependencies);
      
      testingPage.clickCloseExportModel();
      Report.reportLog(dependencies, "CloseExportModel action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}