package com.chat.app.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {
    private long id;
    private String sender;
    private String content;
}
