package ren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

//springboot入口
@Controller // 这个类是个控制器
@SpringBootApplication // 这是一个Spring boot的应用
//@Configuration // 自身就是配置文件
//@ComponentScan(basePackages = "ren") //將其注入到spring容器中
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
