import java.io.*;
import javax.servlet.*;
public class FirstServlet implements Servlet
{
	static{
		System.out.println("FirstServlet .Class file is loading....... ");
	}
public	FirstServlet(){
		System.out.println("FirstServlet object is instantiated.");
	}
	//For Servlet initialization container calls this method
 public  void init(ServletConfig config) throws ServletException
	 {
		System.out.println("Servlet initialization");
	 }
  public  ServletConfig getServletConfig()
	  {
		return null;
	  }
	  //request processing logic
  public  void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
	  {
		System.out.println("Servlet request processing......");
	  }
  public  String getServletInfo()
{
	  return null;
	

}//servlet de-instantiation logic
  public  void destroy()
	  {
		System.out.println("Servlet de-instantiation......");
	  }
}