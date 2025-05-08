import java.awt.*;
class Application extends Frame
{
public static void main(String args[])
{
Application f=new Application();
f.setTitle("TU");
f.setSize(600,800);
f.setVisible(true);
f.setBackground(Color.white);
}
Application()
{
FlowLayout f1 = new FlowLayout();
this.setLayout(f1);
this.setLayout(null);
Panel p1=new Panel();
Label l1=new Label("Takshashila University");
Label l2=new Label("State Private University");
Label l3=new Label("Ongur,Tindivam");
Font f0 = new Font ("Arial",Font.BOLD,28);
l1.setFont(f0);
Font f3 = new Font ("Arial",Font.BOLD,24);
l2.setFont(f3);
Font f2 = new Font ("Arial",Font.BOLD,28);
l3.setFont(f2);
p1.setBackground(Color.red);
p1.setBounds(0,30,600,100);
p1.add(l1);
p1.add(l2);
p1.add(l3);
this.add(p1);

Panel p2=new Panel();
Label l4=new Label("Application Form 2025");
p2.setBackground(Color.orange);
Font f4 = new Font ("Arial",Font.BOLD,28);
l4.setFont(f4);
p2.setBounds(0,130,600,60);
p2.add(l4);
this.add(p2);

Label l11=new Label("Admission number");
Label l12=new Label("Name of candidate");
Label l13=new Label("Father name");
Label l14=new Label("DOB");
Label l15=new Label("Gender");
Label l16=new Label("Address");
Label l17=new Label("Nationality");
Label l18=new Label("Select course");
TextField t1=new TextField(20);
TextField t2=new TextField(20);
TextField t3=new TextField(20);
Choice dd=new Choice();
for (int i=0;i<=31;i++)
{
dd.addItem(" "+i);
}
CheckboxGroup cg=new CheckboxGroup();
Checkbox cb1=new Checkbox("Male",cg,true);
Checkbox cb2=new Checkbox("Female",cg,true);
Choice c1=new Choice();
c1.addItem("Select");
c1.addItem("India");
c1.addItem("US");
TextArea ta=new TextArea(20,20);
Checkbox cb3=new Checkbox("MCA");
Checkbox cb4=new Checkbox("MBA");
Checkbox cb5=new Checkbox("MSC");
Checkbox cb6=new Checkbox("MA");
Button b=new Button("Submit");
this.add(l11);
this.add(t1);
this.add(l12);
this.add(t2);
this.add(l13);
this.add(t3);
this.add(l14);
this.add(dd);
this.add(l15);
this.add(cb1);
this.add(cb2);
this.add(l16);
this.add(ta);
this.add(l17);
this.add(c1);
this.add(l18);
this.add(cb3);
this.add(cb4);
this.add(cb5);
this.add(cb6);
this.add(b);
l11.setBounds(50,230,200,30);
t1.setBounds(300,230,200,30);
l12.setBounds(50,270,200,30);
t2.setBounds(300,270,200,30);
l13.setBounds(50,310,200,30);
t3.setBounds(300,310,200,30);
l14.setBounds(50,350,200,30);
dd.setBounds(300,350,200,30);
l15.setBounds(50,390,200,30);
cb1.setBounds(300,390,100,30);
cb2.setBounds(410,390,100,30);
l16.setBounds(50,440,200,30);
ta.setBounds(300,440,200,70);
l17.setBounds(50,520,200,30);
c1.setBounds(300,520,200,30);
l18.setBounds(50,560,200,30);
cb3.setBounds(300,560,50,30);
cb4.setBounds(300,590,50,30);
cb5.setBounds(300,620,50,30);
cb6.setBounds(300,650,50,30);
b.setBounds(200,730,150,30);
}
}