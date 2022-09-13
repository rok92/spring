package com.spring_boot_mybatis.project.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileDownloadController {
	
	@RequestMapping("fileDownloadList")
	public ModelAndView fildDownloadList(ModelAndView mv) {
		File path = new File("C:/springWorkspace/upload");
		String[] fileList = path.list();
		
		mv.addObject("fileList", fileList);
		mv.setViewName("upload/fileDownloadListView");
		return mv;
	}
	
	@RequestMapping("fileDownload/{file}")
	public void fileDownload(@PathVariable String file, HttpServletResponse response) throws IOException {
		File f=new File("C:/springWorkspace/upload/", file);
		
		// 파일명 인코딩
		String encodedFileName = new String(file.getBytes("UTF-8"), "ISO-8859-1");

		
		// file다운로드 설정
		response.setContentType("application/download");
		response.setContentLengthLong((int)f.length());
		response.setHeader("Content-Disposition", "attachment;filename=\""+encodedFileName+"\"");
		
		// response 객체를 통해서 서버로부터 파일 다운로드 받음
		OutputStream os = response.getOutputStream();
				
		// 파일 입력 객체 생성
		FileInputStream fis = new FileInputStream(f);
		FileCopyUtils.copy(fis, os);
	}
}
