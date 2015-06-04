package com.flipkart.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.flipkart.utilities.Driver;

public class MainItemPage {

	@FindBy(xpath = "//h1[@class='title']")
	private WebElement itemName;

	public MainItemPage() {

		PageFactory.initElements(Driver.driver, this);
	}

	public boolean verifyItem() {
		
		try {
			Assert.assertEquals(itemName.getText(),
					"Micromax Canvas 2 Colors A120 with 8 GB ROM");
			
			System.out.println("Item Found-"+ itemName.getText());
			
		} catch (Exception e) {
			
			return false;
		}
		
		return true;
	}
}
