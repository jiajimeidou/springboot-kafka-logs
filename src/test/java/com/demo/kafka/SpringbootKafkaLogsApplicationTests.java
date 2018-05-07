package com.demo.kafka;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.AllArgsConstructor;
import lombok.Data;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootKafkaLogsApplicationTests {

	private static final Logger log = LoggerFactory.getLogger("kafka-event");

	@Data
	@AllArgsConstructor
	static class TempEvent {
		private String name, evenId;
	}

	@Test
	public void testSendMessage() throws InterruptedException {

		log.info("user-dowork:{}",
				Arrays.asList(new TempEvent("xiaolang3", "30005L"), new TempEvent("xiaolang4", "30006L")));

		Thread.sleep(2000);
	}

}
