package com.kodilla.stream.forumser;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1213, "Robert", 'M', 1900,1,1,15));
        theForumUserList.add(new ForumUser( 1214, "Joanna", 'F', 1990,1, 1, 4));
        theForumUserList.add(new ForumUser(1215, "Karolina", 'F', 1995, 1, 1, 115));
        theForumUserList.add(new ForumUser( 1216, "Pawel", 'M', 1980, 1, 1, 2));
        theForumUserList.add(new ForumUser(1217, "Radek", 'M', 2005, 1, 2,3));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
