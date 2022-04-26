class ObjectArg
{
 int a,b;
 void getData(int x,int y)
 {
  a=x;
  b=y;
 }
 void display()
 {
  System.out.println("a="+a);
  System.out.println("b="+b);
 }
 void copyObject(ObjectArg m)
 {
  a=m.a;
  b=m.b;
 }
}
class ObjectArgMain
{
 public static void main(String arg[])
 {
  ObjectArg s=new ObjectArg();
  ObjectArg t=new ObjectArg();
  s.getData(34,45);
  t.copyObject(s);
  s.display();
  t.display();
 }
}