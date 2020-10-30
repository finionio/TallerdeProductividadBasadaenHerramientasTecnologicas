package TestUnit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 *
 * @author Fernando Gutierrez
 */
public class Prueba {
    //prueba para realizar login automatico en base a un archivo excel, incluido en el repositorio
    public static void main(String[] argumentos) throws InterruptedException, NoSuchElementException, IOException {
      //Propiedades del archivo excel 
      String excelPath = "./Credenciales/credenciales.xlsx";  //Debe ser aguevo establecido como system.property
      String sheetName = "auth_sheet";
      
      //Estableciendo propiedad del ChromeDriver
      System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");
      
      //Instanciamiento de mi clase ExcelUtils para construir un lector
      ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
      
      //instanciamiento del usuario y password
      String usr = excel.getCellData(1,0);
      String pwd = excel.getCellData(1,1);
      
      //Instanciamiento del WebDriver para firefox 
      WebDriver driver;
      driver = new FirefoxDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      String url = excel.getCellData(1, 2);
      
      
      /*
      //metodo accionador del driver con URL  
      driver.get(url);
      //instanciamiento de webdriverWait
      WebDriverWait wait;
      wait = new WebDriverWait(driver, 20);
      //Esperamos a que se cargue el elementoHTML quenecesitamos para ls pruebas  
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"))).sendKeys(usr); 
      driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
      driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/input")).sendKeys(pwd);
      driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
      driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
       
      Thread.sleep(5000); 
      //Esperar a que se cargue el feed para cerrar sesión
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/i"))).click();
      //Cerrar sesión
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div[1]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span"))).click();
      */

      Thread.sleep(5000); 
      driver.close();
      driver.quit();
       
    
    }
    
    
    
    
}
