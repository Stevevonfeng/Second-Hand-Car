package com.servlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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

import com.service.IUserService;
import com.service.UserServiceImpl;

/**
 * Servlet implementation class UserImage
 */
@WebServlet("/User-Image")
public class UserImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserImage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		IUserService ius = new UserServiceImpl();
		String userName = null;
		
		try {
			//1.创建解析工厂
			 DiskFileItemFactory factory = new DiskFileItemFactory();
			//2.创建解析器
			 ServletFileUpload upload = new ServletFileUpload(factory);
			//3.解析request请求 
			 List<FileItem> list = upload.parseRequest(request);
			 
			 for(FileItem item:list){
			//判断是否为一个普通的表单域(用户名)
				 if(item.isFormField()){
					String filedname = item.getFieldName();//input的标签名--username
					userName = 	item.getString();									//input填入的文本内容
					System.out.println(userName);
				 }else{
					 InputStream is = item.getInputStream();
					//在磁盘上创建文件
					String filename = item.getName();//提交文件名的名字(原文件名)
					//文件后缀
					String subfix = filename.substring(filename.indexOf("."));//截取文件后缀
					String bfilename = new Date().getTime()+subfix;
					System.out.println(bfilename);
					File file = new File("C:\\dbimgs\\"+bfilename);
					if(!file.exists()){
						file.createNewFile();
					}
					
					FileOutputStream fos = new FileOutputStream(file);
					//文件的转存到本地磁盘
					byte[] b = new byte[512];
					int len = -1;
					while((len = is.read(b))!=-1){
						fos.write(b);
					}
					ius.upUserIMg(userName,bfilename);
					//关闭流
					is.close();
					fos.close();
				 }
				 
			 }
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
