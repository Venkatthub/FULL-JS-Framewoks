package directory.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import directory.backend.BackendOps;

/**
 * Servlet implementation class Directory
 */

@WebServlet("/directory")
public class Directory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		String areaName = request.getParameter("area");

		BackendOps bp = new BackendOps();

		bp.computeResults(areaName);

		String jsonObject = new Gson().toJson(bp.getPojoInstance());

		response.getWriter().print(jsonObject);

	}

}
