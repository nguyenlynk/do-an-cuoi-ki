import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm_DG extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginForm_DG() {
        setTitle("Đăng nhập độc giả");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null); // Sử dụng layout null để có thể sử dụng setBounds
        panel.setBackground(new Color(240, 240, 240));

        JLabel usernameLabel = new JLabel("Tên đăng nhập:");
        JLabel passwordLabel = new JLabel("Mật khẩu:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Đăng nhập");
        JButton exitButton = new JButton("Thoát");
        loginButton.setBackground(new Color(102, 204, 255));
        loginButton.setForeground(Color.WHITE);
        exitButton.setBackground(new Color(102, 204, 255));
        exitButton.setForeground(Color.WHITE);

        
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                DocGiaForm();
                dispose();
                // Kiểm tra nếu username là "admin" và password là "admin"
//                if ("admin".equals(username) && "admin".equals(new String(password))) {
                    // Nếu đăng nhập thành công, mở MainForm
                    // Đóng cửa sổ đăng nhập sau khi chuyển đến MainForm
//                }
//                else {
                    // Nếu đăng nhập thất bại, hiển thị thông báo
//                    JOptionPane.showMessageDialog(LoginForm.this, "Đăng nhập thất bại. Vui lòng kiểm tra lại tên đăng nhập và mật khẩu.");
//                }
            }
        });

        // ...

        
        
       exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitForm();
                dispose();
            }
        });
        // Tên đăng nhập
        usernameLabel.setBounds(10, 10, 100, 20);
        usernameField.setBounds(120, 10, 150, 20);

        // Mật khẩu
        passwordLabel.setBounds(10, 40, 100, 20);
        passwordField.setBounds(120, 40, 150, 20);

        // Nút Đăng nhập
        loginButton.setBounds(85, 80, 120, 30);

        //
        exitButton.setBounds(85, 120, 120, 30);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(exitButton);
        add(panel);

        setUIFont(new javax.swing.plaf.FontUIResource("Arial", Font.PLAIN, 14));
        setLocationRelativeTo(null);
    }
    
    public void DocGiaForm() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFormReader().setVisible(true);
            }
        });
    }
    public void exitForm() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WelcomeForm().setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm_DG().setVisible(true);
            }
        });
    }

    private static void setUIFont(javax.swing.plaf.FontUIResource f) {
        UIManager.put("TextField.font", f);
        UIManager.put("PasswordField.font", f);
        UIManager.put("Label.font", f);
        UIManager.put("Button.font", f);
    }
}
