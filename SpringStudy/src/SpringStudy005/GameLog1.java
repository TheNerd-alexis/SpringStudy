/* GameLog1.java: Spring AOP with spring configuration file */
package SpringStudy005;

public class GameLog1 {
	public void startGame(){
		System.err.println("게임에 접속했습니다.");
	}
	public void clearGame(){
		System.err.println("플레이어가 게임을 클리어했습니다.");
	}
	public void serverCrash(){
		System.err.println("서버가 원활하지 않습니다.");
	}
	public void finishGame(){
		System.err.println("게임을 종료했습니다.");
	}
}