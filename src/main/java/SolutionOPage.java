import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SolutionOPage {

   static  WebDriver driver = new ChromeDriver();



    @FindBy(xpath = "hhdhdhd")
    private WebElement login;

    public SolutionOPage(){
        PageFactory.initElements(driver, this);
    }

    public static void main(String[] args) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
      //  js.executeScript();

        WebDriverWait wait = new WebDriverWait(driver, 20);


    }



}
