package com.example.MyBookShopApp.data;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Author {


    private Integer id;
    private String firstName;
    private String lastName;
    private String name;

    private List<Book> bookList;

    public Author() {
       // bookList = new ArrayList<>();
    }

    public String getName(){
        return  firstName + " " + lastName;
    }


}
