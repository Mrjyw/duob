package com.bjf;

import java.awt.image.BufferedImage;

public class GroupHeaderCommponent {

    private static final int DEFAULT_HEIGHT = 422;

    private static final int DEFAULT_WIDTH = 422;

    private static final int DEFAULT_SPACE = 14;

    int picWidth;

    int picHeight;

    int picSpace;

    BufferedImage defaultImage;


    public GroupHeaderCommponent() {
        this(DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_SPACE, null);
    }

    public GroupHeaderCommponent(int picWidth, int picHeight, int picSpace, BufferedImage defaultImage) {
        this.picWidth = picWidth;
        this.picHeight = picHeight;
        this.picSpace = picSpace;
        this.defaultImage = defaultImage;
    }

}
