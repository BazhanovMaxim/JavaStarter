package Logic005;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        Scanner cns = new Scanner(System.in);

        System.out.print("Здарова, это бухгалтерия. Пиши сколько работаешь, а я те премию расчитаю ок да: ");

        int userVisluga = cns.nextInt();

        System.out.print("Ну и зпху свою тоже напиши, бомжара: ");

        int userZP = cns.nextInt();

        if (userVisluga >= 0 && userVisluga <= 5) {
            System.out.println("Братан, ток 15% накинем, чисто на проезд. Итого: " + (userZP/100) * 15 + " к зп.");
        } else if (userVisluga >= 5 && userVisluga <= 10) {
            System.out.println("Нормуль поднялся. Скок работал, сток получай - 25% прибавку. Итого: " + (userZP/100) * 25 + " к зп.");
        } else if (userVisluga >= 15 && userVisluga <= 20) {
            System.out.println("Кошерно брат, тебе 35% к зп. Итого: " + (userZP/100) * 35 + " к зп.");
        } else if (userVisluga >= 20 && userVisluga <= 25) {
            System.out.println("Даже я столько не работал, смотри не рипнись. Тебе + 45%. Итого: " + (userZP/100) * 45 + " к зп.");
        } else if (userVisluga >= 25) {
            System.out.println("Тебе пора на пенсию, бро, подумай о внуках. Вот тебе + 50%. Итого: " + (userZP/100) * 50 + " к зп.");
        }
    }
}
