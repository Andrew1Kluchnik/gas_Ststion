package com.company.commands;

import com.company.entities.Fuel;
import com.company.entities.Post;
import com.company.entities.TypeOfFuel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Creator {
    static Scanner scanner = new Scanner(System.in);
    private static byte count = 0;

    public static double getDouble() {
        return scanner.nextDouble();
    }

    public static String getString() {
        return scanner.next();
    }

    public static List<Post> createstations() {
        ArrayList<Post> listPost = new ArrayList<Post>();
        for (int i = 0; i < 10; i++) {
            Post post1 = new Post(i, createFuel());
            listPost.add(post1);
        }
        return listPost;
    }

    private static ArrayList<Fuel> createFuel() {
        ArrayList<Fuel> fuels = new ArrayList<>();
        if (count < 8) {
            fuels.add(new Fuel(TypeOfFuel.BENZ, 1000));
            fuels.add(new Fuel(TypeOfFuel.DIESEL, 1000));
            fuels.add(new Fuel(TypeOfFuel.GAS, 1000));
        } else {
            fuels.add(new Fuel(TypeOfFuel.BENZ, 1000));
            fuels.add(new Fuel(TypeOfFuel.DIESEL, 1000));
        }
        return fuels;
    }
}
