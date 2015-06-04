package com.flipkart.test;

import org.openqa.selenium.support.PageFactory;

import com.flipkart.PageObjects.HomePage;
import com.flipkart.PageObjects.ItemListPage;
import com.flipkart.PageObjects.MainItemPage;
import com.flipkart.utilities.CommonUtilities;
import com.flipkart.utilities.Driver;

public class Test {

	public static void main(String[] args) {

		Driver.driver = Driver.browser("firefox");
		CommonUtilities.launchBrowser("http://www.flipkart.com");

		HomePage page = PageFactory.initElements(Driver.driver, HomePage.class);
		page.searchItem("mobile");
		
		//ItemListPage listpage = PageFactory.initElements(Driver.driver, ItemListPage.class);
		//listpage.selectFisrtProduct();
		
		ItemListPage listpage= new ItemListPage();
		listpage.selectFirstProduct();

		MainItemPage mainitempage= new MainItemPage();
		mainitempage.verifyItem();
		
		Driver.driver.close();
	}

}
