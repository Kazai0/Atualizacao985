package br.com.automatizar;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

import com.thoughtworks.selenium.webdriven.commands.Click;


import br.com.telas.TelaInicial;

public class Automatizar {

	// criando objetos
	
	TelaInicial tela1 = new TelaInicial();
	
	public void entrandoNoSite(){
		
		try {
			
			System.setProperty("webDriver.chrome.driver","C:\\Users\\jean.franzen\\Desktop\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			

			
			
			driver.get("http://192.168.0.1/");
				
			driver.findElement(By.id("username")).clear();
			
			driver.findElement(By.id("username")).sendKeys("support");
			
			driver.findElement(By.id("password")).sendKeys("support");
			
			
			driver.findElement(By.id("LoginId")).click();
			
			
			//Obrigado Deus
			driver.switchTo().frame("mainFrame");
			
			driver.findElement(By.id("mmManager")).click();
			
			
			Thread.sleep(1000);
			
			driver.findElement(By.id("smSysMgr")).click();
			
			Thread.sleep(1200);
			
			driver.findElement(By.id("ssmSoftUgr")).click();
			
			Thread.sleep(1200);
			
			driver.findElement(By.className("white")).click();
			
			
				for (int i = 0; i < 4; i++) {
					
				Thread.sleep(42000);
					
				driver.navigate().refresh();
				
				
				
				driver.findElement(By.id("username")).clear();
				
				driver.findElement(By.id("username")).sendKeys("support");
				
				driver.findElement(By.id("password")).sendKeys("support");
				
				
				driver.findElement(By.id("LoginId")).click();
				
				
				//Obrigado Deus
				driver.switchTo().frame("mainFrame");
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("mmManager")).click();
				
				
				Thread.sleep(2000);
				
				driver.findElement(By.id("smSysMgr")).click();
				
				Thread.sleep(2000);
				
			
				
				driver.findElement(By.id("ssmSoftUgr")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.className("white")).click();
				
//				driver.findElement(By.xpath("//*[@id='VersionUpload']"));
				
				
				
				}
				
				Thread.sleep(42000);
				
				driver.quit();
				
		
			
			
			
			
} catch (Exception e) {
	System.out.println(e);
}

}

	
	
		
		
		
		
			
			
			
			
			
	
			

	private By ByXPath(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
