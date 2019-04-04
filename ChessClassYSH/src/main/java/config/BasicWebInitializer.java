package config;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.*;



@Order(1)
public class BasicWebInitializer implements WebApplicationInitializer {


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
//        servletContext.addFilter("filterName", AFilter.class).addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), false, "/");
//	  servletContext.addListener(EventListener.class);
//        servletContext.addServlet("servletName", AServlet.class);
       /* AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringWebConfig.class);
        ctx.register(SpringRootConfig.class);

        ctx.setServletContext(servletContext);

        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);*/
    }
}
