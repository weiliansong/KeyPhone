package com;

import java.util.Timer;
import java.util.TimerTask;

import gui.KeyPhoneFrame;

public class Main implements Runnable {
	private static KeyPhoneFrame window;
	
	public static void main(String[] args) {
		Thread thread = new Thread(new Main());
		window = new KeyPhoneFrame();
		thread.start();
	}
	
	@Override
	public void run() {
		Timer T = new Timer();
		T.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, 0, 1000/30);
	}
}
