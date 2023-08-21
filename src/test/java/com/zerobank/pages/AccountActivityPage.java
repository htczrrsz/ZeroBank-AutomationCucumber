package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage{


    @FindBy (css="#aa_accountId")
    private WebElement dropDownMenu;


    @FindBy(css = "thead th")
    private List<WebElement> columnElementsOfSavingsAccount;



    public String getDefaultSelectedElementText(){
        Select select= new Select(dropDownMenu);
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        return BrowserUtils.getText(firstSelectedOption);
    }


    public List<String> getAllTextsInDropdownMenu(){
        Select select= new Select(dropDownMenu);
        List<WebElement> options = select.getOptions();
        List<String> elementsText = BrowserUtils.getElementsText(options);
        return elementsText;
    }


    public List<String> getColumnNamesOfSavingAccount(){
        List<String> elementsText = BrowserUtils.getElementsText(columnElementsOfSavingsAccount);
        return elementsText;
    }


}
