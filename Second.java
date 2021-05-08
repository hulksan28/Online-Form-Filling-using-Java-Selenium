import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Second
{
	public static void main(String [] arg) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://vtop2.vitap.ac.in:8070/vtop/initialProcess");
		
			Thread.sleep(5000);
		
		driver.findElement(By.linkText("Login to VTOP")).click();
		/*
		try 
		{
			//System.out.println("Sleepin for 5 seconds");
			Thread.sleep(5000);
		} catch (InterruptedException e) 
		{
			System.out.println("Thread is interrupted");
		}
		*/
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[3]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"uname\"]")).sendKeys("Write your registration number");
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Write your password here");
		String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
		driver.findElement(By.xpath("//*s[@id=\"captchaCheck\"]")).sendKeys(captchaVal);
		driver.findElement(By.xpath("//*[@id=\"captcha\"]")).click();
		Thread.sleep(5000);
		/*
		driver.findElement(By.xpath("//*[@id=\"button-panel\"]/aside/section/div/div[14]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"FE0001\"]")).click();
		*/
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"button-panel\"]/aside/section/div/div[1]/a"));
		action.moveToElement(element).perform();
		
		//driver.findElement(By.xpath("//*[@id=\"FE0001\"]")).click();
		Actions action2 = new Actions(driver);
		List<WebElement> element2 = driver.findElements(By.xpath("//*[@id=\"FE0001\"]"));
		
		for(int i=0;i<2;i++)
		{
			WebElement ele=element2.get(i);
			
			if(i==1)
			{
				System.out.println("hii");
				ele.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"type\"]/option[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
		
		//Crypto
		
		driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"245\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"246\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"247\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"248\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"249\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"250\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"251\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"252\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"253\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"262\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"263\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"264\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"268\"]")).sendKeys("okay");
		
		driver.findElement(By.xpath("//*[@id=\"286\"]")).sendKeys("notrequired");
		
		driver.findElement(By.xpath("//*[@id=\"287\"]")).sendKeys("average");
		
		driver.findElement(By.xpath("//*[@id=\"288\"]")).sendKeys("reallifeexamples");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click(); 
		
		Thread.sleep(3000);
		
		//OOPS
		
driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"type\"]/option[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"245\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"246\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"247\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"248\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"249\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"250\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"251\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"252\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"253\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"262\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"263\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"264\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"268\"]")).sendKeys("okay");
		
		driver.findElement(By.xpath("//*[@id=\"286\"]")).sendKeys("notrequired");
		
		driver.findElement(By.xpath("//*[@id=\"287\"]")).sendKeys("average");
		
		driver.findElement(By.xpath("//*[@id=\"288\"]")).sendKeys("reallifeexamples");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		
		//CG
		
driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"type\"]/option[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
		
				driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[4]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"245\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"246\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"247\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"248\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"249\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"250\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"251\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"252\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"253\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"262\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"263\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"264\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"268\"]")).sendKeys("okay");
				
				driver.findElement(By.xpath("//*[@id=\"286\"]")).sendKeys("notrequired");
				
				driver.findElement(By.xpath("//*[@id=\"287\"]")).sendKeys("average");
				
				driver.findElement(By.xpath("//*[@id=\"288\"]")).sendKeys("reallifeexamples");
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
				
				Thread.sleep(2000);
				
		
				
		//COA
		
				driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
		
				driver.findElement(By.xpath("//*[@id=\"type\"]/option[2]")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[5]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"245\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"246\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"247\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"248\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"249\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"250\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"251\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"252\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"253\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"262\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"263\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"264\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"268\"]")).sendKeys("okay");
				
				driver.findElement(By.xpath("//*[@id=\"286\"]")).sendKeys("notrequired");
				
				driver.findElement(By.xpath("//*[@id=\"287\"]")).sendKeys("average");
				
				driver.findElement(By.xpath("//*[@id=\"288\"]")).sendKeys("reallifeexamples");
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				Thread.sleep(2000);
				
				Thread.sleep(3000);
				
			
				
		//DMS
	

				driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"type\"]/option[2]")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[6]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"245\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"246\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"247\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"248\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"249\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"250\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"251\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"252\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"253\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"262\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"263\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"264\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"268\"]")).sendKeys("okay");
				
				driver.findElement(By.xpath("//*[@id=\"286\"]")).sendKeys("notrequired");
				
				driver.findElement(By.xpath("//*[@id=\"287\"]")).sendKeys("average");
				
				driver.findElement(By.xpath("//*[@id=\"288\"]")).sendKeys("reallifeexamples");
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				Thread.sleep(2000);
				
				Thread.sleep(5000);
				
				
			
		//AS

				driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"type\"]/option[2]")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[7]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"245\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"246\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"247\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"248\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"249\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"250\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"251\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"252\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"253\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"262\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"263\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"264\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"268\"]")).sendKeys("okay");
				
				driver.findElement(By.xpath("//*[@id=\"286\"]")).sendKeys("notrequired");
				
				driver.findElement(By.xpath("//*[@id=\"287\"]")).sendKeys("average");
				
				driver.findElement(By.xpath("//*[@id=\"288\"]")).sendKeys("reallifeexamples");
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				Thread.sleep(2000);
				
				Thread.sleep(5000);
				
		//MGT

				
				driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"type\"]/option[2]")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[8]")).click();
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"245\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"246\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"247\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"248\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"249\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"250\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"251\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"252\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"253\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"262\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"263\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"264\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"268\"]")).sendKeys("okay");
				
				driver.findElement(By.xpath("//*[@id=\"286\"]")).sendKeys("notrequired");
				
				driver.findElement(By.xpath("//*[@id=\"287\"]")).sendKeys("average");
				
				driver.findElement(By.xpath("//*[@id=\"288\"]")).sendKeys("reallifeexamples");
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				Thread.sleep(2000);
				
				Thread.sleep(5000);
				
/*		//STS
 * 
 */
				for(int i=0;i<2;i++)
				{
					WebElement ele=element2.get(i);
					
					if(i==1)
					{
						System.out.println("hii");
						ele.click();
						break;
					}
				}
				
				driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"type\"]/option[2]")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[9]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"245\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"246\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"247\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"248\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"249\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"250\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"251\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"252\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"253\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"262\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"263\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"264\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"268\"]")).sendKeys("okay");
				
				driver.findElement(By.xpath("//*[@id=\"286\"]")).sendKeys("notrequired");
				
				driver.findElement(By.xpath("//*[@id=\"287\"]")).sendKeys("average");
				
				driver.findElement(By.xpath("//*[@id=\"288\"]")).sendKeys("reallifeexamples");
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				Thread.sleep(2000);
				
				Thread.sleep(5000);
				
				
				
		
				
		//LAB_WORK
				action.moveToElement(element).perform();
				
				for(int i=0;i<2;i++)
				{
					WebElement ele=element2.get(i);
					
					if(i==1)
					{
						System.out.println("hii");
						ele.click();
						break;
					}
				}
				
				driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"type\"]/option[3]")).click();
				
				Thread.sleep(3000);
				
		    //OOPS
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[2]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"254\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"255\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"256\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"257\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"258\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				Thread.sleep(2000);
				
				Thread.sleep(5000);
			
			//CG
				action.moveToElement(element).perform();
				for(int i=0;i<2;i++)
				{
					WebElement ele=element2.get(i);
					
					if(i==1)
					{
						System.out.println("hii");
						ele.click();
						break;
					}
				}
				
driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"type\"]/option[3]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[3]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"254\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"255\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"256\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"257\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"258\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				Thread.sleep(2000);
				
				Thread.sleep(5000);
			//AS
				action.moveToElement(element).perform();
				for(int i=0;i<2;i++)
				{
					WebElement ele=element2.get(i);
					
					if(i==1)
					{
						System.out.println("hii");
						ele.click();
						break;
					}
				}
				
driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"type\"]/option[3]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[4]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"254\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"255\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"256\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"257\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"258\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				Thread.sleep(2000);
				
				Thread.sleep(5000);
				
				
				//ETHICS
				action.moveToElement(element).perform();
				for(int i=0;i<2;i++)
				{
					WebElement ele=element2.get(i);
					
					if(i==1)
					{
						System.out.println("hii");
						ele.click();
						break;
					}
				}
				
				driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
								
								driver.findElement(By.xpath("//*[@id=\"type\"]/option[3]")).click();
								
								Thread.sleep(3000);
								
								driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
								
								driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[5]")).click();
								
								Thread.sleep(3000);
								
								driver.findElement(By.xpath("//*[@id=\"254\"]")).click();
								
								driver.findElement(By.xpath("//*[@id=\"255\"]")).click();
								
								driver.findElement(By.xpath("//*[@id=\"256\"]")).click();
								
								driver.findElement(By.xpath("//*[@id=\"257\"]")).click();
								
								driver.findElement(By.xpath("//*[@id=\"258\"]")).click();
								
								driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
								
								Thread.sleep(2000);
								
								Thread.sleep(5000);
								
				
				
	
			//LABFACILITY
								action.moveToElement(element).perform();			
								for(int i=0;i<2;i++)
								{
									WebElement ele=element2.get(i);
									
									if(i==1)
									{
										System.out.println("hii");
										ele.click();
										break;
									}
								}
								
				driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"type\"]/option[4]")).click();
				
				Thread.sleep(3000);
				
				
			//OOPS
				driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[2]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"259\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"260\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"261\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				Thread.sleep(2000);
				
driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
				
				Thread.sleep(5000);
				
			//CG
				action.moveToElement(element).perform();
				for(int i=0;i<2;i++)
				{
					WebElement ele=element2.get(i);
					
					if(i==1)
					{
						System.out.println("hii");
						ele.click();
						break;
					}
				}
				
driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"type\"]/option[4]")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[3]")).click();
				
				Thread.sleep(3000);
				
driver.findElement(By.xpath("//*[@id=\"259\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"260\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"261\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				Thread.sleep(2000);
				
				Thread.sleep(5000);
				
				
			//AS
				action.moveToElement(element).perform();
				for(int i=0;i<2;i++)
				{
					WebElement ele=element2.get(i);
					
					if(i==1)
					{
						System.out.println("hii");
						ele.click();
						break;
					}
				}
				
driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"type\"]/option[4]")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[4]")).click();
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//*[@id=\"259\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"260\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"261\"]")).click();
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
				
				Thread.sleep(2000);
				
				Thread.sleep(3000);
				
				//ETHICS
				action.moveToElement(element).perform();
				for(int i=0;i<2;i++)
				{
					WebElement ele=element2.get(i);
					
					if(i==1)
					{
						System.out.println("hii");
						ele.click();
						break;
					}
				}
				
				driver.findElement(By.xpath("//*[@id=\"type\"]")).click();
								
								driver.findElement(By.xpath("//*[@id=\"type\"]/option[4]")).click();
								
								Thread.sleep(3000);
								driver.findElement(By.xpath("//*[@id=\"courseId\"]")).click();
								
								driver.findElement(By.xpath("//*[@id=\"courseId\"]/option[5]")).click();
								
								Thread.sleep(5000);
								
								driver.findElement(By.xpath("//*[@id=\"259\"]")).click();
								
								driver.findElement(By.xpath("//*[@id=\"260\"]")).click();
								
								driver.findElement(By.xpath("//*[@id=\"261\"]")).click();
								
								driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
								
								Thread.sleep(2000);
								
								Thread.sleep(5000);
				
	}
}