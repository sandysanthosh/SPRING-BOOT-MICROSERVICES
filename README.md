# SpringBootIn50
Source code for https://www.youtube.com/watch?v=Ke7Tr4RgRTs

# Instructions
1. Open pom.xml with Intelij or Eclipse
2. Run Main.java
3. Open browser on http://localhost:8080

maven- auto Configuration


# add war file in spring boot:

in pom.xml:

<packaging>war</packaging>

# error handling:

 @NotEmpty
 @Email
 
 public class RecordNotFoundException extends RuntimeException
{
    public RecordNotFoundException(String exception) {
        super(exception);
    }
}

# In employee class:

if(emloyee == null)
{
throw new RecordNotFoundException ("InvalidEmployeeid" : "id");
}

# run build:

In goals ->clean install


# boot-starter-logging:


internal Logger -> Apache Commons Logging 

private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

spring.output.ansi.enabled - always, detect or never 	

LOGGER.info("Simple log statement with inputs {}, {} and {}", 1,2,3);

types -> logging, log4j, logback

  LOGGER.debug("This is a debug message");
 
	LOGGER.info("This is an info message");
  
	LOGGER.warn("This is a warn message");
  
	LOGGER.error("This is an error message");

