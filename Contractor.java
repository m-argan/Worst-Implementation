package testPrep;

public class E1 implements Employee
{private String a;
private int b;
private int c;	
public E1(String a1,int b1,int c1)
{this.a=a1;
this.b=b1;
this.c=c1;}
public Employee createNew(String name,int rate,int hours)
{return new E1(a,b,c);}
public double sparkle_dash()
{return (b*c);}
@Override
public void pumpkinAss(int hours) 
{this.hours+=hours;}
public String ApPlEsAucE(){return a;}
public int xyz(){return b;}
public int late(){return c;}}
