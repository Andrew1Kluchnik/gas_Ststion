package com.company;

import com.company.commands.CommandsOfUser;
import com.company.commands.Creator;
import com.company.commands.FilterOfStation;
import com.company.entities.Station;
import com.company.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Station> stationList = new ArrayList<>();
        stationList = Creator.createstations();
        User user = new User();
        System.out.println("Введите имя юзера");
        user.setName(Creator.getString());
        System.out.println("Введите кол-во денег юзера");
        user.setMoney(Creator.getDouble());
        System.out.println("Введите тип топлива: GAS, DIESEL, BENZ");
        user.setType_Of_Fuel(Creator.getString());
        System.out.println("Вам доступны колонки:");
        stationList = FilterOfStation.Filter(stationList,user.getType_Of_Fuel());
        stationList.stream().forEach(x -> System.out.println(x.getNumberOfStation()));
        CommandsOfUser commands = new CommandsOfUser();
        System.out.println("Добрый день, есть ли у вас деньги?");
        Scanner scanner = new Scanner(System.in);


    }
}
