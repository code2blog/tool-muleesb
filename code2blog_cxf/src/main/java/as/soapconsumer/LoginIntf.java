package as.soapconsumer;

import javax.jws.WebService;

@WebService
public interface LoginIntf {
	LoginResponse verify(LoginRequest request);
}