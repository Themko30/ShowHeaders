package Controller;

import Model.HeadersBean;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

@WebServlet(name = "ServletRequestHeaders", value = "/ServletRequestHeaders")
public class ServletRequestHeaders extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ArrayList<String> headerNames = Collections.list(request.getHeaderNames());
    ArrayList<String> headerValues = new ArrayList<>();
    for (String headerName : headerNames) {
      headerValues.add(request.getHeader(headerName));
    }
    HeadersBean headersBean = new HeadersBean(headerNames, headerValues);
    request.setAttribute("headerskey", headersBean);
    RequestDispatcher dispatcher =
        request.getRequestDispatcher("/WEB-INF/Results/ShowRequestHeaders.jsp");
    dispatcher.forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
