package everis.actions;

import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;


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

public class T_ComprobarlosdistintosaAction{
    private By HigherSameAssertion = By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[1]/td/table/tbody/tr/td[2]/div/p/span[2]/b/a");
private By LessSameAssertion = By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[1]/td/table/tbody/tr/td[2]/div/p/span[2]/b/a");
private By HigherAssertion = By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[1]/td/table/tbody/tr/td[2]/div/p/span[2]/b/a");
private By LessAssertion = By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[1]/td/table/tbody/tr/td[2]/div/p/span[2]/b/a");
private By DifferentAssertion = By.xpath("//div[contains(text(),'The upload is complete!')]");
private By ContainsAssertion = By.xpath("//div[contains(text(),'The upload is complete!')]");
private By NotContainsAssertion = By.xpath("//div[contains(text(),'The upload is complete!')]");
private By NotNullAssertion = By.xpath("//div[contains(text(),'The upload is complete!')]");
private By SameAssertion = By.xpath("//div[contains(text(),'The upload is complete!')]");

    private String finalResult;
    private SharedDependencies dependencies;  
    
    
    
    private ScrollPage scrollPage;
 	
    
    public T_ComprobarlosdistintosaAction(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
         
        scrollPage = new ScrollPage(dependencies);

        
    }
    public T_ComprobarlosdistintosaAction CharactersAssertions() {
        Assert.assertTrue("Field DifferentAssertion not found in assertion", !"not complete!".equals(dependencies.driver.findElement(DifferentAssertion).getText()));
          Report.reportLog(dependencies, "The field not complete! has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          Assert.assertTrue("Field ContainsAssertion not found in assertion", dependencies.driver.findElement(ContainsAssertion).getText().contains("complete"));
          Report.reportLog(dependencies, "The field complete has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          Assert.assertTrue("Field NotContainsAssertion not found in assertion", !dependencies.driver.findElement(NotContainsAssertion).getText().contains("not"));
          Report.reportLog(dependencies, "The field not has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          Assert.assertTrue("Field NotNullAssertion not found in assertion", dependencies.driver.findElement(NotNullAssertion).getText() != null);
          Report.reportLog(dependencies, "The field empty has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          Assert.assertTrue("Field SameAssertion not found in assertion", "The upload is complete!".equals(dependencies.driver.findElement(SameAssertion).getText()));
          Report.reportLog(dependencies, "The field The upload is complete! has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          
        return this;
    }
    
    public T_ComprobarlosdistintosaAction IndexWikipedia () {
        dependencies.driver.get("https://es.wikipedia.org/wiki/Portal:Comunidad");
        Report.reportLog(dependencies, "Navigated to " + "https://es.wikipedia.org/wiki/Portal:Comunidad", "INFO", 0);
        return this;
    }

	public T_ComprobarlosdistintosaAction NumbersAssertions() {
        Assert.assertTrue("Field HigherSameAssertion not found in assertion", Integer.parseInt(dependencies.driver.findElement(HigherSameAssertion).getText()) <= 2021);
          Report.reportLog(dependencies, "The field 2021 has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          Assert.assertTrue("Field LessSameAssertion not found in assertion", Integer.parseInt(dependencies.driver.findElement(LessSameAssertion).getText()) >= 2020);
          Report.reportLog(dependencies, "The field 2020 has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          Assert.assertTrue("Field HigherAssertion not found in assertion", Integer.parseInt(dependencies.driver.findElement(HigherAssertion).getText()) < 2030);
          Report.reportLog(dependencies, "The field 2030 has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          Assert.assertTrue("Field LessAssertion not found in assertion", Integer.parseInt(dependencies.driver.findElement(LessAssertion).getText()) > 2010);
          Report.reportLog(dependencies, "The field 2010 has been found on assertion", "INFO", 0);
          Report.capScreen(dependencies);
          
        return this;
    }
    
    
    public void doT_ComprobarlosdistintosaAction() throws Exception {
      CharactersAssertions();
      Report.reportLog(dependencies, "CharactersAssertions action completed", "INFO", 1000);
      Thread.sleep(1000);
      
      
      
      scrollPage.clickScrollUp();
      Report.reportLog(dependencies, "ScrollUp action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      IndexWikipedia();
      Report.reportLog(dependencies, "IndexWikipedia action completed", "INFO", 1000);
      Thread.sleep(1000);
      Report.capScreen(dependencies);
      
      NumbersAssertions();
      Report.reportLog(dependencies, "NumbersAssertions action completed", "INFO", 0);
      
      
    
    }
}