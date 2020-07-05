

#### Spring Boot Starters to test in Java:


```

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}

}

```

#### Instructions:

	* Open pom.xml with Intelij or Eclipse
	* Run Main.java
	* Open browser on http://localhost:8080

``` maven- auto Configuration ```

<a href="https://github.com/sandysanthosh/SPRING-BOOT-MICROSERVICES/blob/master/applicationProperties.md">ApplicationProperties:</a>

 -> built-in mechanism for application configuration using a file 


#### add war file in spring boot:

* Add this  in pom.xml:

``` <packaging>war</packaging> ```


#### error handling:

	 * @NotEmpty
	 * @Email
 
 ```
 public class RecordNotFoundException extends RuntimeException
{
    public RecordNotFoundException(String exception) {
        super(exception);
    }
}
```

# In employee class:
 
``` 

if(emloyee == null)
{
throw new RecordNotFoundException ("InvalidEmployeeid" : "id");
}

```

# Run build:

In goals ->clean install

