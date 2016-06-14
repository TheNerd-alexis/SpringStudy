/* PlageGame.java */
package SpringStudy005;

import java.util.Random;

public class PlayGame {
	public void playing() {
		System.err.println("게임에 접속했습니다.");
		try {
			for (int i = 0; i < 10; i++) {
				if (new Random().nextInt() % 10 == 0)
					throw new Exception();
				System.out.println("게임 중");
				Thread.sleep(1000);
			}
			System.err.println("플레이어가 게임을 클리어했습니다.");
		} catch (Exception e) {
			System.err.println("서버가 원활하지 않습니다.");
		} finally {
			System.err.println("게임을 종료했습니다.");
		}
	}
}