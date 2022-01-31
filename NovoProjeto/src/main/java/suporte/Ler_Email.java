package suporte;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import java.time.LocalDateTime;

public class Ler_Email {

    private final By listbox = By.className("_3qXS6Uo8WFxax_lDWr_1a_");
    private String cod = null;
    WebDriver actions = Web.SetupDriver(false);
    private String hora;
    private String[] var1;
    private String emailHora;
    @Test
    public String LendoEmail() throws InterruptedException {
        actions.manage().window().setPosition(new Point(0, -2000));
        actions.get("https://outlook.office365.com/owa/");
//        Thread.sleep(5000);

        hora = String.format("%tR",LocalDateTime.now());
        var1 = actions.findElements(listbox).get(0).getText().split("\n");
        emailHora = var1[3].trim();
        System.out.println(emailHora);
        System.out.println(hora);

        int cont = 0;
        while(hora.equals(emailHora)){

            String emailTitulo = var1[2].trim();
            cod = var1[4].split(":")[1].trim();
            Assert.assertEquals("Codigo de Ativacao do Token B3", emailTitulo);
            System.out.println(emailHora);
            System.out.println(cod);

            hora = String.format("%tR",LocalDateTime.now());
            var1 = actions.findElements(listbox).get(0).getText().split("\n");
            emailHora = var1[3].trim();;
            Thread.sleep(1000);
            if(cont <= 10){ break;}
            cont += 1;
        }
        System.out.println(cod);
        actions.close();
        return cod;
    }
}



