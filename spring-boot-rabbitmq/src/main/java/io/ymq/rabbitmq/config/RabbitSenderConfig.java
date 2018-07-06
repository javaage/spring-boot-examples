package io.ymq.rabbitmq.config;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitSenderConfig {
  @Bean
  public TopicExchange topicExCertification() {
    return new TopicExchange("certification_exchange");
  }
}
