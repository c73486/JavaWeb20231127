package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/servlet/welcome")//要給/(先取名在生產)
public class WelcomeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//編碼設定
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		//動態產生時間(server端)SSR渲染
		//js動態時間(client端)CSR渲染
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		String now = sdf.format(new Date());
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>歡迎頁</title>");
		out.println("<link rel=\"stylesheet\" href=\"../css/demo.css\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 class=\"my_red_color\">歡迎光臨</h1>");
		out.println("<h3>"+now+"</h3>");
		out.println("<h2>\n"
				+ "			<script>\n"
				+ "				var Today=new Date();\n"
				+ "　				document.write(\"今天是 \" + Today.getFullYear() + \" 年 \"\n"
				+ "									+ (Today.getMonth()+1) + \" 月 \"\n"
				+ "									+ Today.getDate() + \" 日 \"\n"
				+ "									+ Today.getHours() + \" 時 \"\n"
				+ "									+ Today.getMinutes() + \" 分 \");\n"
				+ "		</script>\n"
				+ "		</h2>");
		out.println("<img src=\"../image/wow.jpg\">");
		out.println("</body>");		
		out.println("</html>");
	
	}
	
}
