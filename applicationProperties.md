
#### Application.properties:

* Spring Boot Framework comes with a built-in mechanism for application configuration using a file called application.properties. 
* It is located inside the src/main/resources folder, as shown in the following figure.

#### Application.properties:

```
#configuring application name  
spring.application.name = demoApplication  
#configuring port  
server.port = 8081  
```
####  application.yml:

 ```
spring:  
application:  
name: demoApplication  
server:  
port: 8081  
```
* We have configured application name and port.

<p>In the above example, we have configured the <strong>application name</strong> and <strong>port</strong>. The port 8081 denotes that the application runs on port <strong>8081</strong>.</p>
<h2 class="h2">Spring Boot Property Categories</h2>
<p>There are <strong>sixteen</strong> categories of Spring Boot Property are as follows:</p>
<ol class="points">
<li>Core Properties</li>
<li>Cache Properties</li>
<li>Mail Properties</li>
<li>JSON Properties</li>
<li>Data Properties</li>
<li>Transaction Properties</li>
<li>Data Migration Properties</li>
<li>Integration Properties</li>
<li>Web Properties</li>
<li>Templating Properties</li>
<li>Server Properties</li>
<li>Security Properties</li>
<li>RSocket Properties</li>
<li>Actuator Properties</li>
<li>DevTools Properties</li>
<li>Testing Properties</li>
</ol>
<h2 class="h2">Application Properties Table</h2>
<p>The following tables provide a list of common Spring Boot properties:</p>
<table class="alt">
<tr>
	<th>Property</th>
	<th>Default Values</th>
	<th>Description</th>
</tr>
<tr>
	<td>Debug</td>
	<td>false</td>
	<td>It enables debug logs.</td>
</tr>
<tr>
	<td>spring.application.name</td>
	<td></td>
	<td>It is used to set the application name.</td>
</tr>
<tr>
	<td>spring.application.admin.enabled</td>
	<td>false</td>
	<td>It is used to enable admin features of the application.</td>
</tr>
<tr>
	<td>spring.config.name</td>
	<td>application</td>
	<td>It is used to set config file name.</td>
</tr>
<tr>
	<td>spring.config.location</td>
	<td></td>
	<td>It is used to config the file name.</td>
</tr>
<tr>
	<td>server.port</td>
	<td>8080</td>
	<td>Configures the HTTP server port</td>
</tr>
<tr>
	<td>server.servlet.context-path</td>
	<td></td>
	<td>It configures the context path of the application.</td>
</tr>
<tr>
	<td>logging.file.path</td>
	<td></td>
	<td>It configures the location of the log file.</td>
</tr>
<tr>
	<td>spring.banner.charset</td>
	<td>UTF-8</td>
	<td>Banner file encoding.</td>
</tr>
<tr>
	<td>spring.banner.location</td>
	<td>classpath:banner.txt</td>
	<td>It is used to set banner file location.</td>
</tr>
<tr>
	<td>logging.file</td>
	<td></td>
	<td>It is used to set log file name. For example, data.log.</td>
</tr>
<tr>
	<td>spring.application.index</td>
	<td></td>
	<td>It is used to set application index.</td>
</tr>
<tr>
	<td>spring.application.name</td>
	<td></td>
	<td>It is used to set the application name.</td>
</tr>
<tr>
	<td>spring.application.admin.enabled</td>
	<td>false</td>
	<td>It is used to enable admin features for the application.</td>
</tr>
<tr>
	<td>spring.config.location</td>
	<td></td>
	<td>It is used to config the file locations.</td>
</tr>
<tr>
	<td>spring.config.name</td>
	<td>application</td>
	<td>It is used to set config the file name.</td>
</tr>
<tr>
	<td>spring.mail.default-encoding</td>
	<td>UTF-8</td>
	<td>It is used to set default MimeMessage encoding.</td>
</tr>
<tr>
	<td>spring.mail.host</td>
	<td></td>
	<td>It is used to set SMTP server host. For example, smtp.example.com.</td>
</tr>
<tr>
	<td>spring.mail.password</td>
	<td></td>
	<td>It is used to set login password of the SMTP server.</td>
</tr>
<tr>
	<td>spring.mail.port</td>
	<td></td>
	<td>It is used to set SMTP server port.</td>
</tr>
<tr>
	<td>spring.mail.test-connection</td>
	<td>false</td>
	<td>It is used to test that the mail server is available on startup.</td>
</tr>
<tr>
	<td>spring.mail.username</td>
	<td></td>
	<td>It is used to set login user of the SMTP server.</td>
</tr>
<tr>
	<td>spring.main.sources</td>
	<td></td>
	<td>It is used to set sources for the application.</td>
</tr>
<tr>
	<td>server.address</td>
	<td></td>
	<td>It is used to set network address to which the server should bind to.</td>
</tr>
<tr>
	<td>server.connection-timeout</td>
	<td></td>
	<td>It is used to set time in milliseconds that connectors will wait for another HTTP request before closing the connection.</td>
</tr>
<tr>
	<td>server.context-path</td>
	<td></td>
	<td>It is used to set context path of the application.</td>
</tr>
<tr>
	<td>server.port</td>
	<td>8080</td>
	<td>It is used to set HTTP port.</td>
</tr>
<tr>
	<td>server.server-header</td>
	<td></td>
	<td>It is used for the Server response header (no header is sent if empty)</td>
</tr>
<tr>
	<td>server.servlet-path</td>
	<td>/</td>
	<td>It is used to set path of the main dispatcher servlet</td>
</tr>
<tr>
	<td>server.ssl.enabled</td>
	<td></td>
	<td>It is used to enable SSL support.</td>
</tr>
<tr>
	<td>spring.http.multipart.enabled</td>
	<td>True</td>
	<td>It is used to enable support of multi-part uploads.</td>
</tr>
<tr>
	<td>spring.servlet.multipart.max-file-size</td>
	<td>1MB</td>
	<td>It is used to set max file size.</td>
</tr>
<tr>
	<td>spring.mvc.async.request-timeout</td>
	<td></td>
	<td>It is used to set time in milliseconds.</td>
</tr>
<tr>
	<td>spring.mvc.date-format</td>
	<td></td>
	<td>It is used to set date format. For example, dd/MM/yyyy.</td>
</tr>
<tr>
	<td>spring.mvc.locale</td>
	<td></td>
	<td>It is used to set locale for the application.</td>
</tr>
<tr>
	<td>spring.social.facebook.app-id</td>
	<td></td>
	<td>It is used to set application's Facebook App ID.</td>
</tr>
<tr>
	<td>spring.social.linkedin.app-id</td>
	<td></td>
	<td>It is used to set application's LinkedIn App ID.</td>
</tr>
<tr>
	<td>spring.social.twitter.app-id</td>
	<td></td>
	<td>It is used to set application's Twitter App ID.</td>
</tr>
<tr>
	<td>security.basic.authorize-mode</td>
	<td>role</td>
	<td>It is used to set security authorize mode to apply.</td>
</tr>
<tr>
	<td>security.basic.enabled</td>
	<td>true</td>
	<td>It is used to enable basic authentication.</td>
</tr>
<tr>
	<td>Spring.test.database.replace</td>
	<td>any</td>
	<td>Type of existing DataSource to replace.</td>
</tr>
<tr>
	<td>Spring.test.mockmvc.print</td>
	<td>default</td>
	<td>MVC Print option</td>
</tr>
<tr>
	<td>spring.freemaker.content-type</td>
	<td>text/html</td>
	<td>Content Type value</td>
</tr>
<tr>
	<td>server.server-header</td>
	<td></td>
	<td>Value to use for the server response header.</td>
</tr>
<tr>
	<td>spring.security.filter.dispatcher-type</td>
	<td>async, error, request</td>
	<td>Security filter chain dispatcher types.</td>
</tr>
<tr>
	<td>spring.security.filter.order</td>
	<td>-100</td>
	<td>Security filter chain order.</td>
</tr>
<tr>
	<td>spring.security.oauth2.client.registration.*</td>
	<td></td>
	<td>OAuth client registrations.</td>
</tr>
<tr>
	<td>spring.security.oauth2.client.provider.*</td>
	<td></td>
	<td>OAuth provider details.</td>
</tr>
</table>
