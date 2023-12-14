import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimKiemSachChoDocGia extends JFrame {
    private JTextField maSachField, tenSachField, tacGiaField, namXBField;
    private JComboBox<String> theLoaiComboBox;
    private JTable table;

    public TimKiemSachChoDocGia() {
        setTitle("Tìm Kiếm Sách Cho Độc Giả");
        setSize(773, 420);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(null);
        panel.setBackground(new Color(240, 240, 240));

        // Label và JTextField cho Mã sách và Tên sách
        JLabel maSachLabel = new JLabel("Mã sách:");
        maSachLabel.setForeground(new Color(0, 102, 204));
        maSachField = new JTextField();
        JLabel tenSachLabel = new JLabel("Tên sách:");
        tenSachLabel.setForeground(new Color(0, 102, 204));
        tenSachField = new JTextField();

        // Label và JTextField cho Tác giả và Năm xuất bản
        JLabel tacGiaLabel = new JLabel("Tác giả:");
        tacGiaLabel.setForeground(new Color(0, 102, 204));
        tacGiaField = new JTextField();
        JLabel namXBLabel = new JLabel("Năm xuất bản:");
        namXBLabel.setForeground(new Color(0, 102, 204));
        namXBField = new JTextField();

        // Label và JComboBox cho Thể loại
        JLabel theLoaiLabel = new JLabel("Thể loại:");
        theLoaiLabel.setForeground(new Color(0, 102, 204));
        String[] theLoaiOptions = {"Tiểu thuyết", "Kinh tế", "Khoa học", "Văn hóa"};
        theLoaiComboBox = new JComboBox<>(theLoaiOptions);

        // Nút nhấn
        JButton timKiemButton = new JButton("Search");
        timKiemButton.setBackground(new Color(102, 204, 255));
        timKiemButton.setForeground(Color.WHITE);
        JButton thoatButton = new JButton("Exit");
        thoatButton.setBackground(new Color(102, 204, 255));
        thoatButton.setForeground(Color.WHITE);

        thoatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	openMainFormReader();
            	dispose();
            }
        });

        // Label danh sách sách
        JLabel danhSachLabel = new JLabel("Danh sách sách:");
        danhSachLabel.setForeground(new Color(0, 102, 204));

        // Tạo JTable
        String[] columnNames = {"Mã sách", "Tên sách", "Tác giả", "Năm xuất bản", "Thể loại"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);

        // ScrollPane để hiển thị JTable
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10, 170, 750, 200);

        // Đặt vị trí và kích thước cho các thành phần
        maSachLabel.setBounds(10, 10, 80, 20);
        maSachField.setBounds(100, 10, 150, 20);
        tenSachLabel.setBounds(300, 10, 60, 20);
        tenSachField.setBounds(370, 10, 150, 20);

        tacGiaLabel.setBounds(10, 40, 80, 20);
        tacGiaField.setBounds(100, 40, 150, 20);
        namXBLabel.setBounds(300, 40, 80, 20);
        namXBField.setBounds(380, 40, 150, 20);

        theLoaiLabel.setBounds(10, 70, 80, 20);
        theLoaiComboBox.setBounds(100, 70, 150, 20);

        timKiemButton.setBounds(10, 100, 80, 30);
        thoatButton.setBounds(100, 100, 80, 30);

        danhSachLabel.setBounds(10, 150, 200, 20);

        // Thêm các thành phần vào panel
        panel.add(maSachLabel);
        panel.add(maSachField);
        panel.add(tenSachLabel);
        panel.add(tenSachField);

        panel.add(tacGiaLabel);
        panel.add(tacGiaField);
        panel.add(namXBLabel);
        panel.add(namXBField);

        panel.add(theLoaiLabel);
        panel.add(theLoaiComboBox);

        panel.add(timKiemButton);
        panel.add(thoatButton);


        panel.add(danhSachLabel);

        // Thêm JScrollPane và JTable vào panel
        panel.add(scrollPane);

        add(panel);

        setLocationRelativeTo(null);
    }
    public void openMainFormReader() {
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
                new TimKiemSachChoDocGia().setVisible(true);
            }
        });
    }
}
