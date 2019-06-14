package java_20190607;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

public class SetDemo {
	public static void main(String[] args) {
		// HashSet set1 = new HashSet();
		// ���ʸ� ������ ���ڿ��� ����־��

		// �ؽ��������� �ߺ��� ������� �ʰ�, ���� ����
		// HashSet<String> set1 = new HashSet<String>(); �ؽ���

		// TreeSet�� �������� �ߺ��� ������� �ʰ�, Natrual ordering(�������� ����)
		// ������ 1�� ���� 11�� ���� ���� �ִ�.
		// TreeSet<String> set1= new TreeSet<String>();

		// LinkedHashSet�� �������� �ߺ��� ������� �ʰ�, �Է��� ������� ���
		LinkedHashSet<String> set1 = new LinkedHashSet<String>();

		for (int i = 0; i < 20; i++) { // valueOf(int i ) �޼ҵ�� int i�� ���ڿ��� ��ȯ
			set1.add(String.valueOf(i));
		}
		// HashSetũ��
		System.out.println(set1.size());

		// ������ ��� ���ͷ����� �ݺ���. �̰����� ����Ѵ�.
		Iterator<String> iterator = set1.iterator();// ���� ���ͷ����Ͱ� �־�� ��°���

		while (iterator.hasNext()) {// String temp= (String)iterator.next();
			String temp = iterator.next();// ĳ���þ��ص� �ȴ� . //�ش� ��ü ���. .hasNext ��
											// ������ �ֳ� Ȯ��
			System.out.println("Iterator:" + temp);
		}

		// Ŀ���͸� ��ü�� �ؽ� �ڵ�� ����� �������̵� �Ǿ��־�� ���ϰ�ü�� �ν� ( ��ü ������1�� ����) - ���� ��ü �ߺ�
		// �����Ҷ�
		// ���� ������� �ؽ��ڵ� �������̵� ���ϸ� ��ü ������ 4���� ���´�.

		Custmer c1 = new Custmer("ȫ�浿", 10);
		Custmer c2 = new Custmer("ȫ�浿", 10);
		Custmer c3 = new Custmer("ȫ�浿", 10);
		Custmer c4 = new Custmer("ȫ�浿", 10);
		// ��� �����
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
			//int random = (int) Math.random() * 45 + 1;// �� �ڵ��� ��� Math.random�� 0���� ����������. 
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