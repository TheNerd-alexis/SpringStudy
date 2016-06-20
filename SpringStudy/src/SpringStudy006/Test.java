package SpringStudy006;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("SpringStudy006/applicationContext.xml");

		PlayGame game = context.getBean("playGame", PlayGame.class);
		try {
			game.playing(Math.abs(new Random().nextInt())%10);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
