package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CadastrarLogin;

       @WebFilter("/controller.do")
       public class LoginFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// place your code here
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		CadastrarLogin logado = (CadastrarLogin) session.getAttribute("logado");
		String path = req.getContextPath();
		String uri = req.getRequestURI();
		String comando = req.getParameter("command");
		if(comando == null){
			comando = "";
		}

		if (logado == null && !uri.equals(path + "/index.jsp")
				&& !comando.equals("LoginUsuario")) {
			((HttpServletResponse) response).sendRedirect(path + "/index.jsp");
		} else {
			// pass the request along the filter chain
			chain.doFilter(request, response);
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
         //thisClass.setTitle("Tela de Login");
         //thisClass.setSize(289, 195);
     //}