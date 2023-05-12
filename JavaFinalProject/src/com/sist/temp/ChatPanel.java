package com.sist.temp;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import com.sist.inter.ChatInterface;

//850 730
public class ChatPanel extends JPanel implements ChatInterface {
	JTextPane pane;
	JTextField tf;
	JButton b1,b2;
	JTable table; //화면 UI
	DefaultTableModel model; //데이터 관리
	JComboBox<String> box;
	/*
	 * 	화면관리 / 데이터관리를 따로하는 프로그램
	 * 	-----	-------
	 * 	view	 Model	==> 연결 (Controller)
	 * 	MVC(Spring)
	 */
	
	public ChatPanel() {
		//초기화
		pane = new JTextPane();
		pane.setEditable(false);
		JScrollPane js1 = new JScrollPane(pane); //스크롤
		tf = new JTextField();
		box = new JComboBox<String>();
		//red => 알림
		box.addItem("black");
		box.addItem("blue");
		box.addItem("yellow");
		box.addItem("green");
		box.addItem("pink");
		box.addItem("orange");
		box.addItem("cyan");
		
		//테이블
		String[] col = {"아이디", "이름", "성별"};
		String[][] row = new String[0][3];
		model = new DefaultTableModel(row, col) {
			@Override
			public boolean isCellEditable(int row, int colum) {
				return false;
			}
		};
		table = new JTable(model);
		JScrollPane js2 = new JScrollPane(table);
		b1 = new JButton("쪽지보내기");
		b2 = new JButton("정보보기");
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		
		//배치
		setLayout(null);
		js1.setBounds(10,15,550,600);
		tf.setBounds(10,620,430,30);
		box.setBounds(445, 620, 115, 30);
		js2.setBounds(570, 15, 230, 250);
		p.setBounds(570, 270, 230, 35);
		add(js1);
		add(tf);
		add(box);
		add(js2);
		add(p);
		
		b1.setEnabled(false);
		b2.setEnabled(false);
		
		
		//이벤트
	}
	
	public void initStyle() {
		Style green = pane.addStyle("green", null);
		StyleConstants.setForeground(green, Color.green);

		Style yellow = pane.addStyle("yellow", null);
		StyleConstants.setForeground(yellow, Color.yellow);

		Style blue = pane.addStyle("blue", null);
		StyleConstants.setForeground(blue, Color.blue);

		Style pink = pane.addStyle("pink", null);
		StyleConstants.setForeground(pink, Color.pink);

		Style orange = pane.addStyle("orange", null);
		StyleConstants.setForeground(orange, Color.orange);

		Style cyan = pane.addStyle("cyan", null);
		StyleConstants.setForeground(cyan, Color.cyan);
	}
	
	public void append(String msg, String color) {
		try {
			Document doc = pane.getDocument();
			doc.insertString(doc.getLength(), msg+"\n", pane.getStyle(color));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
