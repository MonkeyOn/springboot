package ren.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dianping.cat.servlet.CatFilter;

@Configuration  // 自身就是配置文件
@ComponentScan(basePackages = "ren.spring") 
public class Config {

	
	
	//cat过滤器
	@Bean
	public FilterRegistrationBean testFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
        //注入过滤器
        registration.setFilter(new CatFilter());
        //拦截规则
        registration.addUrlPatterns("/*");
        //过滤器名称
        registration.setName("cat-filter");
        //过滤器顺序 ,配置，值越大，执行顺序越靠后
        registration.setOrder(FilterRegistrationBean.LOWEST_PRECEDENCE);
//		registration.addInitParameter("paramName", "paramValue"); //
		return registration;
	}

	 
}
