package demo_project;

class B
{
    int methodOfA()
    {
        return (true ? null : 0);
    }
    public static void main(String a[]){
    	B b=new B();
    	int result=b.methodOfA();
    	System.out.println("Result="+result);
    	
    }
}