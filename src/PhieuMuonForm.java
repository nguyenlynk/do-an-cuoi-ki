import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhieuMuonForm extends JFrame {
    private JTextField maPhieuField, ngayMuonField, hanTraField, maSachField;
    private JButton muonButton, traButton, xemDanhSachButton, thoatButton;

    public PhieuMuonForm() {
        setTitle("Phiếu Mượn");
        setSize(410, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(240, 240, 240));

        JLabel maPhieuLabel = new JLabel("Mã phiếu:");
        maPhieuField = new JTextField();

        JLabel ngayMuonLabel = new JLabel("Ngày mượn:");
        ngayMuonField = new JTextField();

        JLabel hanTraLabel = new JLabel("Hạn trả:");
        hanTraField = new JTextField();

        JLabel maSachLabel = new JLabel("Mã sách:");
        maSachField = new JTextField();

        muonButton = new JButton("Mượn sách");
        traButton = new JButton("Trả sách");
        xemDanhSachButton = new JButton("Xem danh sách mượn");
        thoatButton = new JButton("Thoát");

        muonButton.setBackground(new Color(102, 204, 255));
        muonButton.setForeground(Color.WHITE);
        traButton.setBackground(new Color(102, 204, 255));
        traButton.setForeground(Color.WHITE);
        xemDanhSachButton.setBackground(new Color(102, 204, 255));
        xemDanhSachButton.setForeground(Color.WHITE);
        thoatButton.setBackground(new Color(102, 204, 255));
        thoatButton.setForeground(Color.WHITE);

        // Đặt vị trí và kích thước cho các thành phần
        maPhieuLabel.setBounds(10, 10, 80, 20);
        maPhieuField.setBounds(100, 10, 150, 20);

        ngayMuonLabel.setBounds(10, 40, 80, 20);
        ngayMuonField.setBounds(100, 40, 150, 20);

        hanTraLabel.setBounds(10, 70, 80, 20);
        hanTraField.setBounds(100, 70, 150, 20);

        maSachLabel.setBounds(10, 100, 80, 20);
        maSachField.setBounds(100, 100, 150, 20);

        muonButton.setBounds(10, 130, 120, 30);
        traButton.setBounds(140, 130, 120, 30);
        xemDanhSachButton.setBounds(270, 130, 120, 30);
        thoatButton.setBounds(100, 175, 120, 30);

        // Xử lý sự kiện khi nhấn nút "Mượn sách"
        muonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                muonSach();
            }
        });

        // Xử lý sự kiện khi nhấn nút "Trả sách"
        traButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                traSach();
            }
        });

        // Xử lý sự kiện khi nhấn nút "Xem danh sách mượn"
        xemDanhSachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xemDanhSachMuon();
            }
        });

        // Xử lý sự kiện khi nhấn nút "Thoát"
        thoatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thoat();
                dispose(); 
            }
        });

        // Thêm các thành phần vào panel
        panel.add(maPhieuLabel);
        panel.add(maPhieuField);
        panel.add(ngayMuonLabel);
        panel.add(ngayMuonField);
        panel.add(hanTraLabel);
        panel.add(hanTraField);
        panel.add(maSachLabel);
        panel.add(maSachField);
        panel.add(muonButton);
        panel.add(traButton);
        panel.add(xemDanhSachButton);
        panel.add(thoatButton);

        add(panel);

        setLocationRelativeTo(null);
    }

    private void muonSach() {
        // Xử lý sự kiện khi nhấn nút "Mượn sách"
        JOptionPane.showMessageDialog(this, "Đã mượn sách.");
    }

    private void traSach() {
        // Xử lý sự kiện khi nhấn nút "Trả sách"
        JOptionPane.showMessageDialog(this, "Đã trả sách.");
    }

    private void xemDanhSachMuon() {
        // Xử lý sự kiện khi nhấn nút "Xem danh sách mượn"
        JOptionPane.showMessageDialog(this, "Danh sách sách đã mượn.");
    }

    private void thoat() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFormReader().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PhieuMuonForm().setVisible(true);
            }
        });
    }
}
