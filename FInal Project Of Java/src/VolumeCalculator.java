class VolumeCalculator {

    // Volume of Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Volume of Cuboid
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static void main(String[] args) {

        VolumeCalculator vc = new VolumeCalculator();

        System.out.println("Cube Volume = " + vc.calculateVolume(5));

        System.out.println("Cuboid Volume = " +
                vc.calculateVolume(5, 4, 3));
    }
}