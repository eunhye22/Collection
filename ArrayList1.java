package collection;

import java.util.ArrayList;

// [!]: ArrayList
// 먼저, 자바의 배열은 크기를 미리 지정하고 사용 --> 넉넉하게 크기를 지정해놓고 사용하곤 함
// 반면, ArrayList는 필요시 언제든지 추가,삭제 가능
// List인터페이스를 상속하므로 인덱스가 있고, 저장 순서가 유지되고, 데이터 중복이 가능하다.
// 또한, 제네릭 문법을 사용 가능 
// --> 만약 제네릭을 사용하지 않는다면 내부적으로 Object타입으로 처리됨 
// 모든 타입을 다 받아줌 --> 추가할 때는 ㄱㅊ / 근데 사용할 때 형변환 필요!!!
// 사용을 위해서는 상단에 임포트 필요 --> import java.util.ArrayList; 또는 import java.util.*; 

class Person {}		// 모든 타입을 add 가능하다는거 확인하기 위해 생성

public class ArrayList1 {
	public static void main(String[] args) {
		
		//[1]:ArrayList를 제네릭이 아닌 Object 타입으로 사용하는 경우
		ArrayList list1 = new ArrayList();
		
		//[2]: 데이터 추가하기 --> add()
		list1.add("임자바");	// 문자열 자료형 저장
		list1.add(20);			// 정수 자료형 저장
		list1.add("임파이");
		list1.add(20);			// 데이터 중복이 가능
		list1.add(new Person());
		
		//[3]: 데이터 가져오기 --> get() --> 이때, 해당 데이터 자료형으로 형변환하여 사용한다.
//		System.out.println(list1.get(0));	// 임자바 
//		String str = list1.get(0);  --> 에러! 왜? Object 타입이니깐.
		String str = (String)list1.get(0);	// 형변환
		System.out.println(str.length());	// 3
		
		int num = (int)list1.get(1);	// 형변환
		System.out.println(num + 100);  // 120 --> 연산 가능!
		
		//[결론]: 제네릭 문법을 사용하지 않으면 ArrayList는 내부적으로 Object타입으로 처리됨을 알 수 있다.
		// 이렇게 get() 메서드를 사용할 때는 형변환을 주의해야 함!!!!
		// 제네릭을 사용하면 된다 ^^
		
		//[4]: 출력 --> 반복문 --> 배열의 크기(size) --> 객체명.size()
		System.out.println(list1.size());	// 5
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i) + "");
		}
		
	} //main

} //end class
