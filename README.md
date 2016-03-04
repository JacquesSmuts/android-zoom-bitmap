# android-zoom-function
Zooms in on a given bitmap and returns the zoomed bitmap

## Usage
Copy the code in the java file to your code and call the function like so:

```java
ImageView imageView = new ImageView();
Bitmap bitmapOriginal = BitmapFactory.decodeResource(getResources(), id);
Bitmap bitmapZoomed = getZoomedBitmap(2.0f, bitmapOriginal, 50f, 50f);
imageView.setImageBitmap(bitmapZoomed);
```
