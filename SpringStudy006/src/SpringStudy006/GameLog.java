/* GameLog.java : Annotation을 이용한 AOP 설정 */
package SpringStudy006;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GameLog {
	@Pointcut("execution(public * playing(..))")
	public void targetMethod() {
		// pointcut annotation 값을 참조하기 위한 dummy method
	}
	@Before("targetMethod()")
	public void startGame(JoinPoint jp) {
		System.err.println(jp.getTarget() + "\n게임에 접속했습니다.");
	}
	@AfterReturning(pointcut="targetMethod()", returning="msg")
	public void clearGame(String msg) {
		System.err.println(msg + "\n게임을 클리어했습니다.");
	}
	@AfterThrowing(pointcut="targetMethod()", throwing="th")
	public void serverCrash(Throwable th) {
		System.err.println(th.getMessage() + "\n서버가 원활하지 않습니다.");
	}
	@After("targetMethod()")
	public void finishGame() {
		System.err.println("게임을 종료했습니다.");
	}

//	@Around("targetMethod()")
	public void enjoyGame(ProceedingJoinPoint jp) {
		startGame(jp);
		try {
			String msg = (String) jp.proceed();
			clearGame(msg);
		} catch (Throwable th) {
			serverCrash(th);
		} finally {
			finishGame();
		}
	}
}