# android-zoom-function
Zooms in on a given bitmap and returns the zoomed bitmap

## Usage
Copy the code in the java file to your code and call the function like so:

```java
        //Get the original Bitmap
        final BitmapFactory.Options bitmapOptions = new BitmapFactory.Options();
        bitmapOptions.inDensity = 1;
        bitmapOptions.inTargetDensity = 1;
        Bitmap bitmapOriginal = BitmapFactory.decodeResource(getResources(), id, bitmapOptions);
        
        //Get the zoomed bitmap
        Bitmap bitmapZoomed = getZoomedBitmap(2.0f, bitmapOriginal, 50f, 50f);
        
        //set the bitmap to an imageview
        ImageView imageView = new ImageView();
        imageView.setImageBitmap(bitmapZoomed);
```
