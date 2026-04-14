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
         int k = 30;
         String str = "Asmita";
	}
      
        // JIRA 102
        public void m2() {
             // logic
        }
  
       }
 
       // JIRA 101 :-
       public void m1() {
             int i = 10;
             int j = 20;
      }

} 
