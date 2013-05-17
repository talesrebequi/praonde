package Dao;
 
import java.io.File;
import java.util.Iterator;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;
 
public class Upload {
 
    public String anexos(HttpServletRequest request, HttpServletResponse response) throws Exception {
    String arquivo="";
	if (ServletFileUpload.isMultipartContent(request)) {
 
		int cont = 0;
 
		ServletFileUpload servletFileUpload = new ServletFileUpload(
					new DiskFileItemFactory());
 
		List fileItemsList = null;
 
		try {
			fileItemsList = servletFileUpload.parseRequest(request);
		} catch (FileUploadException e1) {
			e1.printStackTrace();
		}
 
		String optionalFileName = "";
		FileItem fileItem = null;
 
		Iterator it = fileItemsList.iterator();
 
		while (it.hasNext()) {
 
			cont++;
 
			FileItem fileItemTemp = (FileItem) it.next();
 
			if (fileItemTemp.isFormField()) {
				System.out.println(fileItemTemp.getFieldName());
				if (fileItemTemp.getFieldName().equals("filename")) {
					optionalFileName = fileItemTemp.getString();
				}
			} else {
				fileItem = fileItemTemp;
			}
 
			if (cont != (fileItemsList.size())) {
				if (fileItem != null) {
 
					String fileName = fileItem.getName();
					
					if (fileItem.getSize() > 0) {
 
						if (optionalFileName.trim().equals("")) {
							fileName = FilenameUtils.getName(fileName);
						} else {
							fileName = optionalFileName;
						}
 
						String dirName = "/C:/uploads/"; //caminho para o projeto
 
						File saveTo = new File(dirName + fileName);
						arquivo="/C:/uploads/"+fileName;
						try {
							fileItem.write(saveTo);
						} catch (Exception e) {
 
						}
 
					}
				}
			}
		} 
		return arquivo;
	} else {
		return "erro";
	}
    }
}