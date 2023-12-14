import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuanLiDocGia extends JFrame {
    private JTextField maDocGiaField, tenDocGiaField, sdtField, gmailField;
    private JComboBox<String> gioiTinhComboBox;
    private JTable table;

    public QuanLiDocGia() {
        setTitle("Quản lý độc giả");
        setSize(773, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(240, 240, 240));

        // Label và JTextField cho Mã độc giả và Gmail
        JLabel maDocGiaLabel = new JLabel("Mã độc giả:");
        maDocGiaLabel.setForeground(new Color(0, 102, 204)); // Màu chữ
        maDocGiaField = new JTextField();
        JLabel gmailLabel = new JLabel("Gmail:");
        gmailLabel.setForeground(new Color(0, 102, 204));
        gmailField = new JTextField();

        // Label và JTextField cho Tên độc giả và Số điện thoại
        JLabel tenDocGiaLabel = new JLabel("Tên độc giả:");
        tenDocGiaLabel.setForeground(new Color(0, 102, 204));
        tenDocGiaField = new JTextField();
        JLabel sdtLabel = new JLabel("SĐT:");
        sdtLabel.setForeground(new Color(0, 102, 204));
        sdtField = new JTextField();

        // Label và JComboBox cho Giới tính
        JLabel gioiTinhLabel = new JLabel("Giới tính:");
        gioiTinhLabel.setForeground(new Color(0, 102, 204));
        String[] gioiTinhOptions = {"Nam", "Nữ"};
        gioiTinhComboBox = new JComboBox<>(gioiTinhOptions);

        // Nút nhấn
        JButton timKiemButton = new JButton("Search");
        timKiemButton.setBackground(new Color(102, 204, 255)); // Màu nút
        timKiemButton.setForeground(Color.WHITE); // Màu chữ
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

        // Label danh sách người mượn
        JLabel danhSachLabel = new JLabel("Danh sách độc giả:");
        danhSachLabel.setForeground(new Color(0, 102, 204));

        // Tạo JTable
        String[] columnNames = {"Mã độc giả", "Tên độc giả", "Giới tính", "Số điện thoại", "Gmail"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);

        // ScrollPane để hiển thị JTable
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 170, 750, 200);

        // Đặt vị trí và kích thước cho các thành phần
        maDocGiaLabel.setBounds(10, 10, 80, 20);
        maDocGiaField.setBounds(100, 10, 150, 20);
        gmailLabel.setBounds(300, 10, 60, 20);
        gmailField.setBounds(370, 10, 150, 20);

        tenDocGiaLabel.setBounds(10, 40, 80, 20);
        tenDocGiaField.setBounds(100, 40, 150, 20);
        sdtLabel.setBounds(300, 40, 80, 20);
        sdtField.setBounds(370, 40, 150, 20);

        gioiTinhLabel.setBounds(10, 70, 80, 20);
        gioiTinhComboBox.setBounds(100, 70, 150, 20);

        timKiemButton.setBounds(10, 100, 80, 30);
        themButton.setBounds(100, 100, 80, 30);
        suaButton.setBounds(190, 100, 80, 30);
        xoaButton.setBounds(280, 100, 80, 30);
        lamMoiButton.setBounds(370, 100, 100, 30);

        danhSachLabel.setBounds(10, 150, 200, 20);

        // Thêm các thành phần vào panel
        panel.add(maDocGiaLabel);
        panel.add(maDocGiaField);
        panel.add(gmailLabel);
        panel.add(gmailField);

        panel.add(tenDocGiaLabel);
        panel.add(tenDocGiaField);
        panel.add(sdtLabel);
        panel.add(sdtField);

        panel.add(gioiTinhLabel);
        panel.add(gioiTinhComboBox);

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
                new QuanLiDocGia().setVisible(true);
            }
        });
    }
}
