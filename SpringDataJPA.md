
### SpringBoot JPA:


#### Pom.xml:

```
<dependency>    
<groupId>org.springframework.boot</groupId>    
<artifactId>spring-boot-starter-data-jpa</artifactId>    
<version>2.2.2.RELEASE</version>    
</dependency>  

```

#### User.java:

```
package com.example.demo;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
@Entity  
@Table(name="userdata")  
public class User   
{  
@Id  
private int id;  
private String username;  
public int getId()   
{  
return id;  
}  
public void setId(int id)   
{  
this.id = id;  
}  
public String getUname()   
{  
return username;  
}  
public void setUname(String username)   
{  
this.username = username;  
}  
@Override  
public String toString()   
{  
return "User [id=" + id + ", uname=" + username + "]";  
}  
}  

```

#### BookController.java:

```

package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    
public class UserController   
{    
@Autowired    
private UserService userService;     
@RequestMapping("/")    
public List<UserRecord> getAllUser()  
{    
return userService.getAllUsers();    
}       
@RequestMapping(value="/add-user", method=RequestMethod.POST)    
public void addUser(@RequestBody UserRecord userRecord)  
{    
userService.addUser(userRecord);    
}       

```

#### UserService.java:

```
import java.util.List;    
import java.util.ArrayList;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Service;  
import com.example.model.UserRecord;  
import com.example.repository.UserRepository;    
@Service    
public class UserService   
{    
@Autowired    
private UserRepository userRepository;    
public List<UserRecord> getAllUsers()  
{    
List<UserRecord>userRecords = new ArrayList<>();    
userRepository.findAll().forEach(userRecords::add);    
return userRecords;    
}    
public void addUser(UserRecord userRecord)  
{    
userRepository.save(userRecord);    
}    

}
```

#### UserRepository.java:

```

import org.springframework.data.repository.CrudRepository;  
import com.example.model.UserRecord;    
public interface UserRepository extends CrudRepository<UserRecord, String>   
{    
}    

```

#### Main.java:

```
@SpringBootApplication  
public class ApacheDerbyExampleApplication   
{  
public static void main(String[] args)   
{  
SpringApplication.run(ApacheDerbyExampleApplication.class, args);  
}  
}  

```




