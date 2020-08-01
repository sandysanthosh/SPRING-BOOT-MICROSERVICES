@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters=false)  // Disable component scanner
public class WebServer {

    // Case insensitive: could also use: http://accounts-service
    public static final String ACCOUNTS_SERVICE_URL
                                        = "http://ACCOUNTS-SERVICE";

    public static void main(String[] args) {
        // Will configure using web-server.yml
        System.setProperty("spring.config.name", "web-server");
        SpringApplication.run(WebServer.class, args);
    }

    @LoadBalanced    // Make sure to create the load-balanced template
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * Account service calls microservice internally using provided URL.
     */
    @Bean
    public WebAccountsService accountsService() {
        return new WebAccountsService(ACCOUNTS_SERVICE_URL);
    }

    @Bean
    public WebAccountsController accountsController() {
         return new WebAccountsController
                       (accountsService());  // plug in account-service
    }
}
