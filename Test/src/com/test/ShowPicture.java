package com.test;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * @author Master_Joe
 *
 */
public class ShowPicture {
	public static void main(String[] args) throws Exception {
		BufferedImage readBufferedImage = ImageIO.read(new File("E:\\girl.png"));
		int width = readBufferedImage.getWidth();
		int height = readBufferedImage.getHeight();

		BufferedImage writeBufferedImage = new BufferedImage(width * 12, height * 12, BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics2d = (Graphics2D) writeBufferedImage.getGraphics();

		graphics2d.setColor(Color.white);
		graphics2d.fillRect(0, 0, width * 12, height * 12);

		String base = "♥♥♥♥♥♥";

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				int color = readBufferedImage.getRGB(x, y);
				int red = (color & 0xff0000) >> 16;
				int green = (color & 0xff00) >> 8;
				int blue = color & 0xff;

				float gray = 0.299f * red + 0.587f * green + 0.114f * blue;
				int index = Math.round((gray / 255 * (1 + base.length())));
//				Color currentColor = new Color((int) (Math.random() * 12344) % 255, (int) (Math.random() * 12344) % 255,
//						(int) (Math.random() * 12344) % 255);
				Color currentColor = new Color(red, green, blue);
				graphics2d.setColor(currentColor);
				if (index >= base.length()) {
					graphics2d.drawString("  ", x * 12, y * 12);
				} else {
					graphics2d.drawString(Character.toString(base.charAt(index)), x * 12, y * 12);
				}

			}
		}

		ImageIO.write(writeBufferedImage, "PNG", new File("E:\\Heart.png"));
		System.out.println("Finished");

	}

}
