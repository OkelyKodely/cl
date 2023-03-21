/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author USER
 */
public class Cl {

    JTextField dis = new JTextField();

    JButton equal = new JButton("equal");
    JButton point = new JButton("dot");

    JButton plus = new JButton("plus");
    JButton minus = new JButton("minus");
    JButton mult = new JButton("times");
    JButton div = new JButton("divide");

    JButton c = new JButton("clear");
    JButton sq = new JButton("square");

    JButton shut = new JButton();

    int oper = 0;

    String curr = "";
    String curr2 = "";

    JFrame j = new JFrame();
    JPanel p = new JPanel();
    Graphics g2;

    JButton doe = new JButton("Do");

    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");

    JComboBox exitCb;

    private void calculate(String s) {
        if (s.contains("0")) {
            String leading = dis.getText();
            if (leading.equals("")) {
                dis.setText("0.");
            }
        }
        if (curr2.equals("=") || curr2.equals("")) {
            if (curr2.equals("=")) {
                if (s.contains(".")) {
                    return;
                }
                curr = s;
            }
            if (curr2.equals("") && !curr.contains(".")) {
                curr += s;
            } else if (curr2.equals("") && curr.contains(".")) {
                if (!s.contains(".")) {
                    curr += s;
                } else {
                    return;
                }
            }
            dis.setText(curr);
            curr2 = "";
        }
        if (curr2.equals("+") || curr2.equals("-") || curr2.equals("*") || curr2.equals("/")) {
            if (oper == 1) {
                if (s.contains(".")) {
                    return;
                }
                dis.setText(s);
                oper++;
            } else if (oper > 1) {
                if (!dis.getText().contains(".") && s.contains(".")) {
                    dis.setText(dis.getText() + s);
                    oper++;
                } else if (!s.contains(".")) {
                    dis.setText(dis.getText() + s);
                    oper++;
                }
            }
        }
    }

    private void calc(String s) {
        if (curr2.equals("=") || curr2.equals("")) {
            if (curr2.equals("=")) {
                if (s.contains(".")) {
                    return;
                }
                curr = s;
            }
            if (curr2.equals("") && !curr.contains(".")) {
                curr += s;
            } else if (curr2.equals("") && curr.contains(".")) {
                if (!s.contains(".")) {
                    curr += s;
                } else {
                    return;
                }
            }
            dis.setText(curr);
            curr2 = "";
        }
        if (curr2.equals("+") || curr2.equals("-") || curr2.equals("*") || curr2.equals("/")) {
            if (oper == 1) {
                if (s.contains(".")) {
                    return;
                }
                dis.setText(s);
                oper++;
            } else if (oper > 1) {
                if (!dis.getText().contains(".") && s.contains(".")) {
                    dis.setText(dis.getText() + s);
                    oper++;
                } else if (!s.contains(".")) {
                    dis.setText(dis.getText() + s);
                    oper++;
                }
            }
        }
    }

    public void set() {

        try {
            g2 = p.getGraphics();
            File pathToFile = new File("s.jpg");
            Image image = ImageIO.read(pathToFile);
            g2.drawImage(image, 0, 0, 800, 500, null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }

        j.setExtendedState(JFrame.MAXIMIZED_BOTH);

        String[] es = new String[]{"exit"};
        exitCb = new JComboBox(es);
        p.add(exitCb);
        p.add(doe);
        doe.setBounds(680, 0, 80, 36);
        doe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (((String) exitCb.getSelectedItem()).contains("exit")) {
                    System.exit(0);
                }
            }
        });
        exitCb.setBounds(600, 0, 100, 36);

        p.add(zero);
        p.add(one);
        p.add(two);
        p.add(three);
        p.add(four);
        p.add(five);
        p.add(six);
        p.add(seven);
        p.add(eight);
        p.add(nine);
        p.add(dis);
        p.add(plus);
        p.setBackground(Color.black);
        p.add(minus);
        p.add(equal);
        p.add(point);
        p.add(mult);
        p.add(div);
        JLabel t = new JLabel("Java Swing Calculator");
        t.setForeground(Color.white);
        p.add(t);
        p.add(c);
        p.add(sq);

        t.setBounds(0, 0, 300, 30);

        dis.setBounds(0, 50, 450, 40);
        dis.setHorizontalAlignment(JTextField.RIGHT);

        shut.setBounds(760, 40, 200, 300);

        plus.setBounds(450, 50, 75, 40);
        minus.setBounds(525, 50, 75, 40);
        mult.setBounds(600, 50, 75, 40);
        div.setBounds(675, 50, 75, 40);

        four.setBounds(450, 100, 150, 40);
        five.setBounds(600, 100, 150, 40);
        three.setBounds(300, 100, 150, 40);
        one.setBounds(0, 100, 150, 40);
        two.setBounds(150, 100, 150, 40);

        eight.setBounds(450, 150, 150, 40);
        seven.setBounds(300, 150, 150, 40);
        six.setBounds(150, 150, 150, 40);
        zero.setBounds(0, 150, 150, 40);
        nine.setBounds(600, 150, 150, 40);

        c.setBounds(250, 0, 75, 35);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                curr = "";
                curr2 = "";
                dis.setText("");
                oper = 0;
            }
        });
        sq.setBounds(325, 0, 75, 35);
        equal.setBounds(0, 200, 500, 40);
        point.setBounds(500, 200, 260, 40);

        sq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float g = Float.parseFloat(curr) * Float.parseFloat(curr);
                curr = "" + g;
                dis.setText(curr);
            }
        });

        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc(".");
            }
        });

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc("1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc("2");
            }
        });
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc(".");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc("3");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc("4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc("5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc("6");
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc("7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc("8");
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc("9");
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calc("0");
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (curr.substring(curr.length() - 1, curr.length()).contains(".")) {
                    return;
                }
                curr2 = "+";
                dis.setText("");
                oper = 1;
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (curr.substring(curr.length() - 1, curr.length()).contains(".")) {
                    return;
                }
                curr2 = "-";
                dis.setText("");
                oper = 1;

            }
        });
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (curr.substring(curr.length() - 1, curr.length()).contains(".")) {
                    return;
                }
                curr2 = "*";
                dis.setText("");
                oper = 1;
            }
        });
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (curr.substring(curr.length() - 1, curr.length()).contains(".")) {
                    return;
                }
                curr2 = "/";
                dis.setText("");
                oper = 1;
            }
        });

        dis.setBackground(Color.green);

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (curr2.equals("+")) {
                    float c = Float.parseFloat(curr) + Float.parseFloat(dis.getText());
                    dis.setText("" + c);
                    curr = "" + c;
                    curr2 = "=";
                    oper = 1;
                } else if (curr2.equals("-")) {
                    float c = Float.parseFloat(curr) - Float.parseFloat(dis.getText());
                    dis.setText("" + c);
                    curr = "" + c;
                    curr2 = "=";
                    oper = 1;
                }
                if (curr2.equals("*")) {
                    float c = Float.parseFloat(curr) * Float.parseFloat(dis.getText());
                    dis.setText("" + c);
                    curr = "" + c;
                    curr2 = "=";
                    oper = 1;
                } else if (curr2.equals("/")) {
                    float c = Float.parseFloat(curr) / Float.parseFloat(dis.getText());
                    dis.setText("" + c);
                    curr = "" + c;
                    curr2 = "=";
                    oper = 1;
                }
            }
        });

    }

    public Cl() {

        j.add(p);
        p.setLayout(null);
        j.setBounds(0, 0, 760, 300);
        p.setBounds(j.getBounds());

        j.setVisible(true);

        set();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new Cl();
    }
}
