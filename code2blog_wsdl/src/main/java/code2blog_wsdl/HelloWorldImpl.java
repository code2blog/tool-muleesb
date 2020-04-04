package code2blog_wsdl;

import code2blog_wsdl.gen.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public String sayHello(String in) {
		return String.format("hello [%s]", in);
	}

}
