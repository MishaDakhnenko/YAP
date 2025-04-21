import java.util.Objects;

// Класс Винчестер
class Винчестер {
    private int размерГБ;

    public Винчестер(int размерГБ) {
        this.размерГБ = размерГБ;
    }

    public int getРазмерГБ() {
        return размерГБ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Винчестер)) return false;
        Винчестер that = (Винчестер) o;
        return размерГБ == that.размерГБ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(размерГБ);
    }

    @Override
    public String toString() {
        return "Винчестер: " + размерГБ + " ГБ";
    }
}

// Класс Дисковод
class Дисковод {
    private String тип;

    public Дисковод(String тип) {
        this.тип = тип;
    }

    public String getТип() {
        return тип;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Дисковод)) return false;
        Дисковод that = (Дисковод) o;
        return Objects.equals(тип, that.тип);
    }

    @Override
    public int hashCode() {
        return Objects.hash(тип);
    }

    @Override
    public String toString() {
        return "Дисковод: " + тип;
    }
}

// Класс Оперативная память
class ОперативнаяПамять {
    private int объемГБ;

    public ОперативнаяПамять(int объемГБ) {
        this.объемГБ = объемГБ;
    }

    public int getОбъемГБ() {
        return объемГБ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ОперативнаяПамять)) return false;
        ОперативнаяПамять that = (ОперативнаяПамять) o;
        return объемГБ == that.объемГБ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(объемГБ);
    }

    @Override
    public String toString() {
        return "Оперативная память: " + объемГБ + " ГБ";
    }
}

// Класс Процессор
class Процессор {
    private String модель;

    public Процессор(String модель) {
        this.модель = модель;
    }

    public String getМодель() {
        return модель;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Процессор)) return false;
        Процессор that = (Процессор) o;
        return Objects.equals(модель, that.модель);
    }

    @Override
    public int hashCode() {
        return Objects.hash(модель);
    }

    @Override
    public String toString() {
        return "Процессор: " + модель;
    }
}

// Класс Компьютер
class Компьютер {
    private Винчестер винчестер;
    private Дисковод дисковод;
    private ОперативнаяПамять оперативнаяПамять;
    private Процессор процессор;
    private boolean включен;

    public Компьютер(Винчестер винчестер, Дисковод дисковод, ОперативнаяПамять оперативнаяПамять, Процессор процессор) {
        this.винчестер = винчестер;
        this.дисковод = дисковод;
        this.оперативнаяПамять = оперативнаяПамять;
        this.процессор = процессор;
        this.включен = false;
    }

    public void включить() {
        включен = true;
        System.out.println("Компьютер включен.");
    }

    public void выключить() {
        включен = false;
        System.out.println("Компьютер выключен.");
    }

    public void проверитьНаВирусы() {
        if (включен) {
            System.out.println("Проверка на вирусы завершена. Угроза не обнаружена.");
        } else {
            System.out.println("Компьютер выключен. Включите его для проверки.");
        }
    }

    public void вывестиРазмерВинчестера() {
        System.out.println("Размер винчестера: " + винчестер.getРазмерГБ() + " ГБ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Компьютер)) return false;
        Компьютер that = (Компьютер) o;
        return включен == that.включен &&
                Objects.equals(винчестер, that.винчестер) &&
                Objects.equals(дисковод, that.дисковод) &&
                Objects.equals(оперативнаяПамять, that.оперативнаяПамять) &&
                Objects.equals(процессор, that.процессор);
    }

    @Override
    public int hashCode() {
        return Objects.hash(винчестер, дисковод, оперативнаяПамять, процессор, включен);
    }

    @Override
    public String toString() {
        return "Компьютер: " + процессор + ", " + оперативнаяПамять + ", " + винчестер + ", " + дисковод;
    }
}

// Главный класс для тестирования
public class Main {
    public static void main(String[] args) {
        Компьютер компьютер = new Компьютер(
                new Винчестер(512),
                new Дисковод("DVD"),
                new ОперативнаяПамять(16),
                new Процессор("Intel i7")
        );

        компьютер.включить();
        компьютер.проверитьНаВирусы();
        компьютер.вывестиРазмерВинчестера();
        компьютер.выключить();

        System.out.println(компьютер);
    }
}
