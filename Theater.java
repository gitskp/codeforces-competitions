import java.util.*;
import java.io.*;
import java.lang.*;

public class Theater{
  public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double n = sc.nextInt();
double m = sc.nextInt();
double a = sc.nextInt();
System.out.println((long)(Math.ceil(n/a)*Math.ceil(m/a)));

}

}
