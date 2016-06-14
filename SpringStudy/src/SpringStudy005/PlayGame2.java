/* PlayGame2.java: Spring AOP with spring configuration file and arguments */
package SpringStudy005;

public class PlayGame2 {
	private String userId;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String playing(String stage, int count) throws Exception {
		for (int i = 0; i < 10; i++) {
			if (count == i)
				throw new Exception("서버 터짐");
			System.out.println("게임 중");
			Thread.sleep(1000);
		}
		return stage + " 보스 물리침";
	}
}