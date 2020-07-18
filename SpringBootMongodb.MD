### Run Programs in POSTMAN:

![image](https://user-images.githubusercontent.com/11579239/87849964-3c7e7d80-c90a-11ea-8b24-36b73c16ae01.png)

### RUN in MongoDB Compass:

![image](https://user-images.githubusercontent.com/11579239/87850005-810a1900-c90a-11ea-993b-cb6d02fc9afd.png)

#### MOngoDB Tables:

![image](https://user-images.githubusercontent.com/11579239/87850017-967f4300-c90a-11ea-98bb-11c761700c75.png)


### Book.java:

```

package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection="books")
public class book {
	@Id
	private int id;
	private String bookName;
	private String authorName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}
```

#### BookRepository.Java:

```

package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.book;

@Repository
public interface BookRepository extends MongoRepository<book,Integer>{

}

```

#### BookController.java:

```

package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.book;
import com.example.demo.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository BookRepository;
	
	@GetMapping("/findAllBooks")
	public List<book> getAllBooks()
	{
		return BookRepository.findAll();
	}
	
	@PostMapping("/addBooks")
	public String addAllBooks(@RequestBody book book)
	{
		 BookRepository.save(book);
		 return "book id";
	}
	
	@DeleteMapping("/deleteBooks/{id}")
	public String deleteBooks(@PathVariable int id)
	{
		 BookRepository.deleteById(id);
		 return "book id";
	}
	
	@GetMapping("/findBook/{id}")
	public String getAllBooksById(@PathVariable int id)
	{
		BookRepository.findById(id);
		return "book id";
	}
}

```

#### Application.properties:

```

spring.data.mongodb.database=booksdetails
spring.data.mongodb.port=27017
spring.data.mongodb.host=localhost

```




