import java.util.*;

public class country {
    // Soldiers in region, who owns region
    private int sol, player, xloc, yloc, id;
    private int[] neighbors;
    private String regname;
    
    public country(String n, int xc, int yc, int id0, int[] neighboring) {
        sol = 1;
        player = 0;
        xloc = xc;
        yloc = yc;
        neighbors = neighboring;
        regname = n;
        id = id0;
    }
    
    public void claim(int p) {
        player = p;
    }
}