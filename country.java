import java.util.*;

public class country {
    // Soldiers in region, who owns region
    private int sol, player, xloc, yloc, id;
    private int[] neighbors;
    private String regname;
    
    public country(String[] input) {
        sol = 1;
        player = 0;
        xloc = Integer.parseInt(input[0]);
        yloc = Integer.parseInt(input[1]);
        String[] _N = input[2].split(":");
        for (int i = 0; i < _N.length; i++)
            neighbors[i] = Integer.parseInt(_N[i]);
        regname = input[3];
        id = Integer.parseInt(input[4]);
    }
    
    public void claim(int p) {
        player = p;
    }
}