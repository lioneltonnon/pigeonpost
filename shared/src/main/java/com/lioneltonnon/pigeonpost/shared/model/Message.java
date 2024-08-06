package src.main.java.com.lioneltonnon.pigeonpost.shared.model;

import src.main.java.com.lioneltonnon.pigeonpost.shared.interfaces.IMessage;

public record Message(String content) implements IMessage {
}