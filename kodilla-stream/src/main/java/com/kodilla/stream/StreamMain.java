package com.kodilla.stream;

import com.kodilla.stream.forumser.Forum;
import com.kodilla.stream.forumser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

    Forum forum = new Forum();
    Map<Integer, ForumUser> theResultMapOfForumUser = forum.getUserList().stream()
            .filter(forumUser -> forumUser.getSex() == 'M')
            .filter(forumUser -> Period.between(forumUser.getDateOfBirthady(), LocalDate.now()).getYears()>=20)
            .filter(forumUser -> forumUser.getPostQuantity() > 0)
            .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("\nNumber of elements: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .forEach(System.out::println);
    }
}
