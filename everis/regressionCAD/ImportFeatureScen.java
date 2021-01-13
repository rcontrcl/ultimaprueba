package everis.regressionCAD;

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

public class ImportFeatureScen {
    private ArrayList<String> results = new ArrayList<String>();
    private String FeatureName = "RegressionCAD";
    private SharedDependencies dependencies;
    private static By ImportScenariosintoTestCasesNotvisible = By.xpath("//span[contains(text(),'everiscadImporterScenarioToTest finished with succ')]");
	

    private G_CrearunproyectonuevoAction g_CrearunproyectonuevoAction;
    private A_AccederalmodulodeRequAction a_AccederalmodulodeRequAction;
    private W_ImportarunficheroFeatuAction w_ImportarunficheroFeatuAction;
    private W_AccederalmodulodeTestAction1 w_AccederalmodulodeTestAction1;
    private A_AadirelTestingContextAction a_AadirelTestingContextAction;
    private A_GenerarlapruebamediantAction a_GenerarlapruebamediantAction;
    private T_ExportarelmodeloAction t_ExportarelmodeloAction;
    private A_GenerarelproyectoconCAction a_GenerarelproyectoconCAction;
    private A_Action a_Action;
    

    public ImportFeatureScen(SharedDependencies sharedDependencies){
        this.dependencies = sharedDependencies;
        this.dependencies.scenarioName =  "ImportFeatureScen";
    }

    public void initActions(){
        try {
            g_CrearunproyectonuevoAction = new G_CrearunproyectonuevoAction(dependencies);
            a_AccederalmodulodeRequAction = new A_AccederalmodulodeRequAction(dependencies);
            w_ImportarunficheroFeatuAction = new W_ImportarunficheroFeatuAction(dependencies);
            w_AccederalmodulodeTestAction1 = new W_AccederalmodulodeTestAction1(dependencies);
            a_AadirelTestingContextAction = new A_AadirelTestingContextAction(dependencies);
            a_GenerarlapruebamediantAction = new A_GenerarlapruebamediantAction(dependencies);
            t_ExportarelmodeloAction = new T_ExportarelmodeloAction(dependencies);
            a_GenerarelproyectoconCAction = new A_GenerarelproyectoconCAction(dependencies);
            a_Action = new A_Action(dependencies);
            
        } catch (Exception e) {
            dependencies.logger.severe(e.getMessage());
        }
    }   

    @Before("@ImportFeatureScen")
    public void before() {
        dependencies.setUp(FeatureName);
        dependencies.setUpEnvironment("MAIN_CONTEXT");  
        initActions();
    }

    @Given("^Crear un proyecto nuevo$")
    public void Given2() throws Exception{
        try {
            Report.reportLog(dependencies, "|Given| Crear un proyecto nuevo testAction is going to start", "INFO", 0);
            g_CrearunproyectonuevoAction.doG_CrearunproyectonuevoAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|Given| Crear un proyecto nuevo testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|Given| Crear un proyecto nuevo testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Acceder al modulo de Requirements$")
    public void And5() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Acceder al modulo de Requirements testAction is going to start", "INFO", 0);
            a_AccederalmodulodeRequAction.doA_AccederalmodulodeRequAction();
            Report.reportLog(dependencies, "|And| Acceder al modulo de Requirements testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Acceder al modulo de Requirements testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @When("^Importar un fichero Feature$")
    public void When3() throws Exception{
        try {
            Report.reportLog(dependencies, "|When| Importar un fichero Feature testAction is going to start", "INFO", 0);
            w_ImportarunficheroFeatuAction.doW_ImportarunficheroFeatuAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|When| Importar un fichero Feature testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|When| Importar un fichero Feature testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @When("^Acceder al modulo de Testing1$")
    public void When4() throws Exception{
        try {
            Report.reportLog(dependencies, "|When| Acceder al modulo de Testing1 testAction is going to start", "INFO", 0);
            w_AccederalmodulodeTestAction1.doW_AccederalmodulodeTestAction1();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|When| Acceder al modulo de Testing1 testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|When| Acceder al modulo de Testing1 testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Añadir el TestingContext$")
    public void And6() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Añadir el TestingContext testAction is going to start", "INFO", 0);
            a_AadirelTestingContextAction.doA_AadirelTestingContextAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|And| Añadir el TestingContext testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Añadir el TestingContext testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Generar la prueba mediante los Requeriments$")
    public void And8() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Generar la prueba mediante los Requeriments testAction is going to start", "INFO", 0);
            a_GenerarlapruebamediantAction.doA_GenerarlapruebamediantAction();
            Thread.sleep(5000);
            new WebDriverWait(dependencies.driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(ImportScenariosintoTestCasesNotvisible));
            Report.reportLog(dependencies, "Condition ImportScenariosintoTestCasesNotvisible isNotVisible finished", "INFO", 20);
            Report.reportLog(dependencies, "|And| Generar la prueba mediante los Requeriments testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Generar la prueba mediante los Requeriments testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @Then("^Exportar el modelo$")
    public void Then2() throws Exception{
        try {
            Report.reportLog(dependencies, "|Then| Exportar el modelo testAction is going to start", "INFO", 0);
            t_ExportarelmodeloAction.doT_ExportarelmodeloAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|Then| Exportar el modelo testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|Then| Exportar el modelo testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Generar el proyecto con Cucumber$")
    public void And7() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Generar el proyecto con Cucumber testAction is going to start", "INFO", 0);
            a_GenerarelproyectoconCAction.doA_GenerarelproyectoconCAction();
            Report.reportLog(dependencies, "|And| Generar el proyecto con Cucumber testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Generar el proyecto con Cucumber testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    

    @After("@ImportFeatureScen")
    public void after() {
        dependencies.isAfter= true;
        String afterResult = "succesfully";
        try {
            a_Action.doA_Action();
            
        } catch (AssertionError e) {
            dependencies.logger.severe(e.getMessage());
            dependencies.captureLog ="KO";
            afterResult = "not succesfully";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, e.getMessage(), "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
        } catch (Exception e) {
            dependencies.logger.severe(e.getMessage());
            dependencies.captureLog ="KO";
            afterResult = "not succesfully";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, e.getMessage(), "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
        }
        dependencies.isAfter = false;
        dependencies.logger.info("Result on ImportFeatureScen" + ":" + dependencies.finalResult);
        dependencies.logger.info("After execution finished" + ":" + afterResult);
        dependencies.results.add(0, dependencies.finalResult);
        Report.addResults(FeatureName, dependencies.scenarioName, dependencies.results);
        dependencies.clearDrivers();
        dependencies.finalReports(FeatureName);
        
    }
}
