package com.miu.teo.book.cloudnativespring.orderservice.book;

public record Book(
        String isbn,
        String title,
        String author,
        Double price
) {
}
//TODO with Spring Cloud Contract project if you’re interested (https:// spring.io/projects/spring-cloud-contract).
