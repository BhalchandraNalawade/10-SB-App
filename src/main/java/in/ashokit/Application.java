package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.dao.UserDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
	UserDao bean = context.getBean(UserDao.class);
	System.out.println(bean.hashCode());
         
         int i = 10;
         int j = 20;
	String name = "Ashokit" ;
         int k = 30;
	}

} 
