package everis.pages;
    
import everis.SharedDependencies;
import everis.Utils;
import everis.report.Report;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;

public class ProjectsPage {
    private By CreateSeed = By.xpath("/html/body/div[12]/div/div/div[4]/button[1]");
private By NameProject = By.xpath("/html/body/div[12]/div/div/div[3]/div[2]/div[1]/input");
private By CreateNewProject = By.xpath("//button[contains(text(),'+ Create new project')]");
private By NewProject = By.xpath("/html/body/div[10]/div/div[1]/div/a");
private By CreateNew = By.xpath("//button[contains(text(),'Create new...')]");
private By CreateNew1 = By.xpath("//button[contains(text(),'Create new...')]");
private By NameProject1 = By.xpath("/html/body/div[12]/div/div/div[3]/div[2]/div[1]/input");
private By CreateNewProject1 = By.xpath("//button[contains(text(),'+ Create new project')]");
private By NewProject1 = By.xpath("/html/body/div[10]/div/div[1]/div/a");
private By CreateSeed1 = By.xpath("/html/body/div[12]/div/div/div[4]/button[1]");

    
    private JavascriptExecutor js;
    private SharedDependencies dependencies;
    
    public ProjectsPage(SharedDependencies sharedDependencies) {
        this.dependencies = sharedDependencies;
        PageFactory.initElements(dependencies.driver, this);
        js = (JavascriptExecutor)dependencies.driver;
    }

    public ProjectsPage clickCreateSeed(){
        dependencies.driver.findElement(CreateSeed).click();
        Report.reportLog(dependencies, "CreateSeed clicked", "INFO", 0);
        return this;
    }
    public ProjectsPage setNameProject(String value){
        dependencies.driver.findElement(NameProject).clear();
        dependencies.driver.findElement(NameProject).sendKeys(value);
        Report.reportLog(dependencies, "Typed importfeature in NameProject", "INFO", 0);
        return this;
    }
    public ProjectsPage clickCreateNewProject(){
        dependencies.driver.findElement(CreateNewProject).click();
        Report.reportLog(dependencies, "CreateNewProject clicked", "INFO", 0);
        return this;
    }
    public ProjectsPage clickNewProject(){
        dependencies.driver.findElement(NewProject).click();
        Report.reportLog(dependencies, "NewProject clicked", "INFO", 0);
        return this;
    }
    public ProjectsPage clickCreateNew(){
        dependencies.driver.findElement(CreateNew).click();
        Report.reportLog(dependencies, "CreateNew clicked", "INFO", 0);
        return this;
    }
    public ProjectsPage clickCreateNew1(){
        dependencies.driver.findElement(CreateNew1).click();
        Report.reportLog(dependencies, "CreateNew1 clicked", "INFO", 0);
        return this;
    }
    public ProjectsPage setNameProject1(String value){
        dependencies.driver.findElement(NameProject1).clear();
        dependencies.driver.findElement(NameProject1).sendKeys(value);
        Report.reportLog(dependencies, "Typed createmodel in NameProject1", "INFO", 0);
        return this;
    }
    public ProjectsPage clickCreateNewProject1(){
        dependencies.driver.findElement(CreateNewProject1).click();
        Report.reportLog(dependencies, "CreateNewProject1 clicked", "INFO", 0);
        return this;
    }
    public ProjectsPage clickNewProject1(){
        dependencies.driver.findElement(NewProject1).click();
        Report.reportLog(dependencies, "NewProject1 clicked", "INFO", 0);
        return this;
    }
    public ProjectsPage clickCreateSeed1(){
        dependencies.driver.findElement(CreateSeed1).click();
        Report.reportLog(dependencies, "CreateSeed1 clicked", "INFO", 0);
        return this;
    }
    
    
}