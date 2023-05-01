package techproed.tests.day25_ExcelUtils;

//package techproed.tests.day25_ExcelUtils;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;

public class C02_BlueRentalExcelTest {
      // public class C02_BlueRentalExcelTest {
        @Test
        public void excelTest() {
            ExcelUtils excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
            String email = excelUtils.getCellData(1,0);
            String password = excelUtils.getCellData(1,1);
            System.out.println(email+" || "+password);
            //Bluerantal car adresine gidelim.
            Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));

            //Excel dosyamızdan aldıgımız ılk emaıl ve password ıle sayfaya login olalım.
            //Login oldugumuzu dogrulyalım.
        }
    }

