package com.epam.fshop.runner;


import com.epam.fshop.view.MainViewer;
import com.epam.fshop.view.ViewerProvider;

/**
 * 1.Цветочница.
 * - Определить иерархию цветов.
 * - Создать несколько объектов-цветов.
 * - Собрать букет (используя аксессуары) с определением его стоимости.
 * - Провести сортировку цветов в букете на основе уровня свежести.
 * - Найти цветок в букете, соответствующий заданному диапазону длин стеблей(max length).
 * - 1 super / 3 subclasses
 * - minimize console menu
 * <p>
 * 27 Jul 2021  * @author
 * Pavel Sirotsin
 */
public class Main {
    public static void main(String[] args) {
        ViewerProvider provider = ViewerProvider.getInstance();
        MainViewer mainViewer = provider.getMainViewer();

        String response = mainViewer.showMenu();
        System.out.println(response);
        System.out.println();

        response = mainViewer.chooseOperation();
        System.out.println(response);

    }

}
