import java.awt.*;
import java.awt.event.*;

class App implements ActionListener
{
Button b1,b4,b3,b5,b6,b7,b2,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18, b19,b20,b21,b22,b23;
Label l1, l2, l3, l4, l5,l6,l7,l8,l9,l10,l11,l12;
TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17;
TextArea ta1, ta2;
List lt1, lt2, lt3, lt4;
Frame f,f1,f2,f3,f4, f5;
Dialog d4;
FileDialog fd1;
Menu m, m1,m2,m3,m4,m5;
MenuItem mi, mi1, mi2, mi3, mi4,mi5;
MenuBar mb, mb1,mb2, mb3,mb4;
Panel p,p1;
String s5="coderS";
String s6="j1d25k16";
String s9, s10,s11,s12,s13, s14,s15,s16,s17,s18,s19,s20;
int a=0, c=0,b=0,d=0,g=0,x=0,y=0,z=0,h=0,i=0,j=0,k=0,q,n,o,r;
	App()
	{
	b1 = new Button("BOOKS");
	b4 = new Button("BACK");
	b3 = new Button("BACK");
	b9 = new Button("BACK");
	b5 = new Button("ADD");
	b2 = new Button("REMOVE");
	b6 = new Button("DELETE");
	b7 = new Button("BUCKET");
	b8 = new Button("BILL");
	b10 = new Button("SUBMIT");
	b11=new  Button("BACK");
	b12=new Button("+");
	b13=new Button("-");
	b14=new Button("...");
	b15=new Button("=");
	b16=new Button("=");
	b17=new Button("=");
	b18=new Button("TOTAL");
	b19=new Button("---->");
	b20=new Button("PRINT");
	b21=new Button("MAIL");
	b22=new Button("TEXT");
	b23=new Button("BACK");
	l1 = new Label("BOOK NAME :");
	l2 = new Label("CUSTOMER NAME :");
	l3 = new Label("ADDRESS :");
	l4=new Label("USERNAME");
	l5=new Label("PASSWORD");
	l6=new Label("TOTAL");
	l7=new Label("x");
	l8=new Label("x");
	l9=new Label("x");
	l10=new Label("Rs.");
	l11=new Label("Rs.");
	l12=new Label("LIST OF ITEMS");
	tf1 = new TextField(20);
	tf2 = new TextField(40);
	tf3 = new TextField(40);
	tf4 = new TextField(40);
	tf4.setEchoChar('*');
	tf5 = new TextField(10);
	tf6 = new TextField(10);
	tf6.setEditable(false);
	tf7 = new TextField(5);
	tf8 = new TextField(5);
	tf9 = new TextField(5);
	tf10 = new TextField(5);
	tf11 = new TextField(5);
	tf12 = new TextField(5);
	tf13 = new TextField(5);
	tf14 = new TextField(5);
	tf15 = new TextField(5);
	tf16 = new TextField(5);
	tf16.setEditable(false);
	tf17 = new TextField(5);
	tf17.setEditable(false);
	ta1 = new TextArea();
	ta2 = new TextArea();
	d4 = new Dialog(f,true);
	fd1=new FileDialog(f);
	lt1 = new List(10,true);
	lt1.add("JAVA TECHMAX 100 Rs.");
	lt1.add("JAVA VBD 100Rs.");
	lt1.add("JAVA NIRALI 100 Rs.");
	lt2 = new List(10,true);
	lt2.add("JAVA TECHMAX 100 Rs.");
	lt2.add("JAVA VBD 100Rs.");
	lt2.add("JAVA NIRALI 100 Rs.");
	lt3 = new List(10,true);
	lt4 = new List(10,true);
	m = new Menu("FILE");
	m1 = new Menu("ADMIN");
	m2 = new Menu("FILE");
	m3 = new Menu("FILE");
	m4 = new Menu("FILE");
	m5 = new Menu("FILE");
	mi = new MenuItem("EXIT");
	mi1 = new MenuItem("EDIT");
	mi2 = new MenuItem("EXIT");
	mi3 = new MenuItem("EXIT");
	mi4 = new MenuItem("EXIT");
	mi5 = new MenuItem("BACK");
	mb = new MenuBar();
	mb1 = new MenuBar();
	mb2= new MenuBar();
	mb3= new MenuBar();
	mb4= new MenuBar();
	p = new Panel();
	p1 = new Panel();
	f = new Frame("APP");
	f1 = new Frame("BOOK LIST");
	f2 = new Frame("ADMIN");
	f3= new Frame("BILL");
	f4=new Frame("PRICE");
	f5=new Frame("BILL");

	f.add(b1);
	m2.add(mi2);
	mb1.add(m2);
	f1.setMenuBar(mb1);
	f1.add(lt1);
	f1.add(b7);
	f1.add(b2);
	f1.add(lt3);
	f1.add(b3);
	f1.add(b8);
	f1.add(tf5);
	f1.add(b13);
	f1.add(b12);
	f1.add(l6);
	f1.add(tf6);
	f1.add(b14);
	mb.add(m);
	mb.add(m1);
	m.add(mi);
	m1.add(mi1);
	f.setMenuBar(mb);
	m3.add(mi3);
	mb2.add(m3);
	f2.setMenuBar(mb2);
	f2.add(l1);
	f2.add(tf1);
	f2.add(b5);
	f2.add(b6);
	f2.add(lt2);
	f2.add(b4);
	m4.add(mi4);
	mb3.add(m4);
	f3.setMenuBar(mb3);
	f3.add(l2);
	f3.add(tf2);
	f3.add(l3);
	f3.add(ta1);
	f3.add(l12);
	f3.add(lt4);
	f3.add(l11);
	f3.add(tf17);
	p.add(b9);
	p.add(b19);
	f3.add(p);
	d4.add(l4);
	d4.add(tf3);
	d4.add(l5);
	d4.add(tf4);
	d4.add(b10);
	d4.add(b11);
	m5.add(mi5);
	mb4.add(m5);
	f4.setMenuBar(mb4);
	f4.add(tf7);
	f4.add(l7);
	f4.add(tf10);
	f4.add(b15);
	f4.add(tf13);
	f4.add(tf8);
	f4.add(l8);
	f4.add(tf11);
	f4.add(b16);
	f4.add(tf14);
	f4.add(tf9);
	f4.add(l9);
	f4.add(tf12);
	f4.add(b17);
	f4.add(tf15);
	f4.add(b18);
	f4.add(tf16);
	f4.add(l10);
	f5.add(ta2);
	p1.add(b20);
	p1.add(b21);
	p1.add(b22);
	p1.add(b23);
	f5.add(p1);
					
	b1.addActionListener(this);
	b4.addActionListener(this);
	b3.addActionListener(this);
	mi.addActionListener(this);
	mi1.addActionListener(this);
	mi2.addActionListener(this);
	mi3.addActionListener(this);
	mi4.addActionListener(this);
	mi5.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b2.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b10.addActionListener(this);
	b11.addActionListener(this);
	b12.addActionListener(this);
	b13.addActionListener(this);
	b14.addActionListener(this);
	b15.addActionListener(this);
	b16.addActionListener(this);
	b17.addActionListener(this);
	b18.addActionListener(this);
	b19.addActionListener(this);
	b20.addActionListener(this);
	b21.addActionListener(this);
	b22.addActionListener(this);
	b23.addActionListener(this);
	
	
	f.setSize(400,200);
	f1.setSize(500,300);
	f2.setSize(550,250);
	f3.setSize(500,500);
	f4.setSize(300,250);
	d4.setSize(350,200);
	f5.setSize(450,300);
	f.setVisible(true);
	f.setLayout(new FlowLayout());
	f1.setLayout(new FlowLayout());	
	f2.setLayout(new FlowLayout());	
	f3.setLayout(new FlowLayout());
	f4.setLayout(new FlowLayout());
	d4.setLayout(new FlowLayout());
	f5.setLayout(new FlowLayout());	
	}
	
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
		{
		f1.setVisible(true);
		}
	else if(e.getSource()==b4)
		{
		f2.setVisible(false);
		f.setVisible(true);
		}
	else if(e.getSource()==b3)
		{
		f1.setVisible(false);
		}
	else if(e.getSource()==mi)
		{	
		System.exit(0);
		}
	else if(e.getSource()==mi1)
		{
		d4.setVisible(true);
		}
	else if(e.getSource()==b10)	
	{
		 String s7=tf3.getText();
		 String s8=tf4.getText();
		if(s7.equals(s5)==true && s8.equals(s6)==true)
		{
		f2.setVisible(true);
		d4.setVisible(false);
		f.setVisible(false);
		}
		else if(s7.equals(s5)!=true && s8.equals(s6)!=true)
		{
		tf3.setText(" ");
		tf4.setText(" ");
		}
	}
	else if(e.getSource()==b11)
		{
		d4.setVisible(false);
		}
	else if(e.getSource()==b5)
		{
		 String s1 = tf1.getText();
		if(s1.length()>=1)
		{
		tf1.setText("");
		lt1.add(s1);
		lt2.add(s1);
		}
		}
	else if(e.getSource()==b6)
		{
		String s3[] = lt2.getSelectedItems();
		for(int o=0; o<s3.length;o++)
			{
			lt1.remove(s3[o]);
			lt2.remove(s3[o]);
			}
		}
	else if(e.getSource()==b7)
		{
		String s2[] = lt1.getSelectedItems();
		for(int q=0; q<s2.length;q++)
		{
			if(s2[q].length()>=1)
			{
			lt3.add(s2[q]);
			lt4.add(s2[q]);
			}
		}
		f1.setVisible(false);
		f1.setVisible(true);
		}
	else if(e.getSource()==b2)
		{
		String s4[] = lt3.getSelectedItems();
		for(int n=0; n<s4.length;n++)
			{
			lt3.remove(s4[n]);
			lt4.remove(s4[n]);
			}
		}
	else if(e.getSource()==b8)
		{
		s19=tf6.getText();
		tf17.setText(s19);
		f3.setVisible(true);
		}
	else if(e.getSource()==b9)
		{
		f3.setVisible(false);
		}
	else if(e.getSource()==mi2)
	{
	System.exit(0);
	}
	else if(e.getSource()==mi3)
	{
	System.exit(0);
	}
	else if(e.getSource()==mi4)
	{
	System.exit(0);
	}
	else if(e.getSource()==b12)
	{
	s9 = tf5.getText();
	 a = Integer.parseInt(s9);
	if(s9.length()>=1)
	{
	while(a>=1)
		{
		c=a+c;
		tf6.setText(c+" ");
		break;
		}

	}
	}
	else if(e.getSource()==b13)
	{
	s10 = tf5.getText();
	 a = Integer.parseInt(s10);
	while(a>=1)
	{
	c=c-a;
	tf6.setText(c+" ");
	break;
	}
	}
	else if(e.getSource()==b14)
	{
	f4.setVisible(true);
	f1.setVisible(false);
	}
	else if(e.getSource()==mi5)
	{
	f4.setVisible(false);
	f1.setVisible(true);
	}
	else if(e.getSource()==b15)
	{
	s11=tf7.getText();
	s12=tf10.getText();
	b = Integer.parseInt(s11);
	d =Integer.parseInt(s12);
	g =d*b;
	tf13.setText(g+" ");
	}
	else if(e.getSource()==b16)
	{
		s13=tf8.getText();
		s14=tf11.getText();
		x = Integer.parseInt(s13);
		y =Integer.parseInt(s14);
		z =y*x;
		tf14.setText(z+" ");
	}
	else if(e.getSource()==b17)
	{
		s15=tf9.getText();
		s16=tf12.getText();
		h = Integer.parseInt(s15);
		i =Integer.parseInt(s16);
		j =i*h;
		tf15.setText(j+" ");
	}
	else if(e.getSource()==b18)
	{
		k=j+z+g;
		tf16.setText(k+" ");
		tf6.setText(k+" ");
		tf17.setText(k+" ");
	}
	else if(e.getSource()==b19)
	{
		s17=tf2.getText();
		s18=ta1.getText();
		ta2.setText("NAME :  "+s17);
		ta2.append("\n");
		ta2.append("\n");
		ta2.append("ADDRESS :  "+s18);
		ta2.append("\n");
		ta2.append("\n");
		String s5[]=lt4.getItems();
		ta2.append("*******LIST OF ITEMS*******");
		ta2.append("\n");
		ta2.append("\n");
		for(int r=0; r<s5.length;r++)
			{
			ta2.append(s5[r]);
			ta2.append("\n");
			}
		ta2.append("\n");
		s20=tf17.getText();
		ta2.append(" BILL OF Rs."+s20);
		f5.setVisible(true);
		f3.setVisible(false);
	}
	else if(e.getSource()==b23)
	{
		ta2.setText(" ");
		ta1.setText(" ");
		tf2.setText(" ");
		f5.setVisible(false);
		f3.setVisible(true);
	}
	else if(e.getSource()==b20)
	{
	fd1.setVisible(true);
	}
	
}
public static void main(String args[])
{
	App x = new App();
}
}