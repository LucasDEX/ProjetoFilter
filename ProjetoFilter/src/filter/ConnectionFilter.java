package filter;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import dao.ConnectionFactory;

@WebFilter("/*")
public class ConnectionFilter implements Filter {

			public void destroy() {
			}

			public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			ConnectionFactory.obterConexao();
			chain.doFilter(request, response);
			ConnectionFactory.fecharConexao();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ServletException(e);
			}

		}

	
			
			public void init(FilterConfig fConfig) throws ServletException {
	}

}









//wingUtilities.invokeLater(new Runnable() {
//public void run() {
//  login thisClass = new login();
  //thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  //thisClass.setVisible(true);



//request.setCharacterEncoding("UTF-8");
//response.setCharacterEncoding("UTF-8");
//HttpServletRequest req = (HttpServletRequest)request;
//HttpSession session = req.getSession();
//RegistrarELogin login = (RegistrarELogin)session.getAttribute("logado");

//if(login == null){9, 195);
//}