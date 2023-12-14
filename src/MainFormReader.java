import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFormReader extends JFrame {
    public MainFormReader() {
        setTitle("MainForm Độc giả");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(240, 240, 240));

        JLabel welcomeLabel = new JLabel("Chào mừng bạn, Độc giả!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        welcomeLabel.setBounds(50, 20, 300, 30);

        JButton timKiemSachButton = new JButton("Tìm kiếm sách");
        JButton xemPhieuMuonButton = new JButton("Xem phiếu mượn");
        JButton thoatButton = new JButton("Thoát");

        timKiemSachButton.setBackground(new Color(102, 204, 255));
        timKiemSachButton.setForeground(Color.WHITE);
        xemPhieuMuonButton.setBackground(new Color(102, 204, 255));
        xemPhieuMuonButton.setForeground(Color.WHITE);
        thoatButton.setBackground(new Color(102, 204, 255));
        thoatButton.setForeground(Color.WHITE);

        timKiemSachButton.setBounds(50, 70, 150, 30);
        xemPhieuMuonButton.setBounds(210, 70, 150, 30);
        thoatButton.setBounds(50, 120, 310, 30);

        
        
        // Xử lý sự kiện khi nhấn nút "Tìm kiếm sách"
        timKiemSachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openTimKiemSachForm();
            }
        });

        // Xử lý sự kiện khi nhấn nút "Xem phiếu mượn"
        xemPhieuMuonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openXemPhieuMuonForm();
            }
        });

        // Xử lý sự kiện khi nhấn nút "Thoát"
        thoatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitApplication();
                dispose();
            }
        });

        panel.add(welcomeLabel);
        panel.add(timKiemSachButton);
        panel.add(xemPhieuMuonButton);
        panel.add(thoatButton);

        add(panel);

        setLocationRelativeTo(null);
    }

    private void openTimKiemSachForm() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TimKiemSachChoDocGia().setVisible(true);
            }
        });
    }

    private void openXemPhieuMuonForm() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PhieuMuonForm().setVisible(true);
            }
        });
    }

    private void exitApplication() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm_DG().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFormReader().setVisible(true);
            }
        });
    }
}
