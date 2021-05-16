package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Week2Day1Assignment {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.findElementById("username").sendKeys("demosalesmanager");
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Leaftaps - TestLeaf Automation Platform");
        driver.findElementByLinkText("CRM/SFA").click();
        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Create Lead").click();
        driver.findElementById("createLeadForm_companyName").sendKeys("PraveenLTD");
        driver.findElementById("createLeadForm_firstName").sendKeys("Praveen");
        driver.findElementById("createLeadForm_lastName").sendKeys("kumar");
        WebElement selectDropdown = driver.findElementById("createLeadForm_dataSourceId");
        Select source = new Select(selectDropdown);
        source.selectByValue("LEAD_CONFERENCE");
        WebElement marketingDropdown = driver.findElementById("createLeadForm_marketingCampaignId");
        Select marketing = new Select(marketingDropdown);
        marketing.selectByValue("CATRQ_CARNDRIVER");
        driver.findElementById("createLeadForm_firstNameLocal").sendKeys("kumar");
        driver.findElementById("createLeadForm_personalTitle").sendKeys("Sir");
        driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Pranav");
        driver.findElementById("createLeadForm_birthDate").sendKeys("16/01/80");
        driver.findElementById("createLeadForm_departmentName").sendKeys("abcxyz");
        driver.findElementById("createLeadForm_annualRevenue").sendKeys("1500");
        driver.findElementById("createLeadForm_numberEmployees").sendKeys("50");
        driver.findElementById("createLeadForm_sicCode").sendKeys("5000");
        driver.findElementByClassName("smallSubmit").click();
        driver.findElementByLinkText("Duplicate Lead").click();
        WebElement amount = driver.findElementById("createLeadForm_industryEnumId");
        Select amount2 = new Select(amount);
        amount2.selectByIndex(3);

        driver.findElementById("createLeadForm_companyName").clear();
        driver.findElementById("createLeadForm_companyName").sendKeys("PraveenLTD");
        driver.findElementByClassName("smallSubmit").click();
        driver.close();



    }
}
