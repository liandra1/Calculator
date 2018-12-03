package LindaCalc;

import java.awt.EventQueue;

public class LindaCalcMain {
	
	LindaCalcJFrame frame = new LindaCalcJFrame();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LindaCalcMain window = new LindaCalcMain();
					window.frame.frmLindasKalkylator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
