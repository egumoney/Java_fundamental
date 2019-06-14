package java_20190607;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConsoleApplication {
	private ArrayList<Member> list;
	
	
	
	public ConsoleApplication() {
		list = new ArrayList<Member>();
	}

	public void print() {
		System.out.println("*******************************************");
		System.out.println("1.Insert 2.Update 3.Delete 4.Search 5.Exit");
		System.out.println("*******************************************");
	}

	public void execute(String message) throws IOException {
		/*
		 * if(message.equals("1")){ insert(); }else if(message.equals("2")){
		 * update(); }else if(message.equals("3")){ delete(); }else
		 * if(message.equals("4")){ search(); }else if(message.equals("5")){
		 * Exit(); }else{ System.out.println("�߸��� �Է��Դϴ�. ���α׷� �����մϴ�.");
		 * 
		 * }
		 */

		switch (message) {
		case "1":
			inse();
			break;
		case "2":
			update();
			break;
		case "3":
			delete();
			break;
		case "4":
			search();
			break;
		case "5":
			Exit();
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
	}

	public void inse() throws IOException {
		// 1.���̵� �Է¹޴´�.
		// 2.�̸��� �Է� �޴´�.
		// 3.ArrayList�� �߰��Ѵ�.
		// 4.ArrayList�� �ִ� ��� ���� ����Ѵ�.
		// 5.print() �׼�ȣ��
		// 6.�����ϼ���: �޼��� ����� Ű���带 �Է¹��� �غ�
		String id = console("���̵�: ");
		String name = console("�̸�: ");
		Member mb = new Member(name, id);
		list.add(mb);
		common();
	}

	// 1.������ ���̵� �Է¹޴´�.
	// 2.ArrayList���� ������ ���̵� ã�Ƽ� ������ ������ �̸��� �Է¹ް�, ������ .
	// ������ ������ ���̵� �����ϴ�. �޼��� ����Ѵ�.
	// 3.ArrayList�� �ִ� ��� ���� �߰��Ѵ�.
	// 4.print()�Լ� ȣ��
	// 5.�����ϼ���: �޼����� ����� Ű���� �Է¹��� ����
	public void update() throws IOException {
		String updateId = console("������ ���̵�: ");
		boolean isExisTed = false;
		for (Member m : list) {
			if (updateId.equals(m.getId())) {
				isExisTed = true;
				break;
			}
		}
		if (isExisTed) {
			String updateName = console("������ �̸� :");
			for (int i = 0; i < list.size(); i++) {
				Member m1 = list.get(i);
				if (updateId.equals(m1.getId())) {
					// list.remove(i);
					// list.add(new Member(updateName,updateId));
					m1.setName(updateName);// �ݹ��� ���۷��� �̱� ������ �����̵ȴ�.
					break;
				}
			}
		} else {
			System.out.println("������ ���̵� �����ϴ�.");
		}

		common();
	}

	private void common() throws IOException {
		for (Member mb1 : list) {
			// System.out.println("���̵�: " + mb1.getId() + ", �̸�:" +
			// mb1.getName());
			System.out.println(mb1);
			// System.out.printf("���̵�: %s, �̸�:%s%n",mb1.getId(),mb1.getName());

		}
		print();
		String message = console("�����ϼ���: ");
		execute(message);
	}

	// 1.������ ���̵� �Է¹޴´�.
	// 2.ArrayList ���� ������ ���̵� ã�Ƽ� ������ ArrayList���� �����ϰ�
	// ������ ������ ���̵� �����ϴ�. �޼��� ����Ѵ�.
	// 3. ArrayList�� �ִ� ��� ���� ����Ѵ�.
	// 4. Print() �Լ�ȣ��
	// 5. �����ϼ���: �޽��� ����� Ű���� �Է� ���� �غ�

	public void delete() throws IOException {
		String deleteId = console("������ ���̵�: ");
		boolean isExisTed = false;

		if (!isExisTed) {System.out.println("������ ���̵� �����ϴ�.");}
		for (int i = 0; i < list.size(); i++) {
			Member m1 = list.get(i);
			if (deleteId.equals(m1.getId())) {
				isExisTed = true;
				list.remove(i);//
				break;
			}
		}

		common();
	}
	
	//1.�˻��� ���̵� �Է¹޴´�.
	//2.ArrayList ���� �˻��� ���̵� ã�Ƽ� ������ ArrayList���� ����ϰ� 
	//������ �˻��� ���̵� �����ϴ�. �޽��� ����Ѵ�.
	//3.ArrayList�� �ִ� ��� ���� ����Ѵ�.
	//4.print()�Լ�ȣ��
	//5.�����ϼ���:�޽��� ����� Ű���� �Է¹��� �غ�
	
	public void search() throws IOException {
		String searchId=console("�˻��� ���̵�: ");
		System.out.println("********************�˻����********************");
		boolean isExisted=false;
		for(int i=0;i<list.size();i++){
			Member m = list.get(i);
			if (searchId.equals(m.getId())) {
				isExisted=true;
				System.out.println(m);
				break;				
			}
		}
		if(!isExisted){
			System.out.println("�˻��� ����� �����ϴ�.");
		}
		System.out.println("*********************************************");
	}

	public void Exit() throws IOException {
		System.out.println("����Ǿ����ϴ�.");
	}

	public static String console(String message) throws IOException {
		System.out.println(message);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	public static void main(String[] args) throws IOException {
		ConsoleApplication c = new ConsoleApplication();
		c.print();
		String message = c.console("�����ϼ���: ");
		c.execute(message);
	}

}
