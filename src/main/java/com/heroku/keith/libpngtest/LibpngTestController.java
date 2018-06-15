package com.heroku.keith.libpngtest;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibpngTestController {

	@RequestMapping("/test")
	public String test() {

		String output;

		try {
			BufferedImage img = new BufferedImage(BufferedImage.TYPE_INT_RGB, 10, 10);
			Graphics2D g2d = img.createGraphics();
			FontRenderContext frc = g2d.getFontRenderContext();
			Font f = new Font("SansSerif", Font.PLAIN, 13);
			String str = new String(new int[] { 2835, 2849, 2879, 2876, 2822 }, 0, 5);
			new TextLayout(str, f, frc);
			output = "All Good!!!";
		} catch (Exception ex) {
			output = ExceptionUtils.getStackTrace(ex);
		}

		return output;
	}
}
