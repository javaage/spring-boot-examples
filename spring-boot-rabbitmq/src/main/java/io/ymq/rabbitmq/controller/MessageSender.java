package io.ymq.rabbitmq.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.ymq.rabbitmq.config.Sender;

@Controller
@RestController
@RequestMapping(value = "/")
public class MessageSender {
	
	@Autowired
	private Sender sender;
	
	@ResponseBody
	@RequestMapping(value = "{message}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Object list(HttpServletRequest request, @PathVariable("message") String message) {
		sender.topicSendMessage(message);
		return message;
	}
}
