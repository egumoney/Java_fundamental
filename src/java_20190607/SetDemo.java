package java_20190607;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

public class SetDemo {
	public static void main(String[] args) {
		// HashSet set1 = new HashSet();
		// 제너릭 무조건 문자열만 집어넣어라

		// 해쉬데이터의 중복을 허용하지 않고, 순서 없음
		// HashSet<String> set1 = new HashSet<String>(); 해쉬셋

		// TreeSet은 데이터의 중복을 허용하지 않고, Natrual ordering(오름차순 정렬)
		// 윈도우 1번 파일 11번 파일 같이 있다.
		// TreeSet<String> set1= new TreeSet<String>();

		// LinkedHashSet은 데이터의 중복을 허용하지 않고, 입력한 순서대로 출력
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();

		for (int i = 0; i < 20; i++) { // valueOf(int i ) 메소드는 int i를 문자열로 변환
			set1.add(String.valueOf(i));
		}
		// HashSet크기
		System.out.println(set1.size());

		// 데이터 출력 이터레이터 반복자. 이걸통해 출력한다.
		Iterator<String> iterator = set1.iterator();// 셋은 이터레이터가 있어야 출력가능

		while (iterator.hasNext()) {// String temp= (String)iterator.next();
			String temp = iterator.next();// 캐스팅안해도 된다 . //해당 객체 출력. .hasNext 는
											// 다음이 있나 확인
			System.out.println("Iterator:" + temp);
		}

		// 커스터머 객체는 해쉬 코드랑 이퀄즈가 오버라이딩 되어있어야 동일객체로 인식 ( 객체 사이즈1로 나옴) - 같은 객체 중복
		// 허용안할때
		// 만약 이퀄즈랑 해쉬코드 오버라이딩 안하면 객체 사이즈 4개로 나온다.

		Custmer c1 = new Custmer("홍길동", 10);
		Custmer c2 = new Custmer("홍길동", 10);
		Custmer c3 = new Custmer("홍길동", 10);
		Custmer c4 = new Custmer("홍길동", 10);
		// 모두 지우기
		set1.clear();

		HashSet<Custmer> set2 = new HashSet<Custmer>();
		set2.add(c1);
		set2.add(c2);
		set2.add(c3);
		set2.add(c4);
		System.out.println(set2.size() + " =set2.size");

		HashSet<Integer>set3=new HashSet<Integer>();
		while (true) {
			int random = (int) (Math.random() * 45 )+ 1;
			//int random = (int) Math.random() * 45 + 1;// 이 코드의 경우 Math.random을 0으로 만들어버린다. 
			set3.add(random);
			if (set3.size() == 6)	break;
		}
		
		System.out.println(set3.size());
		
		Iterator<Integer> i = set3.iterator();
		while(i.hasNext()){
			Integer temp = i.next();
			System.out.print(temp+"\t");
		}
		
		

	}
}

class Custmer {
	/*
	 * String name; int age;
	 */

	private String name;
	private int age;

	public Custmer() {
		super();// TODO Auto-generated constructor stub
	}

	public Custmer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Custmer other = (Custmer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/*
	 * public Custmer (String name , int age){ this.name=name; this.age=age; }
	 */
}