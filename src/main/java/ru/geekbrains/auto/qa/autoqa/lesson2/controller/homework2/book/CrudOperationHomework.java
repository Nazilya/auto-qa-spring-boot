package ru.geekbrains.auto.qa.autoqa.lesson2.controller.homework2.book;

import org.springframework.web.bind.annotation.*;
import ru.geekbrains.auto.qa.autoqa.lesson2.controller.homework2.book.dto.Book;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/book")
public class CrudOperationHomework {
    Map<Integer, Book> data = new HashMap<>();

    @PostConstruct
    void init() {
        data.put(1, new Book(1, "Geraldine M.C.", "Cyrano", 380, 128,  2006));
        data.put(2, new Book(2, "Rowling J.K.", "Harry Potter and the Half-Blood Prince", 1181, 560,  2018));
        data.put(3, new Book(3, "Толстой Л. Н.", "Война и мир", 2962, 800,  2021));
        data.put(4, new Book(4, "Толстой Л. Н.", "Анна Каренина", 1614, 624,  2021));
    }
    @GetMapping("/{id}")
    public Book get(@PathVariable int id) {
        return data.get(id);
    }
    @GetMapping("/all")
    public List<Book> get() {
        return new ArrayList<>(data.values());
    }
    @PostMapping()
    public void save(@RequestBody Book book) {
        int id = data.size() + 1;
        book.setId(id);
        data.put(id, book);
    }
    @PutMapping("/{id}")
    public void change(@PathVariable int id, @RequestBody Book bookChanging) {
        Book book = data.get(id);
        book.setAuthor(bookChanging.getAuthor());
        book.setTitle(bookChanging.getTitle());
        book.setPrice(bookChanging.getPrice());
        book.setPages(bookChanging.getPages());
        book.setYear(bookChanging.getYear());
        data.put(id, book);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        data.remove(id);
    }
}
