public class Main {
    public static void main(String[] args) {
        int[] harmonic = {1,2,3,4,5,};
        double harmonicSum = 0.0;
        for(int num : harmonic) {
            harmonicSum += 1.0/num;

        }
        double Harmonicsumavg = harmonic.length/harmonicSum;
        System.out.println("Harmonik Ortlama =" + Harmonicsumavg);
    }
}