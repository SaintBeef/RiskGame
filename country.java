import java.util.*;

public class country {
    // Soldiers in region, who owns region
    static int ss = 0, oP = 0;
    
    public static void claim(int p) {
        oP = p;
    }
    
    // aTTACKING & dEFENDING
    // Forces on both sides and registering which two sides are against eachother
    public static void battle(int af, int df, int ap, int dp) {
        af--;
        int winner = 0, sum = af + df;
        if (Math.random()*sum <= af)
            claim(af);
    }
}