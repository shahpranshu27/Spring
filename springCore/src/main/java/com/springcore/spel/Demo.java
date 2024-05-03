package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{ 22+11 }")
	private int x;
	
	@Value("#{ 33<44?1:0 }")
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
