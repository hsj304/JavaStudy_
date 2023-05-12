package com.sist.temp;
import java.awt.*; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.script.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.GenieMusicVO;
import com.sist.manager.MusicSystem;

import java.util.*;
import java.util.List;
import java.io.*;
import java.net.*;

/*
 * 프로그램 => 2개
 * 1)로그인, 채팅문자열 입력 ... 일반 사용자
 * 2)서버에서 전송되는 데이터를 출력
 * 	 ---------------------- Thread
 */

//메뉴 왼쪽 배치
public class NetworkMain extends JFrame implements ActionListener,Runnable,MouseListener {
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JLabel logo;
	JButton b1,b2,b3,b4,b5,b6;
	Login login= new Login();
	//페이지 지정
	int curpage=1;
	int totalpage=0;
	MusicSystem ms = new MusicSystem();
	
	//네트워크 관련 클래스
	//서버연결 => 연결기기
	Socket s; //서버의 메모리 연결
	//서버에서 보내준 값을 받는다
	BufferedReader in;
	//서버로 값을 전송
	OutputStream out;
	//ID 저장
	String myId;
	int selectRow=-1;
	//쪽지보내기
	SendMessage sm = new SendMessage();
	RecvMessage rm = new RecvMessage();
	
	public NetworkMain() {
		logo = new JLabel();
		Image img = ImageChange.getImage(new ImageIcon("c:\\java_datas\\label.jpg"), 80, 80);
		
		logo.setIcon(new ImageIcon(img));
		mp = new MenuPanel();
		cp = new ControlPanel();
		tp = new TopPanel();
		
		setLayout(null); // Layout없이 직접 배치
		logo.setBounds(10, 15, 80, 80);
		mp.setBounds(10, 100, 80, 200);
		cp.setBounds(100, 15, 850, 780);
		tp.setBounds(980, 15, 200, 730);
		
		b1=new JButton("홈");
		b2=new JButton("뮤직검색");
		b3=new JButton("채팅");
		b4=new JButton("뉴스검색");
		b5=new JButton("커뮤니티");
		b6=new JButton("나가기");
		mp.setLayout(new GridLayout(6,1,10,10));
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		mp.add(b6);
		
		//추가
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		setSize(1200, 850);
		setVisible(false);
		//종료
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setTitle("네트워크 뮤직 프로그램");
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		//채팅
		cp.cp.tf.addActionListener(this);
		
		
		
		musicDisplay();
		cp.hp.b1.addActionListener(this);//이전
		cp.hp.b2.addActionListener(this);//다음
		
		cp.cp.b1.addActionListener(this);//쪽지보내기
		cp.cp.b2.addActionListener(this);//정보 보기
		cp.cp.table.addMouseListener(this);//
		
		//쪽지 보내기
		sm.b1.addActionListener(this);
		sm.b2.addActionListener(this);
		rm.b1.addActionListener(this);
		rm.b2.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			
		}
		
		new NetworkMain();
	}
	
	public void musicDisplay() {
		totalpage = ms.musicTotalPage();
		
		List<GenieMusicVO> list = ms.musicListData(curpage);
		
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		cp.hp.pageLa.setText(curpage + " page / " + totalpage + " pages");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			curpage=1;
			musicDisplay();
			cp.card.show(cp, "home");
		} else if(e.getSource() == b2) {
			cp.card.show(cp, "find");
		} else if(e.getSource() == b3) {
			cp.card.show(cp, "chat");
		} else if(e.getSource() == b4) {
			cp.card.show(cp, "news");
			
		} else if(e.getSource() == b5) {
			cp.card.show(cp, "board");
		} else if(e.getSource() == login.b1) {
			String id=login.tf1.getText();
			if(id.length() < 1) {
				JOptionPane.showMessageDialog(this, "ID를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String name=login.tf2.getText();
			if(name.length() < 1) {
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String sex="남자";
			if(login.rb1.isSelected()) {
				sex="남자";
			} else {
				sex="여자";
			}
			
			//서버로 전송
			try {
				//서버 연결
				s=new Socket("211.238.142.111", 11111);
				//서버 컴퓨터 => IP
				//211.238.142.()
				//읽는 위치 / 쓰는 위치
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				//s는 서버 메모리 => 서버 메모리로부터 값을 읽어 온다
				out=s.getOutputStream();
				//서버에서 읽어 갈 수 있게 메모리에 저장
				
				//서버로 로그인 요청
				out.write((Function.LOGIN + "|" + id +"|" + name + "|" + sex + "\n").getBytes());
			} catch (Exception e2) {
				// TODO: handle exception
			}
			//서버로부터 전송된 값을 받아 온다
			new Thread(this).start(); // run()호출
			
		} else if(e.getSource() == login.b2) {
			System.exit(0);
		} else if(e.getSource() == cp.cp.tf) {
			String msg = cp.cp.tf.getText();
			String color = cp.cp.box.getSelectedItem().toString();
			
			if(msg.length() <1) return;
			
			try {
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			cp.cp.tf.setText("");
		} else if(e.getSource() == cp.hp.b1) {
			if(curpage > 1) {
				curpage--;
				musicDisplay();
			}
		} else if(e.getSource() == cp.hp.b2) {
			if(curpage < totalpage) {
				curpage++;
				musicDisplay();
			}
		} else if (e.getSource() == cp.cp.b2) {
			//정보 보기
			if(selectRow==-1) {
				JOptionPane.showMessageDialog(this, "정보 볼 대상을 선택하세요");
				return;
			}
			//선택된 경우
			String youId=cp.cp.table.getValueAt(selectRow, 0).toString();
			try {
				//선택된 id의 정보요청(서버요청)
				out.write((Function.INFO+"|"+youId+"\n").getBytes());
				//out.write => 서버요청 ==> \n포함되야 된다
				//처리 => 서버 => 결과값을 받아서 클라이언트에서 출력
			} catch (Exception e2) {
				// TODO: handle exception
			}
		} else if (e.getSource() == cp.cp.b1) {
			//쪽지보내기
			sm.ta.setText("");
			String youId = cp.cp.table.getValueAt(selectRow, 0).toString();
			sm.tf.setText(youId);
			sm.setVisible(true);
		} else if(e.getSource() == sm.b2) { 
			sm.setVisible(false);
		} else if(e.getSource() == rm.b2) {
			rm.setVisible(false);
		} else if(e.getSource() == sm.b1) {
			String youId = sm.tf.getText();
			String msg = sm.ta.getText();
			if(msg.length()<1) {
				sm.ta.requestFocus();
				return;
			}
			try {
				out.write((Function.MSGSEND+"|"+youId+"|"+msg+"\n").getBytes());
			} catch (Exception e2) {
				// TODO: handle exception
			}
			sm.setVisible(false);
		} else if(e.getSource() == rm.b1) {
			sm.tf.setText(rm.tf.getText());
			sm.ta.setText("");
			sm.setVisible(true);
			rm.setVisible(false);
		} else if(e.getSource()==b6) {
			try
			{
				out.write((Function.EXIT+"|"+myId+"\n").getBytes());
			}catch(Exception ex){}
		}
		
	}

	//서버에서 결과값을 받아서 출력
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				String msg = in.readLine();
				//서버에서 보낸 값
				StringTokenizer st = new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch (protocol) {
				//서버에서 로그인이 들어온 경우
				//LOGIN => 테이블에 정보를 출력한다
				case Function.LOGIN: {
					String[] data = { st.nextToken(),
									st.nextToken(),
									st.nextToken()
					};
					cp.cp.model.addRow(data);
				}
				// C/S -> 모든 명령이 서버로부터 받아서 처리
				// MYLOG => 로그인 종료하고 메인창을 보여준다
				break;
				case Function.MYLOG:{
					setTitle(st.nextToken());
					myId=st.nextToken();
					login.setVisible(false);
					setVisible(true);
				}
				break;
				case Function.CHAT:{
					cp.cp.initStyle();
					cp.cp.append(st.nextToken(), st.nextToken());
				}
				break;
				case Function.INFO: {
					String data="아이디:" + st.nextToken() + "\n"
								+ "이름:" + st.nextToken() + "\n"
								+ "성별:" + st.nextToken();
					JOptionPane.showMessageDialog(this, data);
				}
				break;
				case Function.MSGSEND:{
					String id = st.nextToken();
					String strMsg = st.nextToken();
					rm.tf.setText(id);
					rm.ta.setText(strMsg);
					rm.setVisible(true);
				}
				break;
				case Function.MYEXIT:
				  {
					  dispose();// 윈도우 메모리 해제 
					  System.exit(0);// 프로그램 종료
				  }
				  break;
				  case Function.EXIT:
				  {
					  String mid=st.nextToken();
					  for(int i=0;i<cp.cp.model.getRowCount();i++)
					  {
						  String uid=cp.cp.table.getValueAt(i, 0).toString();
						  if(mid.equals(uid))
						  {
							  cp.cp.model.removeRow(i);
							  break;
						  }
					  }
				  }
				  break;
				
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cp.cp.table) {
			if(e.getClickCount()==2) {//더블클릭
				selectRow=cp.cp.table.getSelectedRow();
				String id=cp.cp.table.getValueAt(selectRow, 0).toString();
//				JOptionPane.showMessageDialog(this, "선택된 ID:" + id);
				if(id.equals(myId)) {
					cp.cp.b1.setEnabled(false);
					cp.cp.b2.setEnabled(false);
				} else {
					cp.cp.b1.setEnabled(true);
					cp.cp.b2.setEnabled(true);
				}
			}
		} 
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
