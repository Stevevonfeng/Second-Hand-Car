package com.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.model.CarAccessories;
import com.model.CarEngin;
import com.model.CarInfo;
import com.model.CarModel;
import com.service.CarServiceImpl;
import com.service.ICarService;
import com.service.Util;

/**
 * Servlet implementation class PostCarServlet
 */
@WebServlet("/PostCarServlet")
public class PostCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Util util = new Util();
		DiskFileItemFactory fa = new DiskFileItemFactory();
		ServletFileUpload up = new ServletFileUpload(fa);
		List<FileItem> list = null;
		try {
			list = up.parseRequest(request);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		/*for(FileItem item : list) {
			if(item.isFormField()) {
				if(item.getFieldName().equals("accessories")) {
					String aa = item.getString();
					System.out.println(aa);
				}
			}
		}*/
	
		long vid = new Date().getTime();
		CarModel cm = util.reqToCarModel(list,vid);
		CarInfo ci = util.reqToCarInfo(list,vid);
		CarEngin ce = util.reqToCarEngin(list,vid);
		CarAccessories ca = util.reqToCarAccessories(list, vid);

		ICarService cs = new CarServiceImpl();
		cs.addCarModel(cm);
		cs.addCarInfo(ci);
		cs.addCarEngin(ce);
		cs.addCarAccessories(ca);
		response.sendRedirect("post-vehicle.jsp");
	}

}
