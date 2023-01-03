package example;

import java.util.Scanner;

class User {
	final static String EMAIL = "qwer@qwer";
	final static String PASSWORD = "qwer";
}

public class Example01 {

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
		if (email.length() > 0 && password.length() > 0) {
			// 3. 입력한 이메일과 비밀번호가 존재하는 인스턴스와 일치하는지 확인
			if (email.equals(User.EMAIL) && password.equals(User.PASSWORD)) {
				// 4. '로그인에 성공했습니다.' 출력
				System.out.println("로그인에 성공했습니다.");
			} 
			// 3-1. 일치하지 않는다면 '로그인 정보가 일치하지 않습니다.' 출력
			else {
				System.out.println("로그인 정보가 일치하지 않습니다.");
			}
		} 
		// 2-1. 둘중 하나라도 존재하지 않는다면 '모두 입력하세요.' 출력
		else {
			System.out.println("모두 입력하세요.");
		}
		
		// 위 코드의 문제점 !
		// 코드의 흐름과 주 프로세스의 위치가 일치하지 않음
		// - 그로인해 주 프로세스를 따로 찾아야하는 번거러움이 있음
		// - 개발 흐름은 입력 -> 입력값 검증 -> 주 프로세스 검증 -> 프로세스 -> 출력
		// - 으로 진행되어야 하는데 그렇지 못함
	}

}
