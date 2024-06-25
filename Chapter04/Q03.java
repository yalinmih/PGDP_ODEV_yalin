package odevler.chapter02.Chapter04;

public class Q03 {
    // chatGPT yardımı ile

    public static final double R = 6_371.01;
    public static void main(String[] args) {
        double atlantaLat = 33.7490;
        double atlantaLon = -84.3880;

        double orlandoLat = 28.5383;
        double orlandoLon = -81.3792;

        double savannahLat = 32.0809;
        double savannahLon = -81.0912;

        double charlotteLat = 35.2271;
        double charlotteLon = -80.8431;

        double dAtlantaSavannah = distance(atlantaLat, atlantaLon, savannahLat, savannahLon);
        double dSavannahCharlotte = distance(savannahLat, savannahLon, charlotteLat, charlotteLon);
        double dCharlotteAtlanta = distance(charlotteLat, charlotteLon, atlantaLat, atlantaLon);
        double dSavannahOrlando = distance(savannahLat, savannahLon, orlandoLat, orlandoLon);
        double dOrlandoCharlotte = distance(orlandoLat, orlandoLon, charlotteLat, charlotteLon);

        double area1 = triangleArea(dAtlantaSavannah, dSavannahCharlotte, dCharlotteAtlanta);
        double area2 = triangleArea(dSavannahOrlando, dOrlandoCharlotte, dSavannahCharlotte);

        double totalArea = area1 + area2;

        System.out.printf("The estimated area is %.2f square kilometers.%n", totalArea);
    }
    public static double distance(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double dlat = lat2 - lat1;
        double dlon = lon2 - lon1;

        double a = Math.sin(dlat / 2) * Math.sin(dlat / 2) + Math.cos(lat1) * Math.cos(lat2) *
                Math.sin(dlon / 2) * Math.sin(dlon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return R * c;
    }
    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
