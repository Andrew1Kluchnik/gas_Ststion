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
