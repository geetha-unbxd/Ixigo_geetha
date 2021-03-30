package ixigo_Actions;

import iixigo_Page.ixigo_Constants;
import javafx.scene.control.DatePicker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;
import java.util.List;

public class ixigo_actions extends ixigo_Constants {
    WebDriver driver = null;


    public void LoginPage_validation() {
        Assert.assertTrue(InputLogo.isDisplayed(), "Webpage Validation failed");
        String inp = InputLogo.getText();
        System.out.println("Logo is displayed successfully" + inp);

    }

    public void Travel_Validation() throws InterruptedException {
        TripSelection.click();
        Thread.sleep(1000);
        if(Clear_data.isDisplayed()) {
            Clear_data.click();
        }
        FromCity.sendKeys("DEL");
        Thread.sleep(2000);
        FromCity.sendKeys(Keys.RETURN);

        Thread.sleep(2000);
        ToCity.sendKeys("BLR");
        Thread.sleep(2000);
        ToCity.sendKeys(Keys.RETURN);
    }

    public void Datepicker() throws InterruptedException {
        Thread.sleep(1000);
        String dep_month = "April 2021";
        FromDate.click();
        while (true) {
            String txt = depdatevalidation.getText();
            if (txt.equals(dep_month)) {
                break;
            } else {
                Thread.sleep(1000);
                DepDatepickerNextArrow.click();

            }
        }
        Departure_date.click();
    }
    public void RDatepicker() throws InterruptedException {
        Thread.sleep(1000);
        String ret_month = "June 2021";
        ToDate.click();
        while (true) {
            String txt = retdatevalidation.getText();

            if (txt.equals(ret_month))
            {
                break;
            }else
            {
                Thread.sleep(1000);
                RetDatepickerNextArrow.click();

            }
        }
        Thread.sleep(1000);
        Return_date.click();

    }

    public void SearchPage_validation() throws InterruptedException {
        Thread.sleep(1000);
        Passengers.click();
        passengerCount.click();
        pasengerClass.get(classIndex("Economy"));

        Thread.sleep(1000);
        Search_button.click();
        Assert.assertTrue(SearchResultPage.isDisplayed(), "SearchPage Validation failed");
        System.out.println("Search page is displayed successfully");
    }
    public void Filter_validation() throws InterruptedException {
        if( ListofStops.size()==3)
        {
            System.out.println("Stops filter options are displayed");
            ListofStops.get(0).click();
            Thread.sleep(1000);
            int sizePrice = priceList.size();
            for(int i=0;i<sizePrice-1;i++){
                String getFare = priceList.get(i).getText();
                int airlinePrice = Integer.parseInt(getFare);
                if(airlinePrice < 7000){
                    String pTime=DepTime.get(i).getText();
                    String AirlineNumber=ListAirlines.get(i).getText();
                    System.out.println("\nAirlines: " +AirlineNumber );
                    System.out.println("Departure : "+ pTime);
                    System.out.println("Fare: " +getFare );
                }
            }

        }


    }
    public int classIndex(String pasengerClass) {
        int index = 1;
        if (pasengerClass.equalsIgnoreCase("Economy")) {
            index = 1;
        } else if (pasengerClass.equalsIgnoreCase("Business")) {
            index = 2;
        } else if (pasengerClass.equalsIgnoreCase("Premium Economy")) {
            index = 3;
        }
        return index;
    }


}