package chap02;

//콘솔에 간단한 메시지를 출력하는 클래스
public class Greeter {

	private String format;
	
	public String greet(String guest)
	{
		return String.format(format, guest);
	}
	
	public void setFormat(String format)
	{
		this.format = format;
	}
	
}
