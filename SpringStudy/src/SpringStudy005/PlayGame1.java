/* PlayGame1.java: Spring AOP with spring configuration file */
package SpringStudy005;

import java.util.Random;

public class PlayGame1 {
	public void playing() throws Exception {
		for (int i = 0; i < 10; i++) {
			if (new Random().nextInt() % 10 == 0)
				throw new Exception();
			System.out.println("게임 중");
			Thread.sleep(1000);
		}
	}
}