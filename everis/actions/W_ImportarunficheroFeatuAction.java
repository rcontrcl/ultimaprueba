package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;

import everis.customActions.ImportFeature;
	
import everis.pages.RequerimentsPage;

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

public class W_ImportarunficheroFeatuAction{
    private By ImportOkNotVisible = By.xpath("//span[contains(text(),'everiscadImportGherkin finished with success! (cli')]");
    
    private String finalResult;
    private SharedDependencies dependencies;  
    
    private ImportFeature importFeature;
	
    
    private RequerimentsPage requerimentsPage;
 	
    
    public W_ImportarunficheroFeatuAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        requerimentsPage = new RequerimentsPage(dependencies);

        importFeature = new ImportFeature(dependencies);
	
    }
    public W_ImportarunficheroFeatuAction ImportFeature() throws Exception {
          importFeature.doImportFeature();
          return this;
        }
        
        public W_ImportarunficheroFeatuAction ImportOkNotVisible() {
        new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(ImportOkNotVisible));
      return this;
    }

    
    public void doW_ImportarunficheroFeatuAction() throws Exception {
      requerimentsPage.MoveBoxHelp();
      Report.reportLog(dependencies, "MoveBoxHelp action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      requerimentsPage.clickExecutePlugIn();
      Report.reportLog(dependencies, "ExecutePlugIn action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      requerimentsPage.clickImportGherkinFile();
      Report.reportLog(dependencies, "ImportGherkinFile action completed", "INFO", 5000);
      Thread.sleep(5000);
      Report.capScreen(dependencies);
      
      ImportFeature();
      Report.reportLog(dependencies, "ImportFeature action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      
      requerimentsPage.clickRunImport();
      Report.reportLog(dependencies, "RunImport action completed", "INFO", 5000);
      Thread.sleep(5000);
      Report.capScreen(dependencies);
      ImportOkNotVisible();
      Report.reportLog(dependencies, "Condition ImportOkNotVisible isNotVisible action completed", "INFO", 20);
      Report.capScreen(dependencies);
      
      requerimentsPage.clickGoBack();
      Report.reportLog(dependencies, "GoBack action completed", "INFO", 0);
      Report.capScreen(dependencies);
      
    
    }
}