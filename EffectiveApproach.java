import java.util.*;

public class EffectiveApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] pos = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            pos[a[i]] = i;
        }

        int m = sc.nextInt();
        long vasya = 0;
        long petya = 0;

        for (int i = 0; i < m; i++) {
            int q = sc.nextInt();
            int index = pos[q];
            vasya = vasya + index;
            petya = petya + (n - index + 1);
        }

        System.out.println(vasya + " " + petya);
    }
}

