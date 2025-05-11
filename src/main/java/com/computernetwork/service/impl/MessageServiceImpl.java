package com.computernetwork.service.impl;

import com.computernetwork.entity.Device;
import com.computernetwork.entity.Message;
import com.computernetwork.entity.User;
import com.computernetwork.repository.DeviceRepository;
import com.computernetwork.repository.MessageRepository;
import com.computernetwork.repository.UserRepository;
import com.computernetwork.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class MessageServiceImpl implements IMessageService {

    @Autowired
    private MessageRepository messageRepository;
    private DeviceRepository deviceRepository;
    private UserRepository userRepository;

    @Override
    public Message createMessage(String content, Integer senderDeviceId, Integer receiverUserId) {
        Optional<Device> senderOptional = deviceRepository.findById(senderDeviceId);
        Optional<User> recieverOptinal = userRepository.findById(receiverUserId);

        if (senderOptional == null){
            System.out.println("Device not found!");
        }

        Message message = new Message();
        message.setMessageContent(content);
        message.setSentAt(new Timestamp(System.currentTimeMillis()));
        message.setSender();
    }


    @Override
    public List<Message> getAllMessage() {
        return List.of();
    }

    @Override
    public List<Message> getMessageByDevice(Integer deviceId) {
        return List.of();
    }

}
