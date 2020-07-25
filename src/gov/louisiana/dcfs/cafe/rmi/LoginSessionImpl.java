package gov.louisiana.dcfs.cafe.rmi;

import org.springframework.stereotype.Service;

@Service("loginSession")
public class LoginSessionImpl implements LoginSession {

	@Override
	public String doLogin(final String username, final String password) {
		System.out.println("Username" + username);
		System.out.println("Password "+ password);
		return "success";
	}

}
