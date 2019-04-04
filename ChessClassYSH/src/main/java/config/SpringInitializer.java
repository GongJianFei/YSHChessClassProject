package config;
import org.springframework.core.annotation.Order;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class SpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //配置Spring根上下文配置类
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {SpringRootConfig.class ,SecurityConfig.class};
    }

    //配置Spring Web上下文配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringWebConfig.class};
    }

    //配置在什么路径下使用Spring的DispatcherServlet。等价于给DispatchServlet指定对应的url-mapping
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    //配置与Spring相关的Filter。这里规定Spring MVC的编码为UTF-8。
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return new Filter[] { characterEncodingFilter };
    }

}

