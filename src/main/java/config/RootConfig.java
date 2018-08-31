package config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * Created by DagoManzano
 */
@ComponentScan(basePackages = {"model", "implementation", "service" ,"controller"})
@PropertySources({@PropertySource(value = { "classpath:aplication.properties" })})
@Configuration
@EnableTransactionManagement
public class RootConfig {
    @Autowired
    private Environment env;
}