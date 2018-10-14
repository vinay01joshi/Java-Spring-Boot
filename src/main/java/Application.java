import ml.vinjo.service.CustomerService;
import ml.vinjo.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerService service = new CustomerServiceImpl();
		 
		System.out.println(service.FindAll().get(0).getFirstName());

	}

}
