package com.computernetwork.service;

import com.computernetwork.entity.Message;

import java.util.List;

public interface IMessageService {
    Message createMessage(String content, Integer deviceId, Integer receiverUserId);
    List<Message> getAllMessage();
    List<Message> getMessageByDevice(Integer deviceId);
}
