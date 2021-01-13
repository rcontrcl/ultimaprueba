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

public class CreateModelScen {
    private ArrayList<String> results = new ArrayList<String>();
    private String FeatureName = "RegressionCAD";
    private SharedDependencies dependencies;
    

    private G_ComprobarqueseharealiAction g_ComprobarqueseharealiAction;
    private A_CrearunproyectonuevoAction a_CrearunproyectonuevoAction;
    private W_AccederalmodulodeTestAction w_AccederalmodulodeTestAction;
    private W_AadirlacajaTestingConAction w_AadirlacajaTestingConAction;
    private A_AadimoslaconfiguracionAction a_AadimoslaconfiguracionAction;
    private T_AadimosunaSuiteAction t_AadimosunaSuiteAction;
    private W_AadimosunTestCaseAction w_AadimosunTestCaseAction;
    private A_AadimosStepsenelBefoAction a_AadimosStepsenelBefoAction;
    private A_AadimosStepsenelExecAction a_AadimosStepsenelExecAction;
    private A_AadimosStepsenelAfteAction a_AadimosStepsenelAfteAction;
    private W_AadimosunBeforeEachAction w_AadimosunBeforeEachAction;
    private A_AadirlosStepsAction a_AadirlosStepsAction;
    private T_GenerarelproyectoconMAction t_GenerarelproyectoconMAction;
    private A_Action a_Action;
    

    public CreateModelScen(SharedDependencies sharedDependencies){
        this.dependencies = sharedDependencies;
        this.dependencies.scenarioName =  "CreateModelScen";
    }

    public void initActions(){
        try {
            g_ComprobarqueseharealiAction = new G_ComprobarqueseharealiAction(dependencies);
            a_CrearunproyectonuevoAction = new A_CrearunproyectonuevoAction(dependencies);
            w_AccederalmodulodeTestAction = new W_AccederalmodulodeTestAction(dependencies);
            w_AadirlacajaTestingConAction = new W_AadirlacajaTestingConAction(dependencies);
            a_AadimoslaconfiguracionAction = new A_AadimoslaconfiguracionAction(dependencies);
            t_AadimosunaSuiteAction = new T_AadimosunaSuiteAction(dependencies);
            w_AadimosunTestCaseAction = new W_AadimosunTestCaseAction(dependencies);
            a_AadimosStepsenelBefoAction = new A_AadimosStepsenelBefoAction(dependencies);
            a_AadimosStepsenelExecAction = new A_AadimosStepsenelExecAction(dependencies);
            a_AadimosStepsenelAfteAction = new A_AadimosStepsenelAfteAction(dependencies);
            w_AadimosunBeforeEachAction = new W_AadimosunBeforeEachAction(dependencies);
            a_AadirlosStepsAction = new A_AadirlosStepsAction(dependencies);
            t_GenerarelproyectoconMAction = new T_GenerarelproyectoconMAction(dependencies);
            a_Action = new A_Action(dependencies);
            
        } catch (Exception e) {
            dependencies.logger.severe(e.getMessage());
        }
    }   

    @Before("@CreateModelScen")
    public void before() {
        dependencies.setUp(FeatureName);
        dependencies.setUpEnvironment("MAIN_CONTEXT");  
        initActions();
    }

    @Given("^Comprobar que se ha realizado el Login correctamente$")
    public void Given3() throws Exception{
        try {
            Report.reportLog(dependencies, "|Given| Comprobar que se ha realizado el Login correctamente testAction is going to start", "INFO", 0);
            g_ComprobarqueseharealiAction.doG_ComprobarqueseharealiAction();
            Report.reportLog(dependencies, "|Given| Comprobar que se ha realizado el Login correctamente testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|Given| Comprobar que se ha realizado el Login correctamente testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Crear un proyecto nuevo.$")
    public void And12() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Crear un proyecto nuevo. testAction is going to start", "INFO", 0);
            a_CrearunproyectonuevoAction.doA_CrearunproyectonuevoAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|And| Crear un proyecto nuevo. testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Crear un proyecto nuevo. testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @When("^Acceder al modulo de Testing$")
    public void When6() throws Exception{
        try {
            Report.reportLog(dependencies, "|When| Acceder al modulo de Testing testAction is going to start", "INFO", 0);
            w_AccederalmodulodeTestAction.doW_AccederalmodulodeTestAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|When| Acceder al modulo de Testing testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|When| Acceder al modulo de Testing testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @When("^Añadir la caja TestingContext$")
    public void When5() throws Exception{
        try {
            Report.reportLog(dependencies, "|When| Añadir la caja TestingContext testAction is going to start", "INFO", 0);
            w_AadirlacajaTestingConAction.doW_AadirlacajaTestingConAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|When| Añadir la caja TestingContext testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|When| Añadir la caja TestingContext testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Añadimos la configuracion$")
    public void And10() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Añadimos la configuracion testAction is going to start", "INFO", 0);
            a_AadimoslaconfiguracionAction.doA_AadimoslaconfiguracionAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|And| Añadimos la configuracion testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Añadimos la configuracion testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @Then("^Añadimos una Suite$")
    public void Then4() throws Exception{
        try {
            Report.reportLog(dependencies, "|Then| Añadimos una Suite testAction is going to start", "INFO", 0);
            t_AadimosunaSuiteAction.doT_AadimosunaSuiteAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|Then| Añadimos una Suite testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|Then| Añadimos una Suite testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @When("^Añadimos un TestCase$")
    public void When8() throws Exception{
        try {
            Report.reportLog(dependencies, "|When| Añadimos un TestCase testAction is going to start", "INFO", 0);
            w_AadimosunTestCaseAction.doW_AadimosunTestCaseAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|When| Añadimos un TestCase testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|When| Añadimos un TestCase testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Añadimos Steps en el Before$")
    public void And9() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Añadimos Steps en el Before testAction is going to start", "INFO", 0);
            a_AadimosStepsenelBefoAction.doA_AadimosStepsenelBefoAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|And| Añadimos Steps en el Before testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Añadimos Steps en el Before testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Añadimos Steps en el Execute$")
    public void And13() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Añadimos Steps en el Execute testAction is going to start", "INFO", 0);
            a_AadimosStepsenelExecAction.doA_AadimosStepsenelExecAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|And| Añadimos Steps en el Execute testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Añadimos Steps en el Execute testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Añadimos Steps en el After$")
    public void And14() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Añadimos Steps en el After testAction is going to start", "INFO", 0);
            a_AadimosStepsenelAfteAction.doA_AadimosStepsenelAfteAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|And| Añadimos Steps en el After testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Añadimos Steps en el After testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @When("^Añadimos un BeforeEach$")
    public void When7() throws Exception{
        try {
            Report.reportLog(dependencies, "|When| Añadimos un BeforeEach testAction is going to start", "INFO", 0);
            w_AadimosunBeforeEachAction.doW_AadimosunBeforeEachAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|When| Añadimos un BeforeEach testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|When| Añadimos un BeforeEach testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Añadir los Steps$")
    public void And11() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Añadir los Steps testAction is going to start", "INFO", 0);
            a_AadirlosStepsAction.doA_AadirlosStepsAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|And| Añadir los Steps testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Añadir los Steps testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @Then("^Generar el proyecto con Main$")
    public void Then3() throws Exception{
        try {
            Report.reportLog(dependencies, "|Then| Generar el proyecto con Main testAction is going to start", "INFO", 0);
            t_GenerarelproyectoconMAction.doT_GenerarelproyectoconMAction();
            Report.reportLog(dependencies, "|Then| Generar el proyecto con Main testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|Then| Generar el proyecto con Main testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    

    @After("@CreateModelScen")
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
        dependencies.logger.info("Result on CreateModelScen" + ":" + dependencies.finalResult);
        dependencies.logger.info("After execution finished" + ":" + afterResult);
        dependencies.results.add(0, dependencies.finalResult);
        Report.addResults(FeatureName, dependencies.scenarioName, dependencies.results);
        dependencies.clearDrivers();
        dependencies.finalReports(FeatureName);
        
    }
}
