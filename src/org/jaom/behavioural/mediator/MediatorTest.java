package org.jaom.behavioural.mediator;

public class MediatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Jose");
		User user2 = new UserImpl(mediator, "Claudia");
		User user3 = new UserImpl(mediator, "Carlos");
		User user4 = new UserImpl(mediator, "Andres");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
	}

}
