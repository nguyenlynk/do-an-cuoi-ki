
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuanLiPhieuMuon extends JFrame {
    private JTextField maPhieuMuonField, ngayMuonField, hanTraField, maSachField, maDocGiaField, ngayTraField;
    private JTable table;

    public QuanLiPhieuMuon() {
        setTitle("Quản lý phiếu mượn");
        setSize(773, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(240, 240, 240));

        // Label và JTextField cho Mã phiếu mượn và Ngày mượn
        JLabel maPhieuMuonLabel = new JLabel("Mã phiếu mượn:");
        maPhieuMuonLabel.setForeground(new Color(0, 102, 204));
        maPhieuMuonField = new JTextField();
        JLabel ngayMuonLabel = new JLabel("Ngày mượn:");
        ngayMuonLabel.setForeground(new Color(0, 102, 204));
        ngayMuonField = new JTextField();

        // Label và JTextField cho Hạn trả và Mã sách
        JLabel hanTraLabel = new JLabel("Hạn trả:");
        hanTraLabel.setForeground(new Color(0, 102, 204));
        hanTraField = new JTextField();
        JLabel maSachLabel = new JLabel("Mã sách:");
        maSachLabel.setForeground(new Color(0, 102, 204));
        maSachField = new JTextField();

        // Label và JTextField cho Mã người mượn và Ngày trả
        JLabel maDocGiaLabel = new JLabel("Mã người mượn:");
        maDocGiaLabel.setForeground(new Color(0, 102, 204));
        maDocGiaField = new JTextField();
        JLabel ngayTraLabel = new JLabel("Ngày trả:");
        ngayTraLabel.setForeground(new Color(0, 102, 204));
        ngayTraField = new JTextField();

        // Nút nhấn
        JButton timKiemButton = new JButton("Search");
        timKiemButton.setBackground(new Color(102, 204, 255));
        timKiemButton.setForeground(Color.WHITE);
        JButton themButton = new JButton("Add");
        themButton.setBackground(new Color(102, 204, 255));
        themButton.setForeground(Color.WHITE);
        JButton suaButton = new JButton("Edit");
        suaButton.setBackground(new Color(102, 204, 255));
        suaButton.setForeground(Color.WHITE);
        JButton xoaButton = new JButton("Delete");
        xoaButton.setBackground(new Color(102, 204, 255));
        xoaButton.setForeground(Color.WHITE);
        JButton lamMoiButton = new JButton("Refresh");
        lamMoiButton.setBackground(new Color(102, 204, 255));
        lamMoiButton.setForeground(Color.WHITE);

        // Label danh sách phiếu mượn
        JLabel danhSachLabel = new JLabel("Danh sách phiếu mượn:");
        danhSachLabel.setForeground(new Color(0, 102, 204));

        // Tạo JTable
        String[] columnNames = {"Mã phiếu mượn", "Ngày mượn", "Hạn trả", "Mã sách", "Mã người mượn", "Ngày trả"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);

        // ScrollPane để hiển thị JTable
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 170, 750, 200);

        // Đặt vị trí và kích thước cho các thành phần
        maPhieuMuonLabel.setBounds(10, 10, 120, 20);
        maPhieuMuonField.setBounds(140, 10, 150, 20);
        ngayMuonLabel.setBounds(300, 10, 80, 20);
        ngayMuonField.setBounds(390, 10, 150, 20);

        hanTraLabel.setBounds(10, 40, 80, 20);
        hanTraField.setBounds(140, 40, 150, 20);
        maSachLabel.setBounds(300, 40, 80, 20);
        maSachField.setBounds(390, 40, 150, 20);

        maDocGiaLabel.setBounds(10,70, 120, 20);
        maDocGiaField.setBounds(140, 70, 150, 20);
        ngayTraLabel.setBounds(300, 70, 80, 20);
        ngayTraField.setBounds(390, 70, 150, 20);

        timKiemButton.setBounds(10, 100, 80, 30);
        themButton.setBounds(100, 100, 80, 30);
        suaButton.setBounds(190, 100, 80, 30);
        xoaButton.setBounds(280, 100, 80, 30);
        lamMoiButton.setBounds(370, 100, 100, 30);

        danhSachLabel.setBounds(10, 150, 200, 20);

        // Thêm các thành phần vào panel
        panel.add(maPhieuMuonLabel);
        panel.add(maPhieuMuonField);
        panel.add(ngayMuonLabel);
        panel.add(ngayMuonField);

        panel.add(hanTraLabel);
        panel.add(hanTraField);
        panel.add(maSachLabel);
        panel.add(maSachField);

        panel.add(maDocGiaLabel);
        panel.add(maDocGiaField);
        panel.add(ngayTraLabel);
        panel.add(ngayTraField);

        panel.add(timKiemButton);
        panel.add(themButton);
        panel.add(suaButton);
        panel.add(xoaButton);
        panel.add(lamMoiButton);

        panel.add(danhSachLabel);

        // Thêm JScrollPane và JTable vào panel
        panel.add(scrollPane);

        add(panel);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuanLiPhieuMuon().setVisible(true);
            }
        });
    }
}
