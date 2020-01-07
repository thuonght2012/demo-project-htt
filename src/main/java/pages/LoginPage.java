package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LoginPage {
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement btnClick;
    @FindBy(id = "userSelect")
    WebElement userSelect;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement btnSubmit;


    public void setBtnClick(){
        btnClick.click();
    }

    public void setUserSelect(String username) {
        userSelect.click();
        List<WebElement> userList = userSelect.findElements(By.tagName("option"));
        for (WebElement user: userList){
            if (user.getText().equals(username)){
                Select userSelects = new Select(userSelect);
                userSelects.selectByVisibleText(username);
            }
        }

    }
    public void setBtnSubmit(){
        btnSubmit.click();
    }
}
