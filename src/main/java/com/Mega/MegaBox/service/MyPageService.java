package com.Mega.MegaBox.service;

import com.Mega.MegaBox.model.MyPageModel;
import com.Mega.MegaBox.repository.MyPageRepository;
import org.springframework.stereotype.Service;

@Service
public class MyPageService {
    private MyPageRepository myPageRepository;

    public MyPageService(MyPageRepository myPageRepository) {
        this.myPageRepository = myPageRepository;
    }

    public String getMyPageNameFindById(String id) {
        return this.myPageRepository.findById(id).map((v) -> v.getUSER_NAME()).orElse("no id" + id);
    }
}
