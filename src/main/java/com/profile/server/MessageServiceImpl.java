package com.profile.server;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepo messageRepo;
    @Override
    public message createMessage(String email, String para) {
        message mes=new message(email,para);
        return this.messageRepo.save(mes);
    }
}
