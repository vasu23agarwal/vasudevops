package fbsel;

public class facebookreg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class FacebookSignUp {

			public ChromeDriver driver;
			
			System.setProperty("webdriver.chrome.driver", "//home//craterzone//chromedriver");
			driver=new ChromeDriver();
			driver.get("file:///C:/Users/DELL/Desktop/Dummy%20facebook/Facebook.html/");
			}
			
			public void Close(){
			driver.quit();

			}
			
			public void FbLgSu() throws InterruptedException{
			//driver.findElementById("email").clear();
			driver.findElementById("email").sendKeys("abc@gmail.com");
			driver.findElementById("pass").sendKeys("abc");
			driver.findElementById("u_0_v").click();
			driver.findElementByXPath(".//*[@id='register_link']/strong/a").click();
			driver.findElementByXPath(".//*[@id='u_0_0']").sendKeys("Selenium");
			driver.findElementByXPath(".//*[@id='u_0_1']").sendKeys("WebDriver");
			driver.findElementByXPath(".//*[@id='u_0_2']").sendKeys("7065334443");
			driver.findElementByXPath(".//*[@id='u_0_4']").sendKeys("7065334443");
			driver.findElementByXPath(".//*[@id='u_0_5']").sendKeys("vasu_ag123");

			Select Days =new Select(driver.findElementById("day"));
			Days.selectByValue("23");
			Thread.sleep(1000);
			Select Month =new Select(driver.findElementById("month"));
			Month.selectByValue("9");
			Thread.sleep(1000);
			Select Year =new Select(driver.findElementById("year"));
			Year.selectByValue("1998");

			//driver.findElementByXPath(".//*[@id='u_0_b']/div[2]/a").click();
			driver.findElementByXPath(".//*[@id='u_0_6']").click();
			driver.findElementByXPath(".//*[@id='u_0_8']/p/a[1]").click();
			driver.findElementByXPath(".//*[@id='u_0_8']/p/a[2]").click();
			driver.findElementByXPath(".//*[@id='u_0_8']/p/a[3]").click();
			driver.findElementByXPath(".//*[@id='u_0_9']").click();
			}
	}

}
