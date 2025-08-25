package com.bjf;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

public class ImageUtils {

    public static BufferedImage reShape(BufferedImage image, Integer height, Integer width) {
        // 缩放比例
        double ratio = 0;
        ratio = image.getHeight() < image.getWidth() ?
                height.doubleValue() / image.getHeight() : width.doubleValue() / image.getWidth();
        // 将图片缩放至对于大小
        AffineTransformOp op = new AffineTransformOp(AffineTransform.getScaleInstance(ratio, ratio), null);
        Image resizedImage = op.filter(image, null);

        return convertToBufferedImage(resizedImage);
    }

    public static BufferedImage fillImageByColor(BufferedImage originalImage, int width, int height, Color color) {
        BufferedImage resultImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        // 获取并填充画布
        Graphics2D graphics = resultImage.createGraphics();
        graphics.setColor(color);
        graphics.fillRect(0, 0, width, height);

        // 计算剧中绘制的位置
        int xOffset = (width - originalImage.getWidth()) / 2;
        int yOffset = (height - originalImage.getHeight()) / 2;

        // 居中绘制
        graphics.drawImage(originalImage, xOffset, yOffset, null);
        graphics.dispose();
        return resultImage;
    }

    public static BufferedImage convertToBufferedImage(Image image) {
        BufferedImage newImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D = newImage.createGraphics();
        graphics2D.drawImage(image, 0,0,null);
        graphics2D.dispose();
        return newImage;
    }

    public static Image convertToImage(BufferedImage image) {
        return image;
    }
}
