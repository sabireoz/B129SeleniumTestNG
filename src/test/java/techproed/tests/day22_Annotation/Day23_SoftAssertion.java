package techproed.tests.day22_Annotation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Day23_SoftAssertion {

  //  @Test
   // public void softAssertTest() {
        //Soft assertion yapmak icin 3 adim izliyoruz:
        //1.adim:Soft Assertion objesini olusturun:

       // SoftAssert softAssert = new SoftAssert();

        //2.adim:Assertion yapin
       // softAssert.assertEquals(1, 2);//1 =2 YE DIYORUZ YANI DEGIL OYUZDEN FAILED OLACALK

        //3.adim:assertAll() methodunu calistirin.
      //  softAssert.assertAll();





    @Test
    public void softAssertTest() {

        //Soft assertion yapabilmek için 3 adım izliyoruz:
        //1. Adım: Soft Assert objesi oluşturun:
        SoftAssert softAssert = new SoftAssert();

        //2. Adım: Assertion yapın:
        //1. assertion
        softAssert.assertEquals(1, 2);//Soft assertion kullanıldığı için test fail olsa bile Java çalışmayı durdurmaz.
        System.out.println("Assetion 1 çalıştı");

        //2. assertion
        softAssert.assertTrue("Selenium".contains("a"));//Üstteki assertion fail oldu fakat bu assertin da çalıştı. Çünkü soft assertion kullanıldığından Java çalışmayı durdurmadı.
        System.out.println("Assetion 2 çalıştı");

        //2. assertion
        softAssert.assertTrue(false);
        System.out.println("Assetion 3 çalıştı");

        //3. Adım: assertAll() methodunu çalıştırın:
        softAssert.assertAll();

        System.out.println("Hello");//Bu kod çalışmayacak. Çünkü assertAll() methodu fail durumunda assertionlar sonrası çalışmayı durdurur.
    }
}

