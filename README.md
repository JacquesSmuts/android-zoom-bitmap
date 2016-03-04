# android-zoom-function
Zooms in on a given bitmap and returns the zoomed bitmap

## Usage
Copy the code in the java file to your code and call the function like so:

```java
        ImageView imageView = new ImageView();
        
        final BitmapFactory.Options bitmapOptions = new BitmapFactory.Options();
        bitmapOptions.inDensity = 1;
        bitmapOptions.inTargetDensity = 1;
        
        Bitmap bitmapOriginal = BitmapFactory.decodeResource(getResources(), id, bitmapOptions);
        Bitmap bitmapZoomed = getZoomedBitmap(2.0f, bitmapOriginal, 50f, 50f);
        
        imageView.setImageBitmap(bitmapZoomed);
```
