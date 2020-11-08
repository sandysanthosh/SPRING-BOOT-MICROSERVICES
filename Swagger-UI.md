

### Swagger-UI:

* Swagger2 is an open source project used to generate the REST API documents for RESTful web services. 

* It provides a user interface to access our RESTful web services via the web browser.

  key Annotation -> @EnableSwagger2

#### POM.xml:

```
<dependency>
   <groupId>io.springfox</groupId>
   <artifactId>springfox-swagger2</artifactId>
   <version>2.7.0</version>
</dependency>
<dependency>
   <groupId>io.springfox</groupId>
   <artifactId>springfox-swagger-ui</artifactId>
   <version>2.7.0</version>
</dependency>

```


### Main.java:

```

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SwaggerDemoApplication {
   public static void main(String[] args) {
      SpringApplication.run(SwaggerDemoApplication.class, args);
   }
}

```

To Test Swagger-UI:

http://localhost:8080/swagger-ui.html


