
public class Recursion2 {

	public static void main(String[] args) {
		
		int [] array = {46, 22, 7, 58, 91, 55, 31, 84, 12, 78}; 
		if(findMax(array) == 91) 
		{
			System.out.println("findMax is correct!"); 
		}
		
		if (findMin(array) == 7)
		{
			System.out.println("findMinh is correct!");
		}
		
		if (reverseStr("pupils").equals("slipup"))
		{
			System.out.println("reverseString is correct!");
		}
		
		if(reverseStr("Hello").equals("olleH")) 
		{ 
			System.out.println("reverseString is correct!");
		}
		
		if(charFrequency("antidisestablishmentarianism", 'a') == 4)
		{
			System.out.println("charFrequency is correct!");
		}
		
		if(charFrequency("antidisestablishmentarianism",'i') == 5)
		{ 	
			System.out.println("charFrequency is correct!");
		}
	}
	
	/**
	 * Finds the highest value in the array using the maxArray() method
	 * @param array array containing the elements to determine the max value from
	 * @return the highest value in the array
	 */
	public static int  findMax(int[] array)
	{
		return maxArray(array, 0, array.length - 1);
	}
	
	/** Finds the maximum value in an array
	* @param array array of values (sorted or unsorted) 
	* @param i iterator
	* @param max maximum value found so far
	* @return maximum value
	*/
	public static int maxArray(int [] array, int i, int max) 
	{
		if (array[i] < array[max])
		{
			 return maxArray(array, i + 1, max);
		}
		else
		{
			return array[i];
		}

	}
	
	public static int findMin(int[] a)
	{
		int min = a.length - 1;
		return minArray(a, 0, min);
	}
	
	public static int minArray(int[] array, int i, int min) 
	{
		if (i < array.length)
		{
			if (array[i] < min)
			{
				min = array[i];
			}
			else 
			{
				return minArray(array, i + 1, min);
			}
		}
		return min;
	}

	/** Reverses a string
	* @param s the string to reverse * @return the reversed string */
	public static String reverseStr(String s) 
	{
		if ((s == null) || (s.length() <= 1)) 
		{
			return s;
		}
		return reverseStr(s.substring(1)) + s.charAt(0);
	}
	
	/** Returns the number of times c appears in the string str
	* @param str string to test
	* @param c character to find
	* @return number of times the character appeared in the string */
	public static int charFrequency(String str, char c) 
	{
		int length = str.length();
		if (length == 0)
		{
			return 0;
		}
		else if (str.charAt(0) == c)
		{
			return 1 + charFrequency(str.substring(1), c);
		}
		return charFrequency(str.substring(1), c);
	}

}
