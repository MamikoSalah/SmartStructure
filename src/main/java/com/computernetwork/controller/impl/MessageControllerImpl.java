package com.computernetwork.controller.impl;

import com.computernetwork.controller.IMessageController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class MessageControllerImpl implements IMessageController {
}
