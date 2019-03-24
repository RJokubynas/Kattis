import java.util.*;

public class ICPC {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		HashSet<String> collegeSet = new HashSet<>();

		int n = in.nextInt();
		String rank[][] = new String[12][2];
		int count = 0;

		for(int i = 0; i<= n-1; i++)
		{
			String college = in.next(), name = in.next();
			if(!collegeSet.contains(college) && collegeSet.size()<12)
			{
				collegeSet.add(college);
				rank[count][0] = college;
				rank[count][1] = name;
				count++;
			}
		}
		for(int i = 0; i<12;i++)
		{
			System.out.println(rank[i][0] + " " + rank[i][1]);
		}
	}
}
