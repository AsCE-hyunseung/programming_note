package baekjun;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		String arr[] = {"a","a","b","c","d","e"};
		Set<String> set = new HashSet<String>();
		
		//��ü�� �߰��ϴ� �ΰ��� ���
		for(int i=0; i<arr.length; i++) { //�迭�� ���̸�ŭ �ݺ���
			set.add(arr[i]);
		}
		for(String str:arr) { //��Ҹ� �ϳ��� ����
			set.add(str);
		}
		
		System.out.println(set);
		
		set.remove("b");
		
		System.out.println(set);
		
		set.clear();
		
		System.out.println(set);
	}

}
