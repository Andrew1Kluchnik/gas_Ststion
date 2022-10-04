package com.company.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Заправка
 */
public class Station {
    private String name;
    private List<Post> posts;

    public Station(String name, List<Post> posts) {
        this.name = name;
        this.posts = posts;
    }

    public List<Post> filter(User userRequest) {
        // userRequest.getFuel() && userRequest.getQuantity()
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (post.getFuels().stream().anyMatch(fuel -> fuel.getType().name().equals(userRequest.getFuel())
                    && fuel.getQuantity() >= userRequest.getQuantity())) {
                result.add(post);
            }
        }
        return result;
    }

    public int refueling(User userRequest) {
        int cost = 0;
        Post post = posts.get(userRequest.getPost());
        List<Fuel> fuels = post.getFuels();
        for (Fuel fuel1 : fuels) {
            if (fuel1.getType().name().equals(userRequest.getFuel())) {
                fuel1.setQuantity(fuel1.getQuantity() - userRequest.getQuantity());
                cost = fuel1.getCost()*userRequest.getQuantity();
            }
        }
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
