package com.definex.devopstraining;

import com.definex.devopstraining.data.dao.BookRepository;
import com.definex.devopstraining.data.model.Book;
import com.definex.devopstraining.service.BookService;
import com.definex.devopstraining.service.model.BookDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
class DevopsTrainingApplicationTests {

    @Autowired
    private BookService bookService;

    @MockBean
    private BookRepository bookRepository;

    @Test
    public void getBookTest() {
        Mockito.when(bookRepository.findAll())
                .thenReturn(List.of(new Book()));

        final List<BookDto> dtoList = bookService.findAll();
        Assertions.assertEquals(1, dtoList.size());
    }

}
