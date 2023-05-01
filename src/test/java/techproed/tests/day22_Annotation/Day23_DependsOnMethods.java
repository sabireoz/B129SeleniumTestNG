package techproed.tests.day22_Annotation;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Day23_DependsOnMethods {
/*



test NG de test metodlari birbirinden bagimsiz calisir
Metodlari bagimli calistrmak istiyorsak dependsOn mETHOD PARAMETRESI KULLANILIR.
asagida SEARCHTESTMETODU homepage test metoduna baglidir.
Eger homePage test fail olursa searchtest calismaz,ignore edilir yani calismaz..
Eger homePage test calisirsa  searchtest calisir..
 */

    @Test
    public void homePageTest() {
        assertEquals(1,2);//Burada "hard assertion "kullanildigi icin Java calismayi durdururve sonraki kodlar calismaz.
        System.out.println("Ana sayfaya gidildi");
    }



    @Test(dependsOnMethods = "homePageTest")
    public void searchTest() {
        System.out.println("Arama yapildi");
    }

    @Test
    public void sigInTest() {
        System.out.println("Giris yapildi");
    }
}
