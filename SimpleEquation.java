package com.nadan.java.equation;

//�������� ��ø ����� �����ϱ� ���� ����.
public class SimpleEquation {
	
	int a = 0;
	
	public void equation(){
		
		for(int x=1; x<=10; x++){  //���� x���� �ϳ� ������ �ش�.
			for(int y=1; y<=10; y++){  //�� �� y���� 1���� 10���� �����Ͽ� ��갪�� 60�� �Ǵ� ���� �����Ѵ�.
				if(4*x+5*y==60){
					System.out.println("("+x+", "+y+")");
				}
			}
		}
		
	}

}
