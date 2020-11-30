

public class Haromszog {

    public static double szamitTerulet(int alap, int magassag) {
        if (alap <= 0 || magassag <= 0) {
            throw new IllegalArgumentException("Nem megfelelõ paraméterek");                
        }
        return (alap * magassag) / 2;
    }

    public static void main(String[] args) {
        System.out.println(szamitTerulet(43, 28));
    }
}