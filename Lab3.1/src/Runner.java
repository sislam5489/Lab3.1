import java.lang.reflect.Array;

public class Runner {

	public static void main(String[]args)
	{
		int[] numbers = {2,3,5,7,10,3};
		removeDuplicates();
	}
	public static int[] removeDuplicates(int[]list)
	{
		int num = 0;
		int[] Array;
		for(int i = 0;i<list.length;i++)
		{
			for(int j = i+1;j<list.length;j++)
			{
				if(list[i]==list[j])
				{
					num++;
					Array = new int[list.length-num];
				}
			}
		}
	}
}
