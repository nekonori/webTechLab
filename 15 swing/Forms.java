
// to execute run the following command
// javac -cp ".;jcalendar-1.4.jar" Forms.java && java -cp ".;jcalendar-1.4.jar" Forms
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import javax.swing.*;

public class Forms {
    static String gender;
    static int flag = 1;
    static JFrame f1 = new JFrame();
    static JFrame f2 = new JFrame();
    static JTextField name = new JTextField();
    static JDateChooser dob = new JDateChooser();
    static JCheckBox male = new JCheckBox("Male");
    static JCheckBox female = new JCheckBox("Female");
    static JTextField mail = new JTextField();
    static JTextField mobile = new JTextField();
    static JPasswordField pass = new JPasswordField();
    static JPasswordField rpass = new JPasswordField();
    static String[] courses = { "BE", "B.Tech", "ME", "M.Tech" };
    static JComboBox course = new JComboBox(courses);
    static String[] branches = { "IT", "CT", "EEE", "ECE" };
    static JComboBox branch = new JComboBox(branches);
    static String[] semesters = { "1", "2", "3", "4", "5", "6", "7", "8" };
    static JComboBox semester = new JComboBox(semesters);
    static JButton register = new JButton("Register");

    static void showDetails() {
        JLabel title = new JLabel("Registration Details");
        JLabel detail = new JLabel("<html>Name: &nbsp;" + name.getText().toString() + "<br/>DOB: &nbsp;"
                + dob.getDate().toString() + "<br/>Gender: &nbsp;"
                + gender + "<br/>MailID: &nbsp;" + mail.getText()
                + "<br/>Mobile: &nbsp;" + mobile.getText()
                + "<br/>Password: &nbsp;" + new String(pass.getPassword())
                + "<br/>Course: &nbsp;" + course.getSelectedItem()
                + "<br/>Branch: &nbsp;" + branch.getSelectedItem()
                + "<br/>Semester: &nbsp;" + semester.getSelectedItem() + "</html>", SwingConstants.CENTER);
        title.setBounds(20, 20, 200, 20);
        detail.setBounds(20, 30, 200, 200);
        f2.add(title);
        f2.add(detail);
    }

    public static void main(String[] args) {
        f2.setVisible(false);
        JLabel lregister = new JLabel("Registration");
        JLabel lname = new JLabel("Name");
        JLabel ldob = new JLabel("DOB");
        JLabel lgender = new JLabel("Gender");
        JLabel lmail = new JLabel("Mail ID");
        JLabel lmobile = new JLabel("Mobile No");
        JLabel lpass = new JLabel("Password");
        JLabel lrpass = new JLabel("Re Password");
        JLabel lcourse = new JLabel("Course");
        JLabel lbranch = new JLabel("Branch");
        JLabel lsemester = new JLabel("Semester");

        lregister.setBounds(20, 1, 100, 20);
        lname.setBounds(20, 20, 100, 20);
        ldob.setBounds(20, 50, 100, 20);
        lgender.setBounds(20, 80, 100, 20);
        lmail.setBounds(20, 110, 100, 20);
        lmobile.setBounds(20, 140, 100, 20);
        lpass.setBounds(20, 170, 100, 20);
        lrpass.setBounds(20, 200, 100, 20);
        lcourse.setBounds(20, 230, 100, 20);
        lbranch.setBounds(20, 260, 100, 20);
        lsemester.setBounds(20, 290, 100, 20);

        name.setBounds(140, 20, 100, 20);
        dob.setBounds(140, 50, 100, 20);
        male.setBounds(140, 80, 80, 20);
        male.setActionCommand("male");
        female.setBounds(220, 80, 80, 20);
        female.setActionCommand("female");
        mail.setBounds(140, 110, 100, 20);
        mobile.setBounds(140, 140, 100, 20);
        pass.setBounds(140, 170, 100, 20);
        rpass.setBounds(140, 200, 100, 20);
        course.setBounds(140, 230, 100, 20);
        branch.setBounds(140, 260, 100, 20);
        semester.setBounds(140, 290, 100, 20);
        register.setBounds(140, 320, 100, 20);

        register.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                f1.setVisible(false);
                showDetails();
                f2.setLayout(null);
                f2.setSize(400, 500);
                f2.setVisible(true);
            }
        });

        male.addActionListener(new GenderActionListener());
        female.addActionListener(new GenderActionListener());

        f1.add(lname);
        f1.add(ldob);
        f1.add(lgender);
        f1.add(lmail);
        f1.add(lmobile);
        f1.add(lpass);
        f1.add(lrpass);
        f1.add(lcourse);
        f1.add(lbranch);
        f1.add(lsemester);
        f1.add(lregister);

        f1.add(name);
        f1.add(dob);
        f1.add(male);
        f1.add(female);
        f1.add(mail);
        f1.add(mobile);
        f1.add(pass);
        f1.add(rpass);
        f1.add(course);
        f1.add(branch);
        f1.add(semester);
        f1.add(register);
        f1.setSize(400, 500);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class GenderActionListener implements ActionListener {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            String choice = evt.getActionCommand();
            male.setSelected(choice == "male");
            female.setSelected(choice == "female");
            gender = choice == "male" ? "male" : "female";
        }
    }

}
