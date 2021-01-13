package everis.customActions;
    
import everis.actions.A_Action;



import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import everis.Utils;
import everis.report.Report;
import everis.Runner;
import everis.SharedDependencies;

public class DeleteProyect {

    private SharedDependencies dependencies;

    /**
     * Constructor
     * 
     * @param sharedDependencies
     * @throws Exception
     */
    public DeleteProyect(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);

    }


    /**
     * Space for user-defined methods
     */
     public void ActionDeleteProyect() throws Exception {
      String nameProyect = dependencies.scenarioName.replace("Scen", "").toLowerCase();
      By searchProyect = By.xpath("/html/body/div/div/div/section[2]/div/div/div[2]/div[1]/div[2]/div/label/input");
      By selectProyect = By.xpath("//span[contains(text(),'" + nameProyect + "')]");
      By removeProyect = By.xpath("//button[contains(text(),'Delete Project ...')]");
      By checkConfirmation = By.xpath("//button[@id='jperepei+" + nameProyect + "']");
      
      dependencies.driver.findElement(searchProyect).clear();
      dependencies.driver.findElement(searchProyect).sendKeys(nameProyect);
      dependencies.driver.findElement(selectProyect).click();
      Thread.sleep(1000);
      dependencies.driver.findElement(removeProyect).click();
      Thread.sleep(1000);
      dependencies.driver.findElement(checkConfirmation).click();
	}
    
    
    /**
     * Class method called from the TestCase thread. Add inside the order of funcions calls desired.
     * 
     * @throws Exception
     */
    public void doDeleteProyect() throws Exception {
    	ActionDeleteProyect();
        // All functions designed in this class and not included as a call in this method will be ignored during test execution
        Report.reportLog(dependencies, "DeleteProyect action completed", "INFO", 0);
    }
}
