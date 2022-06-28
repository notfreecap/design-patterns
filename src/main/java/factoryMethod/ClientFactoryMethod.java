package factoryMethod;

public class ClientFactoryMethod {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader imageReader = null;
        String image = "factorymethod.gif";
        String format = image.substring(image.indexOf(".") + 1, (image.length()));
        if (format.equals("jpeg")){
            imageReader = new JpegReader(image);
        }
        if (format.equals("gif")){
            imageReader = new GifReader(image);
        }

        assert imageReader == null;
        decodedImage = imageReader.getDecodeImage();
        System.out.println(decodedImage);
    }
}
