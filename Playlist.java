import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        // creating array
        desertIslandPlaylist.add("song : 1");
        // adding new songs using.add
        desertIslandPlaylist.add("song : 2");
        desertIslandPlaylist.add("song : 3");
        desertIslandPlaylist.add("song : 4");
        desertIslandPlaylist.add("song : 5");
        desertIslandPlaylist.add("song : 6");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
        // to get size of array using .size
        System.out.println(desertIslandPlaylist);
        String a = desertIslandPlaylist.get(0);
        // for extracting the values
        String b = desertIslandPlaylist.get(1);
        // for extracting the value and store it using .get
        desertIslandPlaylist.remove(0);
        // removing song : 1 using .remove
        System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.remove(1);
        // removing song : 2
        desertIslandPlaylist.add(0, b);
        // adding the value of into array list song 2
        desertIslandPlaylist.add(1, a);
        // adding the value of into array list song 1
        System.out.println(desertIslandPlaylist);
        desertIslandPlaylist.set(1, b);
        // for swaping value using .set
        System.out.println(desertIslandPlaylist);
        System.out.println(b);
    }
}