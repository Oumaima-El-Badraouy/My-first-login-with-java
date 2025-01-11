import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Signin extends JFrame {
    private JTextField txtUsername;
    private JTextField password,Email;
    private JButton btnSignin,btnClose;
    private JLabel lblUsername,lblPassword,lblEmail;
    public  Signin(){
        setTitle("sign in");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,500);
        setLocationRelativeTo(null);
        setLayout(null);
        Email=new JTextField();
        lblEmail=new JLabel("your Email : ");
        txtUsername = new JTextField();
        password=new JPasswordField();
        lblUsername= new JLabel("your name : ");
        lblPassword= new JLabel("your password : ");
        btnClose = new JButton("CLOSE");
        btnSignin = new JButton("SIGNIN");

        lblUsername.setBounds(20,120,260,20);

        txtUsername.setBounds(20,160,260,20);

        lblPassword.setBounds(20,180,260,20);

        password.setBounds(20,210,260,20);
        lblEmail.setBounds(20,240,260,20);

        Email.setBounds(20,260,260,20);

        btnClose.setBounds(20,300,100,20);

        btnSignin.setBounds(140,300,100,20);





        add(lblUsername);
        add(txtUsername);
        add(lblPassword);
        add(password);
        add(lblEmail);
        add(Email);
        add(btnClose);
        add(btnSignin);

        setVisible(true);



        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnSignin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Username = txtUsername.getText();
                String passworde = password.getText();
                String txtEmail= Email.getText();
                String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(txtEmail);
                System.out.println(matcher.matches());

                if (Username.equalsIgnoreCase("Admin")) {
                    if (txtEmail.equalsIgnoreCase("Admin@gmail.com")) {
                        if (passworde.equals("Ouma1234")) {
                            showmessage("Welcome, Admin!");
                        } else {
                            showmessage("Password is incorrect.");
                        }
                    } else {
                        showmessage("Email is incorrect.");
                    }
                } else {
                    showmessage("Username is incorrect.");
                }
            }
        });
    }
    public void showmessage(String msg){
        JOptionPane.showMessageDialog(this,msg,"Application ",JOptionPane.ERROR_MESSAGE);
    }
}
