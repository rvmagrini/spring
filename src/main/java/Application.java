import com.rvmagrini.service.SpeakerService;
import com.rvmagrini.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        // Sample without Spring
        // SpeakerService service = new SpeakerServiceImpl();

        // Loading Spring and config files into Application Context
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
    }

}
