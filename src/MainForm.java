import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    public MainForm() {
        setTitle("Trang chủ ");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(240, 240, 240));

        JButton quanLiDocGiaButton = new JButton("Quản lí độc giả");
        quanLiDocGiaButton.setBackground(new Color(102, 204, 255));
        quanLiDocGiaButton.setForeground(Color.WHITE);
        quanLiDocGiaButton.setBounds(50, 30, 150, 30);

        JButton quanLiSachButton = new JButton("Quản lí sách");
        quanLiSachButton.setBackground(new Color(102, 204, 255));
        quanLiSachButton.setForeground(Color.WHITE);
        quanLiSachButton.setBounds(50, 70, 150, 30);

        JButton quanLiPhieuMuonButton = new JButton("Quản lí phiếu mượn");
        quanLiPhieuMuonButton.setBackground(new Color(102, 204, 255));
        quanLiPhieuMuonButton.setForeground(Color.WHITE);
        quanLiPhieuMuonButton.setBounds(50, 110, 150, 30);

        JButton thoatButton = new JButton("Thoát");
        thoatButton.setBackground(new Color(102, 204, 255));
        thoatButton.setForeground(Color.WHITE);
        thoatButton.setBounds(50, 150, 150, 30);

        // Xử lý sự kiện khi nhấn các nút
        quanLiDocGiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openQuanLiDocGiaForm();
            }
        });

        quanLiSachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openQuanLiSachForm();
            }
        });

        quanLiPhieuMuonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openQuanLiPhieuMuonForm();
            }
        });

        thoatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitApplication();
                dispose();
            }
        });

        panel.add(quanLiDocGiaButton);
        panel.add(quanLiSachButton);
        panel.add(quanLiPhieuMuonButton);
        panel.add(thoatButton);

        add(panel);

        setLocationRelativeTo(null);
    }

    private void openQuanLiDocGiaForm() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuanLiDocGia().setVisible(true);
            }
        });
    }

    private void openQuanLiSachForm() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuanLiSach().setVisible(true);
            }
        });
    }

    private void openQuanLiPhieuMuonForm() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuanLiPhieuMuon().setVisible(true);
            }
        });
    }

    private void exitApplication() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
}
