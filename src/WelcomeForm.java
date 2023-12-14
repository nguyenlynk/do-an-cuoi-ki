import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeForm extends JFrame {
	public WelcomeForm() {
		setTitle("Chào mừng đến với Thư viện");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel(null);
		panel.setBackground(new Color(240, 240, 240));

		JLabel titleLabel = new JLabel("Chào mừng đến với Thư viện");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
		titleLabel.setBounds(50, 20, 300, 30);

		JButton adminButton = new JButton("Đăng nhập Admin");
		JButton readerButton = new JButton("Đăng nhập Độc giả");

		adminButton.setBackground(new Color(102, 204, 255));
		adminButton.setForeground(Color.WHITE);
		readerButton.setBackground(new Color(102, 204, 255));
		readerButton.setForeground(Color.WHITE);

		adminButton.setBounds(50, 70, 150, 30);
		readerButton.setBounds(210, 70, 150, 30);

		adminButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openLoginForm("admin");
			}
		});

		readerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openLoginForm_DG();
			}
		});

		panel.add(titleLabel);
		panel.add(adminButton);
		panel.add(readerButton);

		add(panel);

		setLocationRelativeTo(null);
	}

	private void openLoginForm_DG() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LoginForm_DG().setVisible(true);
			}
		});
		dispose();
	}

	private void openLoginForm(String role) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LoginForm().setVisible(true);
			}
		});
		dispose(); // Đóng cửa sổ chào mừng sau khi mở form đăng nhập
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new WelcomeForm().setVisible(true);
			}
		});
	}
}
