package SpringStudy005;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("SpringStudy005/applicationContext.xml");
		PlayGame game = context.getBean("playGame", PlayGame.class);
		game.playing();
				
		PlayGame1 game1 = context.getBean("playGame1", PlayGame1.class);
		try {
			game1.playing();
		} catch (Exception e) {
			e.getStackTrace();
		}

		PlayGame2 game2 = context.getBean("playGame2", PlayGame2.class);
		try {
			game2.playing("이상한", Math.abs(new Random().nextInt())%10);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
