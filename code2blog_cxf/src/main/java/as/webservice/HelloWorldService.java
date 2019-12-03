package as.webservice;

import javax.jws.WebService;

@WebService
public class HelloWorldService implements IHelloWorldService {
	@Override
	public String helloWorldFunc(String name) {
		return "Hello World " + name;
	}
}