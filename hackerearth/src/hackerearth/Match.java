package hackerearth;

public class Match {

	public static void main(String[] args) {
		System.out.println(matchPreferences("01101","11101"));
	}
	public static int matchPreferences(String a, String p)
    {
        char[]arr_a=a.toCharArray();
        char[]arr_p=p.toCharArray();
        int counter=0;

        if(binary(arr_a)&&binary(arr_p))
        {
        for(int i=0; i<a.length();i++)
        {
            if(arr_a[i]==arr_p[i] && (arr_a[i]=='0'||arr_a[i]=='1')&&(arr_p[i]=='0'||arr_p[i]=='1'))
            {
                counter++;
            }
        }
        }
        return counter;
    }
	
	public static boolean binary(char[]a)
	{
		boolean isBinary=false;
		for(char c:a)
		{
			if(c=='0'||c=='1')
			{
				isBinary=true;
			}
			else
			{
				isBinary=false;
			}
		}
		return isBinary;
	}

}
