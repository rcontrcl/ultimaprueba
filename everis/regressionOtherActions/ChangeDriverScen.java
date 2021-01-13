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

public class ChangeDriverScen {
    private ArrayList<String> results = new ArrayList<String>();
    private String FeatureName = "RegressionOtherActions";
    private SharedDependencies dependencies;
    

    private G_AbrirunnuevonavegadorAction g_AbrirunnuevonavegadorAction;
    private A_ComprobarqueestamosenAction a_ComprobarqueestamosenAction;
    private W_AbrirunnuevonavegadorAction w_AbrirunnuevonavegadorAction;
    private A_AbrirlapestaaparareaAction a_AbrirlapestaaparareaAction;
    private A_ComprobarquepodemosreaAction a_ComprobarquepodemosreaAction;
    private W_VolveralapestaadeGmAction w_VolveralapestaadeGmAction;
    private A_ComprobarqueestamosenAction1 a_ComprobarqueestamosenAction1;
    private T_VolveralapaginaCADAction t_VolveralapaginaCADAction;
    private A_ComprobarqueestamosenAction2 a_ComprobarqueestamosenAction2;
    

    public ChangeDriverScen(SharedDependencies sharedDependencies){
        this.dependencies = sharedDependencies;
        this.dependencies.scenarioName =  "ChangeDriverScen";
    }

    public void initActions(){
        try {
            g_AbrirunnuevonavegadorAction = new G_AbrirunnuevonavegadorAction(dependencies);
            a_ComprobarqueestamosenAction = new A_ComprobarqueestamosenAction(dependencies);
            w_AbrirunnuevonavegadorAction = new W_AbrirunnuevonavegadorAction(dependencies);
            a_AbrirlapestaaparareaAction = new A_AbrirlapestaaparareaAction(dependencies);
            a_ComprobarquepodemosreaAction = new A_ComprobarquepodemosreaAction(dependencies);
            w_VolveralapestaadeGmAction = new W_VolveralapestaadeGmAction(dependencies);
            a_ComprobarqueestamosenAction1 = new A_ComprobarqueestamosenAction1(dependencies);
            t_VolveralapaginaCADAction = new T_VolveralapaginaCADAction(dependencies);
            a_ComprobarqueestamosenAction2 = new A_ComprobarqueestamosenAction2(dependencies);
            
        } catch (Exception e) {
            dependencies.logger.severe(e.getMessage());
        }
    }   

    @Before("@ChangeDriverScen")
    public void before() {
        dependencies.setUp(FeatureName);
        dependencies.setUpEnvironment("MAIN_CONTEXT");  
        initActions();
    }

    @Given("^Abrir un nuevo navegador a la pagina JIRAITO$")
    public void Given1() throws Exception{
        try {
            Report.reportLog(dependencies, "|Given| Abrir un nuevo navegador a la pagina JIRAITO testAction is going to start", "INFO", 0);
            g_AbrirunnuevonavegadorAction.doG_AbrirunnuevonavegadorAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|Given| Abrir un nuevo navegador a la pagina JIRAITO testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|Given| Abrir un nuevo navegador a la pagina JIRAITO testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Comprobar que estamos en la pagina JIRAITO$")
    public void And() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Comprobar que estamos en la pagina JIRAITO testAction is going to start", "INFO", 0);
            a_ComprobarqueestamosenAction.doA_ComprobarqueestamosenAction();
            Report.reportLog(dependencies, "|And| Comprobar que estamos en la pagina JIRAITO testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Comprobar que estamos en la pagina JIRAITO testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @When("^Abrir un nuevo navegador a la pagina Gmail$")
    public void When1() throws Exception{
        try {
            Report.reportLog(dependencies, "|When| Abrir un nuevo navegador a la pagina Gmail testAction is going to start", "INFO", 0);
            w_AbrirunnuevonavegadorAction.doW_AbrirunnuevonavegadorAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|When| Abrir un nuevo navegador a la pagina Gmail testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|When| Abrir un nuevo navegador a la pagina Gmail testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Abrir la pestaña para realizar el inicio de sesion$")
    public void And4() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Abrir la pestaña para realizar el inicio de sesion testAction is going to start", "INFO", 0);
            a_AbrirlapestaaparareaAction.doA_AbrirlapestaaparareaAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|And| Abrir la pestaña para realizar el inicio de sesion testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Abrir la pestaña para realizar el inicio de sesion testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Comprobar que podemos realizar el inicio de sesion$")
    public void And3() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Comprobar que podemos realizar el inicio de sesion testAction is going to start", "INFO", 0);
            a_ComprobarquepodemosreaAction.doA_ComprobarquepodemosreaAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|And| Comprobar que podemos realizar el inicio de sesion testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Comprobar que podemos realizar el inicio de sesion testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @When("^Volver a la pestaña de Gmail$")
    public void When2() throws Exception{
        try {
            Report.reportLog(dependencies, "|When| Volver a la pestaña de Gmail testAction is going to start", "INFO", 0);
            w_VolveralapestaadeGmAction.doW_VolveralapestaadeGmAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|When| Volver a la pestaña de Gmail testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|When| Volver a la pestaña de Gmail testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Comprobar que estamos en la pagina Gmail$")
    public void And1() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Comprobar que estamos en la pagina Gmail testAction is going to start", "INFO", 0);
            a_ComprobarqueestamosenAction1.doA_ComprobarqueestamosenAction1();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|And| Comprobar que estamos en la pagina Gmail testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Comprobar que estamos en la pagina Gmail testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @Then("^Volver a la pagina CAD$")
    public void Then1() throws Exception{
        try {
            Report.reportLog(dependencies, "|Then| Volver a la pagina CAD testAction is going to start", "INFO", 0);
            t_VolveralapaginaCADAction.doT_VolveralapaginaCADAction();
            Thread.sleep(5000);
            Report.reportLog(dependencies, "|Then| Volver a la pagina CAD testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|Then| Volver a la pagina CAD testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    @And("^Comprobar que estamos en la pagina CAD$")
    public void And2() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Comprobar que estamos en la pagina CAD testAction is going to start", "INFO", 0);
            a_ComprobarqueestamosenAction2.doA_ComprobarqueestamosenAction2();
            Report.reportLog(dependencies, "|And| Comprobar que estamos en la pagina CAD testAction completed", "INFO", 0);
        } catch (TimeoutException te) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, te.getMessage(), "ERROR", 0);
            throw new Exception();
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "KO";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Comprobar que estamos en la pagina CAD testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
    

    @After("@ChangeDriverScen")
    public void after() {
        dependencies.logger.info("Result on ChangeDriverScen" + ":" + dependencies.finalResult);
        
        dependencies.results.add(0, dependencies.finalResult);
        Report.addResults(FeatureName, dependencies.scenarioName, dependencies.results);
        dependencies.clearDrivers();
        dependencies.finalReports(FeatureName);
        
    }
}
