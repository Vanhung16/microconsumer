package com.example.microconsumer;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class CustomMessage {
    private UUID messageId;
    private String message;
}
