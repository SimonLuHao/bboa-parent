package com.simon.consumer;

import java.util.UUID;

import com.alibaba.rocketmq.client.consumer.DefaultMQPullConsumer;
import com.alibaba.rocketmq.client.exception.MQClientException;

public class TestConsumer {

	//了解离开家了见谅见谅看见了了交流空间离开就
	public static void main(String[] args) throws MQClientException{
		DefaultMQPullConsumer consumer =new DefaultMQPullConsumer();
		consumer.createTopic(UUID.randomUUID().toString(), "SIMON", 1);
		consumer.setNamesrvAddr("127.0.0.1:9876");
		consumer.setConsumerGroup("fantuantuan");
	}
	
}
