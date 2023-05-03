import com.PayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MainConfig.class);
        PayService payService = (PayService)ac.getBean(PayService.class);
        payService.pay();
    }
}
