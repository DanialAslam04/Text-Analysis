import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class screen{
JTextArea t1;
JButton SA,UpperC,LowerC,Analys,clear;
JLabel l1;
String s1;

screen(){
JFrame j=new JFrame("Text Editor");
JPanel p=new JPanel();


t1=new JTextArea(20, 105);
t1.setFont(new Font("Serif", Font.PLAIN, 16));
t1.setText("Enter Text Here");

l1=new JLabel("<---Text Analyzer--->");
l1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 26));
l1.setForeground(new Color(0x00244f));

SA=new JButton("SELECT ALL");
UpperC=new JButton("UPPER CASE");
LowerC=new JButton("LOWER CASE");
Analys=new JButton("ANALYSIS");
clear=new JButton("CLEAR");

SA.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae){
t1.requestFocusInWindow();// to get focus of text area
t1.selectAll();
}
});

UpperC.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae){
s1=t1.getText();
t1.setText(s1.toUpperCase());
}
});

LowerC.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae){
s1=t1.getText();
t1.setText(s1.toLowerCase());
}
});

Analys.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae){

s1=t1.getText();
char[] ch = s1.toCharArray(); 
int count=0;
		
for(int i=0;i<s1.length();i++)
if (i>0&&ch[i]==' ')
count++;

int words= count+1;
int chr= s1.length()-count;
		
JLabel l2= new JLabel("Total Words:"+words);
JLabel l3= new JLabel("Total Characters:"+chr);

p.add(l2);
p.add(l3);


}
});

clear.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae){
t1.setText(" ");
}
});


p.add(l1);
p.add(t1);
p.add(SA);
p.add(UpperC);
p.add(LowerC);
p.add(Analys);
p.add(clear);

p.setLayout(new FlowLayout());    
j.setContentPane(p);
j.setVisible(true);
j.setSize(1280,850);
j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}

public class JavaProject{

public static void main(String args[]){

screen obj=new screen();


}

}