// Базовый класс Одежда
abstract class Одежда {
    protected String производитель;
    protected double цена;
    protected String стиль;

    public Одежда(String производитель, double цена, String стиль) {
        this.производитель = производитель;
        this.цена = цена;
        this.стиль = стиль;
    }

    public String getПроизводитель() { return производитель; }
    public double getЦена() { return цена; }
    public String getСтиль() { return стиль; }

    public abstract String бренд();
}

// Класс Куртка, наследник Одежда
class Куртка extends Одежда {
    private String сезонность;
    private boolean капюшон;

    public Куртка(String производитель, double цена, String стиль, String сезонность, boolean капюшон) {
        super(производитель, цена, стиль);
        this.сезонность = сезонность;
        this.капюшон = капюшон;
    }

    public String getСезонность() { return сезонность; }
    public boolean hasКапюшон() { return капюшон; }

    @Override
    public String бренд() {
        return "Куртка от " + производитель;
    }
}

// Класс Кофта, наследник Одежда
class Кофта extends Одежда {
    private int длинаРукава;
    private double процентШерсти;

    public Кофта(String производитель, double цена, String стиль, int длинаРукава, double процентШерсти) {
        super(производитель, цена, стиль);
        this.длинаРукава = длинаРукава;
        this.процентШерсти = процентШерсти;
    }

    public int getДлинаРукава() { return длинаРукава; }
    public double getПроцентШерсти() { return процентШерсти; }

    @Override
    public String бренд() {
        return "Кофта от " + производитель;
    }
}

// Класс Брюки, наследник Одежда
class Брюки extends Одежда {
    private boolean расклешенность;

    public Брюки(String производитель, double цена, String стиль, boolean расклешенность) {
        super(производитель, цена, стиль);
        this.расклешенность = расклешенность;
    }

    public boolean isРасклешенность() { return расклешенность; }

    @Override
    public String бренд() {
        return "Брюки от " + производитель;
    }
}

// Главный класс для тестирования
class Магазин {
    public static void main(String[] args) {
        Куртка куртка = new Куртка("Nike", 100.0, "Спортивный", "Зима", true);
        Кофта кофта = new Кофта("Adidas", 80.0, "Casual", 65, 30.5);
        Брюки брюки = new Брюки("Levi's", 120.0, "Классический", false);

        System.out.println(куртка.бренд() + " | Цена: " + куртка.getЦена() + " | Сезонность: " + куртка.getСезонность());
        System.out.println(кофта.бренд() + " | Длина рукава: " + кофта.getДлинаРукава() + " см | Шерсть: " + кофта.getПроцентШерсти() + "%");
        System.out.println(брюки.бренд() + " | Расклешенность: " + (брюки.isРасклешенность() ? "Да" : "Нет"));
    }
}
