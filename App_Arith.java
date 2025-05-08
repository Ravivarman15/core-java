import java.awt.*;
import java.awt.event.*;
class App_Arith extends Frame implements ActionListener
{
TextField t1, t2, t3;
Button b1, b2, b3, b4;
public static void main(String args[])
{
App_Arith f = new App_Arith();
f.setTitle("Arithmatic");
f.setSize(450,450);
f.setVisible(true);
f.setBackground(Color.black);
}
App_Arith()
{
setLayout(null);
Panel p = new Panel();
Label l = new Label("Arithmatic Operation");
l.setBackground(Color.yellow);
l.setBounds(50, 10, 300, 50);
Font f0 = new Font ("Arial",Font.BOLD,32);
l.setFont(f0);
p.setBackground(Color.black);
p.add(l);
p.setBounds(0,50,450,80);
this.add(p);

Label l1 = new Label("First number:");
t1 = new TextField(20);
Label l2 = new Label("second number:");
t2 = new TextField(20);
Label l3 = new Label("Result:");
t3 = new TextField(20);
t3.setEditable(false);

this.add(l1);
this.add(t1);
this.add(l2);
this.add(t2);
this.add(l3);
this.add(t3);
b1 = new Button("Add");
b2 = new Button("Subtract");
b3 = new Button("Multiply");
b4 = new Button("Divide");
this.add(b1);
this.add(b2);
this.add(b3);
this.add(b4);
l1.setBounds(50,150,150,30);
t1.setBounds(250,150,150,30);
l2.setBounds(50,200,150,30);
t2.setBounds(250,200,150,30);
l3.setBounds(50,250,150,30);
t3.setBounds(250,250,150,30);
b1.setBounds(50,300,80,30);
b2.setBounds(150,300,80,30);
b3.setBounds(250,300,80,30);
b4.setBounds(350,300,80,30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
try
{
double result = 0;
String s1 = t1.getText();
String s2 = t2.getText();
double a = Double.parseDouble(s1);
double b = Double.parseDouble(s2);
result=0;
if (ae.getSource() == b1) 
{
result = a + b;
} 
else if (ae.getSource() == b2)
{
result = a - b;
} 
else if (ae.getSource() == b3) 
{
result = a * b;
} 
else if (ae.getSource() == b4)
{
if (b != 0) 
{
result = a / b;
}
else 
{
t3.setText("Error");
return;
}
}
t3.setText(String.valueOf(result));
} 
catch (NumberFormatException e) 
{
t3.setText("Invalid input");
}
}
}







