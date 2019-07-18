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

import com.service.CommentService;
import com.service.ICommentService;
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
		ICommentService ics = new CommentService();
		String userName = null;
		
		try {
			//1.������������
			 DiskFileItemFactory factory = new DiskFileItemFactory();
			//2.����������
			 ServletFileUpload upload = new ServletFileUpload(factory);
			//3.����request���� 
			 List<FileItem> list = upload.parseRequest(request);
			 
			 for(FileItem item:list){
			//�ж��Ƿ�Ϊһ����ͨ�ı���(�û���)
				 if(item.isFormField()){
					String filedname = item.getFieldName();//input�ı�ǩ��--username
					userName = 	item.getString();
				 }else{
					 InputStream is = item.getInputStream();
					//�ڴ����ϴ����ļ�
					String filename = item.getName();//�ύ�ļ���������(ԭ�ļ���)
					//�ļ���׺
					String subfix = filename.substring(filename.indexOf("."));//��ȡ�ļ���׺
					String bfilename = new Date().getTime()+subfix;
					File file = new File("C:\\dbimgs\\"+bfilename);
					if(!file.exists()){
						file.createNewFile();
					}
					
					FileOutputStream fos = new FileOutputStream(file);
					//�ļ���ת�浽���ش���
					byte[] b = new byte[512];
					int len = -1;
					while((len = is.read(b))!=-1){
						fos.write(b);
					}
					ius.upUserIMg(userName,bfilename);
					ics.setCommentImgByUserName(userName, bfilename);
					//�ر���
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
