package merge;
import java.util.*;
import java.lang.*;
class MergeSort{
    public static ArrayList<Integer> merge(ArrayList<Integer> arr)
    {
        if(arr.size()==2)
        {
            ArrayList<Integer> ans=new ArrayList<Integer>();
            ans.add(Collections.min(arr));
            ans.add(Collections.max(arr));
            return (ans);
        }
        else if(arr.size()==1)
        {
            return arr;
        }
        int middle=arr.size()/2;
        ArrayList<Integer> left=new ArrayList<Integer>();
        ArrayList<Integer> right=new ArrayList<Integer>();
        for (int i=0;i<arr.size();i++)
        {
            if (i<middle)
            {
                left.add(arr.get(i));
            }
            else
            {
                right.add(arr.get(i));
            }
        }
        left=merge(left);
        right=merge(right);
        
        int p1=0,p2=0;
        ArrayList<Integer> result=new ArrayList<Integer>();
        while(p1<left.size()||p2<right.size())
        {
            if (p2==right.size())
            {
                result.add(left.get(p1));
                p1++;
            }
            else if(p1==left.size())
            {
                result.add(right.get(p2));
                p2++;
            }
            else if(left.get(p1)<right.get(p2))
            {
                result.add(left.get(p1));
                p1++;
            }
            else
            {
                result.add(right.get(p2));
                p2++;
            }
        }
        return (result);
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> p=new ArrayList<Integer>();
        p.add(1);
        p.add(3);
        p.add(5);
        p.add(4);
        p.add(2);
        System.out.println("Before");
        for (int i=0;i<5;i++)
        {
            System.out.print(p.get(i)+"\t");
        }
        System.out.println("\nAfter");
        p=merge(p);
        for (int i=0;i<5;i++)
        {
            System.out.print(p.get(i)+"\t");
        }
    }
}
