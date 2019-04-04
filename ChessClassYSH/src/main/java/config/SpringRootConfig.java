package config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan(basePackages = {"serviceImpl","controller","config"})
@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableTransactionManagement
@Import(DaoConfig.class)
@EnableWebMvc
public class SpringRootConfig {

    @Bean
    public PropertyPlaceholderConfigurer getTestPpc() {
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        ppc.setLocations(new ClassPathResource("jdbc.properties"));
        return ppc;
    }
}
