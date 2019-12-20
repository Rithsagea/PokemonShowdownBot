package rithsagea.showdown.websocket;

import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

@ClientEndpoint
public class ShowdownSocket {
	@OnOpen
	public void onOpen(Session session) {
		
	}
	
	@OnClose
	public void onClose(Session session, CloseReason reason) {
		
	}
	
	@OnMessage
	public void receiveMessage(String message) {
		
	}
	
	@OnError
	public void receiveError(Throwable t) {
		t.printStackTrace();
	}
}
