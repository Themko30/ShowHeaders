package Controller;

import Model.HeadersBean;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


@WebServlet(name = "ServletRequestHeaders", value = "/ServletRequestHeaders")
public class ServletRequestHeaders extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<String> headerNames = Collections.list(request.getHeaderNames());
		ArrayList<String> headerValues = new ArrayList<>();
		for (String headerName : headerNames) {
			headerValues.add(request.getHeader(headerName));
		}
		HeadersBean headersBean = new HeadersBean(headerNames, headerValues);
		request.setAttribute("headerskey", headersBean);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Results/ShowRequestHeaders.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
