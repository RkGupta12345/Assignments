package com.kafka.day2;

public class Client {

	public static void main(String[] args) {
		Boolean isAsync = true;

		Producer producer = new Producer(KafkaProperties.TOPIC2, isAsync, "First Test H E E L L O");
		producer.start();

		System.out.println("Started Producer");

		try {
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		producer.setInterrupt(true);

	}

}
