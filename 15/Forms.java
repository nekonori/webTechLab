/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forms;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Prasath Karthiban
 */
public class Forms {

    /**
     * @param args the command line arguments
     */
    static String gender;
    static int flag=1;
    static JFrame f1=new JFrame();
    static JFrame f2=new JFrame();
    static JTextField name=new JTextField();
    static JDateChooser dob=new JDateChooser();
    static JCheckBox male=new JCheckBox("Male");
    static JCheckBox female=new JCheckBox("Female");
    static JTextField mail=new JTextField();
    static JTextField mobile=new JTextField();
    static JPasswordField pass=new JPasswordField();
    static JPasswordField rpass=new JPasswordField();
    static String[] courses={"BE","B.Tech","ME","M.Tech"};
    static JComboBox course=new JComboBox(courses);
    static String[] branches={"IT","CT","EEE","ECE"};
    static JComboBox branch=new JComboBox(branches);
    static String[] semesters={"1","2","3","4","5","6","7","8"};
    static JComboBox semester=new JComboBox(semesters);
    static JButton register=new JButton("Register");
                                     

    
    static void showDetails(){
        JLabel title=new JLabel("Registration Details");
        JLabel detail=new JLabel("<html>Name-->"+name.getText().toString()+"<br/>DOB-->"
        +dob.getDate().toString()+"<br/>Gender-->"
        +gender+"<br/>MailID-->"+mail.getText()
        +"<br/>Mobile-->"+mobile.getText()
        +"<br/>Password-->"+pass.getPassword()
        +"<br/>Course-->"+course.getSelectedItem()
        +"<br/>Branch-->"+branch.getSelectedItem()
        +"<br/>Semester-->"+semester.getSelectedItem()+"</html>",SwingConstants.CENTER);
        title.setBounds(20,20,200,20);
        detail.setBounds(20,30,200,200);
        f2.add(title);
        f2.add(detail);
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        f2.setVisible(false);
        JLabel lregister=new JLabel("Registration");
        JLabel lname=new JLabel("Name");
        JLabel ldob=new JLabel("DOB");
        JLabel lgender=new JLabel("Gender");
        JLabel lmail=new JLabel("Mail ID");
        JLabel lmobile=new JLabel("Mobile No");
        JLabel lpass=new JLabel("Password");
        JLabel lrpass=new JLabel("Re Password");
        JLabel lcourse=new JLabel("Course");
        JLabel lbranch=new JLabel("Branch");
        JLabel lsemester=new JLabel("Semester");
        
        
        
        lregister.setBounds(20,1,100,20);
        lname.setBounds(20,20,100,20);
        ldob.setBounds(20,50,100,20);
        lgender.setBounds(20,80,100,20);
        lmail.setBounds(20,110,100,20);
        lmobile.setBounds(20,140,100,20);
        lpass.setBounds(20,170,100,20);
        lrpass.setBounds(20,200,100,20);
        lcourse.setBounds(20,230,100,20);
        lbranch.setBounds(20,260,100,20);
        lsemester.setBounds(20,290,100,20);
        
        
        name.setBounds(140,20,100,20);
        dob.setBounds(140,50,100,20);
        male.setBounds(140,80,80,20);
        female.setBounds(220,80,80,20);
        mail.setBounds(140,110,100,20);
        mobile.setBounds(140,140,100,20);
        pass.setBounds(140,170,100,20);
        rpass.setBounds(140,200,100,20);
        course.setBounds(140,230,100,20);
        branch.setBounds(140,260,100,20);
        semester.setBounds(140,290,100,20);
        register.setBounds(140,320,100,20);
        
        register.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
            f1.setVisible(false);
            showDetails();
            f2.setLayout(null);
            f2.setSize(400,500);
            f2.setVisible(true);
            }
        });
        male.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
            if(flag==1){
                female.setSelected(false);
                male.setSelected(true);
                gender="male";
            }
            else{
                flag=0;
                male.setSelected(true);
                gender="male";
            }
            }
        });
        
        female.addActionListener(new ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
            if(flag==1){
                male.setSelected(false);
                female.setSelected(true);
                gender="female";
            }
            else{
                flag=0;
                female.setSelected(true);
                gender="female";
            }
        } 
        });
        
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
        f1.setSize(400,500);
        f1.setLayout(null);
        f1.setVisible(true);
    }
    
}
