package edu.gsu.cis.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgetAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		ForgotGui.callForgot();
	}

}
