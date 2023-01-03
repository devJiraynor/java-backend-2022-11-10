package example;

import java.util.Scanner;

// Example01.java 를 개선한 코드
public class Example02 {

	// 로그인 프로세스
	public static void main(String[] args) {
		
		// 1. 사용자로부터 이메일 주소와 비밀번호를 입력 받음
		Scanner scanner = new Scanner(System.in);
		System.out.println("email : ");
		String email = scanner.nextLine();
		System.out.println("password : ");
		String password = scanner.nextLine();
		
		System.out.println("email - " + email + " / password : " + password);
		// 2. 이메일과 비밀번호가 모두 존재하는지 확인
		// 2-1. 둘중 하나라도 존재하지 않는다면 '모두 입력하세요.' 출력
		
		// 문자열.isEmpty() method : 
		// 문자열의 길이가 0이면 true, 0이 아니면 false return (문자열이 비었는지 확인)
		if (email.isEmpty() || password.isEmpty()) {
			System.out.println("모두 입력하세요.");
			return;
		} 
		// 3. 입력한 이메일과 비밀번호가 존재하는 인스턴스와 일치하는지 확인
		// 3-1. 일치하지 않는다면 '로그인 정보가 일치하지 않습니다.' 출력
		if (!email.equals(User.EMAIL) || !password.equals(User.PASSWORD)) {
			System.out.println("로그인 정보가 일치하지 않습니다.");
			return;
		} 
		
		// 4. '로그인에 성공했습니다.' 출력
		System.out.println("로그인에 성공했습니다.");
	}
}
