package HttpServletEx;

public class HttpServletExample {

	public static void main(String[] args) {
		LoginServlet login = new LoginServlet();
		FileDownloadServlet down = new FileDownloadServlet();	
		login.login();
		down.down();
	}

}
