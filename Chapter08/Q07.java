package odevler.chapter02.Chapter08;

public class Q07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3},
                {-1, -1, -1},
                {4, 1, 1},
                {2, 0.5, 9},
                {3.5, 2, -1},
                {3, 1.5, 3},
                {-1.5, 4, 2},
                {5.5, 4, -0.5}};

        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1], points[p2]);

        for (int i = 1; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i], points[j]);

                if (distance < shortestDistance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }

        }
        System.out.println("The closest two points are (" +
                points[p1][0] + ", " + points[p1][1] + ", " + points[p1][2] + ") and (" +
                points[p2][0] + ", " + points[p2][1] + ", " + points[p2][2] + ")");
    }

    public static double distance(double[] point1, double[] point2) {
        return Math.sqrt((point2[0] - point1[0]) * (point2[0] - point1[0]) +
                (point2[1] - point1[1]) * (point2[1] - point1[1]) +
                (point2[2] - point1[2]) * (point2[2] - point1[2])
        );
    }
}
