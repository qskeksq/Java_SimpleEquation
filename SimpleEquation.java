package com.nadan.java.equation;

//방정식은 중첩 제어문을 공부하기 아주 좋다.
public class SimpleEquation {
	
	int a = 0;
	
	public void equation(){
		
		for(int x=1; x<=10; x++){  //먼저 x값을 하나 지정해 준다.
			for(int y=1; y<=10; y++){  //그 후 y값을 1부터 10까지 대입하여 계산값이 60이 되는 수를 리턴한다.
				if(4*x+5*y==60){
					System.out.println("("+x+", "+y+")");
				}
			}
		}
		
	}

}
