package co.com.choucair.reto_Utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/",
        tags = "@Utest",
        glue = "co.com.choucair.reto_Utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE )



public class RunnerTags {
}
