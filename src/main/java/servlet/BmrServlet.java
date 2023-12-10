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

@WebServlet("/servlet/bmr") // servlet path = "/servlet/bmi"
public class BmrServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 編碼設定
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		// 取得 form 表單傳來的參數
		String sex = req.getParameter("sex");
		String age = req.getParameter("age");
		String height = req.getParameter("height");
		String weight = req.getParameter("weight");
		
		// 計算 bmi
		double h = Double.parseDouble(height);
		double w = Double.parseDouble(weight);
		/*
		 * 男：66＋( 13.7*體重kg＋5*身高cm－6.8*年齡 )
		   女：655＋( 9.6*體重kg＋1.8*身高cm－4.7*年齡 )
		 */
		
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>BMI</title>");
		out.println("<link rel=\"stylesheet\" href=\"../css/demo.css\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 class=\"my_red_color\">BMI Result !</h1>");
		out.println("<h2>身高: " + h + "</h2>");
		out.println("<h2>體重: " + w + "</h2>");
		out.println("<h2>BMI: " + String.format("%.2f") + "</h2>");
		out.println("<button type='button' onClick='history.back();' >返回</button>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
}