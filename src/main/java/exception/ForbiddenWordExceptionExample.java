package exception;

public class ForbiddenWordExceptionExample {
    public static void main(String[] args) {
        try {
            checkWord("Плохое_слово");
        } catch (ForbiddenWordException e) {
            System.out.println("Поймано собственное исключение: " + e.getMessage());
        }
    }

    public static void checkWord(String word) throws ForbiddenWordException {
        if (word.equals("Плохое_слово")) {
            throw new ForbiddenWordException(word);
        }
    }
}
