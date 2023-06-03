import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckSelenideGithub {

    @Test
    void successTest() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;



        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions").pressEnter();
        $("[href*='SoftAssertions']").click();
        $("#user-content-3-using-junit5-extend-test-class").shouldBe(Condition.visible).scrollTo();


    }
}
