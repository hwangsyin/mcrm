package crm.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import crm.ApplicationInitializer;
import crm.config.ApplicationConfiguration;
import crm.config.WebApplicationConfiguration;

/**
 * 
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
public class WebApplication implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		ApplicationInitializer.init();
		
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(ApplicationConfiguration.class, WebApplicationConfiguration.class);
		
		ServletRegistration.Dynamic registration = servletContext
			.addServlet("dispatcher", new DispatcherServlet(ctx));
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
	}
}
