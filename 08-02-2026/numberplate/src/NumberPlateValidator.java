import java.util.Arrays;
import java.util.List;

public class NumberPlateValidator {

    public static boolean validate(String plate) {

        if (plate == null || plate.isEmpty()) {
            return false;
        }

        // Split by "-"
        List<String> segments = Arrays.asList(plate.split("-"));

        // Rule 1: Exactly 3 segments
        if (segments.size() != 3) {
            return false;
        }

        // Rule 2: Each segment must have at least 1 character
        boolean anyEmptySegment = segments.stream()
                .anyMatch(segment -> segment.isEmpty());

        if (anyEmptySegment) {
            return false;
        }

        // Rule 3: Total characters (excluding '-') must be <= 9
        int totalCharacters = segments.stream()
                .mapToInt(String::length)
                .sum();

        if (totalCharacters > 9) {
            return false;
        }

        // Rule 4: Validate characters (letters or digits only)
        boolean invalidCharacterFound = segments.stream()
                .flatMap(segment -> segment.chars().mapToObj(c -> (char) c))
                .anyMatch(c -> !Character.isLetterOrDigit(c));

        if (invalidCharacterFound) {
            return false;
        }

        return true;
    }
}
