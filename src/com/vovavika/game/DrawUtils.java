package com.vovavika.game;

import java.awt.*;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

public class DrawUtils {
    private DrawUtils()
    {

    }
    public static int getMessageWidth(String message, Font font, Graphics2D g)
    {
        g.setFont(font);
        Rectangle2D bounds = g.getFontMetrics().getStringBounds(message,g);
        return (int) bounds.getWidth();
    }
    public static int getMessageHeigh(String message, Font font, Graphics2D g)
    {
        g.setFont(font);
        if (message.length() == 0) return 0;
        TextLayout tl = new TextLayout(message ,font,g.getFontRenderContext());
        return (int)tl.getBounds().getHeight();

    }
}
