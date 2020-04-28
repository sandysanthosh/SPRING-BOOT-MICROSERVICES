# SpringBootIn50
Source code for https://www.youtube.com/watch?v=Ke7Tr4RgRTs

# Instructions
1. Open pom.xml with Intelij or Eclipse
2. Run Main.java
3. Open browser on http://localhost:8080

maven- auto Configuration


# add war file in spring boot:

add this  in pom.xml:
"<packaging>war</packaging>"

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


# REST request validation annotations:

@AssertFalse -> 	The annotated element must be false.

@AssertTrue -> 	The annotated element must be true.

@DecimalMax -> 	The annotated element must be a number whose value must be lower or equal to the specified maximum.

@DecimalMin -> 	The annotated element must be a number whose value must be higher or equal to the specified minimum.

@Future -> 	The annotated element must be an instant, date or time in the future.

@Max -> 	The annotated element must be a number whose value must be lower or equal to the specified maximum.

@Min -> 	The annotated element must be a number whose value must be higher or equal to the specified minimum.

@Negative -> 	The annotated element must be a strictly negative number.

@NotBlank -> 	The annotated element must not be null and must contain at least one non-whitespace character.

@NotEmpty -> 	The annotated element must not be null nor empty.

@NotNull -> 	The annotated element must not be null.

@Null -> 	The annotated element must be null.

@Pattern -> 	The annotated CharSequence must match the specified regular expression.

@Positive -> 	The annotated element must be a strictly positive number.

@Size -> 	The annotated element size must be between the specified boundaries (included).

Spring boot metices - actuator
Spring security
Spring jpa mysql security 

App

@Advice 
@before 
@order(0)

@data in Lombok

Will add all getter and setters 
To string
Equal and barcode



<a href="http://starwalt.in/Blogs/index.html">Follow us on Blog</a>
