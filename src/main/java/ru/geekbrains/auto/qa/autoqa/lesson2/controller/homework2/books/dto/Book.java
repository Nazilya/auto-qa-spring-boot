package ru.geekbrains.auto.qa.autoqa.lesson2.controller.homework2.books.dto;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    private int id;
    private String author;
    private String title;
    private int price;
    private int pages;
    private int year;
}
