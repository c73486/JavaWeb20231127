package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/lotto")
public class LottoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		Set<Integer> nums = new LinkedHashSet<Integer>();
		Random random = new SecureRandom();
		while (nums.size() < 5) {
			nums.add(random.nextInt(39)+1);
		}
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>樂透電腦選號</title>");
		out.println("<link rel=\"stylesheet\" href=\"../css/demo.css\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>"+ nums +"</h2>");
		out.println("</body>");
	}
	
}
