package ru.ann.springcourse.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.ann.springcourse.models.Book;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();

        book.setId(rs.getInt("id"));
        book.setYear(rs.getInt("year"));
        book.setTitle(rs.getString("title"));
        book.setAuthor(rs.getString("author"));


        return book;
    }
}
