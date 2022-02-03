import com.rvmagrini.model.Speaker;
import com.rvmagrini.repository.HibernateSpeakerRepositoryImpl;
import com.rvmagrini.repository.SpeakerRepository;
import com.rvmagrini.service.SpeakerService;
import com.rvmagrini.service.SpeakerServiceImpl;
import com.rvmagrini.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.rvmagrini"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calendarFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calendarFactory().getObject();
    }

    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    // @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService() {
        // Constructor Injection
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

        // Setter Injection
        // service.setRepository(getSpeakerRepository());

        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
    */

}
