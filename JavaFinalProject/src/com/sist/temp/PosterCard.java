package com.sist.temp;

import javax.swing.*;

import com.sist.common.ImageChange;
import com.sist.manager.GenieMusicVO;

import java.util.*;
import java.awt.*;
import java.net.*;

public class PosterCard extends JPanel {
	JLabel poLa = new JLabel();
	JLabel tLa = new JLabel();
	
	public PosterCard(GenieMusicVO vo) {
		setLayout(null);
		poLa.setBounds(5,5,150,130);
		tLa.setBounds(5, 140, 150, 30);
		
		add(poLa);
		add(tLa);
		
		try {
			URL url = new URL("http:" + vo.getPoster());
			Image img = ImageChange.getImage(new ImageIcon(url), 150, 130);
			
			poLa.setIcon(new ImageIcon(img));
			tLa.setText(vo.getTitle());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
