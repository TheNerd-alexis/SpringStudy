/* GameLog2.java : Spring AOP with spring configuration file and arguments */
package SpringStudy005;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class GameLog2 {
	public void startGame(JoinPoint jp) {
		System.err.println(((PlayGame2) jp.getThis()).getUserId() + "이 게임에 접속했습니다.");
		StringBuilder gameInfo = new StringBuilder();
		gameInfo.append("arg\t\t: ");
		for(Object obj : jp.getArgs())
				gameInfo.append(obj + "\t");
		gameInfo.append("\nclass\t\t: " + jp.getClass())
				.append("\nkind\t\t: " + jp.getKind())
				.append("\nstatic part\t: " + jp.getStaticPart())
				.append("\nsignature\t: " + jp.getSignature())
				.append("\nsource location\t: " + jp.getSourceLocation())
				.append("\ntarget\t\t: " + jp.getTarget())
				.append("\nthis\t\t: " + jp.getThis());
		System.err.println(gameInfo.toString());
	}
	public void clearGame(JoinPoint jp, String msg) {
		System.err.println(msg + ((PlayGame2) jp.getThis()).getUserId() +"이 게임을 클리어했습니다.");
	}
	public void serverCrash(Throwable th) {
		System.err.println(th.getMessage() + "\n서버가 원활하지 않습니다.");
	}
	public void finishGame() {
		System.err.println("게임을 종료했습니다.");
	}

	public void enjoyGame(ProceedingJoinPoint jp) {
		startGame(jp);
		try {
			String msg = (String)jp.proceed();
			clearGame(jp, msg);
		} catch (Throwable th) {
			serverCrash(th);
		} finally {
			finishGame();
		}
	}
}