/*
��ȡ�����е����ֵ
˼·��
1.��ȡ��ֵ��Ҫ���бȽϣ�ÿһ�αȽ϶�����һ���Ƚϴ��ֵ����Ϊֵ��ȷ����
ͨ��һ������������ʱ�洢��
2.�������е�ÿһ��Ԫ�غ���������е�ֵ���бȽϡ�������ڱ�����ֵ��
���øñ�����¼�ϴ�ֵ��
3.�����е�Ԫ�ض��Ƚ���ɣ���ô�ñ����д洢�ľ��������е����ֵ�ˡ�

���裺
1.�����������ʼ��Ϊ����������һ��Ԫ�ؼ��ɡ�
2.ͨ��ѭ������������б�����
3.�ڱ��������ж����ж������������������Ԫ�رȱ����е�Ԫ�ش󣬾͸�ֵ���ñ�����

��Ҫ����һ����������ɣ��Ա���ߴ��븴���ԡ�
1����ȷ����������е����Ԫ�� int��
2��Ϊֹ���ݣ�һ�����顣int []
���ܺ�������Ҫ���ݲ������в���������Ҫ���ؼ���ֵ��
�������Ҫ������������
*/
public class maxss{
	public static int getMax(int [] arr)
	{
	     int max = arr[0];
	     for(int x=1;x<arr.length;x++)
	     {
		if(arr[x]>max)
		       max=arr[x];
	      }return max;	
	}
	public static int getMin(int [] arr)
	{
	     int min=arr[0];
	     for(int x=1;x<arr.length;x++)
		{
		     if(arr[x]<min)
			min=arr[x];
		}return min;
	}
	public static void main(String[] args)
	{
	     int [] arr = {5,2,6,7,2,8,8,9};
	      int max = getMax(arr);
	      int min = getMin(arr);
	     System.out.println("max ="+max+";");
	     System.out.print("min ="+min+";");
	}
}