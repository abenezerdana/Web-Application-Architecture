package edu.miu.assignment1.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NewPostDto {
    String title;
    String author;
    String content;
}
