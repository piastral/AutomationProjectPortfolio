package screenShotHeadlessSSLAdBlockExtension;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtension {
	// now we will enable extension at Runtime the extension then can be used  ENABLE EXTENSION IN BROWSER THROUGH AUTOMATION
	/*1) ADD CRX EXTRACTOR/DOWNLOADER  TO CHROME  BROWSER  (MANUALLY)
	 * 
	 * 2) ADD SELECTORS HUB PLUGIN TO CHROME BROWSER ( MANUALLY)
	 * 
	 * 3) CAPTURE CRX FILE FOR SELECTORSHUB EXTENSION
	 * 
	 * 4) PASS CRX FILE PATH IN AUTOMATION SCRIPT IN CHROME OPTIONS
	 */

	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		File file = new File("C:\\Users\\mohammed\\eclipse-workspace\\PracticeSeleniumInterview\\SelectorHubCrx\\SelectorsHub.crx");
		 options.addExtensions(file);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

	}

}
