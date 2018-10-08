import com.sampackage.service.CustomerService;
import com.sampackage.service.CustomerServiceImpl;

public class Application {


    public Application() {
    }

    public static void main(String[] args){
        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstname());
    }
}

