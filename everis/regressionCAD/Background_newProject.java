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
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Throwables;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import everis.Runner;
import everis.Utils;
import everis.report.Report;
import everis.SharedDependencies;
import everis.actions.A_RealizarelLoginAction;
import everis.actions.G_AccederalaHomePageAction;


public class Background_newProject {
    private ArrayList<String> results = new ArrayList<String>();
    private String finalResult = "OK";
    private SharedDependencies dependencies;
    private A_RealizarelLoginAction a_RealizarelLoginAction;
	private G_AccederalaHomePageAction g_AccederalaHomePageAction;
	

    public Background_newProject(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        initActions();
    }

    public void initActions() {
        try {
            a_RealizarelLoginAction = new A_RealizarelLoginAction(dependencies);
			g_AccederalaHomePageAction = new G_AccederalaHomePageAction(dependencies);
			
        } catch (Exception e) {
            dependencies.logger.severe(e.getMessage());
        }
    }

    @Given("^Acceder a la HomePage$")
    public void Given4() throws Exception{
        try {
            Report.reportLog(dependencies, "|Given| Acceder a la HomePage testAction is going to start", "INFO", 0);
            g_AccederalaHomePageAction.doG_AccederalaHomePageAction();
            Report.reportLog(dependencies, "|Given| Acceder a la HomePage testAction completed", "INFO", 0);
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|Given| Acceder a la HomePage testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
	@And("^Realizar el Login$")
    public void And15() throws Exception{
        try {
            Report.reportLog(dependencies, "|And| Realizar el Login testAction is going to start", "INFO", 0);
            a_RealizarelLoginAction.doA_RealizarelLoginAction();
            Report.reportLog(dependencies, "|And| Realizar el Login testAction completed", "INFO", 0);
        } catch (Exception | AssertionError e) {
            dependencies.finalResult = "BQ";
            Report.capScreen(dependencies);
            Report.reportLog(dependencies, "|And| Realizar el Login testAction NOT completed", "ERROR", 0);
            Report.reportLog(dependencies, Throwables.getStackTraceAsString(e), "DEBUG", 0);
            dependencies.logger.severe(e.getMessage());
            throw new Exception();
        }
    }
	

}