package test.main;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		//카객체를 담을 수 있는 방 3개짜리 배열 객체 생성
		Car[] cars=new Car[3];
		//각각 방에 카객체 생성해서 참조값 저장
		cars[0]=new Car("소나타");
		cars[1]=new Car("프라이드");
		cars[2]=new Car("그랜져");
		
		for(int i=0;i<cars.length;i++) {
			//i번째 카 객체의 참조값 얻어와서
			Car tmp=cars[i];
			//메소드 호출
			tmp.drive();
					
		}
		System.out.println("확장for문");
		for(Car tmp:cars) {
			tmp.drive();
		}
	}
}
