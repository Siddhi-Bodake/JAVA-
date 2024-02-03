import javax.swing.*;
class calculator extends JFrame {
JTextField l;
calculator(){
setTitle("calculator");
l = new JTextField(16);
JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be,
bc,beq;
b0 = new JButton("0");
b1 = new JButton("1");
b2 = new JButton("2");
b3 = new JButton("3");
b4 = new JButton("4");
b5 = new JButton("5");
b6 = new JButton("6");
b7 = new JButton("7");
b8 = new JButton("8");
b9 = new JButton("9");
beq = new JButton("=");
ba = new JButton("+");
bs = new JButton("-");
bd = new JButton("/");
bm = new JButton("*");
bc = new JButton("Clear");
be = new JButton(".");
JPanel p = new JPanel();
p.add(l);
p.add(b7);
p.add(b8);
p.add(b9);
p.add(bd);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(bm);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(bs);
p.add(be);
p.add(b0);
p.add(beq);
p.add(ba);
p.add(bc);
add(p);
setSize(200, 220);
setResizable(false);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {new calculator();}
}
