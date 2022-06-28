package factoryMethod;

public class GifReader implements ImageReader{
    private DecodedImage decodedImage;

    public GifReader(String image) {
        this.decodedImage = new DecodedImage(image + ".gif");
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}
