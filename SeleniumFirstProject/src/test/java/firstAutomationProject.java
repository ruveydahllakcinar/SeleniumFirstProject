import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstAutomationProject {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        WebElement firstname = driver.findElement(By.id("firstName"));
        firstname.click();
        firstname.sendKeys("Ruveyda");


        WebElement lastname = driver.findElement(By.id("lastName"));
        lastname.click();
        lastname.sendKeys("Akçınar");

        WebElement email = driver.findElement(By.cssSelector("#userEmail"));
        email.click();
        email.sendKeys("rvydhll@gmail.com");

        WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        age.click();
        age.sendKeys("24");

        WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
        salary.click();
        salary.sendKeys("25000");

        WebElement department = driver.findElement(By.cssSelector("#department"));
        department.click();
        department.sendKeys("QA Engineer");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        driver.quit();
    }
}



//HOMEWORK
/*
1. Web sayfast acalir +
2. Elements bagligina gidilir. +
3. Web Tables alt bashima giditis.+
4.Add butonuna tiklanir.
5.1üm gerckli bilgiler doldurulur.
6. Submit edilir
7. Quit ile proje bitirilir.
*/