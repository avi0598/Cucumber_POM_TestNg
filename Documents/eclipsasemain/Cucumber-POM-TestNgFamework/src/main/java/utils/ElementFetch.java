package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseTest.baseTest;

public class ElementFetch {
	
 	
	
	public WebElement getWebElement(String indentifierType, String identifierValue)

	{

	switch(indentifierType) {

	case "XPATH":

	return baseTest.driver.findElement(By.xpath(identifierValue));

	case "CSS":

	return baseTest.driver.findElement(By.cssSelector(identifierValue));

	case "ID":

	return  baseTest.driver.findElement(By.id(identifierValue));

	case " NAME":

	return  baseTest.driver.findElement(By.name(identifierValue));

	case " TAGNAME":

	return  baseTest.driver.findElement(By.tagName(identifierValue));

	default:

	return null;
	}}

	public List<WebElement> getWebElements (String indentifierType, String identifierValue){

	switch(indentifierType) {

	case "XPATH":

	return  baseTest.driver.findElements(By.xpath(identifierValue));

	case "CSS":

	return  baseTest.driver.findElements(By.cssSelector(identifierValue));

	case "ID":

	return  baseTest.driver.findElements(By.id(identifierValue));

	case "NAME":

	return  baseTest.driver.findElements(By.name(identifierValue));

	case "TAGNAME":

	return  baseTest.driver.findElements(By.tagName(identifierValue));

	default:

	return null;
}}}