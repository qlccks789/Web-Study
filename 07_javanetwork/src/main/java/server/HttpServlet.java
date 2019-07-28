package server;

public abstract class HttpServlet {
	public abstract void service(
			HttpServletRequest request, 
			HttpServletResponse response) throws Exception;
}
