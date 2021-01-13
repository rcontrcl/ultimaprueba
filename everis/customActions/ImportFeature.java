package everis.customActions;
    
import everis.actions.W_ImportarunficheroFeatuAction;



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

public class ImportFeature {

    private SharedDependencies dependencies;

    /**
     * Constructor
     * 
     * @param sharedDependencies
     * @throws Exception
     */
    public ImportFeature(SharedDependencies sharedDependencies) throws Exception {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
    }


    /**
     * Space for user-defined methods
     */
     public void getFile() {
      String file = "238b28a1896c1849c244d2fea6fa8df4afd5af7b";
      By inputFile = By.xpath("/html/body/div[12]/div/div/div[2]/div[2]/fieldset/form/div/div[1]/div/div/div");
      By clickFile = By.xpath("//label[@title='file']");
       
      Actions action = new Actions(dependencies.driver);
      action.doubleClick(dependencies.driver.findElement(inputFile)).perform();
      action.sendKeys(file).perform();
      dependencies.driver.findElement(clickFile).click();
	}
    
    
    /**
     * Class method called from the TestCase thread. Add inside the order of funcions calls desired.
     * 
     * @throws Exception
     */
    public void doImportFeature() throws Exception {
        // All functions designed in this class and not included as a call in this method will be ignored during test execution
        getFile();
		Report.reportLog(dependencies, "El archivo wikipedia.feature se ha importado correctamente", "INFO", 0);
    }
}
