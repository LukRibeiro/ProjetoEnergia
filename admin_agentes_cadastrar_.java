package MVP_Admin;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import suporte.getValidaCNPJ;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Pages.LoginPage;
import suporte.Generator;
import suporte.Screenshot;
import suporte.Web;
import suporte.WebAdm;
import suporte.WebAdmHeadless;
import suporte.WebHeadless;



public class admin_agentes_cadastrar_ {
	
static WebDriver driver;
	getValidaCNPJ cnpj = new getValidaCNPJ();

	
	@Rule
	public TestName test = new TestName();
	
		
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		driver = WebAdm.createChrome();
	}
	
		 
		    
	  @Test
		public void cadastro() throws InterruptedException {
			
			LoginPage login = new LoginPage(driver);
			
			login.TypeUsernameAdm();;
			login.TypePasswordAdm();
			login.clickOnLoginButton();
			
			
			
			
			driver.findElement(By.linkText("Agentes")).click();
		    driver.findElement(By.linkText("Cadastrar")).click();
		    
		    		    	    
            Thread.sleep(1000);
		    		    
		    WebElement mensageminicial = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[1]/h2" ));
			String mensagem = mensageminicial.getText();
		    assertEquals("Informações Gerais do Agente", mensagem);
		    
		    		    
		    driver.findElement(By.xpath("//*[@formcontrolname='codigoB3']")).sendKeys(""+new Random().nextInt(10000));
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[1]/div[1]/div[2]/div/div/input")).sendKeys("energia");
		    
		   		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[1]/div[1]/div[3]/div/div/input")).sendKeys("" +cnpj.cnpj(false)); // Campo CNPJ
		    
		    
		    {
		        WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[1]/div[1]/div[4]/div"));
		        dropdown.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[1]/div[1]/div[4]/div/select/option[2]")).click();
		      
		    }
		    
		    
		    driver.findElement(By.cssSelector("input[formControlName=nire]")).sendKeys("Energia B3");
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[1]/div[1]/div[6]/div/div/input")).sendKeys("45554");
		    
		    driver.findElement(By.cssSelector("input[formControlName=inscricaoMunicipal]")).sendKeys(""+new Random().nextInt(10000));
		    
		    driver.findElement(By.cssSelector("input[formControlName=grupoEconomico]")).sendKeys("zuk");
		    
		  		
		    
		    driver.findElement(By.cssSelector("input[formControlName=cep]")).sendKeys("81200100");
		    driver.findElement(By.cssSelector("input[formControlName=logradouro]")).sendKeys("Curitiba");
		    driver.findElement(By.cssSelector("input[formControlName=num]")).sendKeys("2511");
		    driver.findElement(By.cssSelector("input[formControlName=complemento]")).sendKeys("ap 81");
		    driver.findElement(By.cssSelector("input[formControlName=bairro]")).sendKeys("ecoville");
		    driver.findElement(By.cssSelector("input[formControlName=municipio]")).sendKeys("Curitiba");
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[1]/div[1]/div[16]/div")).click();
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[1]/div[1]/div[16]/div/select/option[17]")).click();
		    
		    
		    
		     driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[1]/div[1]/div[20]/div/div/label")).click();
		     
		    
		     driver.findElement(By.cssSelector("input[formControlName=ativoCirculante]")).sendKeys("20000");
		     
		     
		     driver.findElement(By.cssSelector("input[formControlName=ativoNaoCirculante]")).sendKeys("10000");
		     
		     driver.findElement(By.cssSelector("input[formControlName=passivoCirculante]")).sendKeys("5000");
		     
		     driver.findElement(By.cssSelector("input[formControlName=passivoNaoCirculante]")).sendKeys("1000");
		    
		     driver.findElement(By.cssSelector("input[formControlName=patrimonioLiquido]")).sendKeys("1000000");
		     
		     driver.findElement(By.cssSelector("input[formControlName=valorLimiteAgente]")).sendKeys("100000000");
		     
		     driver.findElement(By.cssSelector("input[formControlName=receitaVendaServico]")).sendKeys("100000000");
		     
		     driver.findElement(By.cssSelector("input[formControlName=custoServico]")).sendKeys("250000000");
		     
		     driver.findElement(By.cssSelector("input[formControlName=despesaReceitaOperacao]")).sendKeys("12000000");
		     
		     driver.findElement(By.cssSelector("input[formControlName=resultadoFinanceiro]")).sendKeys("35000000");
		     
		     driver.findElement(By.cssSelector("input[formControlName=impostoRendaLucro]")).sendKeys("3000000000");
		     
		     driver.findElement(By.cssSelector(".btn-primary:nth-child(2)")).click();
		     
		 
		    //     driver.navigate().refresh();
	  
		    
		    
	  }
		  
		
		    @Test
			public void cadastro1() throws InterruptedException { 
		    
		  	  // Informa��es CCEE ( 2� P�gina )
		    
		    
		   driver.findElement(By.cssSelector("input[formControlName=siglaAgente]")).sendKeys(""+new Random().nextInt(10000));
		    
	     //   driver.findElement(By.cssSelector("input[formControlName=siglaAgente]")).sendKeys("temporario ");// * erro com Sigla Reservada
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.cssSelector("input[formControlName=codigoAgente]")).sendKeys(""+new Random().nextInt(10000));
		    		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[2]/div[1]/div[2]/div/div/div/div[1]/label")).click();
		    
		    driver.findElement(By.cssSelector("input[formControlName=siglaPerfilAgente]")).sendKeys(""+new Random().nextInt(10000));
		    
		    driver.findElement(By.cssSelector("input[formControlName=codigoPerfilAgente]")).sendKeys(""+new Random().nextInt(10000));
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[2]/div[1]/div[3]/div/div/div[2]/div[3]/div")).click();
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[2]/div[1]/div[3]/div/div/div[2]/div[3]/div/select/option[2]")).click();
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[2]/div[1]/div[3]/div/div/div[2]/div[4]/div/select")).click();
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[2]/div[1]/div[3]/div/div/div[2]/div[4]/div/select/option[2]")).click();
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[2]/div[1]/div[3]/div/div/div[2]/div[5]/div/select")).click();
		    
		    driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[2]/div[1]/div[3]/div/div/div[2]/div[5]/div/select/option[3]")).click();
		    
		    
		   driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[2]/div[2]/button[3]")).click();
	    
		    
		   
		   		
		   
		    
		    
			  }
				    
		 // 3 � tela (Informa��es do Diretor Respons�vel)  
		    
		    
				    @Test
					public void cadastro2() throws InterruptedException { 
		    
		    
				   	driver.findElement(By.cssSelector("input[formControlName=nome]")).sendKeys("Wanndersonn");
				    	
				   	driver.findElement(By.cssSelector("input[formControlName=cpf]")).sendKeys("91222162512");
				   	
				   	driver.findElement(By.cssSelector("input[formControlName=rg]")).sendKeys("91222162512");
				   	
				   	driver.findElement(By.cssSelector("input[formControlName=email]")).sendKeys("bernice5485@uorak.com");
				   	
				   	driver.findElement(By.cssSelector("input[formControlName=telefone]")).sendKeys("4199743923");
				    	
				    	
				   driver.findElement(By.xpath("/html/body/app-root/div/app-cadastro-agente/div/form/div[3]/div[2]/button[3]")).click();
				   
				   Thread.sleep(2000);
				   
				   driver.findElement(By.xpath("/html/body/modal-container/div/div/div[2]/button")).click();
		    
		    
		  
		    
		  //   String screenshotArquivo = Generator.dataHoraparaArquivo() + test.getMethodName();
		      Screenshot.tirar(driver, test.getMethodName() );


}



		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		   	driver.quit();

		
	  
			

		    
	
		
		}
	
	
	

}