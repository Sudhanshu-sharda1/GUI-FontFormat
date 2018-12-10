import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

public class FormatFont extends JFrame {

	private JTextField textField;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private ButtonGroup buttonGroup_1 = new ButtonGroup();
	private ButtonGroup buttonGroup_2 = new ButtonGroup();

	public FormatFont() {
		setTitle("FORMAT TEXT");
		setBounds(new Rectangle(800, 250, 550, 500));
		getContentPane().setLayout(null);

		JLabel lblText = new JLabel("Text");
		lblText.setFont(new Font("Arial", Font.PLAIN, 20));
		lblText.setBounds(64, 33, 68, 22);
		getContentPane().add(lblText);

		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setBounds(144, 26, 322, 46);
		getContentPane().add(textField);
		textField.setColumns(10);

		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setBorder(new TitledBorder(null, "Font Name", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setForeground(Color.BLACK);
		panel.setBounds(28, 85, 170, 148);
		getContentPane().add(panel);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Courier");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.setActionCommand("Courier New");
		rdbtnNewRadioButton_1.setFont(new Font("Courier New", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(10, 24, 107, 25);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("SansSerif");
		rdbtnNewRadioButton_2.setActionCommand("SansSerif");
		rdbtnNewRadioButton_2.setFont(new Font("SansSerif", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBounds(10, 54, 107, 25);
		rdbtnNewRadioButton_2.setHorizontalAlignment(SwingConstants.LEFT);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Arial");
		rdbtnNewRadioButton_3.setActionCommand("Arial");
		rdbtnNewRadioButton_3.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnNewRadioButton_3.setBounds(10, 84, 83, 25);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Proxy I");
		rdbtnNewRadioButton.setActionCommand("Perpetua Titling MT");
		rdbtnNewRadioButton.setFont(new Font("Perpetua Titling MT", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(10, 114, 93, 25);

		buttonGroup.add(rdbtnNewRadioButton_2);
		buttonGroup.add(rdbtnNewRadioButton_1);
		buttonGroup.add(rdbtnNewRadioButton_3);
		buttonGroup.add(rdbtnNewRadioButton);

		panel.setLayout(null);
		panel.add(rdbtnNewRadioButton_1);
		panel.add(rdbtnNewRadioButton_2);
		panel.add(rdbtnNewRadioButton_3);
		panel.add(rdbtnNewRadioButton);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Font Style", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(28, 261, 172, 124);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Bold");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(8, 27, 73, 25);
		panel_1.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Italics");
		chckbxNewCheckBox_1.setFont(new Font("Arial", Font.ITALIC, 14));
		chckbxNewCheckBox_1.setBounds(8, 57, 95, 25);
		panel_1.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Regular");
		chckbxNewCheckBox_2.setFont(new Font("Arial", Font.PLAIN, 14));
		chckbxNewCheckBox_2.setBounds(8, 87, 112, 25);
		panel_1.add(chckbxNewCheckBox_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Colour", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(273, 109, 141, 98);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JRadioButton rdbtnRed = new JRadioButton("Red");
		rdbtnRed.setActionCommand("RED");
		rdbtnRed.setForeground(Color.RED);
		rdbtnRed.setSelected(true);
		rdbtnRed.setFont(new Font("Arial", Font.PLAIN, 14));
		buttonGroup_1.add(rdbtnRed);
		rdbtnRed.setBounds(10, 25, 82, 25);
		panel_2.add(rdbtnRed);

		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Green");
		rdbtnNewRadioButton_4.setActionCommand("GREEN");
		rdbtnNewRadioButton_4.setForeground(Color.GREEN);
		rdbtnNewRadioButton_4.setFont(new Font("Arial", Font.PLAIN, 14));
		buttonGroup_1.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(10, 55, 82, 25);
		panel_2.add(rdbtnNewRadioButton_4);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Size", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(273, 232, 193, 148);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("10");
		rdbtnNewRadioButton_6.setSelected(true);
		rdbtnNewRadioButton_6.setActionCommand("10");
		rdbtnNewRadioButton_6.setFont(new Font("Arial", Font.BOLD, 10));
		buttonGroup_2.add(rdbtnNewRadioButton_6);
		rdbtnNewRadioButton_6.setBounds(10, 32, 43, 25);
		panel_3.add(rdbtnNewRadioButton_6);

		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("20");
		rdbtnNewRadioButton_7.setActionCommand("20");
		rdbtnNewRadioButton_7.setFont(new Font("Arial", Font.PLAIN, 20));
		buttonGroup_2.add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.setBounds(10, 72, 63, 25);
		panel_3.add(rdbtnNewRadioButton_7);

		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("30");
		rdbtnNewRadioButton_5.setActionCommand("30");
		rdbtnNewRadioButton_5.setFont(new Font("Arial", Font.PLAIN, 30));
		buttonGroup_2.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setBounds(10, 114, 63, 25);
		panel_3.add(rdbtnNewRadioButton_5);

		JButton btnSubmit = new JButton("Apply Format");
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				String fontName = buttonGroup.getSelection().getActionCommand();
				String fontSize = buttonGroup_2.getSelection().getActionCommand();
				String colour = buttonGroup_1.getSelection().getActionCommand();

				int fs;
				if (fontSize == null)
					fs = 10;
				else
					fs = Integer.parseInt(fontSize);

				int fontStyle;
				if (chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected())
					fontStyle = Font.BOLD + Font.ITALIC;
				else if (chckbxNewCheckBox.isSelected())
					fontStyle = Font.BOLD;
				else if (chckbxNewCheckBox_1.isSelected())
					fontStyle = Font.ITALIC;
				else
					fontStyle = Font.PLAIN;

				Font textFont = new Font(fontName, fontStyle, fs);
				textField.setFont(textFont);

				if (colour.equals("RED"))
					textField.setForeground(Color.RED);
				else if (colour.equals("GREEN"))
					textField.setForeground(Color.GREEN);
				else
					textField.setForeground(Color.BLACK);
			}
		});
		btnSubmit.setBounds(362, 416, 125, 25);
		getContentPane().add(btnSubmit);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				textField.setFont(new Font("Arial", Font.PLAIN, 15));
				textField.setForeground(Color.BLACK);
			}
		});
		btnReset.setBounds(220, 416, 97, 25);
		getContentPane().add(btnReset);

		setVisible(true);
	}

	public static void main(String args[]) {
		FormatFont ob = new FormatFont();
	}
}
