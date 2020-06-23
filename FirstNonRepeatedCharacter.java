import java.io.*;
class FirstNonRepeatedCharacter {
    public static int firstUniqChar(String s) {
    int[] dp =new int[256];
        char[] arr =s.toCharArray();
    
    for(char c : arr ){
        dp[c-'a']++;
    }
    
    for(int i=0;i<arr.length;i++){
        if (dp[arr[i]-'a']==1) return i;
    }
    return -1;
    }
	public static void main(String[] args) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	String s=br.readLine();
	System.out.println(firstUniqChar(s));
	}
}