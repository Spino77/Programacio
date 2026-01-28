import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class cosa_cosa {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        int f = 4;
        int c = 10;

        String[][] map = new String[f][c];
        int[] pos = new int[2];
        fill_map(map,f,c);
        spawn_tonto(map,f,c);
        show_map(map, f, c);

        while (true) {
            get_pos(pos,map,f,c);
            String movement = sc.next();

            if (movement.equals("w") || movement.equals("W")) {
                move_up(map,f,c,pos);
                show_map(map,f,c);
            } else if (movement.equals("s") || movement.equals("S")) {
                move_down(map,f,c,pos);
                show_map(map,f,c);
            } else if (movement.equals("a") || movement.equals("A")) {
                move_left(map,f,c,pos);
                show_map(map,f,c);
            } else if (movement.equals("d") || movement.equals("D")) {
                move_right(map,f,c,pos);
                show_map(map,f,c);
            }


        }

    }

    public static String[][] fill_map(String[][] map, int f, int c) {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                int randomNum = (int)(Math.random() * 2);
                if (randomNum == 0) {
                    map[i][j] = "-";
                } else if (randomNum == 1) {
                    map[i][j] = "=";
                }


            }
        }
        return map;
    }

    public static void show_map(String[][] map, int f, int c) {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] spawn_tonto(String[][] map, int f, int c) {
        map[f/2][c/2] = "@";
        return map;
    }

    public static int[] get_pos(int[] pos, String[][] map,int f,int c) {
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j].equals("@")) {
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }


    public static String[][] move_up(String[][] map, int f, int c, int[] pos) {
        int current_f = map.length;
        int current_c = map[0].length;
        int randomNum = (int)(Math.random() * 2);
        if (randomNum == 0) {map[pos[0]][pos[1]] = "-";
        } else if (randomNum == 1) {map[pos[0]][pos[1]] = "=";}
        map[pos[0] - 1][pos[1]] = "@";
        return map;
    }

    public static String[][] move_down(String[][] map, int f, int c, int[] pos) {
        int current_f = map.length;
        int current_c = map[0].length;
        int randomNum = (int)(Math.random() * 2);
        if (randomNum == 0) {map[pos[0]][pos[1]] = "-";
        } else if (randomNum == 1) {map[pos[0]][pos[1]] = "=";}
        map[pos[0] + 1][pos[1]] = "@";
        return map;
    }

    public static String[][] move_left(String[][] map, int f, int c, int[] pos) {
        int current_f = map.length;
        int current_c = map[0].length;
        int randomNum = (int)(Math.random() * 2);
        if (randomNum == 0) {map[pos[0]][pos[1]] = "-";
        } else if (randomNum == 1) {map[pos[0]][pos[1]] = "=";}
        map[pos[0]][pos[1] - 1] = "@";
        return map;
    }

    public static String[][] move_right(String[][] map, int f, int c, int[] pos) {
        int current_f = map.length;
        int current_c = map[0].length;
        int randomNum = (int)(Math.random() * 2);
        if (randomNum == 0) {map[pos[0]][pos[1]] = "-";
        } else if (randomNum == 1) {map[pos[0]][pos[1]] = "=";}
        map[pos[0]][pos[1] + 1] = "@";
        return map;
    }

}
