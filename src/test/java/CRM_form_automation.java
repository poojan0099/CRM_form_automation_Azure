import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CRM_form_automation{

    @Test
    void test_form() throws InterruptedException
    {
        System.setProperty("webdriver.edge.driver", "D:\\Selenium_tools\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //        driver.get("https://org3428784c.crm8.dynamics.com/main.aspx?appid=5457e902-d69d-ec11-b400-6045bdaaca9f&pagetype=entitylist&etn=crf3c_clientproject&viewid=13913b6f-fe0d-415b-9a16-2b211d3569c9&viewType=1039");
        driver.get("https://aarshdigital.crm8.dynamics.com/main.aspx?appid=d56ec6cd-cac3-444c-8da0-d6a876b22299&forceUCI=1&pagetype=entityrecord&etn=crf3c_clientproject");
//		WebElement sign_in = driver.findElement(By.xpath("//div[@id='mectrl_headerPicture']"));
//		sign_in.click();

        driver.manage().window().maximize();

        WebElement email = driver.findElement(By.xpath("//*[@id=\"i0116\"]"));
        email.click();
        email.sendKeys("lokin@aarshsoftwares.in");

        WebElement next = driver.findElement(By.xpath("//input[@type='submit']"));
        next.click();

        Thread.sleep(3000);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"i0118\"]"));
        password.sendKeys("Pass@32123");
        password.click();

        WebElement sign_in_click = driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
        sign_in_click.click();

        Thread.sleep(3000);

        WebElement stay_signed_in = driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
        stay_signed_in.click();

        Thread.sleep(5000);

        try {

            Thread.sleep(3000);

//		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
            WebElement new_record = driver.findElement(By.xpath("//*[@id=\"crf3c_clientproject|NoRelationship|Form|Mscrm.NewRecordFromForm20-button\"]"));
            new_record.click();


//		driver.get(driver.getCurrentUrl());
//
////		WebElement account_input = driver.findElement(By.xpath("//*[@id=\"id-4f3ba324-7a24-4824-8b14-e4324c50b337-7-crf3c_account270bd3db-d9af-4782-9025-509e298dec0a-crf3c_account.fieldControl-LookupResultsDropdown_crf3c_account_0_textInputBox_with_filter_new\"]"));
////		wait.until(ExpectedConditions.elementToBeClickable(account_input)).click();
////		account_input.click();
////		account_input.sendKeys("aa");


            WebElement acc_input = driver.findElement(By.xpath("//*[@id=\"id-4f3ba324-7a24-4824-8b14-e4324c50b337-1-crf3c_name4273edbd-ac1d-40d3-9fb2-095c621b552d-crf3c_name.fieldControl-text-box-text\"]"));
            acc_input.click();
            acc_input.sendKeys("aa");
//		WebElement aarsh_click = driver.findElement(By.xpath("//*[@id=\"id-4f3ba324-7a24-4824-8b14-e4324c50b337-7-crf3c_account270bd3db-d9af-4782-9025-509e298dec0a-crf3c_account.fieldControl-LookupResultsPopup_crf3c_account_0_resultsContainer_0_0\"]"));
//		aarsh_click.click();
//		Thread.sleep(5000);
            Actions a = new Actions(driver);
            a.moveToElement(acc_input);
            acc_input.sendKeys(Keys.DOWN, Keys.ENTER);


            WebElement revenue = driver.findElement(By.xpath("//*[@id=\"id-4f3ba324-7a24-4824-8b14-e4324c50b337-13-crf3c_estimatedrevenue533b9e00-756b-4312-95a0-dc888637ac78-crf3c_estimatedrevenue.fieldControl-currency-text-input\"]"));
            revenue.click();
            revenue.sendKeys("50000");

            WebElement date = driver.findElement(By.xpath("//*[@id=\"id-4f3ba324-7a24-4824-8b14-e4324c50b337-16-crf3c_estimatedstartdate5b773807-9fb2-42db-97c3-7a91eff8adff-crf3c_estimatedstartdate.fieldControl-crf3c_estimatedstartdate.fieldControl._datecontrol-date-container\"]/div/div/div/div/div/i"));
            date.click();

            WebElement date_click = driver.findElement(By.xpath("//*[@id=\"DatePicker-Callout11\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[6]/td[5]/button"));
            date_click.click();

            WebElement end_date = driver.findElement(By.xpath("//*[@id=\"id-4f3ba324-7a24-4824-8b14-e4324c50b337-19-crf3c_estimatedenddate5b773807-9fb2-42db-97c3-7a91eff8adff-crf3c_estimatedenddate.fieldControl-crf3c_estimatedenddate.fieldControl._datecontrol-date-container\"]/div/div/div/div/div/i"));
            end_date.click();

            WebElement end_day_click = driver.findElement(By.xpath("//*[@id=\"DatePicker-Callout16\"]/div/div/div[2]/div[2]/div[2]/table/tbody/tr[6]/td[4]/button"));
            end_day_click.click();
//
//		WebElement end_month_click = driver.findElement(By.xpath("//*[@id=\"DatePicker-Callout27\"]/div/div/div[2]/div[4]/div/div[2]/div/div[3]/button[3]"));
//		end_month_click.click();


            WebElement service_type = driver.findElement(By.xpath("//*[@id=\"id-4f3ba324-7a24-4824-8b14-e4324c50b337-22-crf3c_servicetype3ef39988-22bb-4f0b-bbbe-64b5a3748aee-crf3c_servicetype.fieldControl-option-set-select\"]"));
            service_type.sendKeys(Keys.DOWN, Keys.ENTER);

            WebElement no_of_months = driver.findElement(By.xpath("//*[@id=\"id-4f3ba324-7a24-4824-8b14-e4324c50b337-25-crf3c_noofmonthsc6d124ca-7eda-4a60-aea9-7fb8d318b68f-crf3c_noofmonths.fieldControl-whole-number-text-input\"]"));
            no_of_months.click();
            no_of_months.sendKeys("1");


        }
        catch(Exception e)
        {
            System.out.println("List of Exceptions:\n"+e+"\n");
        }

//		driver.quit();
    }
}
