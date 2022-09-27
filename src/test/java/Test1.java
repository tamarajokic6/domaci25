import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {
    private WebDriver webDriver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.get("https://testsheepnz.github.io/BasicCalculator.html");

    }

    @BeforeMethod
    public void before() {
        webDriver.get("https://testsheepnz.github.io/BasicCalculator.html");
    }

    @Test
    public void add1() {
        String expected = "2";
        WebElement firstNumber = webDriver.findElement(By.id("number1Field"));
        firstNumber.sendKeys("1");
        WebElement secondNumber = webDriver.findElement(By.id("number2Field"));
        secondNumber.sendKeys("1");
        WebElement operation = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Add");
        WebElement button = webDriver.findElement(By.id("calculateButton"));
        button.click();

        WebElement calculation = webDriver.findElement(By.id("numberAnswerField"));

        String actual = calculation.getAttribute("value");
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void add2() {
        String expected = "1";
        WebElement firstNumber = webDriver.findElement(By.id("number1Field"));
        firstNumber.sendKeys("0");
        WebElement secondNumber = webDriver.findElement(By.id("number2Field"));
        secondNumber.sendKeys("1");
        WebElement operation = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Add");
        WebElement button = webDriver.findElement(By.id("calculateButton"));
        button.click();

        WebElement calculation = webDriver.findElement(By.id("numberAnswerField"));

        String actual = calculation.getAttribute("value");
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void add3() {
        String expected = "-1";
        WebElement firstNumber = webDriver.findElement(By.id("number1Field"));
        firstNumber.sendKeys("0");
        WebElement secondNumber = webDriver.findElement(By.id("number2Field"));
        secondNumber.sendKeys("-1");
        WebElement operation = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Add");
        WebElement button = webDriver.findElement(By.id("calculateButton"));
        button.click();

        WebElement calculation = webDriver.findElement(By.id("numberAnswerField"));

        String actual = calculation.getAttribute("value");
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void add4() {
        String expected = "19999999998";
        WebElement firstNumber = webDriver.findElement(By.id("number1Field"));
        firstNumber.sendKeys("9999999999");
        WebElement secondNumber = webDriver.findElement(By.id("number2Field"));
        secondNumber.sendKeys("9999999999");
        WebElement operation = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Add");
        WebElement button = webDriver.findElement(By.id("calculateButton"));
        button.click();

        WebElement calculation = webDriver.findElement(By.id("numberAnswerField"));

        String actual = calculation.getAttribute("value");
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void add5() {
        String expected = "-30";
        WebElement firstNumber = webDriver.findElement(By.id("number1Field"));
        firstNumber.sendKeys("-10");
        WebElement secondNumber = webDriver.findElement(By.id("number2Field"));
        secondNumber.sendKeys("-20");
        WebElement operation = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select = new Select(operation);
        select.selectByVisibleText("Add");
        WebElement button = webDriver.findElement(By.id("calculateButton"));
        button.click();

        WebElement calculation = webDriver.findElement(By.id("numberAnswerField"));

        String actual = calculation.getAttribute("value");
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void multiply1() {
        String expected1 = "1";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("1");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("1");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Multiply");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);
    }

    @Test
    public void multiply2() {
        String expected1 = "0";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("0");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("1");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Multiply");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void multiply3() {
        String expected1 = "0";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("0");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("-1");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Multiply");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void multiply4() {
        String expected1 = "99999999980000000001";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("9999999999");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("9999999999");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Multiply");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void multiply5() {
        String expected1 = "200";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("-10");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("-20");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Multiply");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void subtract1() {
        String expected1 = "0";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("1");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("1");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Subtract");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);
    }

    @Test
    public void subtract2() {
        String expected1 = "-1";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("0");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("1");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Subtract");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void subtract3() {
        String expected1 = "1";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("0");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("-1");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Subtract");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void subtract4() {
        String expected1 = "0";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("9999999999");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("9999999999");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Subtract");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void subtract5() {
        String expected1 = "10";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("-10");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("-20");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Subtract");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void subtract6() {
        String expected1 = "-10";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("-20");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("-10");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Subtract");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void divide1() {
        String expected1 = "1";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("1");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("1");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Divide");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);
    }

    @Test
    public void divide2() {
        String expected1 = "0";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("0");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("1");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Divide");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void divide3() {
        String expected1 = "0";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("0");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("-1");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Divide");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void divide4() {
        String expected1 = "1";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("9999999999");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("9999999999");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Divide");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void divide5() {
        String expected1 = "0.5";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("-10");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("-20");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Divide");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @Test
    public void divide6() {
        String expected1 = "Divide by zero error!";
        WebElement firstNumber1 = webDriver.findElement(By.id("number1Field"));
        firstNumber1.sendKeys("10");
        WebElement secondNumber1 = webDriver.findElement(By.id("number2Field"));
        secondNumber1.sendKeys("0");
        WebElement operation1 = webDriver.findElement(By.id("selectOperationDropdown"));
        Select select1 = new Select(operation1);
        select1.selectByVisibleText("Divide");
        WebElement button1 = webDriver.findElement(By.id("calculateButton"));
        button1.click();

        WebElement calculation1 = webDriver.findElement(By.id("numberAnswerField"));

        String actual1 = calculation1.getAttribute("value");
        Assert.assertEquals(actual1, expected1);

    }

    @AfterClass
    public void afterClass() {
        webDriver.quit();
    }


}



