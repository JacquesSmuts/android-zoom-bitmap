    /**
     * Returns a bitmap that is zoomed in based on input
     * @param zoomScale scale at which image will be zoomed. 1.0f = original size
     * @param bmp bitmap to be modified
     * @param xPercentage X-position to be in the center, as a percentage of the bitmap width, 0-100f
     * @param yPercentage Y-position to be in the center, as a percentage of the bitmap height, 0-100f
     */
    private Bitmap getZoomedBitmap(float zoomScale, Bitmap bmp, float xPercentage, float yPercentage){
        bmp.setDensity(Bitmap.DENSITY_NONE);

        //Set the default value of x/yPercentage to 50/50 in case bad value is provided.
        xPercentage = (xPercentage < 0f || xPercentage > 100f) ? 50.0f : xPercentage;
        yPercentage = (yPercentage < 0f || yPercentage > 100f) ? 50.0f : yPercentage;

        int originalWidth = bmp.getWidth();
        int originalHeight = bmp.getHeight();

        //Get the new sizes based on zoomScale
        int newWidth = (int) (originalWidth/zoomScale);
        int newHeight = (int) (originalHeight/zoomScale);

        //get the new X/Y positions based on x/yPercentage
        int newX = (int) (originalWidth * xPercentage/100) - newWidth/2;
        int newY = (int) (originalHeight * yPercentage/100) - newHeight/2;

        //Make sure the x/y values are not lower than 0
        newX = (newX < 0) ? 0 : newX;
        newY = (newY < 0) ? 0 : newY;

        //make sure the image does not go over the right edge
        while ((newX + newWidth) > originalWidth){
            newX -= 2;
        }

        //make sure the image does not go over the bottom edge
        while ((newY + newHeight) > originalHeight){
            newY -= 2;
        }

        return Bitmap.createBitmap(bmp, newX, newY, newWidth, newHeight);
    }
