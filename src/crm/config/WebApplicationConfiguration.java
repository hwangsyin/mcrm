package crm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Spring MVC ≈‰÷√
 * @author <a mailto="hwangsyin@gmail.com">King</a>
 *
 */
@Configuration
@ComponentScan("crm.controller")
@EnableWebMvc
public class WebApplicationConfiguration extends WebMvcConfigurerAdapter {
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
