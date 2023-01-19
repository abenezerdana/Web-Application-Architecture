package edu.miu.assignment1.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.PrimitiveIterator;
@Data
@AllArgsConstructor
public class PostDto {
    private Long id;
    private String title;
    private String author;
}
