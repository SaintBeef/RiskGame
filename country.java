import java.util.*;

public class country {
    // Soldiers in region, who owns region
    private int sol, player, xloc, yloc;
    private int[] nC;
    private String regname;
    
    public country(int xc, int yc, int[] neighboring, String n) {
        sol = 1;
        player = 0;
        xloc = xc;
        yloc = yc;
        nC = neighboring;
        regname = n;
    }
    
    public void claim(int p) {
        player = p;
    }
}