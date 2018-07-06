package io.ymq.rabbitmq.config;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Sender {

  @Autowired
  private AmqpTemplate rabbitTemplate;

  public String topicSendMessage(final String name) {
//	  Connection connection = ConnectionUtil.getConnection();
//	  
//	  Channel channel = connection.createChannel();
//      //声明队列
//      channel.queueDeclare(QUEUE_NAME,false,false,false,null);
//      //绑定队列到交换机;
//      channel.queueBind(QUEUE_NAME,EXCHANGE_NAME,"update"); 
	  
	  String context = "hello "+name+" --" + new Date().getTime();  
      System.out.println(context);
      this.rabbitTemplate.convertAndSend("topicExchange", "topic.message.123", context);  
      return context;  
  }
}