package java_frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class main_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new gui_test();
		Button bt = new Button("Click");
		
		Frame frame = new Frame("test!");
		frame.setSize(500,500);
		frame.add(bt);
		frame.setBackground( new Color(180,180,180));
		frame.setVisible(true);
		frame.addWindowListener( new WindowListener() {
			// frame에 의해 생성된  window 이벤트 설정하기
			
			@Override
			public void windowOpened(WindowEvent e) {}
			@Override
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false); // 화면에서 사라지기
				e.getWindow().dispose(); // 메모리제거
				System.exit(0);
			}
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
