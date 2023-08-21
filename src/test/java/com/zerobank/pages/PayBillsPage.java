package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{


    @FindBy(css = "#sp_amount")
    private WebElement amountInputBox;


    @FindBy(css = "#sp_date")
    private WebElement dateInputBox;


    @FindBy(css = "#sp_description")
    private WebElement descriptionInputBox;

    @FindBy(css = "#pay_saved_payees")
    private WebElement payButton;


    @FindBy(css = "div#alert_content>span")
    private WebElement successMessage;



    public void sendAmount(String amount){
        BrowserUtils.sendKeys(amountInputBox,amount);
    }


    public void sendDate(String date){
        BrowserUtils.sendKeys(dateInputBox,date);
    }


    public void sendDescription(String description){
        BrowserUtils.sendKeys(descriptionInputBox,description);
    }


    public void clickPayButton(){
        BrowserUtils.clickWithJS(payButton);
    }


    public String getSuccessMessageText(){
        return BrowserUtils.getText(successMessage);
    }


    public String getAmountErrorMessage(){
        return amountInputBox.getAttribute("validationMessage");
    }


    public String getDateErrorMessage(){
        return dateInputBox.getAttribute("validationMessage");
    }


    public boolean isDateBoxEmpty(){
       return dateInputBox.getAttribute("value").isEmpty();
    }


}
