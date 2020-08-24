package TS_001;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

public class FungsiUtama {
	WebDriver driver;

	@Given("^Open the Chrome and launch the application$")
	public void Open_the_Chrome_and_launch_the_application() throws Throwable{	
		System.out.println("Langkah ini untuk membuka Chrome dan menjalankan aplikasi.");
	}
	
	@When("^Enter the number of first testing$")
	public void Enter_the_number_of_first_testing() throws Throwable{
		System.out.println("Langkah ini untuk mengetikkan angka testing pertama.");
	}
	
	@Then ("^Showing the results$")
	public void Showing_the_results() throws Throwable{
		System.out.println("Langkah ini untuk menampilkan hasil perhitungan.");
	}
	
}

