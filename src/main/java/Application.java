import com.rvmagrini.service.SpeakerService;
import com.rvmagrini.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        // Sample without Spring
        // SpeakerService service = new SpeakerServiceImpl();

        // Loading Spring by Java Config
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service);
        System.out.println("First Name: " + service.findAll().get(0).getFirstName());
        System.out.println("Last Name: " + service.findAll().get(0).getLastName());
        System.out.println("Seed Value: " + service.findAll().get(0).getSeedNum());



    }

}
