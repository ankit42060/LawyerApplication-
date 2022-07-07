package com.lawyerinfo.lawyerinfo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lawyerinfo.lawyerinfo.Entity.FileDB;

@Repository
public interface FileRepo extends JpaRepository<FileDB, Long> {

}
