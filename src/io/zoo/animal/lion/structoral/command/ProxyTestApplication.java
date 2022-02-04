package io.zoo.animal.lion.structoral.command;

public class ProxyTestApplication {

    public static void main(String[] args) {
        Image realImage1 = new ProxyImage("Dart file");
        realImage1.displayImage();

        Image realImage2 = new ProxyImage("flutter file");
        realImage2.displayImage();
    }

    interface Image {

        void displayImage();
    }

    static class RealImage implements Image {

        private final String fileName;

        public RealImage(String fileName) {
            this.fileName = fileName;

            loadImageFromDisk();
        }

        @Override
        public void displayImage() {
            System.out.println("Displaying... " + fileName);
        }

        private void loadImageFromDisk() {
            System.out.println("Loading... " + fileName);
        }
    }

    static class ProxyImage implements Image {

        private final String fileName;

        private Image realImage;

        public ProxyImage(String fileName) {
            this.fileName = fileName;

            realImage = new RealImage(fileName);
        }

        @Override
        public void displayImage() {
            realImage.displayImage();
        }
    }
}
