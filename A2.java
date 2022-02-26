package com.anno;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/mul")
public class A2 extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int k = 0;

		Cookie ck[] = req.getCookies();
		for (Cookie c : ck) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
			}
		}

		k = k * k;
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='green'>");
		out.println("result is " + k);
		out.println("</body></html>");
		System.out.println("l is called by  session cooiiiiiieeeee ");

	}

}
