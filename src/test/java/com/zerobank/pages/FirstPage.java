package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {
    public FirstPage(){PageFactory.initElements(Driver.get(),this);}

    @FindBy(xpath = "//button")
    public WebElement signBtn;


}
