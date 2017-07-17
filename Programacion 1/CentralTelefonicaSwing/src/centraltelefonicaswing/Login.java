package centraltelefonicaswing;


import java.awt.*;
import javax.swing.*;


/**
 *
 * @author sauld
 */
public class Login extends JFrame {

    private JTextField _t1;
    private JPasswordField _t2;

    public Login() {
        EjecutarPrograma();

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Login l = new Login();
        l.setVisible(true);
    }

    public void EjecutarPrograma() {
        setSize(300, 500);
        setResizable(false);
        setTitle("Login");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        //Panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.WHITE);

        //Label del Sing ing
        JLabel _l1 = new JLabel("Sign In ");
        Font menuFont = new Font("Tahoma", Font.PLAIN, 18);
        _l1.setFont(menuFont);
        panel.add(_l1);
        c.setLayout(new BorderLayout());
        c.add(panel, BorderLayout.NORTH);

        //Panel 2
        JPanel p = new JPanel();
        p.setBackground(Color.white);
        p.setLayout(null);

        //Separador
        JSeparator s = new JSeparator();
        s.setForeground(Color.red);
        s.setBounds(new Rectangle(15, 0, 255, 20));
        p.add(s);

        //Label del USERNAME
        JLabel _l2 = new JLabel("User Name:");
        Font font = new Font("Tahoma", Font.PLAIN, 14);
        _l2.setFont(font);
        _l2.setBounds(new Rectangle(15, 15, 80, 18));
        p.add(_l2);

        //TexField username
        _t1 = new JTextField();
        _t1.setBounds(new Rectangle(15, 35, 215, 25));
        p.add(_t1);
        
        //Jlabel Pasword
        JLabel _l3 = new JLabel("Password:");
        _l3.setFont(font);
        _l3.setBounds(new Rectangle(15, 65, 80, 18));
        p.add(_l3);
        
        //TexField password
        _t2 = new JPasswordField();
        _t2.setBounds(new Rectangle(15, 85, 215, 25));
        p.add(_t2);
        c.add(p, BorderLayout.CENTER);

    }
}
