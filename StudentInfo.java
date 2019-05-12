import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StudentInfo extends JFrame implements ActionListener {
    private JTextField name, fname, mname, vill, post, stunum, parennum;
    private Container c;
    private JLabel sname, sfname, smname, address, villlabel, postlabel, dislabel, divlabel, stunumlabel, parnumlabel;
    private JComboBox district, divison;
    private String[] dname = {"Rajshahi", "Dhaka", "Khulna", "Meherpur", "Jessore", "Barisal", "Sylhet", "Chittagong"};
    private String[] divname = {"Dhaka", "Khulna", "Rajshahi", "Sylhet", "Rangpur", "Chittagong", "Barissal"};
    private JButton submitbutton, cancelbutton;
    private JRadioButton male, female;
    private ButtonGroup btngroup;
    private Font f;
    StudentInfo() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50, 50, 1200, 800);
        this.setLayout(null);
        c = this.getContentPane();

        //f = new Font("Arial", Font.BOLD,18);
        sname = new JLabel("Student Name");
        sname.setBounds(300, 20, 150, 20);
        name = new JTextField();
        name.setBounds(410, 20, 300, 30);
        c.add(sname);
        c.add(name);

        sfname = new JLabel("Father's Name");
        sfname.setBounds(300, 100, 150, 20);
        fname = new JTextField();
        fname.setBounds(410, 100, 300, 30);
        c.add(sfname);
        c.add(fname);

        smname = new JLabel("Mother's Name");
        smname.setBounds(300, 180, 150, 20);
        mname = new JTextField();
        mname.setBounds(410, 180, 300, 30);
        c.add(smname);
        c.add(mname);

        address = new JLabel("ADDRESS :");
        address.setBounds(300, 260, 150, 20);
        c.add(address);

        villlabel = new JLabel("Village");
        villlabel.setBounds(300, 300, 150, 20);
        vill = new JTextField();
        vill.setBounds(350, 300, 180, 25);
        c.add(villlabel);
        c.add(vill);

        postlabel = new JLabel("Post");
        postlabel.setBounds(570, 300, 150, 20);
        post = new JTextField();
        post.setBounds(605, 300, 180, 25);
        c.add(postlabel);
        c.add(post);

        dislabel = new JLabel("District");
        dislabel.setBounds(300, 350, 180, 25);
        district = new JComboBox(dname);
        district.setBounds(300, 380, 180, 25);
        c.add(dislabel);
        c.add(district);

        divlabel = new JLabel("Division");
        divlabel.setBounds(570, 350, 150, 20);
        divison = new JComboBox(divname);
        divison.setBounds(570, 380, 180, 25);
        c.add(divlabel);
        c.add(divison);

        stunumlabel = new JLabel("Contact Number of Student");
        stunumlabel.setBounds(300, 480, 250, 20);
        stunum = new JTextField();
        stunum.setBounds(500, 480, 250, 20);
        c.add(stunumlabel);
        c.add(stunum);

        parnumlabel = new JLabel("Contact number of Parrent");
        parnumlabel.setBounds(300, 560, 250, 20);
        parennum = new JTextField();
        parennum.setBounds(500, 560, 250, 20);
        c.add(parnumlabel);
        c.add(parennum);

        submitbutton = new JButton("Submit");
        submitbutton.setBounds(300, 640, 100, 30);
        submitbutton.addActionListener(this);
        c.add(submitbutton);

        cancelbutton = new JButton("Cancel");
        cancelbutton.setBounds(500, 640, 100, 30);
        cancelbutton.addActionListener(this);
        c.add(cancelbutton);

        this.setVisible(true);

    }

    public static void main(String[] args) {
        StudentInfo s = new StudentInfo();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submitbutton)
        {
            try
            {
                File file = new File("E:/Java Project/StudentInfo/Student Data.txt");
                FileWriter fout = new FileWriter(file,true);
                fout.append("Student Name: " + name.getText()+ "; " +"Father's name: " +fname.getText()+"; "+"Mother's name: "+mname.getText()+"; "+ "Village: "+vill.getText()+"; "+"Post: "+post.getText()+"; "+"District: "+district.getSelectedItem()+"; "+"Divison: "+divison.getSelectedItem()+"; "+ "Students number: "+stunum.getText()+"; "+"Parents number: "+parennum.getText()+";"+"\r\n");
                fout.close();
                JOptionPane.showMessageDialog(null,"Successfully Done");
                System.exit(0);
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, "Exception :" + e1);;
            }
        }

        if(e.getSource() == cancelbutton)
        {
            System.exit(0);
        }

    }
}