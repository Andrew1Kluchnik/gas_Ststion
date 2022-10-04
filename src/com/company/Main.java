package com.company;

import com.company.commands.Creator;
import com.company.entities.Post;
import com.company.entities.Station;
import com.company.entities.TypeOfFuel;
import com.company.entities.User;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Post> posts = Creator.createPosts(4); // todo
        Station wogStation = new Station("WOG", posts);

        while (true) {
            System.out.println("_________________________________");
            posts.forEach(post -> System.out.println(post));
            User user = new User();
            System.out.println("Введите имя юзера");
            user.setName(scanner.next());
            System.out.println("Введите кол-во денег юзера");
            user.setMoney(scanner.nextDouble());
            System.out.println("Введите тип топлива: GAS, DIESEL, BENZ");
            user.setFuel(scanner.next());
            System.out.println("Введите кол-во топлива в литрах");
            user.setQuantity(scanner.nextInt());
            List<Post> filteredPosts = wogStation.filter(user);
            System.out.println("Вам доступны колонки:");
            filteredPosts.forEach(post -> System.out.println(post));
            System.out.println("На какую колонку поедешь?");
            user.setPost(scanner.nextByte());
            int cost = wogStation.refueling(user);
            System.out.println("Спасибо за заправку, вы заправились на: " + cost);
        }

    }
}
