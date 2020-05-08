package com.example.demo;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@Transactional
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @RequestMapping("getfile")
    public String getOpinionBills() {
        OpnFileDO one = fileRepository.getOne("14247");
        return one.toString();
    }


}


