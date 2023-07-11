package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features="D:\\FisPractice\\Activity\\src\\test\\java\\Features\\Login.feature",
glue={"StepDefinitions"},
tags="@tag2",
dryRun=false,
monochrome=true,
plugin= {"pretty"})

public class TestRunner {
	
//	 public void openBrowser() {
//		 
//	 }
	 public void enter_the_url(String url){
		 
	 }
	 public void clickDropdown() {
		 
	 }
	
	 public void selectOption1FromDropdown(String string) {
		 
	 }
	 public void selectOption2FromDropdown(String string) {
	 }
	 
	 public void navigateBack() {
		 
	 }

	 public void selectCheckboxes(){
		 
	 }
	 public void Openurl() {
		 
	 }
	 public void Fileupload() {
		 
	 }
	 public void Uploadfile() {
		 
	 }
	 public void Success() {
		 
	 }
}
