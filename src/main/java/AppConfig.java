import com.rvmagrini.model.Speaker;
import com.rvmagrini.repository.HibernateSpeakerRepositoryImpl;
import com.rvmagrini.repository.SpeakerRepository;
import com.rvmagrini.service.SpeakerService;
import com.rvmagrini.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
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
}
