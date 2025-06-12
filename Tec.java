class placement
{
void technical()
{
System.out.println("Technical training");
}
void communication()
{
System.out.println("communication training");
}
}

class MCA extends placement
{
void java()
{
System.out.println("java programming");
}
void os()
{
System.out.println("operating system");
}
}


class Tec
{
public static void main(String args[])
{
MCA mca = new MCA();
mca();
}
}