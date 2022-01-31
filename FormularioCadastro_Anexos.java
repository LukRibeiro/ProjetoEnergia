package S5_Boleta;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.LoginPage;
import suporte.Generator;
import suporte.GetCPF;
import suporte.Screenshot;
import suporte.WebMle_Boleta;

public class FormularioCadastro_Anexos {
	
	
	static WebDriver driver; 
	
	GetCPF cpf = new GetCPF();

		
		@Rule
		public TestName test = new TestName();
		
		

		
		
		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			
					
			driver = WebMle_Boleta.createChrome();
			
		//	driver.manage().deleteAllCookies();
			
			
			
		}
		
		
		@Test
		public void PrimeiroCadastro() throws InterruptedException {
			
			
            LoginPage login = new LoginPage(driver);
			
			login.TypeUsernameBoleta();
			login.TypePasswordBoleta();
			login.clickOnLoginButtonBoleta();
		    
		  
		    
		    
		     
		    // Etapa 1 de 3 Dados da empresa
		    
		    
		 
			
			
			  driver.findElement(By.id("naturezaJuridica")).click();
			    {
			      WebElement dropdown = driver.findElement(By.id("naturezaJuridica"));
			      dropdown.findElement(By.xpath("//option[. = 'Sociedade Anônima']")).click();
			    }
			    driver.findElement(By.id("nire")).click();
			    driver.findElement(By.id("nire")).sendKeys(""+new Random().nextInt(10000));
			 
			    driver.findElement(By.id("inscricaoEstadual")).sendKeys(""+new Random().nextInt(10000));
		
			    driver.findElement(By.id("inscricaoMunicipal")).sendKeys(""+new Random().nextInt(10000));
			
			    driver.findElement(By.id("codigoAgenteCCE")).sendKeys(""+new Random().nextInt(10000));
			
			    driver.findElement(By.id("cep")).sendKeys("81200100");
			    
						    
			    
		  //    driver.findElement(By.id("logradouro")).sendKeys("Curitiba");
			    
			    
			    driver.findElement(By.id("numero")).sendKeys("28780");
			    
			    
			    
		  //    driver.findElement(By.id("bairro")).sendKeys("Mossungue");
		  //    driver.findElement(By.id("uf")).click();
	      //    driver.findElement(By.xpath("//*[@id=\"uf\"]/option[16]")).click();
		  //    driver.findElement(By.id("municipio")).sendKeys("Curitiba");		
			    
			    
			    driver.findElement(By.id("complemento")).sendKeys("perto da padaria");
			    driver.findElement(By.id("emailCobranca")).sendKeys("lizeth3570@uorak.com");
			    
			    driver.findElement(By.cssSelector(".col-12:nth-child(1) .form-check-label")).click();
			    driver.findElement(By.id("nomeResponsavel")).click();
			    driver.findElement(By.id("nomeResponsavel")).sendKeys("Jose");
			    driver.findElement(By.id("telefoneComunicacao")).sendKeys("(41) 99666-4448");
			    driver.findElement(By.id("emailComunicacao")).click();
			    
			    
			    driver.findElement(By.id("emailComunicacao")).sendKeys("l@gmail.com");
			    driver.findElement(By.cssSelector(".col-12:nth-child(5) .form-check-label")).click();
			    driver.findElement(By.id("nomeResponsavelFatura")).click();
			    driver.findElement(By.id("nomeResponsavelFatura")).sendKeys("Jubileu");
			    
			    
			    driver.findElement(By.id("emailResponsavelFatura")).sendKeys("joao@gmail.com");
			    driver.findElement(By.id("nomeBanco")).click();
			    driver.findElement(By.id("nomeBanco")).sendKeys("Santander");
			    driver.findElement(By.id("agencia")).sendKeys("0038");
			    driver.findElement(By.id("contaCorrente")).click();
			    
			    
			    driver.findElement(By.id("contaCorrente")).sendKeys("1142010");
			    			    driver.findElement(By.cssSelector(".btn")).click();
			    
			    
			    
			    
			    // Etapa 2 de 3 Dados da empresa 
			    
			    
			    
			  
			    driver.findElement(By.cssSelector("input[formControlName='nome']")).sendKeys("Lucas Legal");
			    driver.findElement(By.id("emailRepresentante-0")).sendKeys("l@gmail.com");
			    driver.findElement(By.id("cpfRepresentante-0")).sendKeys("" +cpf.cpf());
			    driver.findElement(By.id("dtNascimentoRepresentante-0")).sendKeys("09031975");
			    
			    driver.findElement(By.xpath("/html/body/app-root/app-primeiro-cadastro/div/div/form/div/div[2]/div/div[2]/div[2]/div/button/span[2]")).click();
			    
			    //representante2
			    
	//		    driver.findElement(By.id("nomeRepresentante-1")).sendKeys("Marcelo Alvez");
	//		    driver.findElement(By.id("emailRepresentante-1")).sendKeys("Marcelo@gmail.com");
	//		    driver.findElement(By.id("cpfRepresentante-1")).sendKeys("" +cpf.cpf());
	//		    driver.findElement(By.id("dtNascimentoRepresentante-1")).sendKeys("09031988");
			    
			    
			    
			   			    
			    driver.findElement(By.id("nomeUsuario-0")).sendKeys("Marcos Consulta");
			    driver.findElement(By.id("emailUsuario-0")).sendKeys("marcos@gmail.com");
			    driver.findElement(By.id("cpfUsuario-0")).sendKeys("" +cpf.cpf());
			    driver.findElement(By.id("dtNascimentoUsuario-0")).sendKeys("09061983");
			    
			    driver.findElement(By.id("tipoUsuario-0")).click();
			    {
			      WebElement dropdown = driver.findElement(By.id("tipoUsuario-0"));
			      dropdown.findElement(By.xpath("//*[@id=\"tipoUsuario-0\"]/option[3]")).click();
			    }
			    
			    
			    driver.findElement(By.xpath("/html/body/app-root/app-primeiro-cadastro/div/div/form/div/div[3]/div/div[2]/div[2]/div[2]/div/button/span[2]")).click();
			    
			    driver.findElement(By.id("nomeUsuario-1")).sendKeys("Keanu Testemunha");
			    driver.findElement(By.id("emailUsuario-1")).sendKeys("Keanu@gmail.com");
			    driver.findElement(By.id("cpfUsuario-1")).sendKeys("" +cpf.cpf());
			    driver.findElement(By.id("dtNascimentoUsuario-1")).sendKeys("04102000");
			    driver.findElement(By.id("tipoUsuario-1")).click();
			    {
			      WebElement dropdown = driver.findElement(By.id("tipoUsuario-1"));
			      dropdown.findElement(By.xpath("//*[@id=\"tipoUsuario-1\"]/option[2]")).click();
			    }
			   

			    Thread.sleep(1000);
			    
		       driver.findElement(By.xpath("/html/body/app-root/app-primeiro-cadastro/div/div/form/div/div[3]/div/div[2]/div[3]/div/button[2]")).click();
			    
			    
			   //Pagina 3 de anexos 
		       
		      	
		       	 driver.findElement(By.xpath("/html/body/app-root/app-primeiro-cadastro/app-header/div/div/div/div/span")).click();
		        
		         driver.findElement(By.id("file")).sendKeys("C:\\Anexos\\3.png");
		       
		//       driver.findElement(By.xpath("/html/body/app-root/app-primeiro-cadastro/div/div/form/div/div[2]/div/div[2]/div[2]/div/button[2]")).click();
			    
			    
			    
			    
			    
			    String screenshotArquivo = "C:\\Users\\p-lucribeiro\\TestReport\\" + Generator.dataHoraparaArquivo() + test.getMethodName() + "png" ;
			    Screenshot.tirar(driver, screenshotArquivo );
			    
			    
		}
			
	 

              @AfterClass
              public static void tearDownAfterClass() throws Exception {

             //driver.quit();



}

}
	
			





