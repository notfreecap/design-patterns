package factoryMethod;

public class JpegReader implements ImageReader{
    private DecodedImage decodedImage;

    public JpegReader(String image) {
        this.decodedImage = new DecodedImage(image+".jpeg");
    }

    @Override
    public DecodedImage getDecodeImage() {
        return decodedImage;
    }
}
