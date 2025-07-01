package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//스프링 설정 파일
//Configuration -> 스프링의 설정파일로 지정
@Configuration
public class AppContext {

	//Bean -> 스프링이 관리하는 빈 객체로 등록
	@Bean
	public Greeter greeter()
	{
		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요");
		return g;
	}
	
	@Bean
	public Greeter greeter1()
	{
		Greeter g = new Greeter();
		g.setFormat("안녕하세요, %s님!");
		return g;
	}
}
