/* PlayGame.java : Annotation을 이용한 AOP 설정 */
package SpringStudy006;

import org.springframework.stereotype.Component;

@Component
public class PlayGame {
	public String playing(int count) throws Exception {
		for (int i = 0; i < 10; i++) {
			if (count == i)
				throw new Exception("서버 터짐");
			System.out.println("게임 중");
			Thread.sleep(1000);
		}
		return "보스 물리침";
	}
}