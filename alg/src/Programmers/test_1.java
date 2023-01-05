package Programmers;

public class test_1 {

	public static void main(String[] args) {
		System.out.println(solution("500220839878","712"));
	}
	
	public static int solution(String t, String p) {
		int ans = 0;
		int len = p.length();
		long p_val = Long.parseLong(p);
		
		for(int i =0; i<= t.length()- len ;i++) {
			long diff = Long.parseLong(t.substring(i, i+len));
			System.out.println(diff);
			if(diff <= p_val) ans++;
		}
		
		return ans;
	}
}
