package com.sist.temp;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;

public class ControlPanel extends JPanel {
	NewsPanel np = new NewsPanel();
	ChatPanel cp = new ChatPanel();
	FindPanel fp = new FindPanel();
	
	HomePanel hp;
	DetailPanel dp;
	BoardListPenal bp;
	BoardInsertPanel ip;
	BoardDetailPenal bdp;
	
	CardLayout card = new CardLayout();
	public ControlPanel() {
		dp = new DetailPanel(this);
		hp = new HomePanel(this);
		bp = new BoardListPenal(this);
		ip = new BoardInsertPanel(this);
		bdp= new BoardDetailPenal(this);
		
		setLayout(card);
		add("home", hp);
		add("news", np);
		add("chat", cp);
		add("find", fp);
		add("detail", dp);
		add("board", bp);
		add("insert", ip);
		add("bdp", bdp);
	}
}
