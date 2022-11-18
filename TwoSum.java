/**
 * Бизнес-логика внутри приложения, обработка пользовательского запроса
 */
public class TwoSum {

    public static int [] findSummonds(int [] input, int target) {
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                if (input[j-i] + input[j] == target) {
                    return new int [] {j-i, j};
                }                
            }
        }
        return new int [] {-1, -1};
    }

}