public static void printfreq9char[] str) { 
	int[] freq = new int[256]; 
	for (int i=0; i< str.length; i++) { 
        freq[str[i]++; 
	}
    for (int i =0; i<256; i++) { 
        if(freq[i] > 0) { 
             System.out.println("!" + (char)(i) + "]=" + freq[i]); 

        }
    }
}

public static void main(String args[]) { 
	char[] str = "Hello World".toCharArray(); 
	printFreq(str); 
}