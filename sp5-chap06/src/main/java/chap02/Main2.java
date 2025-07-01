package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		Greeter g3 = ctx.getBean("greeter1", Greeter.class);
		
		System.out.println("(g1 == g2) = "+ (g1 == g2));
		System.out.println("(g1 == g3) = "+ (g1 == g3));
		System.out.println("(g2 == g3) = "+ (g2 == g3));
		
		System.out.println(g1.greet("테스트"));
		System.out.println(g3.greet("테스트"));
		
		//스프링 컨데티어는 내부적으로 빈 객체와 빈 이름을 연결하는 정보를 갖는다
		//싱글톤 : 단일객체
		//스프링은 기본적으로 한 개의 @Bean 애노테이션에 대해 한 개의 빈 객체를 생성
		
//      콘솔 출력 결과
//		(g1 == g2) = true
//		(g1 == g3) = false
//		(g2 == g3) = false
//		테스트, 안녕하세요
//		안녕하세요, 테스트님!
		
		ctx.close();
	}
}
