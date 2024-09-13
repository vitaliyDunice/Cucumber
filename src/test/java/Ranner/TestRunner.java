package Ranner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // путь к вашим .feature файлам
        glue = {"src/main/java/org/example/Step"})
public class TestRunner {
}