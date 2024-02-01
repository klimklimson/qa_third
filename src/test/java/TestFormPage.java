import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class TestFormPage {
    private final static String Base_URL = "https://demoqa.com/automation-practice-form";

    @Test
    public void dataInputTest() {
        open(Base_URL);

        Configuration.holdBrowserOpen = true; // keep browser open
        executeJavaScript("$('#fixedban').remove()"); // removing ads
        executeJavaScript("$('footer').remove()");  // removing footer

        $x("//input[@id='firstName']").setValue("Ivan");
        $x("//input[@id='lastName']").setValue("Petrov");
        $x("//input[@id='userEmail']").setValue("qwe@gmail.com");
        $x("//*[contains(@class, 'custom-control')][.//*[contains(text(), 'Other')]]").click();
        $x("//input[@id='userNumber']").setValue("3809725530");
        $x("//input[@id='dateOfBirthInput']").click();
        $x("//*[contains(@class, 'react-datepicker__month-select')]").selectOption("September");
        $x("//*[contains(@class, 'react-datepicker__year-select')]").selectOption("1997");
        $x("//*[contains(@class, 'react-datepicker__day--015')]").click();
        $x("//input[@id='subjectsInput']").setValue("Eng").pressEnter();
        $x("//label[@for='hobbies-checkbox-2']").click();
        $x("//label[@for='hobbies-checkbox-1']").click();
        $x("//label[@for='hobbies-checkbox-3']").click();
        $x("//input[@id='uploadPicture']").uploadFromClasspath("123.jpg");
        $x("//textarea[@id='currentAddress']").setValue("103 Strathcona St, Winnipeg, MB R3G 3G3, Canada");
        $x("//input[@id='react-select-3-input']").setValue("Utt").pressEnter();
        $x("//input[@id='react-select-4-input']").setValue("Luck").pressEnter();
        $x("//button[contains(text(), 'Submit')]").pressEnter();

    }


}
