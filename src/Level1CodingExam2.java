import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1CodingExam2 implements MouseListener, ActionListener {

	public static void main(String[] args) {
	Level1CodingExam2 exam = new Level1CodingExam2();
	exam.setup();	
}
	
JPanel JP = new JPanel();
JFrame JF = new JFrame("Animal Sounds");
JButton JB = new JButton("Cow");
JButton Jb = new JButton("Cat");
JButton jb = new JButton("Dog");
JButton j = new JButton("Duck");
JButton button = new JButton("Llama");

void setup() {
	JF.setVisible(true);
	JF.add(JP);
	JP.add(j);
	JP.add(jb);
	JP.add(Jb);
	JP.add(JB);
	JP.add(button);
	JB.addActionListener(this);
	Jb.addActionListener(this);
	j.addActionListener(this);
	jb.addActionListener(this);
	button.addActionListener(this);
	JF.pack();
}
public void playNoise(String soundFile) {
	try {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
		sound.play();
		Thread.sleep(3400);
	} catch (Exception ex) {
		ex.printStackTrace();
	}
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
	
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
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == JB) {
		playNoise("moo.wav");
	
	}
	
	else if(e.getSource() == Jb) {
		playNoise("meow.wav");
	}
	
	else if(e.getSource() == jb) {
		playNoise("woof.wav");
	}
	
	else if(e.getSource() == j) {
		playNoise("quack.wav");
	}

	else if(e.getSource() == button) {
			playNoise("llama.wav");
		
		}
	JF.pack();
}
}
