import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ml.vinjo.service.CustomerService;
import ml.vinjo.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			 
		CustomerService service = applicationContext.getBean("customerService",CustomerService.class);
		 
		System.out.println(service.FindAll().get(0).getFirstName());

	}

}
