package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Book;
import mk.ukim.finki.wp.lab.repository.InMemoryBookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final InMemoryBookRepository inMemoryBookRepository;

    public BookServiceImpl(InMemoryBookRepository inMemoryBookRepository) {
        this.inMemoryBookRepository = inMemoryBookRepository;
    }

    @Override
    public List<Book> listAll() {
        return inMemoryBookRepository.findAll();
    }

    @Override
    public List<Book> searchBooks(String text, Double rating) {
        return inMemoryBookRepository.searchBooks(text, rating);
    }
}
