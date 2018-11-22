package ren.config;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer extends SpringServletContainerInitializer {
	//SpringBootServletInitializer
	//WebApplicationInitializer
	//ServletContainerInitializer: 重要的类
	//SpringServletContainerInitializer 
	
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		System.out.println("*******************************启动容器啦*******************************");
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(Config.class);
//        ctx.setServletContext(servletContext);//将注册配置类和当前servletContext关联
//
//        // 注册springMVC的DispatcherServlet
//        Dynamic servlet =  servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
//        servlet.addMapping("/");
//        servlet.setLoadOnStartup(1);
//
//	}

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext servletContext) throws ServletException {
		System.out.println("*******************************启动容器啦*******************************");
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(Config.class);
        ctx.setServletContext(servletContext);//将注册配置类和当前servletContext关联

        // 注册springMVC的DispatcherServlet
        Dynamic servlet =  servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
		
	}


}
