import java.util.ArrayList;

public class UnderScorifyingTheString {

    public static String underScorifyingString(String string, String substring) {
        ArrayList<Integer[]> location = collapseIndex(getLocation(string, substring));
        return underscorify(string, location);
    }

    private static ArrayList<Integer[]> collapseIndex(ArrayList<Integer[]> location) {
        if (location.size() == 0) {
            return location;
        }
        ArrayList<Integer[]> newLocation = new ArrayList<>();
        newLocation.add(location.get(0));
        Integer[] previous = newLocation.get(0);
        for (int i = 1; i < location.size(); i++) {
            Integer[] current = location.get(i);

            if (current[0] <= previous[1]) {
                previous[1] = current[1];
            } else {
                newLocation.add(current);
                previous = current;
            }
        }
        return newLocation;
    }

    private static ArrayList<Integer[]> getLocation(String string, String substring) {
        ArrayList<Integer[]> locations = new ArrayList<>();
        int startIndex = 0;
        while (startIndex < string.length()) {
            int nextIndex = string.indexOf(substring, startIndex);
            if (nextIndex != -1) {
                locations.add(new Integer[]{nextIndex, nextIndex + substring.length()});
                startIndex = nextIndex + 1;
            } else {
                break;
            }
        }
        return locations;
    }

    private static String underscorify(String string, ArrayList<Integer[]> location) {
        int locationIndex = 0;
        int startIndex = 0;
        boolean inBetweenUnderscores = false;
        ArrayList<String> finalchar = new ArrayList<>();
        int i = 0;
        while (startIndex < string.length() && locationIndex < location.size()) {
            if (startIndex == location.get(locationIndex)[i]) {
                finalchar.add("_");
                inBetweenUnderscores = !inBetweenUnderscores;
                if (!inBetweenUnderscores) {
                    locationIndex++;
                }
                i = i == 1 ? 0 : 1;
            }
            finalchar.add(String.valueOf(string.charAt(startIndex)));
            startIndex++;

        }
        if (locationIndex < location.size()) {
            finalchar.add("_");
        } else if (startIndex < string.length()) {
            finalchar.add(string.substring(startIndex));
        }
        return String.join("", finalchar);

    }

}
