public class Main {

	public static void main(String [] args)
	{
		int [] in = {3, 4, 7, 5, 1};

		System.out.print("in\t: ");
		printTab(in);

		System.out.print("out\t: ");
		printTab(reverseTab(in));
	}

	public static int [] reverseTab(int [] in)
	{
		/* Start inversion tableau */
		for(int i = 0; i < in.length/2; i++)
		{
			in[i] = in[in.length-i-1]+in[i];
			in[in.length-i-1] = in[i]-in[in.length-i-1];
			in[i] = in[i]-in[in.length-i-1] ;
		}
		/* Reversing done */
		
		return in;
	}
	
	public static void printTab(int [] tab)
	{
		for(int i =0; i < tab.length; i++)
		{
			System.out.print(tab[i]+" ");
		}
		System.out.println();
	}
}