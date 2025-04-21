class UniqueDigitsNumber {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) { // Можно поменять диапазон
            if (hasUniqueDigits(i)) {
                System.out.println("Первое число с уникальными цифрами: " + i);
                break;
            }
        }
    }

    public static boolean hasUniqueDigits(int num) {
        boolean[] seen = new boolean[10];
        while (num > 0) {
            int digit = num % 10;
            if (seen[digit]) {
                return false;
            }
            seen[digit] = true;
            num /= 10;
        }
        return true;
    }
}
