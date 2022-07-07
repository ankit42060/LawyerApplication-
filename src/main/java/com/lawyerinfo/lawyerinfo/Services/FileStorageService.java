package com.lawyerinfo.lawyerinfo.Services;

 

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lawyerinfo.lawyerinfo.Entity.FileDB;
import com.lawyerinfo.lawyerinfo.Repository.FileRepo;
import com.lawyerinfo.lawyerinfo.exception.FileNotFoundException;
import com.lawyerinfo.lawyerinfo.exception.FileStorageException;
 

 

@Service
public class FileStorageService {
	
	@Autowired
	public FileRepo filerepository;

	
	public FileDB storeFiles(MultipartFile file) {
		
			String fileName = org.springframework.util.StringUtils.cleanPath(file.getOriginalFilename());
					
			try {
				if(fileName.contains("..")) {
					throw new FileStorageException("Sorry !! file contain invalid path sequence "+fileName);
				}
				FileDB dbfiles = new FileDB(fileName,file.getContentType(),file.getBytes());
				return filerepository.save(dbfiles);

			} catch (Exception e) {
				// TODO: handle exception
				throw new FileStorageException("Could not store files"+fileName+".Please try again later!!!",e);
			}
			// TODO: handle exception
			 
			
		
	}
	public FileDB getFile(long fileId) {
		return filerepository.findById(fileId)
				.orElseThrow(() -> new FileNotFoundException("File you requested not found with id " +fileId));
	}
}
