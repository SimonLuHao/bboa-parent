package com.simon.consumer;

import java.util.UUID;

import com.alibaba.rocketmq.client.consumer.DefaultMQPullConsumer;
import com.alibaba.rocketmq.client.exception.MQClientException;

public class TestConsumer {

	//�˽��뿪���˼��¼��¿������˽����ռ��뿪��
	public static void main(String[] args) throws MQClientException{
		DefaultMQPullConsumer consumer =new DefaultMQPullConsumer();
		consumer.createTopic(UUID.randomUUID().toString(), "SIMON", 1);
		consumer.setNamesrvAddr("127.0.0.1:9876");
		consumer.setConsumerGroup("fantuantuan");
	}
	
}
