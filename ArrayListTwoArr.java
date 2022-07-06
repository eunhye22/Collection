package collection;

import java.util.ArrayList;
import java.util.Arrays;

// ArrayList 기반으로 2차원 배열을 만들어 요소를 추가하고 출력해보자
public class ArrayListTwoArr {
	public static void main(String args[]) {
		// 정수를 요소로 갖는 배열 타입 
		ArrayList<Integer[]> list = new ArrayList<>();
		
		list.add(new Integer[] {11, 12, 13, 14});
		list.add(new Integer[] {21, 22, 23, 24});
		list.add(new Integer[] {31, 32, 33, 34});
		
		System.out.println(list.size());	// 3
		
		// 요소 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)[0]); // 11, 21, 31
		}
		
		// 전체 요소 출력 --> 이중 반복문 --> 안쪽 배열의 사이즈 미리 체크!!!
		// size() -> 컬렉션 프레임워크 타입의 길이를 알고 싶을 때 사용
		// length() -> 문자열의 길이를 알고 싶을 때 사용
		// 배열의 길이는 length 사용쓰~!
		System.out.println(list.get(0).length);
		
		for(int i=0; i<list.size(); i++) {	
			for(int j=0; j<list.get(i).length; j++) {
				System.out.print("["+ i +"]" + "[" +j + "]" +":"  +list.get(i)[j] + " ");
			}// inner for
			System.out.println();
		}// outer for
		
		// Arrays.toString 이용해서 찍어보기!!
		for(int i=0; i<list.size(); i++) {
			System.out.println(Arrays.toString(list.get(i)));
		}
		
	}//main

}//end class
