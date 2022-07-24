package com.core.annotation.atINJECT;

import javax.inject.Inject;

public class ChatBoxService {
	@Inject
	private MessagingService messagingService;

	public void sendMessage(String message) {
		messagingService.sendMessage(message);
	}

}
