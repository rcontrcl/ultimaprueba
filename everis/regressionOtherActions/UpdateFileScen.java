package everis.regressionOtherActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import com.google.common.base.Throwables;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import everis.SharedDependencies;
import everis.report.Report;
import everis.actions.*;

public class UpdateFileScen {
    private ArrayList<String> results = new ArrayList<String>();
    private String FeatureName = "RegressionOtherActions";
    private SharedDependencies dependencies;
    

    private G_NavegaralapaginatusiAction g_NavegaralapaginatusiAction;
    private W_SubirunficheroAction w_SubirunficheroAction;
    private T_ComprobarlosdistintosaAction t_ComprobarlosdistintosaAction;
    

    public UpdateFileScen(SharedDependencies sharedDependencies){
        this.dependencies = sharedDependencies;
        this.dependencies.scenarioName =  "UpdateFileScen";
    }

    public void initActions(){
        try {
            g_NavegaralapaginatusiAction = new G_NavegaralapaginatusiAction(dependencies);
            w_SubirunficheroAction = new W_SubirunficheroAction(dependencies);
            t_ComprobarlosdistintosaAction = new T_ComprobarlosdistintosaAction(dependencies);
            
        } catch (Exception e) {
            dependencies.logger.severe(e.getMessage());
        }
    }   

    @Before("@UpdateFileScen")
    public void before() {
        dependencies.setUp(FeatureName);
        dependencies.setUpEnvironment("MAIN_CONTEXT");  
        initActions();
    }

    @Given("^Navegar a la pagina tus.io$")
    public void Given() throws Exception{
        try {
            Report.reportLog(dependencies, "|Given| Navegar a la pagina tus.io testAction is going to start", "INFO", 0);
            g_NavegaralapaginatusiAction.doG_NavegaralapaginatusiAction();
            Report.reportLog(dependencies, "|Given| Navegar a la pagina tus.io testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|Given| Navegar a la pagina tus.io testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @When("^Subir un fichero$")
    public void When() throws Exception{
        try {
            Report.reportLog(dependencies, "|When| Subir un fichero testAction is going to start", "INFO", 0);
            w_SubirunficheroAction.doW_SubirunficheroAction();
            Thread.sleep(3000);
            Report.reportLog(dependencies, "|When| Subir un fichero testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|When| Subir un fichero testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @Then("^Comprobar los distintos asserions$")
    public void Then() throws Exception{
        try {
            Report.reportLog(dependencies, "|Then| Comprobar los distintos asserions testAction is going to start", "INFO", 0);
            t_ComprobarlosdistintosaAction.doT_ComprobarlosdistintosaAction();
            Report.reportLog(dependencies, "|Then| Comprobar los distintos asserions testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|Then| Comprobar los distintos asserions testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    

    @After("@UpdateFileScen")
    public void after() {
        dependencies.logger.info("Result on UpdateFileScen" + ":" + dependencies.finalResult);
        
        dependencies.results.add(0, dependencies.finalResult);
        Report.addResults(FeatureName, dependencies.scenarioName, dependencies.results);
        dependencies.clearDrivers();
        dependencies.finalReports(FeatureName);
        
    }
}
