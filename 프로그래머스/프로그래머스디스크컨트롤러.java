<<<<<<< HEAD
import java.util.*;
import java.io.*;
class disk
{
	int x;
	int y;
	disk(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	}
public class ���α׷��ӽ���ũ��Ʈ�ѷ� {
	
	public static void main(String[] args) {
		int jobs[][] = {{0,3},{1,9},{2,6}};
		PriorityQueue<disk> pq = new PriorityQueue<disk>(new Comparator<disk>() {
			public int compare(disk disk1, disk disk2)
			{
				if( disk1.x > disk2.x)
				{
					return 1;
				}
				else
					return -1;
				
			}
		});

	}

}
=======
import java.util.*;
import java.io.*;
class disk
{
	int x;
	int y;
	disk(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	}
public class ���α׷��ӽ���ũ��Ʈ�ѷ� {
	
	public static void main(String[] args) {
		int jobs[][] = {{0,3},{1,9},{2,6}};
		PriorityQueue<disk> pq = new PriorityQueue<disk>(new Comparator<disk>() {
			public int compare(disk disk1, disk disk2)
			{
				if( disk1.x > disk2.x)
				{
					return 1;
				}
				else
					return -1;
				
			}
		});

	}

}
>>>>>>> cd8bf4bced39b628e5df6c5ef81d1dff0902ae83
