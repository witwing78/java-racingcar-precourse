package freecourse2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final String CAR_NAMES_MSG = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분) ";
    private static final String TRY_NUMBERS_MSG = "시도할 회수는 몇회인가요? ";
    private static final String COMMA = ",";
    private static final String CAR_NAME_LENGTH_CHECK_MSG = "자동차 이름은 5자 이하만 가능합니다.";

    private Scanner scanner;

    public InputView() {
    }

    public List<String> getCarNames() {
        scanner = new Scanner(System.in);
        System.out.print(CAR_NAMES_MSG);
        return splitComma(scanner.nextLine());
    }

    public int getTryNumbers(){
        System.out.print(TRY_NUMBERS_MSG);
        return scanner.nextInt();
    }

    public List<String> splitComma(String string) {
        return Arrays.asList(string.split(COMMA));
    }

}
