package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		pw.println("<html> "+ "<head>" +"<title>Sample 'Hello, World' " +
				"Application</title> </head>"+
				"<body bgcolor=white> <table border='0'> <tr> <td>" +
"<img src='images/tomcat.gif'> </td> <td> <h1>Sample Application Servlet Page</h1> " +
"</td> </tr></table> <p>This is the output of a Servlet that is part of the Hello, World application.</p> </body></html>" );

		pw.println("Hello!!!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<html> "+ "<head>" +"<title>Sample 'Hello, World' " +
				"Application</title> </head>"+
				"<body bgcolor=white> <table border='0'> <tr> <td>" +
"<img src='images/tomcat.gif'> </td> <td> <h1>Sample Application Servlet Page</h1> " +
"</td> </tr></table> <p>This is the output of a Servlet Form that is part of the Hello, World application.</p> </body></html>" );
		String string1 = request.getParameter("name");
        String string2 = request.getParameter("pwd");
        String concatenated =
            MyConcatenator.concatenate(
            string1, string2);
        
        out.println("UserName: "+string1);
        out.println();
        out.println("<br> Password: "+string2);
        
        out.print("<br>Concatenated String: "+concatenated);
	}

}
