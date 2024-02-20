package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    private int countUser ;
    public static int UpdateCount ;

    public void  setCount(int n) { countUser  = n ; }

    public static int UpdateCountCon(){
        UpdateCount++ ;
        return UpdateCount ;
    }

    public static int UpdateCountDis(){
        UpdateCount-- ;
        return UpdateCount ;
    }
}