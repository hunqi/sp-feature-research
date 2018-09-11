package readinglist;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.TestPropertySource;

@Configuration
@ComponentScan(basePackageClasses={AmazonProperties.class})
@PropertySource("application-test.properties")
public class UnitTestConfig {
}
