package config;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/*
 * On the Server end, we recieve the data and reply back to the client. 
 * In Spring we can create a customized handler by using TextWebSocketHandler.
 */

@Component
public class SocketTextHandler extends TextWebSocketHandler {

	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message)
			throws InterruptedException, IOException {

		String payload = message.getPayload();
		JSONObject jsonObject = new JSONObject(payload);
		session.sendMessage(new TextMessage("Hi " + jsonObject.get("user") + " how may we help you?"));
	}

}