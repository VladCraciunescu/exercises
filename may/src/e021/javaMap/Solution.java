package e021.javaMap;


import java.util.HashMap;
import java.util.Scanner;

class Solution{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            map.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(map.containsKey(s))
                System.out.println(s+"="+map.get(s));
            else
                System.out.println("Not found");
        }
    }
}
//https://www.hackerrank.com/challenges/phone-book/problem?h_r=next-challenge&h_v=zen