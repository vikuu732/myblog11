package com.myblog.myblog11.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@NoArgsConstructor
@Data
@AllArgsConstructor
public class ErrorDetails {
    private String message;

    private Date Date;

    private String uri;
}
