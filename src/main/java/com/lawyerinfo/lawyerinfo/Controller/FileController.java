package com.lawyerinfo.lawyerinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.lawyerinfo.lawyerinfo.Entity.FileDB;
import com.lawyerinfo.lawyerinfo.Services.FileStorageService;
import com.lawyerinfo.lawyerinfo.payload.FileUploadResponse;

@RestController
public class FileController {

	@Autowired
	public FileStorageService filestorageserice;
	
	@PostMapping("/fileupload")
	public FileUploadResponse uploadFile(@RequestParam("file") MultipartFile file ) {
		FileDB filedb = filestorageserice.storeFiles(file);
		
		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/filedownload/")
                .path(String.valueOf(filedb.getId()))
                .toUriString();
		
		return new FileUploadResponse(filedb.getName(), fileDownloadUri,
                file.getContentType(), file.getSize());
	}
	
	@GetMapping("/filedownload/{fileId}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable long fileId) {
		FileDB dbfile = filestorageserice.getFile(fileId);
		
		return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(dbfile.getType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "/attachment; filename=\"" + dbfile.getName() + "\"")
                .body(new ByteArrayResource(dbfile.getFileContent()));
	}
	 

	 
}
	

