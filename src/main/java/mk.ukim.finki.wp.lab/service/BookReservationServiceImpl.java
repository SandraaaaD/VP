package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.BookReservation;
import mk.ukim.finki.wp.lab.repository.InMemoryBookReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class BookReservationServiceImpl implements BookReservationService {

    private final InMemoryBookReservationRepository inMemoryBookReservationRepository;

    public BookReservationServiceImpl(InMemoryBookReservationRepository inMemoryBookReservationRepository) {
        this.inMemoryBookReservationRepository = inMemoryBookReservationRepository;
    }

    @Override
    public BookReservation placeReservation(String bookTitle, String readerName, String readerAddress, int numberOfCopies) {
        BookReservation bookReservation = new BookReservation(bookTitle, readerName, readerAddress, numberOfCopies);
        return inMemoryBookReservationRepository.save(bookReservation);

    }
}
