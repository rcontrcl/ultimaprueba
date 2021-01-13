package everis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;

import everis.report.Report;

public class SharedDependencies {

	public WebDriver driver;
	
	public File folderTestSuite;
	public File folderTestCase;
	public File folderDownloads;
	public Logger logger = Utils.logger();
	public FileSystem fileSystem = FileSystems.getDefault();
	public Properties prop = new Properties();
	public Runner runner = new Runner();
	public Map<String, WebDriver> contextsDriver = new HashMap<String, WebDriver>();
	public String handler;
	public String level;
	public String finalResult = "OK";
	public boolean isAfter = false;
	public String captureLog = "OK";
	public String scenarioName;
	public ArrayList<String> results = new ArrayList<String>();
	
	public void setUp(String suiteName) {
		folderTestSuite = new File(runner.folderLogs + fileSystem.getSeparator() + suiteName);
		folderTestSuite.mkdirs();
		folderTestCase = new File(folderTestSuite + fileSystem.getSeparator() + scenarioName);
		folderTestCase.mkdirs();
		folderDownloads = new File(folderTestCase + fileSystem.getSeparator() + "files");
		folderDownloads.mkdirs();

		try {
			prop.load(new FileInputStream("config.properties"));
			level = prop.getProperty("LOG_LEVEL");
		} catch (FileNotFoundException e) {
			logger.severe(e.getMessage());
		} catch (IOException e) {
			logger.severe(e.getMessage());
		}

	}
	
	public void setUpEnvironment(String nameDriver) {
		try {
			driver = Utils.setUpDriver(folderDownloads, prop, nameDriver, contextsDriver);
			handler = driver.getWindowHandle();
			
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
	}
	
	public void clearDrivers() {
		for (Map.Entry<String, WebDriver> context : contextsDriver.entrySet()) {
			context.getValue().quit();
		}
		contextsDriver.clear();
	}

	public void finalReports(String featureName) {
        Report.reportExcel(folderTestSuite, results, featureName, scenarioName);
		try {
			Report.reportTestlink();
		} catch (NullPointerException | MalformedURLException e) {
			logger.severe("No se ha podido conectar con el servidor TestLink");
			logger.severe(e.getMessage());
		}
	}
}