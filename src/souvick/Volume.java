package souvick;

public class Volume {
    public static void main(String[] args) {
        int lengthCm;
        long volumeCmCube;

        lengthCm=500000;
        volumeCmCube= (long) lengthCm *lengthCm*lengthCm;
        System.out.println("Volume: "+volumeCmCube);

    }
}
