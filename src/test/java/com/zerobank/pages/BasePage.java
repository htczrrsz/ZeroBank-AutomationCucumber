package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }




    public void navigateToSection(String str){
        WebElement element=Driver.get().findElement(By.xpath("//strong[.='"+str+"']"));
        BrowserUtils.clickWithJS(element);
    }


}



