package elements;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class DoorO extends Background {
	private int x;
	private int y;
	
	public DoorO(int x, int y){
		
		this.x = x;
		this.y = y;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void Image() throws IOException {
		BufferedImage gate_open = ImageIO.read(new File("src/main/resources/sprite/gate_open.png"));
	}

}
