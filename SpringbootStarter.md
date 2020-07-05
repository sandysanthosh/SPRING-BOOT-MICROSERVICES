#### Spring Boot Starters:

* Spring Boot provides a number of starters that allow us to add jars in the classpath. Spring Boot built-in starters make development easier and rapid. Spring Boot Starters are the dependency descriptors.

* In the Spring Boot Framework, all the starters follow a similar naming pattern: spring-boot-starter-*, where * denotes a particular type of application. For example, if we want to use Spring and JPA for database access, we need to include the spring-boot-starter-data-jpa dependency in our pom.xml file of the project.

#### Third-Party Starters:

* We can also include third party starters in our project. But we do not use spring-boot-starter for including third party dependency.
* The spring-boot-starter is reserved for official Spring Boot artifacts.
* The third-party starter starts with the name of the project. 
* For example, the third-party project name is abc, then the dependency name will be abc-spring-boot-starter.

<table class="alt">
<tr>
	<th>Name</th>
	<th>Description</th>
</tr>
<tr>
	<td>spring-boot-starter-thymeleaf</td>
	<td>It is used to build MVC web applications using Thymeleaf views.</td>
</tr>
<tr>
	<td>spring-boot-starter-data-couchbase</td>
	<td>It is used for the Couchbase document-oriented database and Spring Data Couchbase.</td>
</tr>
<tr>
	<td>spring-boot-starter-artemis</td>
	<td>It is used for JMS messaging using Apache Artemis.</td>
</tr>
<tr>
	<td>spring-boot-starter-web-services</td>
	<td>It is used for Spring Web Services.</td>
</tr>
<tr>
	<td>spring-boot-starter-mail</td>
	<td>It is used to support Java Mail and Spring Framework's email sending.</td>
</tr>
<tr>
	<td>spring-boot-starter-data-redis</td>
	<td>It is used for Redis key-value data store with Spring Data Redis and the Jedis client.</td>
</tr>
<tr>
	<td>spring-boot-starter-web</td>
	<td>It is used for building the web application, including RESTful applications using Spring MVC. It uses Tomcat as the default embedded container.</td>
</tr>
<tr>
	<td>spring-boot-starter-data-gemfire</td>
	<td>It is used to GemFire distributed data store and Spring Data GemFire.</td>
</tr>
<tr>
	<td>spring-boot-starter-activemq</td>
	<td>It is used in JMS messaging using Apache ActiveMQ.</td>
</tr>
<tr>
	<td>spring-boot-starter-data-elasticsearch</td>
	<td>It is used in Elasticsearch search and analytics engine and Spring Data Elasticsearch.</td>
</tr>
<tr>
	<td>spring-boot-starter-integration</td>
	<td>It is used for Spring Integration.</td>
</tr>
<tr>
	<td>spring-boot-starter-test</td>
	<td>It is used to test Spring Boot applications with libraries, including JUnit, Hamcrest, and Mockito.</td>
</tr>
<tr>
	<td>spring-boot-starter-jdbc</td>
	<td>It is used for JDBC with the Tomcat JDBC connection pool.</td>
</tr>
<tr>
	<td>spring-boot-starter-mobile</td>
	<td>It is used for building web applications using Spring Mobile.</td>
</tr>
<tr>
	<td>spring-boot-starter-validation</td>
	<td>It is used for Java Bean Validation with Hibernate Validator.</td>
</tr>
<tr>
	<td>spring-boot-starter-hateoas</td>
	<td>It is used to build a hypermedia-based RESTful web application with Spring MVC and Spring HATEOAS.</td>
</tr>
<tr>
	<td>spring-boot-starter-jersey</td>
	<td>It is used to build RESTful web applications using JAX-RS and Jersey. An alternative to spring-boot-starter-web.</td>
</tr>
<tr>
	<td>spring-boot-starter-data-neo4j</td>
	<td>It is used for the Neo4j graph database and Spring Data Neo4j.</td>
</tr>
<tr>
	<td>spring-boot-starter-data-ldap</td>
	<td>It is used for Spring Data LDAP.</td>
</tr>
<tr>
	<td>spring-boot-starter-websocket</td>
	<td>It is used for building the WebSocket applications. It uses Spring Framework's WebSocket support.</td>
</tr>
<tr>
	<td>spring-boot-starter-aop</td>
	<td>It is used for aspect-oriented programming with Spring AOP and AspectJ.</td>
</tr>
<tr>
	<td>spring-boot-starter-amqp</td>
	<td>It is used for Spring AMQP and Rabbit MQ.</td>
</tr>
<tr>
	<td>spring-boot-starter-data-cassandra</td>
	<td>It is used for Cassandra distributed database and Spring Data Cassandra.</td>
</tr>
<tr>
	<td>spring-boot-starter-social-facebook</td>
	<td>It is used for Spring Social Facebook.</td>
</tr>
<tr>
	<td>spring-boot-starter-jta-atomikos</td>
	<td>It is used for JTA transactions using Atomikos.</td>
</tr>
<tr>
	<td>spring-boot-starter-security</td>
	<td>It is used for Spring Security.</td>
</tr>
<tr>
	<td>spring-boot-starter-mustache</td>
	<td>It is used for building MVC web applications using Mustache views.</td>
</tr>
<tr>
	<td>spring-boot-starter-data-jpa</td>
	<td>It is used for Spring Data JPA with Hibernate.</td>
</tr>
<tr>
	<td>spring-boot-starter</td>
	<td>It is used for core starter, including auto-configuration support, logging, and YAML.</td>
</tr>
<tr>
	<td>spring-boot-starter-groovy-templates</td>
	<td>It is used for building MVC web applications using Groovy Template views.</td>
</tr>
<tr>
	<td>spring-boot-starter-freemarker</td>
	<td>It is used for building MVC web applications using FreeMarker views.</td>
</tr>
<tr>
	<td>spring-boot-starter-batch</td>
	<td>It is used for Spring Batch.</td>
</tr>
<tr>
	<td>spring-boot-starter-social-linkedin</td>
	<td>It is used for Spring Social LinkedIn.</td>
</tr>
<tr>
	<td>spring-boot-starter-cache</td>
	<td>It is used for Spring Framework's caching support.</td>
</tr>
<tr>
	<td>spring-boot-starter-data-solr</td>
	<td>It is used for the Apache Solr search platform with Spring Data Solr.</td>
</tr>
<tr>
	<td>spring-boot-starter-data-mongodb</td>
	<td>It is used for MongoDB document-oriented database and Spring Data MongoDB.</td>
</tr>
<tr>
	<td>spring-boot-starter-jooq</td>
	<td>It is used for jOOQ to access SQL databases. An alternative to spring-boot-starter-data-jpa or spring-boot-starter-jdbc.</td>
</tr>
<tr>
	<td>spring-boot-starter-jta-narayana</td>
	<td>It is used for Spring Boot Narayana JTA Starter.</td>
</tr>
<tr>
	<td>spring-boot-starter-cloud-connectors</td>
	<td>It is used for Spring Cloud Connectors that simplifies connecting to services in cloud platforms like Cloud Foundry and Heroku.</td>
</tr>
<tr>
	<td>spring-boot-starter-jta-bitronix</td>
	<td>It is used for JTA transactions using Bitronix.</td>
</tr>
<tr>
	<td>spring-boot-starter-social-twitter</td>
	<td>It is used for Spring Social Twitter.</td>
</tr>
<tr>
	<td>spring-boot-starter-data-rest</td>
	<td>It is used for exposing Spring Data repositories over REST using Spring Data REST.</td>
</tr>
</table>
<h2 class="h3">Spring Boot Production Starters</h2>
<table class="alt">
<tr>
	<th>Name</th>
	<th>Description</th>
</tr>
<tr>
	<td>spring-boot-starter-actuator</td>
	<td>It is used for Spring Boot's Actuator that provides production-ready features to help you monitor and manage your application.</td>
</tr>
<tr>
	<td>spring-boot-starter-remote-shell</td>
	<td>It is used for the CRaSH remote shell to monitor and manage your application over SSH. Deprecated since 1.5.</td>
</tr>
</table>
<h2 class="h3">Spring Boot Technical Starters</h2>
<table class="alt">
<tr>
	<th>Name</th>
	<th>Description</th>
</tr>
<tr>
	<td>spring-boot-starter-undertow</td>
	<td>It is used for Undertow as the embedded servlet container. An alternative to spring-boot-starter-tomcat.</td>
</tr>
<tr>
	<td>spring-boot-starter-jetty</td>
	<td>It is used for Jetty as the embedded servlet container. An alternative to spring-boot-starter-tomcat.</td>
</tr>
<tr>
	<td>spring-boot-starter-logging</td>
	<td>It is used for logging using Logback. Default logging starter.</td>
</tr>
<tr>
	<td>spring-boot-starter-tomcat</td>
	<td>It is used for Tomcat as the embedded servlet container. Default servlet container starter used by spring-boot-starter-web.</td>
</tr>
<tr>
	<td>spring-boot-starter-log4j2</td>
	<td>It is used for Log4j2 for logging. An alternative to spring-boot-starter-logging.</td>
</tr>
</table>

### Spring Boot Starter to run in Java:
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


#### Add war file in spring boot:

* Add this  in pom.xml:

```
<packaging>war</packaging>
<parent>  
<groupId>org.springframework.boot</groupId>  
<artifactId>spring-boot-starter-parent</artifactId>  
<version>1.4.0.RELEASE</version>  
</parent>  

```


#### Error handling:

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

#### In employee class:
 
``` 

if(emloyee == null)
{
throw new RecordNotFoundException ("InvalidEmployeeid" : "id");
}

```

#### Run build:

In goals ->clean install

