package techproed.tests.day25_ExcelUtils;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;

public class C03_BlueRentalExcelTest2 {



    //package techproed.tests.day25_ExcelUtils;
 // public class C03_BlueRentalExcelTest2 {
        @Test
        public <BlueRentalPage> void test1() {
        /*
        Excel dosyamızdaki tüm email ve password'ler ile
        BlueRentalCar sayfasına gidip login olalım
         */
            ExcelUtils excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
            //Sayfaya gidelim
            Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
            BlueRentalPage blueRentalPage = new BlueRentalPage();
            //Bir loop oluşturup excel dosyasındaki tüm verileri girdirelim
            for (int i = 1; i <= excelUtils.rowCount(); i++) {//i'yi 1 den başlattık çünkü veriler 1. satırdan başlıyor
                String mail = excelUtils.getCellData(i,0);
                String password = excelUtils.getCellData(i,1);
                System.out.println(mail+" || "+password);
                blueRentalPage.login.click();
                blueRentalPage.email.sendKeys(mail, Keys.TAB,password,Keys.ENTER);
                Driver.closeDriver();

            }
        }
    }
}
