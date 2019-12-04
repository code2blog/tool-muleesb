
Demo 1  <br>
	site: https://code2blog.wordpress.com  <br>
	post: "mulesoft – part 10 ( cxf )"   <br>
  <br>
This message flow (as_webservice.xml) exposes a wsdl file on port 8081  <br>
You can invoke it using this url http://localhost:8081/as_webservice?wsdl  <br>
A soap operation called helloWorldFunc can be invoked which returns Hello World + inputArgument.   <br>

- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

Demo 2  <br>
	site: https://code2blog.wordpress.com  <br>
	post: "mulesoft – part 11 ( webservice provider and consumer )"   <br>
  <br>
This message flow (as_soapconsumer.xml) create a consumer webservice that accepts http query parameters and invokes a soap webservice  <br>
You can invoke it using this url http://localhost:8081/as_soapconsumer  <br>
