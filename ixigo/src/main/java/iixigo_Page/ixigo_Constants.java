package iixigo_Page;

import com.sun.javafx.property.adapter.PropertyDescriptor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ixigo_Constants
{
    @FindBy(xpath = "//*[@class='ixigo-logo-cntr']")
    public WebElement InputLogo;

    @FindBy(xpath = "//span[contains(text(),'Round Trip')]")
    public  WebElement TripSelection;

    @FindBy(xpath ="//div[@class='input-label' and contains(text(),\"From\")]/../input")
    public WebElement FromCity;

    @FindBy(xpath ="//div[@class='input-label' and contains(text(),\"To\")]/../input")
    public WebElement ToCity;

    @FindBy(xpath ="//div[@class='input-label' and contains(text(),\"Departure\")]/../input")
    public WebElement FromDate;

    @FindBy(xpath ="//div[@class='input-label' and contains(text(),\"Return\")]/../input")
    public WebElement ToDate;

    @FindBy(xpath ="//div[@class='input-label' and contains(text(),\"Travellers\")]/../input")
    public WebElement Passengers;

    @FindBy(xpath ="//*[@class='rd-date']//following::*[@class='rd-month-label']")
    public WebElement depdatevalidation;

    @FindBy(xpath ="(//*[@class='rd-date']//following::*[@class='rd-month-label'])[3]")
    public WebElement retdatevalidation;


    @FindBy(xpath ="//*[@class='ixi-icon-arrow rd-next']")
    public WebElement DepDatepickerNextArrow;

    @FindBy(xpath ="(//*[@class='ixi-icon-arrow rd-next'])[2]")
    public WebElement RetDatepickerNextArrow;

    @FindBy(xpath ="//div[2]/div[2]/div[1]/table/tbody[@class='rd-days-body']/tr[2]/td[1]/div[1]")
    public WebElement Departure_date;

    @FindBy(xpath ="//div[7]/div[2]/div[1]/table/tbody[@class='rd-days-body']/tr[2]/td[1]/div[1]")
    public WebElement Return_date;

    @FindBy(xpath="//*[@class='search u-ib u-v-align-bottom']")
    public WebElement Search_button;

    @FindBy(xpath="//*[@class='book-cta']")
    public WebElement SearchResultPage;

    @FindBy(xpath="//div[contains(text(),'Adult')]/../../div[2]/span[contains(text(),'2')]")
    public WebElement passengerCount;

    @FindBy(xpath="//div[contains(text(),\"Class\")]/../div[4]//span[contains(text(),'Business')]")
    public WebElement passengerClassValue;

    @FindBy(xpath="(//div[@class='input-label' and contains(text(),\"From\")]/../../div[2])[1]")
    public WebElement Clear_data;

    @FindBy(xpath = "(//*[@class='radio-list']//child::*//child::*[1])")
    public List<WebElement> pasengerClass;

    @FindBy(xpath ="//*[@class='stops']//child::*[@class='checkbox-list-item ']")
    public List<WebElement> ListofStops;

    @FindBy(xpath ="(//*[@class='price']//child::*[@class='c-price-display u-text-ellipsis ']//following-sibling::*[2])")
    public List<WebElement> priceList;

    @FindBy(xpath="//*[@class='airline-text']")
    public List<WebElement> ListAirlines;

    @FindBy(xpath="(//*[@class='time-group']//child::*[@class='time'][1])")
    public List<WebElement> DepTime;


}
