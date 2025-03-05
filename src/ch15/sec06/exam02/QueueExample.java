package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaoTalk", "감자바"));
		
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
				
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
				
			case "sendKakaoTalk":
				System.out.println(message.to + "님에게 카카오톡를 보냅니다.");
				break;
			}
		}
	}

}
