package ch02ch03;

//증감연산자(p112)
//증가연산자(++): 피연산자의 값을 1 증가시킨다.
//간소연산자(--): 피연산자의 값을 1 감소시킨다.
//전위형: 예) ++i  --j
//후위형: 예) i++ j--

public class IncDecOperator_p112 {

	public static void main(String[] args) {

		int x =10;
		int y =10;
		int z =0;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z="+z);
		
		x++;      //println으로 가서 11이 된다.
 		++x;         //해당 위치에서 이미 11
		System.out.println("x="+x);
		System.out.println("x="+x); 
		
		System.out.println("____________________");
		
		y--; //10
		System.out.println("y="+y); //9
		--y; //8
		System.out.println("y="+y);//8
		
		System.out.println("____________________");
		
		z=x++; //x =12 => z=12
		System.out.println("z="+z);//12
		System.out.println("x="+x);//13 dlrhtdptj ++가 더해진다
		z=++x; //x = 13 => x = 14
		System.out.println("z="+z);//z =14
		System.out.println("x="+x);//x = 14 이미 더해져 있기 때문에 그대로이다.
		
		// 위의 후위는 1이 증가하였지만 아래 전위는 그대로이다
		//이는 전후 위치에 따라 계산 위치가 달라디기 때문이다
		//또한 연산자 간의 우선순위 또한 중요하다.
		
		System.out.println("____________________");
		
		z= ++x + y++;
		//x = 15 + y= 8
		System.out.println("z="+z);//23
		//x=15
		System.out.println("x="+x);//15
		//y=8
		System.out.println("y="+y);//8+1 =9
	
		
	}

}
