package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		//AppContext를 파라미터로 전달, AppContext에서 정의한 @Bean 설정 정보를 읽어와 Greeter 객체를 생성하고 초기화
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		//첫 번째 파라미터 : @Bean의 메서드 이름(빈 객체의 이름) , 두 번째 파라미터 : 검색할 빈 객체의 타입
		//AppContext에서 @Bean 메서드의 이름이 'greeter'이고 생성한 타입이 Greeter
		Greeter g = ctx.getBean("greeter", Greeter.class);
		String msg = g.greet("스프링");
		System.out.println(msg);
		ctx.close();
	}

	//AnnotationConfigApplicationContext : 자바 애노테이션을 이용한 클래스로부터 객체 설정 정보를 가져옴
	//GenericXmlApplicationContext : XML로부터 객체 설정 정보를 가져옴
	//GenericGroovyApplicationContext : 그루비 코드를 이용해 설정 정보를 가져옴
	
}
