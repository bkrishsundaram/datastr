package com.bk.gg.process;

public class LicenceKey {

	
	public String licenceyKey(String s, int k) {
		if(s==null || s.length() ==0 ) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		int count = k;
		int i = s.length()-1;
		while(i >= 0) {
			char ch = s.charAt(i);
			if(ch != '-') {
				ch = Character.toUpperCase(ch);
				if(count==0) {
					count=k;
					sb.append('-');
				}
				sb.append(ch);
				count--;
			}
			i--;
		}
		
		return sb.reverse().toString();
	}
	
	
	public static void main(String[] args) {
		
		LicenceKey l = new LicenceKey();
		System.out.println(l.licenceyKey("sdf-34-dff-344", 4));
		
	}

}
