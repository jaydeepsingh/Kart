package com.flipkart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.utilities.Driver;

public class ItemListPage {

	@FindBy(xpath = ".//*[@id='products']/div[1]/div[1]/div/div[1]/a[1]/img")
	private WebElement firstProduct;

	public ItemListPage() {
		// WebDriver driver= Driver.driver;
		PageFactory.initElements(Driver.driver, this);
	}

	public boolean selectFirstProduct() {
		try {

			firstProduct.click();
			// CommonUtilities.clickEvent(firstProduct);

		} catch (Exception e) {
			return false;
		}
		return true;
	}

	

	

}
