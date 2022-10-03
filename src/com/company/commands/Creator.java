package com.company.commands;

import com.company.entities.Fuel;
import com.company.entities.Post;
import com.company.entities.TypeOfFuel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Creator {

    public static List<Post> createPosts(int count) {
        List<Post> listPost = new ArrayList<Post>();
        for (int i = 0; i < count; i++) {
            Post post1 = new Post(i, createFuel(i));
            listPost.add(post1);
        }
        return listPost;
    }

    private static ArrayList<Fuel> createFuel(int n) {
        ArrayList<Fuel> fuels = new ArrayList<>();
        if (n % 2 == 0) {
            fuels.add(new Fuel(TypeOfFuel.BENZ, 10));
            fuels.add(new Fuel(TypeOfFuel.DIESEL, 20));
            fuels.add(new Fuel(TypeOfFuel.GAS, 30));
        } else {
            fuels.add(new Fuel(TypeOfFuel.BENZ, 15));
            fuels.add(new Fuel(TypeOfFuel.DIESEL, 10));
        }
        return fuels;
    }
}
