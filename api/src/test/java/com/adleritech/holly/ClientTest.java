package com.adleritech.holly;

import com.adleritech.holly.dto.Message;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;


public class ClientTest
{
    @Ignore
    @Test
    public void sendMessageToChannel() throws IOException {
        ClientFactory.createService("http://localhost:8000").sendMessage(new Message("_tests", "a\n```b```")).execute();
    }
}
