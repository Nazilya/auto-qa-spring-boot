package ru.geekbrains.auto.qa.autoqa.lesson2.controller.rest.example.dto;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private int id;
    private String firstname;
    private String secondName;
    private int age;
}
