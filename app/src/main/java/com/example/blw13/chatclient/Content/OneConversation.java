package com.example.blw13.chatclient.Content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample name for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class OneConversation {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Message> ITEMS = new ArrayList<Message>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Message> ITEM_MAP = new HashMap<String, Message>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(Message item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static Message createDummyItem(int position) {
        return new Message(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of name.
     */
    public static class Message {
        public final String id;
        public final String content;
        public final String details;

        public Message(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
