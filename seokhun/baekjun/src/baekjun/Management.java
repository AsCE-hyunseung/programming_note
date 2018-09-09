package baekjun;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Management {
	
	Scanner sc = new Scanner(System.in);
	Set<String> hs = new HashSet<String>();
	
	public void Run() {
		int key = 0;
		while((key = selectMenu())!=0) {
			switch(key) {
			case 1 : addMember(); break;
			case 2 : removeMember(); break;
			case 3 : searchMember(); break;
			case 4 : listMember(); break;
			default : System.out.println("�߸� �����");
			}
		}
		System.out.println("����");
	}
	int selectMenu() {
		System.out.println("1:�߰� 2:���� 3:�˻� 4:�� 0:����");
		int key = sc.nextInt();
		sc.nextLine();
		return key;
	}
	void addMember() {
		String name ="";
		System.out.println("�߰��� ȸ�� �̸� : ");
		name = sc.nextLine();
		
		if(hs.add(name)) {
			System.out.println("�߰��Ǿ����ϴ�");
		}else {
			System.out.println("�̹� �����մϴ�");
		}
	}
	void removeMember() {
		String name="";
		System.out.println("������ ȸ�� �̸� : ");
		name = sc.nextLine();
		
		if(hs.remove(name)) {
			System.out.println("�����Ǿ����ϴ�");
		}else {
			System.out.println("�������� �ʴ� ȸ���Դϴ�");
		}
	}
	void searchMember() {
		String name="";
		System.out.println("�˻��� ȸ�� �̸� : ");
		name = sc.nextLine();
		
		if(hs.contains(name)) {
			System.out.println("�˻��Ǿ����ϴ�" + name);
		}else {
			System.out.println("�˻����� �ʽ��ϴ�.");
		}
	}
	void listMember() {
		System.out.println("��ü ���");
		int cnt = hs.size();
		System.out.println("ȸ�� �� : " + cnt);
		for(String name : hs) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
