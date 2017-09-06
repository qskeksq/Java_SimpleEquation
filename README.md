# SimpleEquation

- 중첩 제어문을 활용한 1차 방정식 해 구하기

```java
public void equation(){
	for(int x=1; x<=10; x++){  //먼저 x값을 하나 지정
		for(int y=1; y<=10; y++){  //그 후 y값을 1부터 10까지 대입하여 계산값이 60이 되는 수를 리턴
			if(4*x+5*y==60){
				System.out.println("("+x+", "+y+")");
			}
		}
	}
}
```
