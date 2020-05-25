package yaroslav_shelest.lesson.dz2;

import java.util.Random;
import java.util.Scanner;

public class dz4 {

    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;
    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static char[][] map;
    static int x;
    static int y;

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (isWinner(DOT_X)) {
                System.out.println("Победил человек.");
                break;
            } else if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }

            aiTurn(DOT_O);
            printMap();

            if (isWinner(DOT_O)) {
                System.out.println("Победил компьютер.");
                break;
            } else if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
        }

        System.out.println("Игра закончена.");
    }

    static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");

            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    static void humanTurn() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите координаты в формате X Y");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        }
        while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

//    static void aiTurn() {
//
//        int x;
//        int y;
//
//        Random random = new Random();
//
//        do {
//            x = random.nextInt(SIZE);
//            y = random.nextInt(SIZE);
//        }
//        while (!isCellValid(x, y));
//        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
//        map[y][x] = DOT_O;
//    }

    static void aiTurn(char symbol) {
        System.out.println(y);
        System.out.println(x);
        int z = y;
        int f = x;
        int d = y + 2;
        int b = x + 2;
        int n = 2;
        Random yran = new Random();
        Random xran = new Random();
                if (f == 0 && z == 0) {
                    do {
                        y = yran.nextInt(n);
                        x = xran.nextInt(n);
                    } while (!isCellValid(x, y));
                }
                if (f == 0 && z == SIZE - 1) {
                    do {
                        y = yran.nextInt(n) + z - 1;
                        x = xran.nextInt(n);
                    } while (!isCellValid(x, y));
                }
                if (f == SIZE - 1 && z == SIZE - 1) {
                    do {
                        y = yran.nextInt(n) + z - 1;
                        x = xran.nextInt(n) + f - 1;
                    } while (!isCellValid(x, y));
                }
                if (f == SIZE - 1 && z == 0) {
                    do {
                        y = yran.nextInt(n);
                        x = xran.nextInt(n) + f - 1;
                    } while (!isCellValid(x, y));
                }
                if (f == 0 && z > 0 && SIZE - 1 > z) {
                    do {
                        y = yran.nextInt(n + 1) + z - 1;
                        x = xran.nextInt(n);
                    } while (!isCellValid(x, y));
                }
                if (f == SIZE - 1 && z > 0 && SIZE - 1 > z) {
                    do {
                        y = yran.nextInt(n + 1) + z - 1;
                        x = xran.nextInt(n) + f - 1;
                    } while (!isCellValid(x, y));
                }
                if (z == SIZE - 1 && x > 0 && SIZE - 1 > x) {
                    do {
                        y = yran.nextInt(n) + z - 1;
                        x = xran.nextInt(n + 1) + f - 1;
                    } while (!isCellValid(x, y));
                    System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
                    map[y][x] = DOT_O;
                }
                if (z == 0 && x > 0 && SIZE - 1 > x) {
                    do {
                        y = yran.nextInt(n);
                        x = xran.nextInt(n + 1) + f - 1;
                        System.out.println(y);
                        System.out.println(x);
                    } while (!isCellValid(x, y));
                    System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
                    map[y][x] = DOT_O;
                }
                if (z > 0 && z< SIZE - 1 && x > 0 && SIZE - 1 > x) {
                    do {
                        y = yran.nextInt(n + 1) + z - 1;
                        x = xran.nextInt(n + 1) + f - 1;
                    } while (!isCellValid(x, y));
                    System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
                    map[y][x] = DOT_O;
                }
            }

    static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isWinner(char symbol) {


        for (int i = 0; i < SIZE; i++) {
            int horz = 0;
            int vert = 0;
            int diag = 0;
            int negDiag = 0;
            int diag1 = 0;
            int negDiag1 = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    horz++;
                }
                if (map[i][j] != symbol) {
                    horz = 0;
                }
                if (map[j][i] == symbol) {
                    vert++;
                }
                if (map[j][i] != symbol) {
                    vert = 0;
                }
                if (horz == DOTS_TO_WIN || vert == DOTS_TO_WIN || diag == DOTS_TO_WIN) {
                    return true;
                }
            }
                for (int f = 0, z = i; f < SIZE - i; f++, z++) {
                    if (map[f][z] == symbol) {
                        diag++;
                    }
                    if (map[f][z] != symbol) {
                        diag = 0;
                    }
                    if (map[f][SIZE - 1 - z] == symbol) {
                        negDiag++;
                    }
                    if (map[f][SIZE - 1 - z] != symbol) {
                        negDiag = 0;
                    }
                    if (diag == DOTS_TO_WIN || negDiag == DOTS_TO_WIN) {
                        return true;
                    }
                }
            for (int f = 0, z = i; f < SIZE - i; f++, z++) {
                if (map[z][f] == symbol) {
                    diag1++;
                }
                if (map[z][f] != symbol) {
                    diag1 = 0;
                }
                if (map[z][SIZE - 1 - f] == symbol) {
                    negDiag1++;
                }
                if (map[z][SIZE - 1 - f] != symbol) {
                    negDiag1 = 0;
                }
                if (diag == DOTS_TO_WIN || negDiag == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}