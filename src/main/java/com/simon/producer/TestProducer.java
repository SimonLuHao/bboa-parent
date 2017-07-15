package com.simon.producer;

import java.util.UUID;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;

public class TestProducer {

	public static void main(String[] args)
			throws MQClientException, RemotingException, MQBrokerException, InterruptedException {
		DefaultMQProducer producer = new DefaultMQProducer();
		int maxMessageSize = producer.getMaxMessageSize();
		System.out.println(maxMessageSize);
		String key = UUID.randomUUID().toString();
		producer.setProducerGroup("fantuantuan");
		producer.setNamesrvAddr("127.0.0.1:9876");
		String newTopic = "Simon";
		Integer queueNum = 1;
		producer.createTopic(key, newTopic, queueNum);
		Message msg = new Message(newTopic, "TUANTUAN", key, ("你好").getBytes());
		SendResult sendResult = producer.send(msg);
		if (sendResult != null) {
			System.out.println("发送成功");
		} else {
			System.out.println("发送失败");
		}
	}

}
