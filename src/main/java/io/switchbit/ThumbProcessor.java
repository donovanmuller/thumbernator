package io.switchbit;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.ServiceActivator;

@EnableBinding(Processor.class)
public class ThumbProcessor {

	private static final String THUMBS_UP = "\n\n" +
		"░░░░░░░░░░░░▄▄░░░░░░░░░ \n" +
		"░░░░░░░░░░░█░░█░░░░░░░░ \n" +
		"░░░░░░░░░░░█░░█░░░░░░░░ \n" +
		"░░░░░░░░░░█░░░█░░░░░░░░ \n" +
		"░░░░░░░░░█░░░░█░░░░░░░░ \n" +
		"███████▄▄█░░░░░██████▄░░ \n" +
		"▓▓▓▓▓▓█░░░░░░░░░░░░░░█░ \n" +
		"▓▓▓▓▓▓█░░░░░░░░░░░░░░█░ \n" +
		"▓▓▓▓▓▓█░░░░░░░░░░░░░░█░ \n" +
		"▓▓▓▓▓▓█░░░░░░░░░░░░░░█░ \n" +
		"▓▓▓▓▓▓█░░░░░░░░░░░░░░█░ \n" +
		"▓▓▓▓▓▓█████░░░░░░░░░█░░ \n" +
		"██████▀░░░░▀▀██████▀░░░░";

	@ServiceActivator(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
	public String thumbenate(String message) {
		return THUMBS_UP.concat("\n\n -> ").concat(message);
	}
}
