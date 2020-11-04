import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Directory", urlPatterns = { "/backend" })

public class DirectoryBackend extends HttpServlet {

/*	CityCodes codes;

	@Override
	public void init() throws ServletException {
		codes = new CityCodes();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		resp.setContentType("text/*");
		PrintWriter out = resp.getWriter();
		String userInput = req.getParameter("area");

		for (String areaname : codes.chennaiCodes().keySet()) {

			if (areaname.contains(userInput)) {

				userInput = areaname;
				break;
			}
		}

		if (codes.chennaiCodes().containsKey(userInput)) {

			int code = codes.chennaiCodes().get(userInput);

			out.print(codes);

		} else {

			int value = Integer.parseInt(userInput);

			if (codes.chennaiCodes().containsValue(value)) {

				out.print(codes);

				codes.chennaiCodes().keySet().stream().forEach(x -> {
					if (codes.chennaiCodes().get(x) == value)
						out.print(x.toUpperCase());
				});

			} else {

				throw new NotFound("\nEntered code or area name is incorrect ! \nPlease try again ");

			}
		}

	}

	@Override
	public void destroy() {
		// Ending the life cycle
		super.destroy();
	}
*/
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		resp.setContentType("text/text");
		PrintWriter out = resp.getWriter();
		String userInput = req.getParameter("city");

		out.print(userInput);
	}


}
