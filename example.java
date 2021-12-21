import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/*<applet code="example" width="600" height="600"> </applet>*/
public class example extends Applet
{
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2;
    Button b1,b2;
    public void init()
    {
        l1=new Label("conversin celcious to faranite");
        l2=new Label("Enter the temperature in Fahrenheit");
        t1=new TextField();
        b1=new Button("conversion");
        l3=new Label("Conversion faharanite to celcious");
        l4=new Label("enter the temperature in  Celsius");
        l5=new Label();
        l6=new Label();
        t2=new TextField();
        b2=new Button("conversion");
        setLayout(null);
        l1.setBounds(100,100,200,20);
        l3.setBounds(500,100,200,20);
        l2.setBounds(100,140,200,20);
        l4.setBounds(500,140,200,20);
        t2.setBounds(740,140,100,20);
        t1.setBounds(340,140,100,20);
        l5.setBounds(100,250,100,20);
        
        l6.setBounds(500,250,100,20);
        b1.setBounds(340,180,100,20);
        b2.setBounds(740,180,100,20);
        add(l1);
        add(l3);
        add(l2);
        add(t1);
        add(l4);
        add(t2);
        add(b1);
        add(b2);
        add(l5);
        add(l6);
        b1.addActionListener(new myapplet2());
        b2.addActionListener(new myapplet2());
    }
    public class myapplet2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double a= Double.parseDouble(t1.getText());
            double c=0.55*(a-32);
            l5.setText(+c +"celcius");
            double b=Double.parseDouble(t2.getText());
            double d=1.8*b+32;
            l6.setText(+d +"fahranite");
        }
    }
}