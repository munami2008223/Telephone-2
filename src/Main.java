public class Main {
    public static void main(String[] args) {
        int starting = 200; // начальный счёт
        int coming = 3000; // сумма пополнения
        int bonus; // количество бонусных рублей
        int result; // конечная сумма на счёте

        if ( coming > 1000 ) {
            bonus = coming / 100;
        } else {
            bonus = 0;
        }

        result = (starting + coming + bonus);

        System.out.println((starting) + " рублей начальный счёт");
        System.out.println((coming) + " рублей пополнение");
        System.out.println((bonus) + " бонусных рублей");
        System.out.println((result) + " рублей итог");
    }
}