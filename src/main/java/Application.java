import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fdmgroup.service.CustomerService;
import com.fdmgroup.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		

		//CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = appContext.getBean("CustomerService", CustomerService.class);
	
		System.out.println(service.findAll().get(0).getFirstName());
		
		

	}

}
