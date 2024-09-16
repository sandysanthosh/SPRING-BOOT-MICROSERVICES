Here’s a quick reference for Spring Boot concepts and commonly used features:

1. Project Setup

Spring Initializr: Use start.spring.io to create a Spring Boot project with dependencies like Web, JPA, Security, etc.

POM.xml:


<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
</dependency>

2. Spring Boot Annotations

@SpringBootApplication: Marks the main class and enables auto-configuration.

@RestController: Combines @Controller and @ResponseBody.

@RequestMapping: Maps HTTP requests to handler methods.

@GetMapping, @PostMapping, @PutMapping, @DeleteMapping: Specialized annotations for HTTP methods.

@Autowired: Automatically injects dependencies.

@Service: Marks a class as a service.

@Repository: Indicates that a class provides data access functionality.

@Component: A generic stereotype for Spring-managed components.


3. Main Application

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}

4. Controller Example

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}

5. Dependency Injection

@Service
public class MyService {
    public String serve() {
        return "Service is working!";
    }
}

@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/service")
    public String getService() {
        return myService.serve();
    }
}

6. Properties File Configuration

application.properties or application.yml for configuration settings.

Example (application.properties):


server.port=8081
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=pass

7. Spring Boot JPA

Entity Class:


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}

Repository Interface:


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

Service and Controller:


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }
}

8. Exception Handling

Global Exception Handling with @ControllerAdvice:


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleNotFoundException(ResourceNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}

9. Spring Boot Security

Security Configuration:


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/api/**").authenticated()
            .and()
            .httpBasic();
    }
}

10. Working with Profiles

Use profiles to manage different environments (e.g., dev, prod):

In application.properties:


spring.profiles.active=dev

In application-dev.properties:

server.port=8081

11. Actuator for Monitoring

Add spring-boot-starter-actuator dependency for health checks, metrics, etc.


<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>

Access health endpoint: /actuator/health


12. Scheduling Tasks

@EnableScheduling
@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}

@Component
public class ScheduledTasks {

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("Current time is: " + new Date());
    }
}

13. Spring Boot DevTools

Add this dependency for auto-reloading during development:


<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
</dependency>

14. Spring Boot Testing

Unit Testing:


@SpringBootTest
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @Test
    public void testService() {
        assertEquals("Service is working!", myService.serve());
    }
}

Mocking with @MockBean:


@MockBean
private MyRepository myRepository;

15. Building & Running

Maven Build:


mvn clean install

Run the JAR:


java -jar target/myapp-0.0.1-SNAPSHOT.jar

This quick reference covers key features of Spring Boot for fast development.

