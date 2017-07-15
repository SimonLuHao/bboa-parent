package com.simon.consumer;

import java.util.UUID;

import com.alibaba.rocketmq.client.consumer.DefaultMQPullConsumer;
import com.alibaba.rocketmq.client.exception.MQClientException;

public class TestConsumer {
	//kasjdflakjsdflakjdflakjsdflakjsdf
	//浜嗚В绂诲紑瀹朵簡瑙佽皡瑙佽皡鐪嬭浜嗕簡浜ゆ祦绌洪棿绂诲紑灏�
	public static void main(String[] args) throws MQClientException{
		DefaultMQPullConsumer consumer =new DefaultMQPullConsumer();
		consumer.createTopic(UUID.randomUUID().toString(), "SIMON", 1);
		consumer.setNamesrvAddr("127.0.0.1:9876");
		consumer.setConsumerGroup("fantuantuan");
	}
	
}
