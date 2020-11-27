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
 
      
      //Estableciendo propiedad del ChromeDriver
      System.setProperty("webdriver.gecko.driver", "C:/GeckoDriver/geckodriver.exe");

      //Instanciamiento del WebDriver para firefox 
      WebDriver driver;
      driver = new FirefoxDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      String url = "file:///C:/Users/Toshiba/Desktop/Tecmilenio/Ultimo%20Semestre/Ultimo%20Java/ProyectoIntegrador/Bana-na/src/main/webapp/PROYECTO%20FINAL.html";      
      
            //metodo accionador del driver con URL  
      driver.get(url);
      //instanciamiento de webdriverWait
      WebDriverWait wait;
      wait = new WebDriverWait(driver, 20);
      
      driver.findElement(By.xpath("/html/body/div/div[1]/a/button")).click();
      
      
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"new_restaurante\"]"))).sendKeys("Bana-na");
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"new_contraseña_res\"]"))).sendKeys("petish");
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"confirmar_contraseña_res\"]"))).sendKeys("petish");
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"direccion_res\"]"))).sendKeys("Enrique Segoviano");
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/div[3]/select/option[7]")));
      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"boton_registrarse_restaurante\"]"))).click();

      Thread.sleep(5000); 
      
      driver.findElement(By.xpath("/html/body/div[1]/div/h2[2]")).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"boton_crear_platillo\"]"))).click();      
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"new_platillo\"]"))).sendKeys("panquecito chocolate");      
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"new_precio\"]"))).sendKeys("20");      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/button[1]"))).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);      
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/h3"))).click();      
          
      
      
      
      
      Thread.sleep(5000); 
      driver.close();
      driver.quit();
       
    
    }
    
    
    
    
}
