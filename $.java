import java.util.*;
public class $ {
	
	static Scanner br = new Scanner(System.in);
	public static String input(String s ) {
		System.out.println(s);
		return br.nextLine();
	}
	public static void main(String[] args)   {
		//Enter any function definition here.
		print(repeat("hello",7,",","Hii... ","."));
	}
    public static void print(String s) {
    	System.out.print(s);
    }
    public static void print(int s) {
    	System.out.print(s);
    }
    public static void print(byte s) {
    	System.out.print(s);
    }
    public static void print(short s) {
    	System.out.print(s);
    }
    public static void print(long s) {
    	System.out.print(s);
    }
    public static void print(char s) {
    	System.out.print(s);
    }
    public static void print(double s) {
    	System.out.print(s);
    }
    public static void print(float s) {
    	System.out.println(s);
    }
    public static void print(boolean s) {
    	System.out.print(s);
    }
    public static void print(String[] s) {
    	System.out.println("{");
    	for(int i = 0 ; i< s.length ;i++) {
    		System.out.print(s[i]+((i<s.length-1)?",":"}"));
        	}
    }
    public static void print(int[] s) {
    	System.out.println("{");
    	for(int i = 0 ; i< s.length ;i++) {
    		System.out.print(s[i]+((i<s.length-1)?",":"}"));
        	}
    }
    public static void print(long[] s) {
    	System.out.println("{");
    	for(int i = 0 ; i< s.length ;i++) {
    		System.out.print(s[i]+((i<s.length-1)?",":"}"));
        	}
    }
    public static void print(double[] s) {
    	System.out.println("{");
    	for(int i = 0 ; i< s.length ;i++) {
    		System.out.print(s[i]+((i<s.length-1)?",":"}"));
        	}
    }
    public static void print(float[] s) {
    	System.out.println("{");
    	for(int i = 0 ; i< s.length ;i++) {
    		System.out.print(s[i]+((i<s.length-1)?",":"}"));
        	}
    }
    public static void print(boolean[] s) {
    	System.out.println("{");
    	for(int i = 0 ; i< s.length ;i++) {
    		System.out.print(s[i]+((i<s.length-1)?",":"}"));
        	}
    }
    public static void print(byte[] s) {
    	System.out.println("{");
    	for(int i = 0 ; i< s.length ;i++) {
    		System.out.print(s[i]+((i<s.length-1)?",":"}"));
        	}
    }
    public static void print(short[] s) {
    	System.out.println("{");
    	for(int i = 0 ; i< s.length ;i++) {
    		System.out.print(s[i]+((i<s.length-1)?",":"}"));
        	}
    }
    public static void inputArray(String[] s ) {
       for (int i = 0; i < s.length; i++) {
		s[i] = br .nextLine();
	}
       
    }
    public static void inputArray(int[] s ) {
        for (int i = 0; i < s.length; i++) {
 		s[i] = br .nextInt();
 	}
        
     }
    public static void inputArray(boolean[] s ) {
        for (int i = 0; i < s.length; i++) {
 		s[i] = br .nextBoolean();
 	}
        
     }
    public static void inputArray(double[] s ) {
        for (int i = 0; i < s.length; i++) {
 		s[i] = br .nextDouble();
 	}
        
     }
    public static void inputArray(float[] s ) {
        for (int i = 0; i < s.length; i++) {
 		s[i] = br .nextFloat();
 	}
        
     }
    public static void inputArray(byte[] s ) {
        for (int i = 0; i < s.length; i++) {
 		s[i] = br .nextByte();
 	}
        
     }
    public static void inputArray(long[] s ) {
        for (int i = 0; i < s.length; i++) {
 		s[i] = br .nextLong();
 	}
        
     }
    public static void inputArray(short[] s ) {
        for (int i = 0; i < s.length; i++) {
 		s[i] = br .nextShort();
 	}
        
     }
    public static int factorial(int a) {
    	return (a > 0)?a * factorial(a-1):1;
    }
    public static boolean isPrime(int a) {
    	int c = 0 ;
    	for (int i = 1; i <= a; i++) {
			if(a%i == 0) {
				c++;
			}
		}
    	if(c == 2) {
    		return true;
    	}
    	return false;
    }
    public static int findRandom(int a , int b) {
    	int rand = (int)(Math.floor(Math.random()*b));
    	return (rand < a)?rand+(a-rand):rand;
    }/* Use this method when array is not Sorted */
    public static int linearSearch(int a[],int searchingValue) {
    	int index = -1;//Default index , tells that the value is not present
    	for (int i : a) {
			if(a[i] == searchingValue) {
				index = i;
				break;
			}
		}
    	return index ;
    }//TODO overload for each data type
    public static String reverse(String s) {
    	String reversedString = "";
    	for(int i = 0 ; i < s.length() ; i++) {
    		reversedString = s.charAt(i) + reversedString;
    	}
    	return reversedString;
    }
    public static int[] extractDigits(int a) {
    	int arr[] = new int [(""+a).length()];
    	for (int i : arr) {
			arr[i] = getDigitFromIndex(a,i);
		}
    	return arr;
    }
    public static int getDigitFromIndex(int a , int index) {
    	return ((int)(a+"").charAt(index)); 
    }
    public static int binarySearch(int a[] , int searchingValue) {
    	int index = -1;
    	if(!isSorted(a)) {
    		Arrays.sort(a);
    	}
    	int LOWER_INDEX = 0;
    	int UPPER_INDEX = a.length - 1;
    	int MIDDLE_INDEX ;
    	while(LOWER_INDEX < UPPER_INDEX){
    		MIDDLE_INDEX = (UPPER_INDEX + LOWER_INDEX)/2;
    		if(a[MIDDLE_INDEX] == searchingValue) {
    			index = MIDDLE_INDEX;
    			break;
    		}
    		else if(a[MIDDLE_INDEX] > searchingValue) {
    			UPPER_INDEX = MIDDLE_INDEX - 1;
    		}
    		else if(a[MIDDLE_INDEX] < searchingValue) {
    			LOWER_INDEX = MIDDLE_INDEX - 1;
    		}
    	                                 	
    	}
    	
		return index;
    	
    }
    public static long binarySearch(long a[] , long searchingValue) {
    	int index = -1;
    	if(!isSorted(a)) {
    		Arrays.sort(a);
    	}
    	int LOWER_INDEX = 0;
    	int UPPER_INDEX = a.length - 1;
    	int MIDDLE_INDEX ;
    	while(LOWER_INDEX < UPPER_INDEX){
    		MIDDLE_INDEX = (UPPER_INDEX + LOWER_INDEX)/2;
    		if(a[MIDDLE_INDEX] == searchingValue) {
    			index = MIDDLE_INDEX;
    			break;
    		}
    		else if(a[MIDDLE_INDEX] > searchingValue) {
    			UPPER_INDEX = MIDDLE_INDEX - 1;
    		}
    		else if(a[MIDDLE_INDEX] < searchingValue) {
    			LOWER_INDEX = MIDDLE_INDEX - 1;
    		}
    	                                 	
    	}
    	
		return index;
    	
    }
    private static boolean isSorted(long[] a) {
    	boolean isSortedArray = true;// we are contradicting the array to be sorted
    	boolean isAscending  = (a[0]<a[a.length -1]); 
    	for (int i = 0 ; i < a.length-1 ; i++) {
    		if(isAscending) {
			if(a[i] > a[i+1]) {
				isSortedArray = false;
				break;
			}
		
    	}
    	else {
    		if(a[i] < a[i+1]) {
				isSortedArray = false;
				break;
			}
    	}}
    	return isSortedArray;
	}
	public static int binarySearch(char a[] , char searchingValue) {
    	int index = -1;
    	if(!isSorted(a)) {
    		Arrays.sort(a);
    	}
    	int LOWER_INDEX = 0;
    	int UPPER_INDEX = a.length - 1;
    	int MIDDLE_INDEX ;
    	while(LOWER_INDEX < UPPER_INDEX){
    		MIDDLE_INDEX = (UPPER_INDEX + LOWER_INDEX)/2;
    		if(a[MIDDLE_INDEX] == searchingValue) {
    			index = MIDDLE_INDEX;
    			break;
    		}
    		else if(a[MIDDLE_INDEX] > searchingValue) {
    			UPPER_INDEX = MIDDLE_INDEX - 1;
    		}
    		else if(a[MIDDLE_INDEX] < searchingValue) {
    			LOWER_INDEX = MIDDLE_INDEX - 1;
    		}
    	                                 	
    	}
    	
		return index;
    	
    }
    public static int binarySearch(double a[] , double searchingValue) {
    	int index = -1;
    	if(!isSorted(a)) {
    		Arrays.sort(a);
    	}
    	int LOWER_INDEX = 0;
    	int UPPER_INDEX = a.length - 1;
    	int MIDDLE_INDEX ;
    	while(LOWER_INDEX < UPPER_INDEX){
    		MIDDLE_INDEX = (UPPER_INDEX + LOWER_INDEX)/2;
    		if(a[MIDDLE_INDEX] == searchingValue) {
    			index = MIDDLE_INDEX;
    			break;
    		}
    		else if(a[MIDDLE_INDEX] > searchingValue) {
    			UPPER_INDEX = MIDDLE_INDEX - 1;
    		}
    		else if(a[MIDDLE_INDEX] < searchingValue) {
    			LOWER_INDEX = MIDDLE_INDEX - 1;
    		}
    	                                 	
    	}
    	
		return index;
    	
    }
    public static int binarySearch(String a[] , String searchingValue) {
    	int index = -1;
    	if(!isSorted(a)) {
    		Arrays.sort(a);
    	}
    	int LOWER_INDEX = 0;
    	int UPPER_INDEX = a.length - 1;
    	int MIDDLE_INDEX ;
    	while(LOWER_INDEX < UPPER_INDEX){
    		MIDDLE_INDEX = (UPPER_INDEX + LOWER_INDEX)/2;
    		if(a[MIDDLE_INDEX].equals(searchingValue)) {
    			index = MIDDLE_INDEX;
    			break;
    		}
    		else if(a[MIDDLE_INDEX].compareTo(searchingValue)>0 ) {
    			UPPER_INDEX = MIDDLE_INDEX - 1;
    		}
    		else if(a[MIDDLE_INDEX].compareTo(searchingValue)<0) {
    			LOWER_INDEX = MIDDLE_INDEX - 1;
    		}
    	                                 	
    	}
    	
		return index;
    	
    }
    public static boolean isSorted(int a[]) {
    	boolean isSortedArray = true;// we are contradicting the array to be sorted
    	boolean isAscending  = (a[0]<a[a.length -1]); 
    	for (int i = 0 ; i < a.length-1 ; i++) {
    		if(isAscending) {
			if(a[i] > a[i+1]) {
				isSortedArray = false;
				break;
			}
		
    	}
    	else {
    		if(a[i] < a[i+1]) {
				isSortedArray = false;
				break;
			}
    	}}
    	return isSortedArray;
    }
    public static boolean isSorted(char a[]) {
    	boolean isSortedArray = true;// we are contradicting the array to be sorted
    	boolean isAscending  = (a[0]<a[a.length -1]); 
    	for (int i = 0 ; i < a.length-1 ; i++) {
    		if(isAscending) {
			if(a[i] > a[i+1]) {
				isSortedArray = false;
				break;
			}
		
    	}
    	else {
    		if(a[i] < a[i+1]) {
				isSortedArray = false;
				break;
			}
    	}}
    	return isSortedArray;
    }
    public static boolean isSorted(double a[]) {
    	boolean isSortedArray = true;// we are contradicting the array to be sorted
    	boolean isAscending  = (a[0]<a[a.length -1]); 
    	for (int i = 0 ; i < a.length-1 ; i++) {
    		if(isAscending) {
			if(a[i] > a[i+1]) {
				isSortedArray = false;
				break;
			}
		
    	}
    	else {
    		if(a[i] < a[i+1]) {
				isSortedArray = false;
				break;
			}
    	}}
    	return isSortedArray;
    }
    public static boolean isSorted(String a[]) {
    	boolean isSortedArray = true;// we are contradicting the array to be sorted
    	boolean isAscending  = (a[0].compareTo(a[a.length -1])<0); 
    	for (int i = 0 ; i < a.length-1 ; i++) {
    		if(isAscending) {
			if(a[i] .compareTo( a[i+1])>0) {
				isSortedArray = false;
				break;
			
			}
		
    	}
    	else {
    		if(a[i] .compareTo( a[i+1])<0) {
				isSortedArray = false;
				break;
			}
    	}}
    	return isSortedArray;
    }


    
    public static String repeat(String s , int a) {
    	if(a == 0 ) {
    		return "";
    	}
    	return s+repeat(s,a-1) ; 
    }
    public static String repeat(String s , int a,String seprator ,String start, String end) {
    	String t = "";
    	for(int i = 0 ; i < a ;i ++) {
    		if(i == 0) {
    			t += start + s + seprator;
    		}
    		else if(i == a-1) {
    			t += s + end;
    		}
    		else {
    			t += s + seprator;
    		}
    		
    	}
 return t;
    }
    public static int tint(String s) {
    	try {
    	return Integer.parseInt(s + "") ;
    	}
    	catch(Exception e) {
    	return 0;
    	}
    }
    public static int tint(long s) {
    	return Integer.parseInt(s + "") ; 
    }
    public static int tint(double s) {
    	return (int)s ; 
    }
    public static int tint(float s) {
    	return (int)s ; 
    }
    public static void printWords(String s) {
    	
    	//TODO
    }
    
        
    
}

