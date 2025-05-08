import java.awt.*;
class Stu_mark extends Frame
{
public static void main(String args[])
{
Stu_mark f=new Stu_mark();
f.setTitle("TU");
f.setSize(600,600);
f.setVisible(true);
f.setBackground(Color.black);
}
Stu_mark()
{
FlowLayout f1 = new FlowLayout();
this.setLayout(f1);
this.setLayout(null);
Panel p1=new Panel();
Label l1=new Label("Takshashila University");
Label l2=new Label("State private university");
Label l3=new Label("ongur,tindivam");
Font f0 = new Font ("Arial",Font.BOLD,28);
l1.setFont(f0);
Font f3 = new Font ("Arial",Font.BOLD,24);
l2.setFont(f3);
Font f2 = new Font ("Arial",Font.BOLD,28);
l3.setFont(f2);
p1.setBackground(Color.yellow);
p1.setBounds(0,30,600,100);

p1.add(l1);
p1.add(l2);
p1.add(l3);
this.add(p1);

Panel p2=new Panel();
Label l4=new Label("Student Mark");
p2.setBackground(Color.blue);
Font f4 = new Font ("Arial",Font.BOLD,28);
l4.setFont(f4);
p2.setBounds(0,130,600,60);
p2.add(l4);
this.add(p2);

Label l11=new Label("Enrollment number");
Label l12=new Label("Java mark");
Label l13=new Label("OS mark");
Label l14=new Label("CN mark");
Label l15=new Label("IS mark");
Label l16=new Label("Total mark");
Label l17=new Label("Average Mark");
TextField t1=new TextField(20);
TextField t2=new TextField(20);
TextField t3=new TextField(20);
TextField t4=new TextField(20);
TextField t5=new TextField(20);
TextField t6=new TextField(20);
TextField t7=new TextField(20);
Button b=new Button("Submit");
this.add(l11);
this.add(t1);
this.add(l12);
this.add(t2);
this.add(l13);
this.add(t3);
this.add(l14);
this.add(t4);
this.add(l15);
this.add(t5);
this.add(l16);
this.add(t6);
this.add(l17);
this.add(t7);
this.add(b);

l11.setBounds(50,200,150,30);
t1.setBounds(300,200,150,30);
l12.setBounds(50,250,150,30);
t2.setBounds(300,250,150,30);
l13.setBounds(50,300,150,30);
t3.setBounds(300,300,150,30);
l14.setBounds(50,350,150,30);
t4.setBounds(300,350,150,30);
l15.setBounds(50,400,150,30);
t5.setBounds(300,400,150,30);
l16.setBounds(50,450,150,30);
t6.setBounds(300,450,150,30);
l17.setBounds(50,500,150,30);
t7.setBounds(300,500,150,30);
b.setBounds(200,550,150,30);
}
}