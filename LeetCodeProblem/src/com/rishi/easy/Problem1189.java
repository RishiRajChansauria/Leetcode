package com.rishi.easy;

public class Problem1189 {

	public int maxNumberOfBalloons(String text) {
		
		int [] lib = new int[26];
		int min =0;
		for(int i=0;i<text.length();i++) {
			lib[text.charAt(i) - 'a']++;
		}
		
		min = lib[1];
		min = Math.min(min, lib[0]);
		min = Math.min(min, lib[11]/2);
		min = Math.min(min, lib[14]/2);
		min = Math.min(min, lib[13]);
		
		return min;
	}

	public static void main(String[] args) {
		Problem1189 p = new Problem1189();
		System.out.println(p.maxNumberOfBalloons("krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw"));
	}

}
